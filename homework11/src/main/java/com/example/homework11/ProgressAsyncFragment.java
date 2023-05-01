package com.example.homework11;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ProgressAsyncFragment extends Fragment {
    int[] integers=null;
    ProgressBar indicatorBar;
    TextView statusView;
    int clicks = 0;
    int progress = 0;
    TextView clicksView;


    Button clicksBtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progress_async, container, false);
        integers = new int[100];
        for(int i=0;i<100;i++) {
            integers[i] = i + 1;
        }
        indicatorBar = (ProgressBar) view.findViewById(R.id.indicator);
        statusView = (TextView) view.findViewById(R.id.statusView);
        Button btnFetch = (Button)view.findViewById(R.id.progressBtn);
        btnFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ProgressTask().execute();
            }
        });
        clicksView = view.findViewById(R.id.clicksView);
        clicksBtn = view.findViewById(R.id.clicksBtn);
        clicksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                clicksView.setText("Clicks: " + clicks);
               v.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progress++;
                        indicatorBar.setProgress(progress);
                        statusView.setText("Статус: " + String.valueOf(progress));
                    }
                }, 200);
            }
        });

        return view;
    }
    class ProgressTask extends AsyncTask<Void, Integer, Void> {
        @Override
        protected Void doInBackground(Void... unused) {
            for (int i = 0; i<integers.length;i++) {
                publishProgress(i);
                SystemClock.sleep(400);
            }
            return null;
        }
        @Override
        protected void onProgressUpdate(Integer... items) {
            indicatorBar.setProgress(items[0]+1);
            statusView.setText("Статус: " + String.valueOf(items[0]+1));
        }
        @Override
        protected void onPostExecute(Void unused) {
            Toast.makeText(getActivity(), "Задача завершена",
                            Toast.LENGTH_SHORT)
                    .show();
        }
    }
}
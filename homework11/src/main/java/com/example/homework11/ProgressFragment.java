package com.example.homework11;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
public class ProgressFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public ProgressFragment() {
        // Required empty public constructor
    }
    public static ProgressFragment newInstance(String param1, String param2) {
        ProgressFragment fragment = new ProgressFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progress, container, false);

        ProgressBar indicatorBar = view.findViewById(R.id.indicator);
        TextView statusView = view.findViewById(R.id.statusView);
        Button btnFetch = view.findViewById(R.id.progressBtn);
        Button btnPause = view.findViewById(R.id.pausebutton);
        Button btnResume = view.findViewById(R.id.resumebutton);

        MyViewModel model = new
                ViewModelProvider(requireActivity()).get(MyViewModel.class);
        model.getValue().observe(getViewLifecycleOwner(), value -> {
            indicatorBar.setProgress(value);
            statusView.setText("Статус: " + value);
        });

        btnFetch.setOnClickListener(v -> model.execute());
        btnPause.setOnClickListener(v -> model.pause());
        btnResume.setOnClickListener(v -> model.resume());

        return view;
    }
}
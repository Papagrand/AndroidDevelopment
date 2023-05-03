package com.example.homework12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DialogFragActivity extends AppCompatActivity {
    int pushCount = 0;
    boolean clicked_again=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_frag);
    }
    public void showDialog(View v) {
        TextView textView = findViewById(R.id.clickerTextView);
        if(pushCount<5){
            pushCount++;
            textView.setText(Integer.toString(pushCount));
        }else{
            if (clicked_again==false){
                CustomDialogFragment dialog = new CustomDialogFragment();
                dialog.show(getSupportFragmentManager(), "custom");
                clicked_again = true;
            }else{
                DumDialogFragment dialog = new DumDialogFragment();
                dialog.show(getSupportFragmentManager(),"custom");
            }

        }
    }

}
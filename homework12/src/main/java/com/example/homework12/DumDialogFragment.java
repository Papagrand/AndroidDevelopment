package com.example.homework12;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DumDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("Вы опять нажали на кнопку")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Поэтому вы переноситесь на основное активити")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Перенести пользователя на основное активити
                        dismiss();
                        getActivity().finish();
                    }
                });
        return builder.create();
    }
}

package com.wells.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Well Araujo", Toast.LENGTH_LONG).show();
        TextView aluno = new TextView(this);
        aluno.setText("Well Araujo");
        setContentView(aluno);
    }
}

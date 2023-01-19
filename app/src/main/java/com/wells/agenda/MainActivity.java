package com.wells.agenda;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Well Araujo", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<String>(Arrays.asList("Alex", "Fran", "Jose", "Maria", "Ana"));
        ListView listaDeAlunos = findViewById(R.id.activity_main_lisa_de_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos));

    }
}

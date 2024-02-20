package com.example.browarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<List<String>> piwa = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.wybor);
        piwa.add(Arrays.asList("Książęce", "łomza"));
        piwa.add(Arrays.asList("corona", "zywiec", "piast"));
        piwa.add(Arrays.asList("Komes", "Okocim", "Książęce"));
        button.setOnClickListener((View v) -> {
            Spinner spinner = findViewById(R.id.spinner);
            String rodzaj = spinner.getSelectedItem().toString();
            String[] rodzaje = getResources().getStringArray(R.array.rodzaje);
            TextView textView = findViewById(R.id.piwa);
            for(int i=0; i<rodzaje.length; i++) {
                if(rodzaj.equals(rodzaje[i])){
                    textView.setText(piwa.get(i).toString());
                }
            }
        });
    }
}
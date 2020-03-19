package br.com.androidpro.tupicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class PlantasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas);

        String[] plantasArray = getResources().getStringArray(R.array.plantas);
        List<String> plantasList = Arrays.asList(plantasArray);

        LinearLayout root = (LinearLayout) findViewById(R.id.rootPlantas);
        for (String bicho : plantasList) {
            TextView textView = new TextView(this);
            textView.setText(bicho);
            root.addView(textView);
        }
    }
}
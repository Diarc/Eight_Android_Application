package com.example.zadanie8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner monthsSpinner;
    TextView seasonsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seasonsText = findViewById(R.id.seasonsText);

        monthsSpinner = findViewById(R.id.monthsSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.months, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthsSpinner.setAdapter(adapter);
        monthsSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedMonth = monthsSpinner.getSelectedItem().toString();
        if(selectedMonth.equals("January")) {
            seasonsText.setText("Winter");
        }
        else if(selectedMonth.equals("February")){
            seasonsText.setText("Winter");
        }
        else if(selectedMonth.equals("March")){
            seasonsText.setText("Winter/Spring");
        }
        else if(selectedMonth.equals("April")){
            seasonsText.setText("Spring");
        }
        else if(selectedMonth.equals("May")){
            seasonsText.setText("Spring");
        }
        else if(selectedMonth.equals("June")){
            seasonsText.setText("Spring/Summer");
        }
        else if(selectedMonth.equals("July")){
            seasonsText.setText("Summer");
        }
        else if(selectedMonth.equals("August")){
            seasonsText.setText("Summer");
        }
        else if(selectedMonth.equals("September")){
            seasonsText.setText("Summer/Fall");
        }
        else if(selectedMonth.equals("October")){
            seasonsText.setText("Fall");
        }
        else if(selectedMonth.equals("November")){
            seasonsText.setText("Fall");
        }
        else if(selectedMonth.equals("December")){
            seasonsText.setText("Fall/Winter");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}
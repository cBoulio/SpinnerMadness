package com.boulio.spinnermadness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private Spinner splitSpinner;
    private int split=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splitSpinner = (Spinner) findViewById(R.id.splitSpinner);

        splitSpinner.setOnItemSelectedListener(this);

        //setArrayAdapter for the spinner!!!
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.splitArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(
                android.R.layout.simple_dropdown_item_1line);
        splitSpinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

        split = position+1;
        Toast.makeText(this, "position "+split, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

package com.sanmeetjasuja.mungerform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button buttonSubmit;
    private EditText editTextItem;
    private EditText editTextPrice;
    private EditText editTextDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        editTextItem = (EditText) findViewById(R.id.editTextItemname);
        editTextPrice = (EditText) findViewById(R.id.editTextPrice);
        editTextDescription = (EditText) findViewById(R.id.editTextDescription);

        buttonSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        // firebase database command expected here
    }
}

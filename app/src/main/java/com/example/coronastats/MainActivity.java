package com.example.coronastats;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {


    private EditText mCountry;
    private Button mSearch;

    public static final String COUNTRY_NAME = "com.example.coronastats.example.COUNTRY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountry = findViewById(R.id.country_editText);

        mSearch = findViewById(R.id.search_button);


        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });


    }

    public void openActivity()
    {
        String countryMain = mCountry.getText().toString();
        if(countryMain.equals(""))
            Toast.makeText(this,"Write the country name for their stats",Toast.LENGTH_SHORT).show();
        else {
            Intent intent = new Intent(this,CoronaStatsActivity.class);
            intent.putExtra(COUNTRY_NAME, mCountry.getText().toString());
            startActivity(intent);
        }

    }

}

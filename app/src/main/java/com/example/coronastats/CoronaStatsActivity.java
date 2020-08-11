package com.example.coronastats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class CoronaStatsActivity extends AppCompatActivity {

    private TextView mCountry;
    private TextView mNoCases;
    private TextView mNoRecovered;
    private TextView mNoDeath;
    private TextView mNewCases;
    private TextView mNewRecovered;
    private TextView mNewDeath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_stats);

        OkHttpClient client = new OkHttpClient();
        final Gson gson = new Gson();

        Intent intent= getIntent();
        String Country=intent.getStringExtra(MainActivity.COUNTRY_NAME);

        mCountry=findViewById(R.id.country_name);
        mNoCases = findViewById(R.id.no_cases);
        mNoRecovered=findViewById(R.id.no_recovered);
        mNoDeath = findViewById(R.id.no_death);
        mNewCases = findViewById(R.id.new_cases_tv);
        mNewRecovered = findViewById(R.id.new_recovered_tv);
        mNewDeath = findViewById(R.id.new_death_tv);

        Request request = new Request.Builder()
                .url("https://covid-19-tracking.p.rapidapi.com/v1/"+Country)
                .get()
                .addHeader("x-rapidapi-host", "covid-19-tracking.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "6484ea0e0cmsh17a7b045863dbd4p1721e0jsn87e4fa9aa595")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Response response) throws IOException {
                final String myResponse = response.body().string();

                CoronaStatsActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        CoronaJson coronaJson = gson.fromJson(myResponse,CoronaJson.class);
                        mCountry.setText(coronaJson.getCountry_text());
                        mNoCases.setText(coronaJson.getTotal_Cases_text());
                        mNoRecovered.setText(coronaJson.getTotal_Recovered_text());
                        mNoDeath.setText(coronaJson.getTotal_Deaths_text());
                        mNewCases.setText(coronaJson.getNew_Cases_text());
                        mNewDeath.setText(coronaJson.getNew_Deaths_text());
                    }
                });
            }
        });
    }
}

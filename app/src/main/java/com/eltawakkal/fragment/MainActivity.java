package com.eltawakkal.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentCity fragmentCity;
    FragmentCountry fragmentCountry;

    Button btnCity, btnCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentCity = new FragmentCity();
        fragmentCountry = new FragmentCountry();

        btnCity = (Button) findViewById(R.id.btnCity);
        btnCountry = (Button) findViewById(R.id.btnCountry);

        btnCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentCity).commit();
            }
        });

        btnCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentCountry).commit();
            }
        });
    }
}

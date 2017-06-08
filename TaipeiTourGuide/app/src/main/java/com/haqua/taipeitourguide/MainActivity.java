package com.haqua.taipeitourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Different Tabs
        TextView sightseeing = (TextView) findViewById(R.id.sightseeing);
        TextView museums = (TextView) findViewById(R.id.museums);
        TextView nightmarkets = (TextView) findViewById(R.id.nightmarkets);
        TextView unmentioned = (TextView) findViewById(R.id.unmentioned);

        // Set a click listener on that View
        sightseeing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sightseeing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent sightseeingIntent = new Intent(MainActivity.this, SightseeingActivity.class);

                // Start the new activity
                startActivity(sightseeingIntent);
            }
        });

        // Set a click listener on that View
        museums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the museums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // Set a click listener on that View
        nightmarkets.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the nightmarkets category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent nightmarketIntent = new Intent(MainActivity.this, NightMarketsActivity.class);

                // Start the new activity
                startActivity(nightmarketIntent);
            }
        });

        // Set a click listener on that View
        unmentioned.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the unmentioned category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent unmentionedIntent = new Intent(MainActivity.this, UnmentionedActivity.class);

                // Start the new activity
                startActivity(unmentionedIntent);
            }
        });
    }
}

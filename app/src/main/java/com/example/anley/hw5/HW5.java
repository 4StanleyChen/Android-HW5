package com.example.anley.hw5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class HW5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw5);

        ArrayList<Teams> scoreboard = new ArrayList<Teams>();

        scoreboard.add(new Teams(R.drawable.trs, "Raptors", "92", R.drawable.mbs, "Bucks", "89"));
        scoreboard.add(new Teams(R.drawable.sass, "Spurs", "103", R.drawable.mgs, "Grizzlies", "96"));

        ScoreArrayAdapter adapter = new ScoreArrayAdapter(this, scoreboard);

        ListView lv = (ListView)findViewById(R.id.lv);
        lv.setAdapter(adapter);
    }
}

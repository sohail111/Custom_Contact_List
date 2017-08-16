package com.example.sohailmalik.custom_contact_list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivityextends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<contact>searchResults = GetSearchResults();

        final ListView l = (ListView) findViewById(R.id.ListView01);
        l.setAdapter(new customrowAdapter(this, searchResults));

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, intposition, long id) {
                Object o = l.getItemAtPosition(position);
                contact fullObject = (contact) o;
                Toast.makeText(getApplicationContext(), "Your choice: " + " " + fullObject.getName(), Toast.LENGTH_LONG).show();
            }
        });


    }

    private ArrayList<contact>GetSearchResults() {
        ArrayList<contact> results = new ArrayList<contact>();

        for (inti = 0; i<100; i++) {
            contact s = new contact();
            s.setName("sohail");
            s.setGender("M");
            s.setPhone("+923456669656");
            results.add(s);
        }
        return results;

    }
}

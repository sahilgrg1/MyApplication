package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Person> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.rvlist);
        list.add(new Person("Sahil","garg"));
        list.add(new Person("Hello","Android"));
        PersonAdapter adapter = new PersonAdapter(list,this);
        rv.setAdapter(adapter);
    }

}

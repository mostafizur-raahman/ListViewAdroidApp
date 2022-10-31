package com.mostafiz.assignment_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        List<String> title = new ArrayList<>();
        List<Integer>image = new ArrayList<>();
        title.add("Mostafiz");
        title.add("Abir");
        title.add("Nahid");
        title.add("Al-amin");
        title.add("Zakir");
        title.add("Naim");
        title.add("Azizul");
        title.add("Valorent");
        title.add("KHalid");

        image.add(R.drawable.fb);
        image.add(R.drawable.twitter);
        image.add(R.drawable.instragram);
        image.add(R.drawable.google);
        image.add(R.drawable.fb);
        image.add(R.drawable.twitter);
        image.add(R.drawable.instragram);
        image.add(R.drawable.google);
        image.add(R.drawable.fb);

        Myadapter myadapter = new Myadapter(this,title,image);
        listView.setAdapter(myadapter);
    }
}
package com.example.show.custmizinglistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    listAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateItems();
    }

    public void generateItems() {
        ArrayList<Items> items = new ArrayList<Items>();

        items.add(new Items(1, "Meet", "2017/12/12") );
        items.add(new Items(2, "Group", "2017/11/12") );
        items.add(new Items(3, "Homework", "2018/12/12") );
        items.add(new Items(4, "Music", "2017/10/12") );
        items.add(new Items(5, "Dinner", "2017/5/12") );

        adapter = new listAdapter(MainActivity.this, items);
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}

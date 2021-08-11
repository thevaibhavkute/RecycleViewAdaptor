package com.example.recycleviewadaptor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecycleViewAdaptor recycleViewAdaptor;
    ArrayList<String> name;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        name=new ArrayList<>();

        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");
        name.add("ItemList");


        //setting Layout
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        //setting adaptor
        recycleViewAdaptor=new RecycleViewAdaptor(name);
        recyclerView.setAdapter(recycleViewAdaptor);
    }
}
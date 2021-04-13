package com.example.exo2_tp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Data> data;
    private RecyclerView mRecyclerView;
    private MonRecyclerViewAdapter mAdapter;
    //private MonRecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        //mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager=new GridLayoutManager(this,1, GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        data = new ArrayList<>();
        data.add(new Data(R.drawable.mercure,"Mercure",12));
        data.add(new Data(R.drawable.venus,"Venus",13));
        data.add(new Data(R.drawable.terre,"Terre",14));
        data.add(new Data(R.drawable.mars,"Mars",12));
        data.add(new Data(R.drawable.jupiter,"Jupiter",13));
        data.add(new Data(R.drawable.saturne,"Saturne",14));
        data.add(new Data(R.drawable.uranus,"Uranus",12));
        data.add(new Data(R.drawable.neptune,"Neptune",13));
        data.add(new Data(R.drawable.pluton,"Pluton",14));
        mAdapter = new MonRecyclerViewAdapter(data);
        mRecyclerView.setAdapter(mAdapter);



    }
}
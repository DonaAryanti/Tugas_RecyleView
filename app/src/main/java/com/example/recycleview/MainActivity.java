package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCumi;
    private ArrayList<CumiModel> ListCumi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCumi = findViewById(R.id.rv_cumi_list);
        rvCumi.setHasFixedSize(true);
        ListCumi.addAll(CumiData.getListData());

        showRecyclerList();
    }
    private void showRecyclerList(){
        rvCumi.setLayoutManager(new LinearLayoutManager(this));
        CumiAdapter cumiAdapter = new CumiAdapter(this);
        cumiAdapter.setCumiList(ListCumi);
        rvCumi.setAdapter(cumiAdapter);
    }

}

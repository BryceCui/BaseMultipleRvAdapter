package com.cuipengyu.basemultiplervadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cuipengyu.basemultiplervadapter.common.AdapterDelegateManager;
import com.cuipengyu.basemultiplervadapter.common.BaseRvAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerview);

        List<Data> strings = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Data data = new Data();
            data.setName("cui01");
            data.setType(1);
            data.setYear("001");
            strings.add(data);
        }
        for (int i = 0; i < 10; i++) {
            Data data1 = new Data();
            data1.setName("cui02");
            data1.setType(2);
            data1.setYear("002");
            strings.add(data1);
        }
        AdapterDelegateManager<Data> manager = new AdapterDelegateManager<Data>();
        manager.addDelegate(new cui01());
        manager.addDelegate(new cui02());
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,6,GridLayoutManager.VERTICAL,false));
        mRecyclerView.setAdapter(new BaseRvAdapter<Data>(strings, manager));
    }
}

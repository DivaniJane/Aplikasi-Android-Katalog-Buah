package com.example.fruitstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFruits;

    private ArrayList<Fruit> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFruits = findViewById(R.id.rv_fruits);
        rvFruits.setHasFixedSize(true);

        list.addAll(FruitsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvFruits.setLayoutManager(new LinearLayoutManager(this));
        ListFruitAdapter listFruitAdapter = new ListFruitAdapter(list);
        rvFruits.setAdapter(listFruitAdapter);

        listFruitAdapter.setOnItemClickCallback(new ListFruitAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Fruit data) {
                showSelectedFruit(data);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    public void about(MenuItem item) {
        Intent aboutActivityIntent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(aboutActivityIntent);
    }

    private void showSelectedFruit(Fruit fruit) {
        Toast.makeText(this, "Kamu memilih " + fruit.getName(), Toast.LENGTH_SHORT).show();

        Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_IMAGES,fruit.getPhoto());
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,fruit.getName());
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_DETAIL,fruit.getDetail());
        startActivity(moveWithDataIntent);
    }
}
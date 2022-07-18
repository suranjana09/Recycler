package com.suranjana.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SimpleRecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
//    ArrayList<String> meroApikoData = new ArrayList<>();
    ArrayList<AnimalModel> meroApikoData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        meroApikoData.add("Suranjana");
//        meroApikoData.add("Ram");
//        meroApikoData.add("Hari");
//        meroApikoData.add("Monica");
//        meroApikoData.add("Aditi");
//        meroApikoData.add("Rakshya");
//        meroApikoData.add("Laxmi");
//        meroApikoData.add("Joey");
//        meroApikoData.add("Sheldon");


        meroApikoData.add(new AnimalModel(
                "Dog",
                "Lucy",
                "German Shepherd",
                "white",
                true
        ));

        meroApikoData.add(new AnimalModel(
                "Cat",
                "Soni",
                "Presian cat",
                "white",
                true
        ));

        meroApikoData.add(new AnimalModel(
                "Dog",
                "Joey",
                "Japanese Spitz",
                "white",
                false
        ));

        meroApikoData.add(new AnimalModel(
                "Dog",
                "Rocky",
                "Bulldog",
                "grey",
                true
        ));





        recyclerView = findViewById(R.id.recycler_view);

//        adapter = new SimpleRecyclerViewAdapter(this,meroApikoData);
        adapter = new SimpleRecyclerViewAdapter(meroApikoData, new OnRecyclerItemClick() {
            @Override
            public void onClick(AnimalModel selectedAnimal) {
                Toast.makeText(MainActivity.this, selectedAnimal.getName(), Toast.LENGTH_SHORT).show();

            }
        });
        layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
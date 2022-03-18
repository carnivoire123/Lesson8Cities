package ru.gb.lesson8cities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list;
    private Repo repo = InMemoryCityRepo.getInstance();
    private CityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        adapter = new CityAdapter();
        adapter.setData(repo.getAll());

        list.setAdapter(adapter);

        list.setLayoutManager(new LinearLayoutManager(this));

        list.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));



    }
}
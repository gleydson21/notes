package com.example.crud.controller;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crud.R;
import com.example.crud.adapter.Adapter;
import com.example.crud.entity.Task;
import com.example.crud.model.TaskDaoRepository;

import java.util.List;

public class TasksList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_list);

        List<Task> listTask = new TaskDaoRepository(this).findAll();

        // Pandora o Recyclerview
        RecyclerView recyclerView = findViewById(R.id.recyclerViewTasks);

        // Configure Adapter
        Adapter adapter = new Adapter(listTask);

        // Configure RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);


    }

    }
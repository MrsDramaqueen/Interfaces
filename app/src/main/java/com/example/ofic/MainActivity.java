package com.example.ofic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ofic.adapter.CourseAdapter;
import com.example.ofic.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView courseRecycler;
    CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Course> tableList = new ArrayList<>();
        tableList.add(new Course(1, "java_2", "Жаров В.", "2 человека", "11:24", "#424345"));
        tableList.add(new Course(2, "java_2", "Косменюк И.", "4 человека", "12:11", "#424345"));
        
        setTableRecycler(tableList);
    }

    private void setTableRecycler(List<Course> tableList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        courseRecycler = findViewById(R.id.courseRecycle);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, tableList);
        courseRecycler.setAdapter(courseAdapter);
    }
}
package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student>studentList =new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecyclerView();
    }
    private void buildStudentList(){
        Student student1=new Student("rahul","25","123");
        studentList.add(student1);

        for (int i=0;i<14;i++){
            Student student = new Student("abc"+i,"22","23342");
            studentList.add(student);
        }


    }
    private void setRecyclerView(){
        StudentAdapter studentAdapter =new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);

    }

    private void initViews(){
        recyclerView=findViewById(R.id.recyclerVIew);
    }



}
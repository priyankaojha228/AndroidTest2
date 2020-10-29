package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView testprog;
    String[] progname = {"Dipisha","Purvi","Suhani","Rashmi","Mitali","Tanu"};
    String[] progds = {"Hi! I am Dipisha","Hi! I am Purvi","Hi! I am Suhani","Hi! I am Rashmi","Hi! I am Mitali","Hi! I am Tanu"};
    int[] progimages = {R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testprog = findViewById(R.id.testprog);
        ProgramAdapter programAdapter = new ProgramAdapter(this,progname,progimages,progds);
        testprog.setAdapter(programAdapter);
    }
}
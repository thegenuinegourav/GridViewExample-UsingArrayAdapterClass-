package com.example.sourabh.gridviewexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private Integer[] ImageResources = {R.drawable.sample_0,R.drawable.sample_1,R.drawable.sample_2,R.drawable.sample_3,
                                         R.drawable.sample_4,R.drawable.sample_5,R.drawable.sample_6,R.drawable.sample_7,
                                          R.drawable.sample_0,R.drawable.sample_1,R.drawable.sample_2,R.drawable.sample_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new ImageAdapter(this,ImageResources)); //Setting Custom Adapter named ImageAdapter passing context and Interger Array (as a resource) as a parameter of the class constructor ImageAdapter
    }
}

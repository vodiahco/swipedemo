package com.sharetray.mobile.android.swipedemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.fortysevendeg.swipelistview.SwipeListView;
import com.sharetray.mobile.android.swipedemo.adapters.SwipeViewAdapter;


public class MainActivity extends Activity {


    String[] countries={"England","Scotland","Wales","Ireland"};
    SwipeViewAdapter swipeViewAdapter;
    SwipeListView swipeListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeListView= (SwipeListView) findViewById(android.R.id.list);

        swipeViewAdapter= new SwipeViewAdapter(this,R.layout.swipelistview,countries);
        swipeListView.setAdapter(swipeViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

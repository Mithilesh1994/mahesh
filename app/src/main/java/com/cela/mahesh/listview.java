package com.cela.mahesh;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listview extends AppCompatActivity {

    String [] mystream={"Msc-IT","M.com","Bsc-IT","B.com"};
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_listview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.activity_listview,mystream);
        ListView list=(ListView) findViewById(R.id.stream_list);
        list.setAdapter(adapter);

       // populateListView();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
   // private void populateListView(){
       // String [] mystream={"Msc-IT","M.com","Bsc-IT","B.com"};
       //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.activity_listview,mystream);
        //ListView list=(ListView) findViewById(R.id.stream_list);
        //list.setAdapter(adapter);
    //}
}

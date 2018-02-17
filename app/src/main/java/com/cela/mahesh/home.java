package com.cela.mahesh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button btnA=(Button) findViewById(R.id.admin);
        Button btnS=(Button) findViewById(R.id.student);
        btnA.setOnClickListener(new View.OnClickListener() {
         @Override
        public void onClick(View V) {
             Intent myA=new Intent(home.this,Activity_admin.class);
             startActivity(myA);
        //Log.i("my app", "onClick: ");
        //Toast.makeText(getApplicationContext(),"Admin button clicked",Toast.LENGTH_SHORT).show();

    }
});
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent myi=new Intent(home.this,student.class);
                startActivity(myi);
               //Log.i("my app", "onClick: ");
                //Toast.makeText(getApplicationContext(),"Student button clicked",Toast.LENGTH_SHORT).show();

            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}

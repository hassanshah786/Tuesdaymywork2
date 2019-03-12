package com.example.tuesdaymywork;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Repalce extends AppCompatActivity {

    Button btn1, btn2, btn3;
    FragmentManager manager;
    FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repalce);

/*

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.container1,new Frament1());
        transaction.add(R.id.container2,new Second());
        transaction.add(R.id.container3,new Third());
        transaction.commit();
*/


            init();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new Frament1());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new Frament1());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new Frament1());
            }
        });

    }

    private void changeFragment(Frament1 frament1) {

        transaction = manager.beginTransaction();
        transaction.replace(R.id.fragments_container, frament1);
        transaction.commit();
    }

    private void init() {

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        manager = getSupportFragmentManager();
    }
}

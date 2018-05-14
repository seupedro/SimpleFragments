package com.example.nakamoto.simplefragments;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Inicie o gerenciador e depois a transação (Troca)*/
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        /* Adicione o fragmento desejado */
        fragmentTransaction.add(R.id.line_container, new OneFragment());
        fragmentTransaction.commit();

        FloatingActionButton button = findViewById(R.id.buttonn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Substitua pelo que quiser*/
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.line_container, new SecondFragment());
                fragmentTransaction.commit();
            }
        });
    }
}

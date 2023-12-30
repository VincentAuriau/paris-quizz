package com.auriau.vincent.parisquizz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SelectionNiveau extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_niveau);

        //Récupération des boutons et envoie ves les différents niveaux concernés lors des clics
        Button niveau1Button = (Button) findViewById(R.id.boutonNiveau1);
        niveau1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SelectionNiveau.this, Niveau_1.class);
                startActivity(i);

            }
        });

        Button niveau2Button = (Button) findViewById(R.id.boutonNiveau2);
        niveau2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SelectionNiveau.this, Niveau_2.class);
                startActivity(i);

            }
        });

        Button niveau3Button = (Button) findViewById(R.id.boutonNiveau3);
        niveau3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SelectionNiveau.this, Niveau_3.class);
                startActivity(i);

            }
        });

        Button niveau4Button = (Button) findViewById(R.id.boutonNiveau4);
        niveau4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SelectionNiveau.this, Niveau_4.class);
                startActivity(i);

            }
        });

    }

    // Lifecycle callback methods overrides

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onRestart() {
        super.onRestart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

    }
}

package com.auriau.vincent.parisquizz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    private int score =0;
    private int scoreNiveau1=0;
    private int scoreNiveau2=0;
    private int scoreNiveau3=0;
    private int scoreNiveau4=0;

    //On récupère les clefs des scores de chaque niveau
    private static final String PREFS_SCORE1 = "PREFS_SCORE1";
    private static final String PREFS_SCORE2 = "PREFS_SCORE2";
    private static final String PREFS_SCORE3 = "PREFS_SCORE3";
    private static final String PREFS_SCORE4 = "PREFS_SCORE4";
    private static final String PREFS = "PREFS";

    //On récupère les préferences qui contiennent toutes les infos
    protected SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_test);

        //On récupère le bouton et on l'active pour lancer la sélection de niveau
        Button launchjouer = (Button) findViewById(R.id.jouer);
        assert launchjouer != null;
        launchjouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuPrincipal.this, SelectionNiveau.class);
                startActivity(i);
            }
        });

        Button initialize = (Button) findViewById(R.id.buttoninitialize);
        assert initialize != null;
        initialize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences.edit().clear().apply();
                onResume();
            }
        });

        // Check for previously saved state
        if (savedInstanceState != null) {
        }

        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);
        //On récupère les scores de chaque niveau
        if (sharedPreferences.contains(PREFS_SCORE1)) {
            scoreNiveau1 = sharedPreferences.getInt(PREFS_SCORE1,0);

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_SCORE1, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_SCORE2)) {
            scoreNiveau2 = sharedPreferences.getInt(PREFS_SCORE2,0);

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_SCORE2, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_SCORE3)) {
            scoreNiveau3 = sharedPreferences.getInt(PREFS_SCORE3,0);

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_SCORE3, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_SCORE4)) {
            scoreNiveau4 = sharedPreferences.getInt(PREFS_SCORE4,0);

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_SCORE4, 0)
                    .apply();
        }

        // On assigne la valeur du score à sa variable
        score=scoreNiveau1 + scoreNiveau2 + scoreNiveau3 +scoreNiveau4;
        TextView monTexte = (TextView)findViewById(R.id.scoretotal);
        assert monTexte != null;

        //On affiche le score dans le TextView prévu à cet effet
        String scoreuh = getResources().getString(R.string.Score)+score;
        monTexte.setText(scoreuh);

    }

    // Lifecycle callback overrides

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onResume() {

        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);
        scoreNiveau1 = sharedPreferences.getInt(PREFS_SCORE1, 0);
        scoreNiveau2 = sharedPreferences.getInt(PREFS_SCORE2, 0);
        scoreNiveau3 = sharedPreferences.getInt(PREFS_SCORE3, 0);
        scoreNiveau4 = sharedPreferences.getInt(PREFS_SCORE4, 0);
        score=scoreNiveau1 + scoreNiveau2 + scoreNiveau3 +scoreNiveau4;
        TextView monTexte = (TextView)findViewById(R.id.scoretotal);
        String scoreuh = getResources().getString(R.string.Score)+score;
        monTexte.setText(scoreuh);
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

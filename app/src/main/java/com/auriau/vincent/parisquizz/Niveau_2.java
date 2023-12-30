package com.auriau.vincent.parisquizz;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Niveau_2 extends Activity{

    int CODE_TUILERIES=22;
    int CODE_MONCEAU=24;
    int CODE_VENDOME=26;
    int CODE_LOOP=28; ///A changer si possible
    int CODE_CONCORDE=210;
    int CODE_SORBONNE=212;
    int CODE_PAVILLONELYSEE=214;
    int CODE_CONCIERGERIE=218;
    int CODE_GRANDPALAIS=220;
    int CODE_PALAISJUSTICE=222;
    int CODE_COMEDIEFRANCAISE=224;
    int CODE_NOTREDAME=226;
    int CODE_PISCINEBAKER=228;
    int CODE_BRANLY=230;
    int CODE_BNF=232;
    int CODE_POMPIDOU=234;
    int CODE_PONTBERCY=236;
    int CODE_BOURSE=238;

    private static final String PREFS = "PREFS";
    private static final String PREFS_TUILERIES = "PREFS_TUILERIES";
    private static final String PREFS_MONCEAU = "PREFS_MONCEAU";
    private static final String PREFS_VENDOME = "PREFS_VENDOME";
    private static final String PREFS_LOOP = "PREFS_LOOP";
    private static final String PREFS_CONCORDE = "PREFS_CONCORDE";
    private static final String PREFS_SORBONNE = "PREFS_SORBONNE";
    private static final String PREFS_PAVILLONELYSEE = "PREFS_PAVILLONELYSEE";
    private static final String PREFS_CONCIERGERIE = "PREFS_CONCIERGERIE";
    private static final String PREFS_GRANDPALAIS = "PREFS_GRANDPALAIS";
    private static final String PREFS_PALAISJUSTICE = "PREFS_PALAISJUSTICE";
    private static final String PREFS_COMEDIEFRANCAISE = "PREFS_COMEDIEFRANCAISE";
    private static final String PREFS_NOTREDAME = "PREFS_NOTREDAME";
    private static final String PREFS_PISCINEBAKER = "PREFS_PISCINEBAKER";
    private static final String PREFS_BRANLY = "PREFS_BRANLY";
    private static final String PREFS_BNF = "PREFS_BNF";
    private static final String PREFS_POMPIDOU = "PREFS_POMPIDOU";
    private static final String PREFS_PONTBERCY = "PREFS_PONTBERCY";
    private static final String PREFS_BOURSE = "PREFS_BOURSE";



    SharedPreferences sharedPreferences;

    private int scoreNiveau2 = 0;
    private int scoreTuileries=0;
    private int scoreMonceau=0;
    private int scoreVendome=0;
    private int scoreLoop=0;
    private int scoreConcorde=0;
    private int scoreSorbonne=0;
    private int scorePavillonELysee=0;
    private int scoreConciergerie=0;
    private int scoreGrandPalais=0;
    private int scorePalaisJustice=0;
    private int scoreComedieFrancaise=0;
    private int scoreNotreDame=0;
    private int scorePiscineBaker=0;
    private int scoreBranly=0;
    private int scoreBNF=0;
    private int scorePompidou=0;
    private int scorePontBercy=0;
    private int scoreBourse=0;

    private static final String PREFS_SCORE2 = "PREFS_SCORE2";

    private ImageView check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau_2);

        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);

        if (sharedPreferences.contains(PREFS_TUILERIES)) {
            int cowde = sharedPreferences.getInt(PREFS_TUILERIES,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checktuileries);
                check.setVisibility(View.VISIBLE);
                scoreTuileries=10;
            }
            else{
                scoreTuileries=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_TUILERIES, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_MONCEAU)) {
            int cowde = sharedPreferences.getInt(PREFS_MONCEAU,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkmonceau);
                check.setVisibility(View.VISIBLE);
                scoreMonceau=10;
            }
            else{
                scoreMonceau=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_MONCEAU, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_VENDOME)) {
            int cowde = sharedPreferences.getInt(PREFS_VENDOME,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkvendome);
                check.setVisibility(View.VISIBLE);
                scoreVendome=10;
            }
            else{
                scoreVendome=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_VENDOME, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_LOOP)) {
            int cowde = sharedPreferences.getInt(PREFS_LOOP,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkpagodeloop);
                check.setVisibility(View.VISIBLE);
                scoreLoop=10;
            }
            else{
                scoreLoop=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_LOOP, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_CONCORDE)) {
            int cowde = sharedPreferences.getInt(PREFS_CONCORDE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkconcorde);
                check.setVisibility(View.VISIBLE);
                scoreConcorde=10;
            }
            else{
                scoreConcorde=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_CONCORDE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_SORBONNE)) {
            int cowde = sharedPreferences.getInt(PREFS_SORBONNE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checksorbonne);
                check.setVisibility(View.VISIBLE);
                scoreSorbonne=10;
            }
            else{
                scoreSorbonne=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_SORBONNE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_PAVILLONELYSEE)) {
            int cowde = sharedPreferences.getInt(PREFS_PAVILLONELYSEE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkpavillonelysee);
                check.setVisibility(View.VISIBLE);
                scorePavillonELysee=10;
            }
            else{
                scorePavillonELysee=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_PAVILLONELYSEE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_CONCIERGERIE)) {
            int cowde = sharedPreferences.getInt(PREFS_CONCIERGERIE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkconciergerie);
                check.setVisibility(View.VISIBLE);
                scoreConciergerie=10;
            }
            else{
                scoreConciergerie=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_CONCIERGERIE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_GRANDPALAIS)) {
            int cowde = sharedPreferences.getInt(PREFS_GRANDPALAIS,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkgrandpalais);
                check.setVisibility(View.VISIBLE);
                scoreGrandPalais=10;
            }
            else{
                scoreGrandPalais=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_GRANDPALAIS, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_PALAISJUSTICE)) {
            int cowde = sharedPreferences.getInt(PREFS_PALAISJUSTICE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkpalaisjustice);
                check.setVisibility(View.VISIBLE);
                scorePalaisJustice=10;
            }
            else{
                scorePalaisJustice=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_PALAISJUSTICE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_COMEDIEFRANCAISE)) {
            int cowde = sharedPreferences.getInt(PREFS_COMEDIEFRANCAISE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkcomediefrançaise);
                check.setVisibility(View.VISIBLE);
                scoreComedieFrancaise=10;
            }
            else{
                scoreComedieFrancaise=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_COMEDIEFRANCAISE, 0)
                    .apply();
        }


        if (sharedPreferences.contains(PREFS_NOTREDAME)) {
            int cowde = sharedPreferences.getInt(PREFS_NOTREDAME,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checknotredame);
                check.setVisibility(View.VISIBLE);
                scoreNotreDame=10;
            }
            else{
                scoreNotreDame=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_NOTREDAME, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_PISCINEBAKER)) {
            int cowde = sharedPreferences.getInt(PREFS_PISCINEBAKER,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkpiscinebaker);
                check.setVisibility(View.VISIBLE);
                scorePiscineBaker=10;
            }
            else{
                scorePiscineBaker=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_PISCINEBAKER, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_BRANLY)) {
            int cowde = sharedPreferences.getInt(PREFS_BRANLY,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkbranly);
                check.setVisibility(View.VISIBLE);
                scoreBranly=10;
            }
            else{
                scoreBranly=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_BRANLY, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_BNF)) {
            int cowde = sharedPreferences.getInt(PREFS_BNF,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkbnf);
                check.setVisibility(View.VISIBLE);
                scoreBNF=10;
            }
            else{
                scoreBNF=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_BNF, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_POMPIDOU)) {
            int cowde = sharedPreferences.getInt(PREFS_POMPIDOU,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkpompidou);
                check.setVisibility(View.VISIBLE);
                scorePompidou=10;
            }
            else{
                scorePompidou=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_POMPIDOU, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_PONTBERCY)) {
            int cowde = sharedPreferences.getInt(PREFS_PONTBERCY,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkpontbercy);
                check.setVisibility(View.VISIBLE);
                scorePontBercy=10;
            }
            else{
                scorePontBercy=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_PONTBERCY, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_BOURSE)) {
            int cowde = sharedPreferences.getInt(PREFS_BOURSE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkbourse);
                check.setVisibility(View.VISIBLE);
                scoreBourse=10;
            }
            else{
                scoreBourse=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_BOURSE, 0)
                    .apply();
        }

        Button tuileriesButton = (Button) findViewById(R.id.tuileries);
        tuileriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",21);
                startActivityForResult(i, CODE_TUILERIES);

            }
        });

        if (savedInstanceState != null) {
        }

        Button monceauButton = (Button) findViewById(R.id.monceau);
        monceauButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",23);
                startActivityForResult(i, CODE_MONCEAU);

            }
        });

        Button vendomeButton = (Button) findViewById(R.id.vendome);
        vendomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",25);
                startActivityForResult(i, CODE_VENDOME);

            }
        });

        Button loopButton = (Button) findViewById(R.id.pagodeloop);
        loopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",27);
                startActivityForResult(i, CODE_LOOP);

            }
        });

        Button concordeButton = (Button) findViewById(R.id.concorde);
        concordeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",29);
                startActivityForResult(i, CODE_CONCORDE);

            }
        });

        Button sorbonneButton = (Button) findViewById(R.id.sorbonne);
        sorbonneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",211);
                startActivityForResult(i, CODE_SORBONNE);

            }
        });

        Button pavillonelyseeButton = (Button) findViewById(R.id.pavillonelysee);
        pavillonelyseeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",213);
                startActivityForResult(i, CODE_PAVILLONELYSEE);

            }
        });

        Button conciergerieButton = (Button) findViewById(R.id.conciergerie);
        conciergerieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",215);
                startActivityForResult(i, CODE_CONCIERGERIE);

            }
        });

        Button grandpalaisButton = (Button) findViewById(R.id.grandpalais);
        grandpalaisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",217);
                startActivityForResult(i, CODE_GRANDPALAIS);

            }
        });

        Button palaisjusticeButton = (Button) findViewById(R.id.palaisjustice);
        palaisjusticeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",219);
                startActivityForResult(i, CODE_PALAISJUSTICE);

            }
        });

        Button comediefrButton = (Button) findViewById(R.id.comediefrançaise);
        comediefrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",221);
                startActivityForResult(i, CODE_COMEDIEFRANCAISE);

            }
        });

        Button notredameButton = (Button) findViewById(R.id.notredame);
        notredameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",223);
                startActivityForResult(i, CODE_NOTREDAME);

            }
        });

        Button piscinebakerButton = (Button) findViewById(R.id.piscinebaker);
        piscinebakerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",225);
                startActivityForResult(i, CODE_PISCINEBAKER);

            }
        });
        Button branlyButton = (Button) findViewById(R.id.branly);
        branlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",227);
                startActivityForResult(i, CODE_BRANLY);

            }
        });
        Button bnfButton = (Button) findViewById(R.id.bnf);
        bnfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",229);
                startActivityForResult(i, CODE_BNF);

            }
        });
        Button pompidouButton = (Button) findViewById(R.id.pompidou);
        pompidouButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",231);
                startActivityForResult(i, CODE_POMPIDOU);

            }
        });
        Button pontbercyButton = (Button) findViewById(R.id.pontbercy);
        pontbercyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",233);
                startActivityForResult(i, CODE_PONTBERCY);

            }
        });
        Button bourseButton = (Button) findViewById(R.id.bourse);
        bourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_2.this,ActiviteQuestion.class);
                i.putExtra("code",235);
                startActivityForResult(i, CODE_BOURSE);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // On vérifie que l'opération s'est bien déroulée
        if (resultCode == RESULT_OK) {
            // On vérifie tout d'abord à quel intent on fait référence ici à l'aide de notre identifiant
            if (requestCode == CODE_TUILERIES) {
                //On récupère la réponse du joueur
                String caca = data.getStringExtra("reponse");

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checktuileries);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_TUILERIES);
                    editor.putInt(PREFS_TUILERIES, 1);
                    editor.apply();

                    scoreTuileries = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }



            }


            if (requestCode == CODE_MONCEAU) {
                String caca = data.getStringExtra("reponse");

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkmonceau);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_MONCEAU);
                    editor.putInt(PREFS_MONCEAU, 1);
                    editor.apply();
                    scoreMonceau = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }

            }

            if (requestCode == CODE_VENDOME) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkvendome);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_VENDOME);
                    editor.putInt(PREFS_VENDOME, 1);
                    editor.apply();

                    scoreVendome = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_LOOP) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkpagodeloop);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_LOOP);
                    editor.putInt(PREFS_LOOP, 1);
                    editor.apply();

                    scoreLoop = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_CONCORDE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkconcorde);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_CONCORDE);
                    editor.putInt(PREFS_CONCORDE, 1);
                    editor.apply();

                    scoreConcorde = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_SORBONNE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checksorbonne);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_SORBONNE);
                    editor.putInt(PREFS_SORBONNE, 1);
                    editor.apply();

                    scoreSorbonne = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_PAVILLONELYSEE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkpavillonelysee);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_PAVILLONELYSEE);
                    editor.putInt(PREFS_PAVILLONELYSEE, 1);
                    editor.apply();

                    scorePavillonELysee = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_CONCIERGERIE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkconciergerie);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_CONCIERGERIE);
                    editor.putInt(PREFS_CONCIERGERIE, 1);
                    editor.apply();

                    scoreConciergerie = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_GRANDPALAIS) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkgrandpalais);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_GRANDPALAIS);
                    editor.putInt(PREFS_GRANDPALAIS, 1);
                    editor.apply();

                    scoreGrandPalais = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_PALAISJUSTICE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkpalaisjustice);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_PALAISJUSTICE);
                    editor.putInt(PREFS_PALAISJUSTICE, 1);
                    editor.apply();

                    scorePalaisJustice = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_COMEDIEFRANCAISE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkcomediefrançaise);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_COMEDIEFRANCAISE);
                    editor.putInt(PREFS_COMEDIEFRANCAISE, 1);
                    editor.apply();

                    scoreComedieFrancaise = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_NOTREDAME) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checknotredame);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_NOTREDAME);
                    editor.putInt(PREFS_NOTREDAME, 1);
                    editor.apply();

                    scoreNotreDame = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_PISCINEBAKER) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkpiscinebaker);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_PISCINEBAKER);
                    editor.putInt(PREFS_PISCINEBAKER, 1);
                    editor.apply();

                    scorePiscineBaker = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_BRANLY) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkbranly);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_BRANLY);
                    editor.putInt(PREFS_BRANLY, 1);
                    editor.apply();

                    scoreBranly = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;
                }
            }

            if (requestCode == CODE_BNF) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkbnf);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_BNF);
                    editor.putInt(PREFS_BNF, 1);
                    editor.apply();

                    scoreBNF = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_POMPIDOU) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkpompidou);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_POMPIDOU);
                    editor.putInt(PREFS_POMPIDOU, 1);
                    editor.apply();

                    scorePompidou = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_PONTBERCY) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkpontbercy);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_PONTBERCY);
                    editor.putInt(PREFS_PONTBERCY, 1);
                    editor.apply();

                    scorePontBercy = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }

            if (requestCode == CODE_BOURSE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkbourse);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_BOURSE);
                    editor.putInt(PREFS_BOURSE, 1);
                    editor.apply();

                    scoreBourse = 10;
                    scoreNiveau2 = scoreTuileries+scoreLoop+scoreVendome+scoreMonceau+scoreConcorde+scoreSorbonne+scorePavillonELysee+scoreConciergerie+scoreGrandPalais+scorePalaisJustice+scoreComedieFrancaise+scoreNotreDame+scorePiscineBaker+scoreBranly+scoreBNF+scorePompidou+scorePontBercy+scoreBourse;

                }
            }


            SharedPreferences settings = getSharedPreferences(PREFS, 0);
            SharedPreferences.Editor editor = settings.edit();
            editor.remove(PREFS_SCORE2);
            editor.putInt(PREFS_SCORE2, scoreNiveau2);
            editor.apply();
        }

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

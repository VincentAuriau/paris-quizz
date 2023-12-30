package com.auriau.vincent.parisquizz;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Niveau_3 extends Activity{

    int CODE_GARELYON=32;
    int CODE_HOTELMARINE=34;
    int CODE_CHATELET=36;
    int CODE_KIOSQUE=38;
    int CODE_OPERABASTILLE=310;
    int CODE_BEAUVAU=312;
    int CODE_MOULINROUGE=314;
    int CODE_JARDINSTROCA=316;
    int CODE_CHAPELLEEXPIATOIRE=318;
    int CODE_VILLETTE=320;
    int CODE_BIBLICHAPTAL=322;
    int CODE_RIVOLI=324;
    int CODE_PASSERELLEBAKER=326;
    int CODE_MADELEINE=328;
    int CODE_NECKER=330;
    int CODE_POPB=332;
    int CODE_HDV=334;
    int CODE_PONTALEX3=336;

    private static final String PREFS = "PREFS";
    private static final String PREFS_GARELYON = "PREFS_GARELYON";
    private static final String PREFS_HOTELMARINE = "PREFS_HOTELMARINE";
    private static final String PREFS_CHATELET = "PREFS_CHATELET";
    private static final String PREFS_KIOSQUE = "PREFS_KIOSQUE";
    private static final String PREFS_OPERABASTILLE = "PREFS_OPERABASTILLE";
    private static final String PREFS_BEAUVAU = "PREFS_BEAUVAU";
    private static final String PREFS_MOULINROUGE = "PREFS_MOULINROUGE ";
    private static final String PREFS_JARDINSTROCA = "PREFS_JARDINSTROCA";
    private static final String PREFS_CHAPELLEEXPIATOIRE = "PREFS_CHAPELLEEXPIATOIRE";
    private static final String PREFS_VILLETTE = "PREFS_VILLETTE";
    private static final String PREFS_BIBLICHAPTAL = "PREFS_BIBLICHAPTAL";
    private static final String PREFS_RIVOLI = "PREFS_RIVOLI";
    private static final String PREFS_PASSERELLEBAKER = "PREFS_PASSERELLEBAKER";
    private static final String PREFS_MADELEINE = "PREFS_MADELEINE";
    private static final String PREFS_NECKER = "PREFS_NECKER";
    private static final String PREFS_POPB = "PREFS_POPB";
    private static final String PREFS_HDV = "PREFS_HDV";
    private static final String PREFS_PONTALEX3 = "PREFS_PONTALEX3";


    SharedPreferences sharedPreferences;

    private int scoreNiveau3 = 0;
    private int scoreGareLyon=0;
    private int scoreHotelMarine=0;
    private int scoreChatelet=0;
    private int scoreKiosque=0;
    private int scoreOperaBastille=0;
    private int scoreBeauvau=0;
    private int scoreMoulinRouge=0;
    private int scoreJardinsTroca=0;
    private int scoreChapelleExpiatoire=0;
    private int scoreVillette=0;
    private int scoreBibliChaptal=0;
    private int scoreRivoli=0;
    private int scorePasserelleBaker=0;
    private int scoreMadeleine=0;
    private int scoreNecker=0;
    private int scorePOPB=0;
    private int scoreHDV=0;
    private int scorePontAlex3=0;

    private static final String PREFS_SCORE3 = "PREFS_SCORE3";

    private ImageView check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau_3);

        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);

        if (sharedPreferences.contains(PREFS_GARELYON)) {
            int cowde = sharedPreferences.getInt(PREFS_GARELYON,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkgarelyon);
                check.setVisibility(View.VISIBLE);
                scoreGareLyon=10;
            }
            else{
                scoreGareLyon=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_GARELYON, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_HOTELMARINE)) {
            int cowde = sharedPreferences.getInt(PREFS_HOTELMARINE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkhotelmarine);
                check.setVisibility(View.VISIBLE);
                scoreHotelMarine=10;
            }
            else{
                scoreHotelMarine=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_HOTELMARINE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_CHATELET)) {
            int cowde = sharedPreferences.getInt(PREFS_CHATELET,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkchatelet);
                check.setVisibility(View.VISIBLE);
                scoreChatelet=10;
            }
            else{
                scoreChatelet=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_CHATELET, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_KIOSQUE )) {
            int cowde = sharedPreferences.getInt(PREFS_KIOSQUE ,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkkiosque);
                check.setVisibility(View.VISIBLE);
                scoreKiosque=10;
            }
            else{
                scoreKiosque=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_KIOSQUE , 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_OPERABASTILLE)) {
            int cowde = sharedPreferences.getInt(PREFS_OPERABASTILLE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkoperabastille);
                check.setVisibility(View.VISIBLE);
                scoreOperaBastille=10;
            }
            else{
                scoreOperaBastille=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_OPERABASTILLE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_BEAUVAU)) {
            int cowde = sharedPreferences.getInt(PREFS_BEAUVAU,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkbeauvau);
                check.setVisibility(View.VISIBLE);
                scoreBeauvau=10;
            }
            else{
                scoreBeauvau=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_BEAUVAU, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_MOULINROUGE)) {
            int cowde = sharedPreferences.getInt(PREFS_MOULINROUGE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkmoulinrouge);
                check.setVisibility(View.VISIBLE);
                scoreMoulinRouge=10;
            }
            else{
                scoreMoulinRouge=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_MOULINROUGE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_JARDINSTROCA)) {
            int cowde = sharedPreferences.getInt(PREFS_JARDINSTROCA,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkjardinstroca);
                check.setVisibility(View.VISIBLE);
                scoreJardinsTroca=10;
            }
            else{
                scoreJardinsTroca=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_JARDINSTROCA, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_CHAPELLEEXPIATOIRE)) {
            int cowde = sharedPreferences.getInt(PREFS_CHAPELLEEXPIATOIRE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkchapelleexpiatoire);
                check.setVisibility(View.VISIBLE);
                scoreChapelleExpiatoire=10;
            }
            else{
                scoreChapelleExpiatoire=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_CHAPELLEEXPIATOIRE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_VILLETTE )) {
            int cowde = sharedPreferences.getInt(PREFS_VILLETTE ,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkvillette);
                check.setVisibility(View.VISIBLE);
                scoreVillette=10;
            }
            else{
                scoreVillette=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_VILLETTE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_BIBLICHAPTAL)) {
            int cowde = sharedPreferences.getInt(PREFS_BIBLICHAPTAL,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkbiblichaptal);
                check.setVisibility(View.VISIBLE);
                scoreBibliChaptal=10;
            }
            else{
                scoreBibliChaptal=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_BIBLICHAPTAL, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_RIVOLI)) {
            int cowde = sharedPreferences.getInt(PREFS_RIVOLI, 0);
            if (cowde == 1) {
                check = (ImageView) findViewById(R.id.checkrivoli);
                check.setVisibility(View.VISIBLE);
                scoreRivoli = 10;
            } else {
                scoreRivoli = 0;
            }
        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_RIVOLI, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_HDV)) {
            int cowde = sharedPreferences.getInt(PREFS_HDV, 0);
            if (cowde == 1) {
                check = (ImageView) findViewById(R.id.checkhdv);
                check.setVisibility(View.VISIBLE);
                scoreHDV = 10;
            } else {
                scoreHDV = 0;
            }
        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_HDV, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_PONTALEX3)) {
            int cowde = sharedPreferences.getInt(PREFS_PONTALEX3, 0);
            if (cowde == 1) {
                check = (ImageView) findViewById(R.id.checkpontalex3);
                check.setVisibility(View.VISIBLE);
                scorePontAlex3 = 10;
            } else {
                scorePontAlex3 = 0;
            }
        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_PONTALEX3, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_PASSERELLEBAKER)) {
            int cowde = sharedPreferences.getInt(PREFS_PASSERELLEBAKER, 0);
            if (cowde == 1) {
                check = (ImageView) findViewById(R.id.checkpasserellebaker);
                check.setVisibility(View.VISIBLE);
                scorePasserelleBaker = 10;
            } else {
                scorePasserelleBaker= 0;
            }
        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_PASSERELLEBAKER, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_MADELEINE)) {
            int cowde = sharedPreferences.getInt(PREFS_MADELEINE, 0);
            if (cowde == 1) {
                check = (ImageView) findViewById(R.id.checkmadeleine);
                check.setVisibility(View.VISIBLE);
                scoreMadeleine = 10;
            } else {
                scoreMadeleine = 0;
            }
        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_MADELEINE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_NECKER)) {
            int cowde = sharedPreferences.getInt(PREFS_NECKER, 0);
            if (cowde == 1) {
                check = (ImageView) findViewById(R.id.checknecker);
                check.setVisibility(View.VISIBLE);
                scoreNecker = 10;
            } else {
                scoreNecker = 0;
            }
        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_NECKER, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_POPB)) {
            int cowde = sharedPreferences.getInt(PREFS_POPB, 0);
            if (cowde == 1) {
                check = (ImageView) findViewById(R.id.checkpopb);
                check.setVisibility(View.VISIBLE);
                scorePOPB = 10;
            } else {
                scorePOPB = 0;
            }
        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_POPB, 0)
                    .apply();
        }


        Button garelyonButton = (Button) findViewById(R.id.garelyon);
        garelyonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",31);
                startActivityForResult(i, CODE_GARELYON);
            }
        });

        if (savedInstanceState != null) {
        }

        Button hotelmarineButton = (Button) findViewById(R.id.hotelmarine);
        hotelmarineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",33);
                startActivityForResult(i, CODE_HOTELMARINE);
            }
        });

        Button chateletButton = (Button) findViewById(R.id.chatelet);
        chateletButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",35);
                startActivityForResult(i, CODE_CHATELET);
            }
        });

        Button kiosqueButton = (Button) findViewById(R.id.kiosque);
        kiosqueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",37);
                startActivityForResult(i, CODE_KIOSQUE);
            }
        });

        Button operabastilleButton = (Button) findViewById(R.id.operabastille);
        operabastilleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",39);
                startActivityForResult(i, CODE_OPERABASTILLE);
            }
        });

        Button beauvauButton = (Button) findViewById(R.id.placebeauvau);
        beauvauButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",311);
                startActivityForResult(i, CODE_BEAUVAU);
            }
        });

        Button moulinrougeButton = (Button) findViewById(R.id.moulinrouge);
        moulinrougeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",313);
                startActivityForResult(i, CODE_MOULINROUGE);
            }
        });


        Button jardinstrocaButton = (Button) findViewById(R.id.jardinstroca);
        jardinstrocaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",315);startActivityForResult(i, CODE_JARDINSTROCA);

            }
        });

        Button chapelleexpButton = (Button) findViewById(R.id.chapelleexpiatoire);
        chapelleexpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code", 317);
                startActivityForResult(i, CODE_CHAPELLEEXPIATOIRE);
            }
        });

        Button villetteButton = (Button) findViewById(R.id.villette);
        villetteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",319);
                startActivityForResult(i, CODE_VILLETTE);
            }
        });

        Button biblichaptalButton = (Button) findViewById(R.id.biblichaptal);
        biblichaptalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",321);
                startActivityForResult(i, CODE_BIBLICHAPTAL);
            }
        });

        Button rivoliButton = (Button) findViewById(R.id.ruerivoli);
        rivoliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",323);
                startActivityForResult(i, CODE_RIVOLI);
            }
        });

        Button passerellebakerButton = (Button) findViewById(R.id.passerellebaker);
        passerellebakerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",325);
                startActivityForResult(i, CODE_PASSERELLEBAKER);
            }
        });

        Button neckerButton = (Button) findViewById(R.id.necker);
        neckerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",329);
                startActivityForResult(i, CODE_NECKER);
            }
        });

        Button popbButton = (Button) findViewById(R.id.popb);
        popbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",331);
                startActivityForResult(i, CODE_POPB);
            }
        });

        Button hdvButton = (Button) findViewById(R.id.hdv);
        hdvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",333);
                startActivityForResult(i, CODE_HDV);
            }
        });

        Button madeleineButton = (Button) findViewById(R.id.madeleine);
        madeleineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",327);
                startActivityForResult(i, CODE_MADELEINE);
            }
        });

        Button pontalex3Button = (Button) findViewById(R.id.pontalex3);
        pontalex3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_3.this,ActiviteQuestion.class);
                i.putExtra("code",335);
                startActivityForResult(i, CODE_PONTALEX3);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // On vérifie que l'opération s'est bien déroulée
        if (resultCode == RESULT_OK) {
            // On vérifie tout d'abord à quel intent on fait référence ici à l'aide de notre identifiant
            if (requestCode == CODE_GARELYON) {
                //On récupère la réponse du joueur
                String caca = data.getStringExtra("reponse");

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkgarelyon);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_GARELYON);
                    editor.putInt(PREFS_GARELYON, 1);
                    editor.apply();

                    scoreGareLyon = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;
                }



            }


            if (requestCode == CODE_HOTELMARINE) {
                String caca = data.getStringExtra("reponse");

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkhotelmarine);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_HOTELMARINE);
                    editor.putInt(PREFS_HOTELMARINE, 1);
                    editor.apply();
                    scoreHotelMarine = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }

            }

            if (requestCode == CODE_CHATELET) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkchatelet);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_CHATELET);
                    editor.putInt(PREFS_CHATELET, 1);
                    editor.apply();

                    scoreChatelet = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_KIOSQUE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkkiosque);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_KIOSQUE);
                    editor.putInt(PREFS_KIOSQUE, 1);
                    editor.apply();

                    scoreKiosque = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_OPERABASTILLE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkoperabastille);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_OPERABASTILLE);
                    editor.putInt(PREFS_OPERABASTILLE, 1);
                    editor.apply();

                    scoreOperaBastille = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_BEAUVAU) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkbeauvau);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_BEAUVAU);
                    editor.putInt(PREFS_BEAUVAU, 1);
                    editor.apply();

                    scoreBeauvau = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_MOULINROUGE) {
                //On récupère la réponse du joueur
                String caca = data.getStringExtra("reponse");

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkmoulinrouge);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_MOULINROUGE);
                    editor.putInt(PREFS_MOULINROUGE,1);
                    editor.apply();

                    scoreMoulinRouge = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;
                }



            }


            if (requestCode == CODE_JARDINSTROCA) {
                String caca = data.getStringExtra("reponse");

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkjardinstroca);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_JARDINSTROCA);
                    editor.putInt(PREFS_JARDINSTROCA, 1);
                    editor.apply();
                    scoreJardinsTroca = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }

            }

            if (requestCode == CODE_CHAPELLEEXPIATOIRE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkchapelleexpiatoire);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_CHAPELLEEXPIATOIRE);
                    editor.putInt(PREFS_CHAPELLEEXPIATOIRE, 1);
                    editor.apply();

                    scoreChapelleExpiatoire = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_VILLETTE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkvillette);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_VILLETTE);
                    editor.putInt(PREFS_VILLETTE, 1);
                    editor.apply();

                    scoreVillette = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_BIBLICHAPTAL) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkbiblichaptal);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_BIBLICHAPTAL);
                    editor.putInt(PREFS_BIBLICHAPTAL, 1);
                    editor.apply();

                    scoreBibliChaptal = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_RIVOLI) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkrivoli);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_RIVOLI);
                    editor.putInt(PREFS_RIVOLI, 1);
                    editor.apply();

                    scoreRivoli = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_PASSERELLEBAKER) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkpasserellebaker);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_PASSERELLEBAKER);
                    editor.putInt(PREFS_PASSERELLEBAKER, 1);
                    editor.apply();

                    scorePasserelleBaker = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_MADELEINE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkmadeleine);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_MADELEINE);
                    editor.putInt(PREFS_MADELEINE, 1);
                    editor.apply();

                    scoreMadeleine = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_NECKER) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checknecker);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_NECKER);
                    editor.putInt(PREFS_NECKER, 1);
                    editor.apply();

                    scoreNecker = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_POPB) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkpopb);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_POPB);
                    editor.putInt(PREFS_POPB, 1);
                    editor.apply();

                    scorePOPB = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_HDV) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkhdv);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_HDV);
                    editor.putInt(PREFS_HDV, 1);
                    editor.apply();

                    scoreHDV = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            if (requestCode == CODE_PONTALEX3) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")) {
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check = (ImageView) findViewById(R.id.checkpontalex3);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_PONTALEX3);
                    editor.putInt(PREFS_PONTALEX3, 1);
                    editor.apply();

                    scorePontAlex3 = 10;
                    scoreNiveau3 = scoreGareLyon+scoreHotelMarine+scoreChatelet+scoreKiosque+scoreOperaBastille+scoreBeauvau+scoreMoulinRouge+scoreVillette+scoreChapelleExpiatoire+scoreJardinsTroca+scoreBibliChaptal+scoreRivoli+scorePasserelleBaker+scoreMadeleine+scoreNecker+scorePOPB+scoreHDV+scorePontAlex3;

                }
            }

            SharedPreferences settings = getSharedPreferences(PREFS, 0);
            SharedPreferences.Editor editor = settings.edit();
            editor.remove(PREFS_SCORE3);
            editor.putInt(PREFS_SCORE3, scoreNiveau3);
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
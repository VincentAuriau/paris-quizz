package com.auriau.vincent.parisquizz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class Niveau_1 extends Activity {

    int CODE_GARNIER=12;
    int CODE_LORETTES=14;
    int CODE_TRINITE=16;
    int CODE_SACRECOEUR=18; ///A changer
    int CODE_JETAIME=110;
    int CODE_BASKETDUPERRE=112;
    int CODE_GARENORD=114;
    int CODE_CANALSTMARTIN=116;
    int CODE_BASSINARSENAL=118;
    int CODE_BUREN=120;
    int CODE_MUSEEORSAY=122;
    int CODE_VOSGES=124;
    int CODE_GAREEST=126;
    int CODE_PETITPALAIS=128;
    int CODE_EGLISELOUISPAUL=130;
    int CODE_PLACESTMICHEL=132;
    int CODE_ELYSEE=134;
    int CODE_DESCARTES=136;

    private static final String PREFS = "PREFS";
    private static final String PREFS_GARNIER = "PREFS_GARNIER";
    private static final String PREFS_LORETTES = "PREFS_LORETTES";
    private static final String PREFS_TRINITE = "PREFS_TRINITE";
    private static final String PREFS_SACRECOEUR = "PREFS_SACRECOEUR";
    private static final String PREFS_JETAIME = "PREFS_JETAIME";
    private static final String PREFS_BASKETDUPERRE = "PREFS_BASKETDUPERRE";
    private static final String PREFS_GARENORD = "PREFS_GARENORD";
    private static final String PREFS_CANLSTMARTIN = "PREFS_CANALSTMARTIN";
    private static final String PREFS_BASSINARSENAL = "PREFS_BASSINARSENAL";
    private static final String PREFS_BUREN = "PREFS_BUREN";
    private static final String PREFS_MUSEEORSAY = "PREFS_MUSEEORSAY";
    private static final String PREFS_VOSGES = "PREFS_VOSGES";
    private static final String PREFS_GAREEST = "PREFS_GAREEST";
    private static final String PREFS_PETITPALAIS = "PREFS_PETITPALAIS";
    private static final String PREFS_EGLISELOUISPAUL = "PREFS_EGLISELOUISPAUL";
    private static final String PREFS_PLACESTMICHEL = "PREFS_PLACESTMICHEL";
    private static final String PREFS_ELYSEE = "PREFS_ELYSEE";
    private static final String PREFS_DESCARTES = "PREFS_DESCARTES";
    SharedPreferences sharedPreferences;

    private int scoreNiveau1 = 0;
    private int scoreGarnier=0;
    private int scoreLorettes=0;
    private int scoreTrinite=0;
    private int scoreSacreCoeur =0;
    private int scoreJetaime=0;
    private int scoreBasketDuperre=0;
    private int scoreGareduNord=0;
    private int scoreCanalStMartin=0;
    private int scoreBassinArsenal = 0;
    private int scoreBuren = 0;
    private int scoreMuseeOrsay = 0;
    private int scoreVosges = 0;
    private int scoreGareEst = 0;
    private int scorePetitPalais = 0;
    private int scoreEgliseLouisPaul = 0;
    private int scorePlaceStMichel = 0;
    private int scoreElysee = 0;
    private int scoreDescartes = 0;

    private static final String PREFS_SCORE1 = "PREFS_SCORE1";

    private ImageView check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau_1);

        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);

        if (sharedPreferences.contains(PREFS_GARNIER)) {
            int cowde = sharedPreferences.getInt(PREFS_GARNIER,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkgarnier);
                check.setVisibility(View.VISIBLE);
                scoreGarnier=10;
            }
            else{
                scoreGarnier=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_GARNIER, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_LORETTES)) {
            int cowde = sharedPreferences.getInt(PREFS_LORETTES,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checklorette);
                check.setVisibility(View.VISIBLE);
                scoreLorettes=10;
            }
            else{
                scoreLorettes=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_LORETTES, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_TRINITE)) {
            int cowde = sharedPreferences.getInt(PREFS_TRINITE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checktrinite);
                check.setVisibility(View.VISIBLE);
                scoreTrinite=10;
            }
            else{
                scoreTrinite=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_TRINITE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_SACRECOEUR)) {
            int cowde = sharedPreferences.getInt(PREFS_SACRECOEUR,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checksacrecoeur);
                check.setVisibility(View.VISIBLE);
                scoreSacreCoeur =10;
            }
            else{
                scoreSacreCoeur =0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_SACRECOEUR, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_JETAIME)) {
            int cowde = sharedPreferences.getInt(PREFS_JETAIME,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkmurjetaime);
                check.setVisibility(View.VISIBLE);
                scoreJetaime=10;
            }
            else{
                scoreJetaime=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_JETAIME, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_BASKETDUPERRE)) {
            int cowde = sharedPreferences.getInt(PREFS_BASKETDUPERRE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkbasketduperre);
                check.setVisibility(View.VISIBLE);
                scoreBasketDuperre=10;
            }
            else{
                scoreBasketDuperre=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_BASKETDUPERRE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_GARENORD)) {
            int cowde = sharedPreferences.getInt(PREFS_GARENORD,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkgaredunord);
                check.setVisibility(View.VISIBLE);
                scoreGareduNord=10;
            }
            else{
                scoreGareduNord=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_GARENORD, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_CANLSTMARTIN)) {
            int cowde = sharedPreferences.getInt(PREFS_CANLSTMARTIN,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkcanalstmartin);
                check.setVisibility(View.VISIBLE);
                scoreCanalStMartin=10;
            }
            else{
                scoreCanalStMartin=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_CANLSTMARTIN, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_BASSINARSENAL)) {
            int cowde = sharedPreferences.getInt(PREFS_BASSINARSENAL,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkbassinarsenal);
                check.setVisibility(View.VISIBLE);
                scoreBassinArsenal=10;
            }
            else{
                scoreBassinArsenal=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_BASSINARSENAL, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_BUREN)) {
            int cowde = sharedPreferences.getInt(PREFS_BUREN,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkcolonnesburen);
                check.setVisibility(View.VISIBLE);
                scoreBuren=10;
            }
            else{
                scoreBuren=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_BUREN, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_MUSEEORSAY)) {
            int cowde = sharedPreferences.getInt(PREFS_MUSEEORSAY,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkmuseeorsay);
                check.setVisibility(View.VISIBLE);
                scoreMuseeOrsay=10;
            }
            else{
                scoreMuseeOrsay=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_MUSEEORSAY, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_VOSGES)) {
            int cowde = sharedPreferences.getInt(PREFS_VOSGES,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkplacevosges);
                check.setVisibility(View.VISIBLE);
                scoreVosges=10;
            }
            else{
                scoreVosges=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_VOSGES, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_GAREEST)) {
            int cowde = sharedPreferences.getInt(PREFS_GAREEST,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkgareest);
                check.setVisibility(View.VISIBLE);
                scoreGareEst=10;
            }
            else{
                scoreGareEst=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_GAREEST, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_PETITPALAIS)) {
            int cowde = sharedPreferences.getInt(PREFS_PETITPALAIS,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkpetitpalais);
                check.setVisibility(View.VISIBLE);
                scorePetitPalais=10;
            }
            else{
                scorePetitPalais=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_PETITPALAIS, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_EGLISELOUISPAUL)) {
            int cowde = sharedPreferences.getInt(PREFS_EGLISELOUISPAUL,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkeglisestlouistpaul);
                check.setVisibility(View.VISIBLE);
                scoreEgliseLouisPaul=10;
            }
            else{
                scoreEgliseLouisPaul=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_EGLISELOUISPAUL, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_PLACESTMICHEL)) {
            int cowde = sharedPreferences.getInt(PREFS_PLACESTMICHEL,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkstmichel);
                check.setVisibility(View.VISIBLE);
                scorePlaceStMichel=10;
            }
            else{
                scorePlaceStMichel=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_PLACESTMICHEL, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_ELYSEE)) {
            int cowde = sharedPreferences.getInt(PREFS_ELYSEE,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkelysee);
                check.setVisibility(View.VISIBLE);
                scoreElysee=10;
            }
            else{
                scoreElysee=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_ELYSEE, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_DESCARTES)) {
            int cowde = sharedPreferences.getInt(PREFS_DESCARTES,0);
            if(cowde==1){
                check=(ImageView) findViewById(R.id.checkdescartes);
                check.setVisibility(View.VISIBLE);
                scoreDescartes=10;
            }
            else{
                scoreDescartes=0;
            }

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_DESCARTES, 0)
                    .apply();
        }

        if (sharedPreferences.contains(PREFS_SCORE1)) {
            scoreNiveau1 = sharedPreferences.getInt(PREFS_SCORE1,0);

        }else {
            sharedPreferences
                    .edit()
                    .putInt(PREFS_SCORE1, 0)
                    .apply();
        }

        Button garnierButton = (Button) findViewById(R.id.operagarnier);
        garnierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",11);
                startActivityForResult(i, CODE_GARNIER);

            }
        });

        if (savedInstanceState != null) {
        }

        Button lorettesButton = (Button) findViewById(R.id.notredamelorette);
        lorettesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",13);
                startActivityForResult(i, CODE_LORETTES);

            }
        });

        Button triniteButton = (Button) findViewById(R.id.trinite);
        triniteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",15);
                startActivityForResult(i, CODE_TRINITE);

            }
        });

        Button sacrecoeurButton = (Button) findViewById(R.id.sacrecoeur);
        sacrecoeurButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",17);
                startActivityForResult(i, CODE_SACRECOEUR);

            }
        });

        Button jetaimeButton = (Button) findViewById(R.id.murjetaime);
        jetaimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",19);
                startActivityForResult(i, CODE_JETAIME);

            }
        });

        Button basketDuperreButton = (Button) findViewById(R.id.basketduperre);
        basketDuperreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",111);
                startActivityForResult(i, CODE_BASKETDUPERRE);

            }
        });

        Button gareNordButton = (Button) findViewById(R.id.garedunord);
        gareNordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",113);
                startActivityForResult(i, CODE_GARENORD);

            }
        });

        Button canalMartinButton = (Button) findViewById(R.id.canalstmartin);
        canalMartinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",115);
                startActivityForResult(i, CODE_CANALSTMARTIN);

            }
        });

        Button canalBassinArsenal = (Button) findViewById(R.id.bassinarsenal);
        canalBassinArsenal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",117);
                startActivityForResult(i, CODE_BASSINARSENAL);

            }
        });

        Button BurenButton = (Button) findViewById(R.id.colonnesburen);
        BurenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",119);
                startActivityForResult(i, CODE_BUREN);

            }
        });

        Button MuseeOrsayButton = (Button) findViewById(R.id.museeorsay);
        MuseeOrsayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",121);
                startActivityForResult(i, CODE_MUSEEORSAY);

            }
        });

        Button VosgesButton = (Button) findViewById(R.id.placevosges);
        VosgesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",123);
                startActivityForResult(i, CODE_VOSGES);

            }
        });

        Button GareEstButton = (Button) findViewById(R.id.gareest);
        GareEstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",125);
                startActivityForResult(i, CODE_GAREEST);

            }
        });

        Button PetitPalaisButton = (Button) findViewById(R.id.petitpalais);
        PetitPalaisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",127);
                startActivityForResult(i, CODE_PETITPALAIS);

            }
        });

        Button LouisPaulButton = (Button) findViewById(R.id.eglisestlouisstpaul);
        LouisPaulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",129);
                startActivityForResult(i, CODE_EGLISELOUISPAUL);

            }
        });

        Button StMichelButton = (Button) findViewById(R.id.placestmichel);
        StMichelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",131);
                startActivityForResult(i, CODE_PLACESTMICHEL);

            }
        });

        Button ElyseeButton = (Button) findViewById(R.id.elysee);
        ElyseeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",133);
                startActivityForResult(i, CODE_ELYSEE);

            }
        });

        Button DescartesButton = (Button) findViewById(R.id.cdescartes);
        DescartesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Niveau_1.this,ActiviteQuestion.class);
                i.putExtra("code",135);
                startActivityForResult(i, CODE_DESCARTES);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // On vérifie que l'opération s'est bien déroulée
        if (resultCode == RESULT_OK){
            // On vérifie tout d'abord à quel intent on fait référence ici à l'aide de notre identifiant
            if (requestCode == CODE_GARNIER) {
                //On récupère la réponse du joueur
                String caca = data.getStringExtra("reponse");

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo" , Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkgarnier);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_GARNIER);
                    editor.putInt(PREFS_GARNIER, 1);
                    editor.apply();

                    scoreGarnier=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }

            }


            if (requestCode == CODE_LORETTES) {
                String caca = data.getStringExtra("reponse");

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checklorette);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_LORETTES);
                    editor.putInt(PREFS_LORETTES, 1);
                    editor.apply();
                    scoreLorettes=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;
                }

            }

            if (requestCode == CODE_TRINITE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.contains("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checktrinite);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_TRINITE);
                    editor.putInt(PREFS_TRINITE, 1);
                    editor.apply();

                    scoreTrinite=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;
                }
            }

            if (requestCode == CODE_SACRECOEUR) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checksacrecoeur);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_SACRECOEUR);
                    editor.putInt(PREFS_SACRECOEUR, 1);
                    editor.apply();

                    scoreSacreCoeur =10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_JETAIME) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkmurjetaime);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_JETAIME);
                    editor.putInt(PREFS_JETAIME, 1);
                    editor.apply();

                    scoreJetaime=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_BASKETDUPERRE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkbasketduperre);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_BASKETDUPERRE);
                    editor.putInt(PREFS_BASKETDUPERRE, 1);
                    editor.apply();

                    scoreBasketDuperre=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_GARENORD) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkgaredunord);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_GARENORD);
                    editor.putInt(PREFS_GARENORD, 1);
                    editor.apply();

                    scoreGareduNord=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_CANALSTMARTIN) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkcanalstmartin);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_CANLSTMARTIN);
                    editor.putInt(PREFS_CANLSTMARTIN, 1);
                    editor.apply();

                    scoreCanalStMartin=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_BASSINARSENAL) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkbassinarsenal);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_BASSINARSENAL);
                    editor.putInt(PREFS_BASSINARSENAL, 1);
                    editor.apply();

                    scoreBassinArsenal=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_BUREN) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkcolonnesburen);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_BUREN);
                    editor.putInt(PREFS_BUREN, 1);
                    editor.apply();

                    scoreBuren=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_MUSEEORSAY) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkmuseeorsay);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_MUSEEORSAY);
                    editor.putInt(PREFS_MUSEEORSAY, 1);
                    editor.apply();

                    scoreMuseeOrsay=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_VOSGES) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkplacevosges);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_VOSGES);
                    editor.putInt(PREFS_VOSGES, 1);
                    editor.apply();

                    scoreVosges=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_GAREEST) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkgareest);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_GAREEST);
                    editor.putInt(PREFS_GAREEST, 1);
                    editor.apply();

                    scoreGareEst=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_PETITPALAIS) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkpetitpalais);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_PETITPALAIS);
                    editor.putInt(PREFS_PETITPALAIS, 1);
                    editor.apply();

                    scorePetitPalais=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_EGLISELOUISPAUL) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkeglisestlouistpaul);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_EGLISELOUISPAUL);
                    editor.putInt(PREFS_EGLISELOUISPAUL, 1);
                    editor.apply();

                    scoreEgliseLouisPaul=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_PLACESTMICHEL) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkstmichel);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_PLACESTMICHEL);
                    editor.putInt(PREFS_PLACESTMICHEL, 1);
                    editor.apply();

                    scorePlaceStMichel=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_ELYSEE) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkelysee);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_ELYSEE);
                    editor.putInt(PREFS_ELYSEE, 1);
                    editor.apply();

                    scoreElysee=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            if (requestCode == CODE_DESCARTES) {
                String caca = data.getStringExtra("reponse");
                // On vérifie aussi que l'opération s'est bien déroulée

                if (caca.equals("trouve")){
                    Toast.makeText(this, "Bravo", Toast.LENGTH_SHORT).show();
                    check=(ImageView) findViewById(R.id.checkdescartes);
                    check.setVisibility(View.VISIBLE);

                    SharedPreferences settings = getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.remove(PREFS_DESCARTES);
                    editor.putInt(PREFS_DESCARTES, 1);
                    editor.apply();

                    scoreDescartes=10;
                    scoreNiveau1=scoreGarnier+scoreLorettes+scoreTrinite+ scoreSacreCoeur +scoreJetaime+scoreBasketDuperre+scoreGareduNord+scoreCanalStMartin+scoreBassinArsenal+scoreBuren+scoreMuseeOrsay+scoreVosges+scoreGareEst+scorePetitPalais+scoreEgliseLouisPaul+scorePlaceStMichel+scoreElysee+scoreDescartes;

                }
            }

            SharedPreferences settings = getSharedPreferences(PREFS, 0);
            SharedPreferences.Editor editor = settings.edit();
            editor.remove(PREFS_SCORE1);
            editor.putInt(PREFS_SCORE1, scoreNiveau1);
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

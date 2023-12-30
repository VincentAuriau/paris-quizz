package com.auriau.vincent.parisquizz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by Vincent on 24/09/2016.
 */
public class AffichageImage extends Activity{

    int codex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.affichage_image);

        RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

        ImageView img = new ImageView(this);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        img.setLayoutParams(lp);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            codex=extras.getInt("code");
        }
        if (codex==11){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.opera_garnier);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==13){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.eglise_notre_dame_des_lorettes);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==15){
            img.setBackgroundResource(R.drawable.eglise_saint_augustin_2);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==17){
            img.setBackgroundResource(R.drawable.sacre_coeur);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==19){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.mur_je_taime);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==111){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.basket_duperre);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==113){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.gare_nord);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==115){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.canal_saint_martin);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==117){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.bassin_arsenal);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==119){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.colonnes_buren);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==121){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.musee_orsay);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==123){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.place_vosges);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==125){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.gare_est);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==127){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.petit_palais);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==129){
            img.setBackgroundResource(R.drawable.eglise_stlouis_stpaul);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==131){
            img.setBackgroundResource(R.drawable.place_stmichel);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==133){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.elysee);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==135){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.descartes);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==21){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.tuileries);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==23){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.parc_monceau);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==25){
            img.setBackgroundResource(R.drawable.place_vendome);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==27){
            img.setBackgroundResource(R.drawable.pagode_loop);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==29){
            img.setBackgroundResource(R.drawable.place_concorde_2);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==211){
            img.setBackgroundResource(R.drawable.la_sorbonne);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==213){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.pavillon_elysee);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==215){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.conciergerie);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==217){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.grand_palais);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==219){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.palais_justice);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==221){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.comedie_francaise);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==223){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.notre_dame);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==225){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.piscine_josephine_baker);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }


        if (codex==227){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.quai_branly);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }


        if (codex==229){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.bnf);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }


        if (codex==231){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.pompidou);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }


        if (codex==233){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.pont_bercy);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }


        if (codex==235){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.bourse);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }


        if (codex==31){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.gare_lyon);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==33){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.hotel_marine);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==35){
            img.setBackgroundResource(R.drawable.place_chatelet);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==37){
            img.setBackgroundResource(R.drawable.kiosque_noctambules_palais_royal);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==39){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.opera_bastille);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==311){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.place_beauvau);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==313){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.moulin_rouge);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==315){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.jardins_troca);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==317){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.chapelle_expiatoire);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==319){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.la_villette);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==321){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.bibli_chaptal);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==323){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.rue_rivoli);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==325){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.passerelle_josephine_baker);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==327){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.madeleine);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }
        if (codex==329){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.hopital_necker);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==331){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.palais_bercy);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }

        if (codex==333){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.hotel_de_ville);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
        }
        if (codex==335){
            img.setRotation(90);
            img.setBackgroundResource(R.drawable.pont_alexandre_3);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);
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
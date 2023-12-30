package com.auriau.vincent.parisquizz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class ActiviteQuestion extends Activity {
    //http://www.eteks.com/tips/tip4.html

    int codex=0;
    EditText reponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activite_question);

        //On récupère le bouton de validation de la proposition
        Button validerButton = (Button) findViewById(R.id.valider);

        //On récupère les infos envoyés lors de la création de l'intent dans le niveau
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            codex=extras.getInt("code");
        }

        //Selon le code passé, on affiche l'image correspondant à celle cliquée
        if (codex==11){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            Button img = new Button(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            //img.setScaleType(ImageView.ScaleType.CENTER);
            img.setBackgroundResource(R.drawable.opera_garnier);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==13){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.eglise_notre_dame_des_lorettes);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==15){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.eglise_saint_augustin_2);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==17){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.sacre_coeur);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==19){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.mur_je_taime);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==111){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.basket_duperre);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==113){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.gare_nord);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==115){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.canal_saint_martin);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==117){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.bassin_arsenal);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==119){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.colonnes_buren);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==121){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.musee_orsay);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==123){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.place_vosges);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==125){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.gare_est);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==127){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.petit_palais);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==129){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.eglise_stlouis_stpaul);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==131){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.place_stmichel);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==133){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.elysee);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==135){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.descartes);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==21){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.tuileries);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==23){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.parc_monceau);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==25){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.place_vendome);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==27){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.pagode_loop);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==29){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.place_concorde_2);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==211){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.la_sorbonne);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==213){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.pavillon_elysee);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==215){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.conciergerie);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==217){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.grand_palais);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==219){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.palais_justice);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==221){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.comedie_francaise);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==223){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.notre_dame);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==225){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.piscine_josephine_baker);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==227){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.quai_branly);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==229){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.bnf);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==231){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.pompidou);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==233){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.pont_bercy);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==235){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.bourse);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==31){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.gare_lyon);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==33){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.hotel_marine);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==35){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.place_chatelet);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==37){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.kiosque_noctambules_palais_royal);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==39){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.opera_bastille);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==311){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.place_beauvau);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==313){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.moulin_rouge);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==315){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.jardins_troca);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==317){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.chapelle_expiatoire);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==319){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.la_villette);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==321){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.bibli_chaptal);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==323){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.rue_rivoli);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==325){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.passerelle_josephine_baker);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==327){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.madeleine);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==329){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.hopital_necker);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==331){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.palais_bercy);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==333){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.hotel_de_ville);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        if (codex==335){
            RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

            ImageView img = new ImageView(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            img.setLayoutParams(lp);
            img.setBackgroundResource(R.drawable.pont_alexandre_3);
            layout.setGravity(Gravity.CENTER);
            layout.addView(img);

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ActiviteQuestion.this, AffichageImage.class);
                    i.putExtra("code", codex);
                    startActivity(i);

                }
            });
        }

        //On récupère l'editext
        reponse = (EditText) findViewById(R.id.editText);

        validerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //On récupère la réponse du joueur et on la renvoie dans l'intent initiateur de celui-ci
                String trouve="trouve";
                String Resultat =reponse.getText().toString();

                if (codex==11){
                    if ((Resultat.contains("Garnier")) || Resultat.contains("garnier")){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==13){
                    if ((Resultat.contains("Lorettes"))||Resultat.contains("lorettes")){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==15){
                    if ((Resultat.contains("Trinité"))||Resultat.contains("trinité")||Resultat.contains("trinite")||Resultat.contains("Trinite")){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==17){
                    if ((Resultat.contains(("Sacre"))||Resultat.contains("sacre")||Resultat.contains("sacré")||Resultat.contains("Sacré"))&&(Resultat.contains("Coeur")||Resultat.contains("coeur"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==19){
                    if (((Resultat.contains("mur"))||Resultat.contains("Mur"))&&((Resultat.contains("je t'aime"))||Resultat.contains("Je t'aime"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==111){
                    if ((Resultat.contains(("Basket"))||Resultat.contains("basket"))&&(Resultat.contains("Duperré")||Resultat.contains("duperré")||Resultat.contains("duperre")||Resultat.contains("Duperre")||Resultat.contains("Pigalle")||Resultat.contains("pigalle"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==113){
                    if ((Resultat.contains(("Gare"))||Resultat.contains("gare"))&&(Resultat.contains("Nord")||Resultat.contains("nord"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==115){
                    if ((Resultat.contains(("Canal"))||Resultat.contains("canal"))&&(Resultat.contains("Saint Martin")||Resultat.contains("saint martin")||Resultat.contains("St Martin")||Resultat.contains("st martin"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==117){
                    if ((Resultat.contains(("Bassin"))||Resultat.contains("bassin"))&&(Resultat.contains("Arsenal")||Resultat.contains("arsenal"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==119){
                    if ((Resultat.contains(("Colonnes"))||Resultat.contains("colonnes"))&&(Resultat.contains("Buren")||Resultat.contains("buren"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==121){
                    if ((Resultat.contains(("Orsay"))||Resultat.contains("orsay"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==123){
                    if ((Resultat.contains(("Vosges"))||Resultat.contains("vosges"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==125){
                    if ((Resultat.contains(("Gare"))||Resultat.contains("gare"))&&(Resultat.contains("Est")||Resultat.contains("est"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==127){
                    if ((Resultat.contains(("Petit"))||Resultat.contains("petit"))&&(Resultat.contains("Palais")||Resultat.contains("palais"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==129){
                    if ((Resultat.contains("Eglise")||Resultat.contains("eglise")||Resultat.contains("église")||Resultat.contains("Église"))&&(Resultat.contains("Louis")||Resultat.contains("louis"))&&(Resultat.contains("Paul")||Resultat.contains("paul"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==131){
                    if ((Resultat.contains(("Place"))||Resultat.contains("place"))&&(Resultat.contains("Michel")||Resultat.contains("michel"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==133){
                    if ((Resultat.contains(("Elysée"))||Resultat.contains("elysée"))||(Resultat.contains("elysee")||Resultat.contains("Elysee"))||(Resultat.contains("élysée")||Resultat.contains("Elysée"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==135){
                    if ((Resultat.contains(("Descartes"))||Resultat.contains("descartes"))||(Resultat.contains("Paris VI")||Resultat.contains("paris VI"))||(Resultat.contains("Paris 6")||Resultat.contains("paris 6"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==21){
                    if ((Resultat.contains("Tuileries")) || Resultat.contains("tuileries")){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==23){
                    if ((Resultat.contains("Monceau")) || Resultat.contains("monceau")){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==25){
                    if ((Resultat.contains("Vendome")) || Resultat.contains("vendome")|| Resultat.contains("vendôme")|| Resultat.contains("Vendôme")){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }
                }
                if (codex==27){
                    if ((Resultat.contains(("Loop")) || Resultat.contains("loop") || Resultat.contains("Pagode") || Resultat.contains("pagode"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }
                }
                if (codex==29){
                    if ((Resultat.contains(("Concorde")) || Resultat.contains("concorde"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }
                }
                if (codex==211){
                    if ((Resultat.contains(("Sorbonne"))||Resultat.contains("sorbonne"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==213){
                    if ((Resultat.contains(("Pavillon"))||Resultat.contains("pavillon"))&&(Resultat.contains(("Elysée"))||Resultat.contains("élysée")||Resultat.contains("elysee")||Resultat.contains("Elysee"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==215){
                    if ((Resultat.contains(("Conciergerie"))||Resultat.contains("conciergerie"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==217){
                    if ((Resultat.contains(("Grand"))||Resultat.contains("grand"))&&(Resultat.contains(("Palais"))||Resultat.contains("palais"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==219){
                    if ((Resultat.contains(("Justice"))||Resultat.contains("justice"))&&(Resultat.contains(("Palais"))||Resultat.contains("palais"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==221){
                    if ((Resultat.contains(("Comedie"))||Resultat.contains("comedie")||Resultat.contains("comédie")||Resultat.contains("Comédie"))&&(Resultat.contains(("Française"))||Resultat.contains("française")||Resultat.contains("francaise")||Resultat.contains("Francaise"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==223){
                    if ((Resultat.contains(("Notre"))||Resultat.contains("notre"))&&(Resultat.contains(("Dame"))||Resultat.contains("dame"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==225){
                    if ((Resultat.contains(("Piscine"))||Resultat.contains("piscine"))&&(Resultat.contains(("Baker"))||Resultat.contains("baker"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==227){
                    if ((Resultat.contains(("Branly"))||Resultat.contains("branly"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==229){
                    if ((Resultat.contains(("BNF"))||Resultat.contains("bnf"))||(Resultat.contains(("Mitterand"))||Resultat.contains("mitterand"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==231){
                    if ((Resultat.contains(("Pompidou"))||Resultat.contains("pompidou"))||(Resultat.contains(("Beaubourg"))||Resultat.contains("beaubourg"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==233){
                    if ((Resultat.contains(("Pont"))||Resultat.contains("pont"))&&(Resultat.contains(("Bercy"))||Resultat.contains("bercy"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==235){
                    if ((Resultat.contains(("Bourse"))||Resultat.contains("bourse"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==31){
                    if (((Resultat.contains("Gare")) || Resultat.contains("gare"))&&((Resultat.contains("Lyon")) || Resultat.contains("lyon"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==33){
                    if (((Resultat.contains("Hotel")) || Resultat.contains("hotel")|| Resultat.contains("hôtel")|| Resultat.contains("Hôtel"))&&((Resultat.contains("Marine")) || Resultat.contains("marine"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==35){
                    if (((Resultat.contains("Chatelet")) || Resultat.contains("chatelet")|| Resultat.contains("châtelet")|| Resultat.contains("Châtelet"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }
                }
                if (codex==37){
                    if (((Resultat.contains(("Kiosque")) || Resultat.contains("kiosque")) &&(Resultat.contains("Noctambules") || Resultat.contains("noctambules")))||(Resultat.contains("Palais Royal"))||(Resultat.contains("Palais royal"))||(Resultat.contains("palais royal"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }
                }
                if (codex==39){
                    if (((Resultat.contains("Opera")) || Resultat.contains("opera")|| Resultat.contains("opéra")|| Resultat.contains("Opéra"))&&((Resultat.contains("Bastille")) || Resultat.contains("bastille"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }
                }
                if (codex==311){
                    if ((((Resultat.contains("Place")) || Resultat.contains("place"))&&((Resultat.contains("Beauvau")) || Resultat.contains("beauvau")))|| Resultat.contains("interieur")|| Resultat.contains("Interieur")|| Resultat.contains("intérieur")|| Resultat.contains("Intérieur")){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==313){
                    if (((Resultat.contains("Moulin")) || Resultat.contains("moulin"))&&((Resultat.contains("Rouge")) || Resultat.contains("rouge"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==315){
                    if (((Resultat.contains("Jardins")) || Resultat.contains("jardins")|| Resultat.contains("jardin")|| Resultat.contains("Jardin"))&&((Resultat.contains("Trocadéro")) || Resultat.contains("trocadéro")|| Resultat.contains("trocadero")|| Resultat.contains("Trocadero"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }
                if (codex==317){
                    if (((Resultat.contains("Chapelle")) || Resultat.contains("chapelle"))&&((Resultat.contains("Expiatoire")) || Resultat.contains("expiatoire"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }
                }
                if (codex==319){
                    if ((Resultat.contains(("Villette")) || Resultat.contains("villette"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }
                }
                if (codex==321){
                    if (((Resultat.contains("Bibliothèque")) || Resultat.contains("bibliothèque")|| Resultat.contains("Bibliotheque")|| Resultat.contains("bibliotheque"))&&((Resultat.contains("Chaptal")) || Resultat.contains("chaptal"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }
                }
                if (codex==323){
                    if ((((Resultat.contains("Rivoli")) || Resultat.contains("rivoli")))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==325){
                    if (((Resultat.contains("Passerelle")) || Resultat.contains("passerelle"))&&((Resultat.contains("Baker")) || Resultat.contains("baker"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==327){
                    if ((((Resultat.contains("Madeleine")) || Resultat.contains("madeleine")))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==329){
                    if ((((Resultat.contains("Necker")) || Resultat.contains("necker")))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==331){
                    if ((((Resultat.contains("Palais")) || Resultat.contains("palais"))&&((Resultat.contains("Bercy")) || Resultat.contains("bercy")))||Resultat.contains("popb")||Resultat.contains("POPB")||((Resultat.contains("AccorHotels")||Resultat.contains("accorhotels")||Resultat.contains("accorhotel")||Resultat.contains("Accorhotels")||Resultat.contains("Accorhotel")||Resultat.contains("AccorHotel"))&&(Resultat.contains("Arena")||Resultat.contains("arena")))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==333){
                    if ((((Resultat.contains("Hotel")) || Resultat.contains("hotel")|| Resultat.contains("hôtel")|| Resultat.contains("Hôtel")))&&(Resultat.contains("ville")|| Resultat.contains("Ville"))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                if (codex==335){
                    if (((Resultat.contains("Pont")) || Resultat.contains("pont"))&&((Resultat.contains("Alexandre")) || Resultat.contains("alexandre"))&&((Resultat.contains("3")))){
                        Intent Result=new Intent();
                        setResult(RESULT_OK,Result);
                        Result.putExtra("reponse",trouve);
                        finish();
                    }
                    else{
                        reponse.setText("");
                        Toast.makeText(getApplicationContext(), "Raté", Toast.LENGTH_SHORT).show();
                    }

                }

                //Result.putExtra("reponse",Resultat);
                //finish();

            }
        });

        // Check for previously saved state
        if (savedInstanceState != null) {
            //Et ta mère
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

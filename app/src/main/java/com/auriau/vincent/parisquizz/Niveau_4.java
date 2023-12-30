package com.auriau.vincent.parisquizz;


import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class Niveau_4 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveau4);
        RelativeLayout layout= (RelativeLayout)findViewById(R.id.Rel ); // //layoutID is id of the linearLayout that defined in your main.xml file

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
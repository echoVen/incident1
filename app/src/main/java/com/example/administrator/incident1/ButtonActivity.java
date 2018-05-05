package com.example.administrator.incident1;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ButtonActivity implements View.OnClickListener {
    private Activity activity;

    public ButtonActivity(Activity activity) {
        this.activity = activity;
    }
    @Override
    public void onClick(View v) {
        text2Fragment textFragment2=new text2Fragment();
        FragmentManager fragmentManager=activity.getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.topfragementlayout,textFragment2);
        fragmentTransaction.commit();
    }
}

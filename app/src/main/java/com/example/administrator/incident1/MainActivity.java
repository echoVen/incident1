package com.example.administrator.incident1;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.administrator.incident1.tex1Fragment;
import com.example.administrator.incident1.tex3Fragment;
import com.example.administrator.incident1.text4Fragment;
import com.example.administrator.incident1.tex5Fragment;
import com.example.administrator.incident1.Fragment1;

public class MainActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.btn1);
        final Fragment1 topFragment = new Fragment1();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.topfragementlayout,topFragment);
        fragmentTransaction.commit();
        button1.setOnClickListener(new Button1ClickListener());
        Button button2=findViewById(R.id.btn2);
        button2.setOnClickListener(new ButtonActivity(this));
        Button button3=findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tex3Fragment textFragment3=new tex3Fragment();
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.topfragementlayout,textFragment3);
                fragmentTransaction.commit();
            }
        });
        Button button4=findViewById(R.id.btn4);
        button4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        text4Fragment textFragment4=new text4Fragment();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.topfragementlayout,textFragment4);
        fragmentTransaction.commit();
    }

    public void clickHandler(View view){
        tex5Fragment textFragment5=new tex5Fragment();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.topfragementlayout,textFragment5);
        fragmentTransaction.commit();
    }
    class Button1ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            tex1Fragment fragment1 = new tex1Fragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.topfragementlayout,fragment1 );
            transaction.commit();
        }
    }


}

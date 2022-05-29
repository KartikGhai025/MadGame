package com.example.madgame;
import java.util.Random;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int cr2=0;
    int cr1 = 0;
    boolean check = true;
    int randomcheck ;

    public void reset(View view){
//        ImageView iv = findViewById(R.id.steering);
//        //iv.animate().setDuration(2000).translationYBy(-1500);
//        iv.animate().setDuration(2000).translationYBy(100);
        ImageView carone = findViewById(R.id.car1);
        ImageView cartwo = findViewById(R.id.car2);
        ImageView b = findViewById(R.id.b);
        ImageView a = findViewById(R.id.a);
        int pa,pb;
        pa=  cr1* 150;
        pb = cr2*150;
        carone.animate().setDuration(1000).rotation(810).translationYBy(pa);
        cartwo.animate().setDuration(1000).rotation(810).translationYBy(pb);

        Toast.makeText(this, "Game Restarted", Toast.LENGTH_SHORT).show();
        ImageView g = findViewById(R.id.green);
        g.animate().alpha(0);
        a.animate().alpha(1);
        b.animate().alpha(1);
        cr1=0;
        cr2=0;
        carone.animate().setDuration(1000).translationYBy(pa).rotation(810);
        cartwo.animate().setDuration(1000).translationYBy(pb).rotation(810);
//        ConstraintLayout bg= findViewById(R.id.bg);
//        int count =  bg.getChildCount();
//         bg.animate().setDuration(200).alpha(0);


    }
public void move(View view){
    randomcheck = new Random().nextInt(1000);
    ImageView b = findViewById(R.id.b);
    ImageView a = findViewById(R.id.a);
    ImageView iv = findViewById(R.id.steering);
    ImageView carone = findViewById(R.id.car1);
    ImageView cartwo = findViewById(R.id.car2);
    ImageView r = findViewById(R.id.red);
    ImageView g = findViewById(R.id.green);
if(cr1 ==6 ){
    Toast.makeText(this, "winner is A", Toast.LENGTH_SHORT).show();
}
    if(cr2 ==6 ){
        Toast.makeText(this, "winner is B", Toast.LENGTH_SHORT).show();
    }
   if(cr1< 6 && cr2<6){
       if(randomcheck%2==0){
           g.animate().alpha(1).setDuration(1);
       }
       if(randomcheck%2!=0){
           g.animate().alpha(0).setDuration(1);
       }

       if(check)
       {
    iv.animate().setDuration(1200).rotation(360);
    a.animate().setDuration(1200).alpha(1);
    b.animate().setDuration(1).alpha(0);
    check = false;
    }
    else
    {
        iv.animate().setDuration(1200).rotation(-360);
        b.animate().setDuration(1200).alpha(1);
        a.animate().setDuration(1).alpha(0);
        check = true;
    }
    if(check && cr1<6 && randomcheck%2==0)
    {
        carone.animate().setDuration(1000).translationYBy(-150);
        cr1 = cr1+1;
    }
if(!check && cr2<6 && randomcheck%2==0)
{
    cartwo.animate().setDuration(1000).translationYBy(-150);
   cr2++;
}
   }
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ivb = findViewById(R.id.b);
        ivb.animate().translationYBy(-100);
        ImageView iva = findViewById(R.id.a);
        iva.animate().translationYBy(-100);
        ImageView r = findViewById(R.id.red);
        ImageView g = findViewById(R.id.green);
        ImageView carone = findViewById(R.id.car1);
        ImageView cartwo = findViewById(R.id.car2);
        carone.animate().setDuration(1000).translationYBy(-80);
        cartwo.animate().setDuration(1000).translationYBy(-80);
      //  g.animate().alpha(0);
       // g.animate().alpha(0);

    }
}
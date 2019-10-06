package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button zoomIn,zoomOut,rotate,slideDown,slideUp,blink,bounce;
    ImageView mImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoomIn=findViewById(R.id.zoomin);
        zoomOut=findViewById(R.id.zoomout);
        rotate=findViewById(R.id.rotate);
        slideDown=findViewById(R.id.slidedown);
        slideUp=findViewById(R.id.slideup);
        blink=findViewById(R.id.blink);
        bounce=findViewById(R.id.bounce);

        mImg=findViewById(R.id.imageView);

        zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomin);
                mImg.startAnimation(animation);
            }
        });
        zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomout);
                mImg.startAnimation(animation);
            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                mImg.startAnimation(animation);
            }
        });
        slideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.slideup);
                mImg.startAnimation(animation);
            }
        });
        slideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.slidedown);
                mImg.startAnimation(animation);
            }
        });
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
                mImg.startAnimation(animation);
            }
        });
        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                mImg.startAnimation(animation);
            }
        });


    }
}

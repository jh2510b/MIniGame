package com.example.minigame;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class Dudogi extends AppCompatActivity {

    final startGame thread_startGame = new startGame();
    final endGame thread_endGame = new endGame();
    int cnt = 30;
    int done = 0;
    boolean finish_thread = false;
    boolean wait_thread = false;

    final playGame thread_playGame = new playGame();
    final playGame2 thread_playGame2 = new playGame2();
    final playGame3 thread_playGame3 = new playGame3();
    int rndnum;
    int rndnum2;
    int rndnum3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dudogi);

        finish_thread = false;
        wait_thread = false;

        DialogView_Start();

        final Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        final ImageView hammer1 = (ImageView) findViewById(R.id.hammer1);
        final ImageView hammer2 = (ImageView) findViewById(R.id.hammer2);
        final ImageView hammer3 = (ImageView) findViewById(R.id.hammer3);
        final ImageView hammer4 = (ImageView) findViewById(R.id.hammer4);
        final ImageView hammer5 = (ImageView) findViewById(R.id.hammer5);
        final ImageView hammer6 = (ImageView) findViewById(R.id.hammer6);
        final ImageView hammer7 = (ImageView) findViewById(R.id.hammer7);
        final ImageView hammer8 = (ImageView) findViewById(R.id.hammer8);
        final ImageView hammer9 = (ImageView) findViewById(R.id.hammer9);
        final ImageView hammer10 = (ImageView) findViewById(R.id.hammer10);
        final ImageView hammer11 = (ImageView) findViewById(R.id.hammer11);
        final ImageView hammer12 = (ImageView) findViewById(R.id.hammer12);

        ImageView button1 = (ImageView) findViewById(R.id.dudogi1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_left = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_left);

                hammer1.setVisibility(View.VISIBLE);
                hammer1.bringToFront();
                hammer1.startAnimation(hammer_left);
            }
        });

        ImageView button2 = (ImageView) findViewById(R.id.dudogi2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_left = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_left);

                hammer2.setVisibility(View.VISIBLE);
                hammer2.bringToFront();
                hammer2.startAnimation(hammer_left);
            }
        });

        ImageView button3 = (ImageView) findViewById(R.id.dudogi3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_right = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_right);

                hammer3.setVisibility(View.VISIBLE);
                hammer3.bringToFront();
                hammer3.startAnimation(hammer_right);
            }
        });

        ImageView button4 = (ImageView) findViewById(R.id.dudogi4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_left = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_left);

                hammer4.setVisibility(View.VISIBLE);
                hammer4.bringToFront();
                hammer4.startAnimation(hammer_left);
            }
        });

        ImageView button5 = (ImageView) findViewById(R.id.dudogi5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_left = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_left);

                hammer5.setVisibility(View.VISIBLE);
                hammer5.bringToFront();
                hammer5.startAnimation(hammer_left);
            }
        });

        ImageView button6 = (ImageView) findViewById(R.id.dudogi6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_right = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_right);

                hammer6.setVisibility(View.VISIBLE);
                hammer6.bringToFront();
                hammer6.startAnimation(hammer_right);
            }
        });

        ImageView button7 = (ImageView) findViewById(R.id.dudogi7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_left = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_left);

                hammer7.setVisibility(View.VISIBLE);
                hammer7.bringToFront();
                hammer7.startAnimation(hammer_left);
            }
        });

        ImageView button8 = (ImageView) findViewById(R.id.dudogi8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_left = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_left);

                hammer8.setVisibility(View.VISIBLE);
                hammer8.bringToFront();
                hammer8.startAnimation(hammer_left);
            }
        });

        ImageView button9 = (ImageView) findViewById(R.id.dudogi9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_right = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_right);

                hammer9.setVisibility(View.VISIBLE);
                hammer9.bringToFront();
                hammer9.startAnimation(hammer_right);
            }
        });

        ImageView button10 = (ImageView) findViewById(R.id.dudogi10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_left = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_left);

                hammer10.setVisibility(View.VISIBLE);
                hammer10.bringToFront();
                hammer10.startAnimation(hammer_left);
            }
        });

        ImageView button11 = (ImageView) findViewById(R.id.dudogi11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_left = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_left);

                hammer11.setVisibility(View.VISIBLE);
                hammer11.bringToFront();
                hammer11.startAnimation(hammer_left);
            }
        });

        ImageView button12 = (ImageView) findViewById(R.id.dudogi12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int score1 = 0;
                if(MainActivity.vibration==true)
                    vibe.vibrate(100);
                TextView score = (TextView) findViewById(R.id.score_dudogi);
                score1 = Integer.valueOf(score.getText().toString());
                score1+=10;
                score.setText(Integer.toString(score1));

                Animation hammer_right = AnimationUtils.loadAnimation(Dudogi.this, R.anim.hammer_right);

                hammer12.setVisibility(View.VISIBLE);
                hammer12.bringToFront();
                hammer12.startAnimation(hammer_right);
            }
        });

        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        button7.setVisibility(View.INVISIBLE);
        button8.setVisibility(View.INVISIBLE);
        button9.setVisibility(View.INVISIBLE);
        button10.setVisibility(View.INVISIBLE);
        button11.setVisibility(View.INVISIBLE);
        button12.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onStart() {
        super.onStart();

        RelativeLayout layout_hammer = (RelativeLayout) findViewById(R.id.layout_hammer);
        layout_hammer.bringToFront();

        Intent intent1 = getIntent();
        String s = intent1.getStringExtra("이름");
        TextView name = (TextView) findViewById(R.id.name_dudogi);
        name.setText(s);

        TextView highscore = (TextView) findViewById(R.id.highscore_in_dudogi);
        highscore.setText(Integer.toString(intent1.getIntExtra("최고점수",0)));

        BackgroundMusic.mp.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        BackgroundMusic.mp.pause();
        DialogView();
    }

    @Override
    public void onBackPressed() {
        DialogView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        wait_thread=true;
        finish_thread=true;
    }

    private void DialogView(){
        wait_thread=true;
        AlertDialog.Builder alert_confirm = new AlertDialog.Builder(Dudogi.this);
        alert_confirm.setMessage("일시정지").setCancelable(false).setPositiveButton("게임선택",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Dudogi.this, GameSelect.class);

                        String name = "두더지";

                        TextView score = (TextView) findViewById(R.id.score_dudogi);
                        int scr = Integer.valueOf(score.getText().toString());

                        TextView highscore = (TextView) findViewById(R.id.highscore_in_dudogi);
                        if( Integer.valueOf(highscore.getText().toString()) > scr){
                            scr = Integer.valueOf(highscore.getText().toString());
                        }

                        TextView s2 = (TextView) findViewById(R.id.name_dudogi);
                        String s = s2.getText().toString();
                        intent.putExtra("이름", s);

                        intent.putExtra("종목", name);
                        intent.putExtra("점수", scr);

                        startActivity(intent);

                        finish();
                    }
                }).setNegativeButton("계속하기",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        wait_thread=false;
                        return;
                    }
                });
        AlertDialog alert = alert_confirm.create();
        alert.show();
    }

    private void DialogView_Start(){
        AlertDialog.Builder alert_confirm = new AlertDialog.Builder(Dudogi.this);
        alert_confirm.setMessage("\n두더지잡기 : 게임설명\n\n" +
                "게임이 시작되면 무작위로 튀어나오는 두더지를 잡아주세요! " +
                "시간이 지날수록 더 많은 두더지가 튀어나옵니다!" +
                "\n\n제한시간 30초\n").setCancelable(false).setPositiveButton("게임선택",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Dudogi.this, GameSelect.class);

                        String name = "두더지";

                        TextView score = (TextView) findViewById(R.id.score_dudogi);
                        int scr = Integer.valueOf(score.getText().toString());

                        TextView highscore = (TextView) findViewById(R.id.highscore_in_dudogi);
                        if( Integer.valueOf(highscore.getText().toString()) > scr){
                            scr = Integer.valueOf(highscore.getText().toString());
                        }

                        TextView s2 = (TextView) findViewById(R.id.name_dudogi);
                        String s = s2.getText().toString();
                        intent.putExtra("이름", s);

                        intent.putExtra("종목", name);
                        intent.putExtra("점수", scr);

                        startActivity(intent);

                        finish();
                    }
                }).setNegativeButton("게임시작",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        thread_startGame.start();
                        thread_endGame.start();
                        thread_playGame.start();
                        thread_playGame2.start();
                        thread_playGame3.start();
                        rndnum=0;
                        rndnum2=0;
                        rndnum3=0;
                    }
                });
        AlertDialog alert = alert_confirm.create();
        alert.show();
    }

    private void DialogView_End(){
        wait_thread=true;
        TextView score = (TextView) findViewById(R.id.score_dudogi);
        AlertDialog.Builder alert_confirm = new AlertDialog.Builder(Dudogi.this);
        alert_confirm.setMessage("게임 종료\n\n" +
                "최종 점수 : "+score.getText().toString()+"점\n")
                .setCancelable(false).setPositiveButton("게임선택",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Dudogi.this, GameSelect.class);

                        String name = "두더지";

                        TextView score = (TextView) findViewById(R.id.score_dudogi);
                        int scr = Integer.valueOf(score.getText().toString());

                        TextView highscore = (TextView) findViewById(R.id.highscore_in_dudogi);
                        if( Integer.valueOf(highscore.getText().toString()) > scr){
                            scr = Integer.valueOf(highscore.getText().toString());
                        }

                        TextView s2 = (TextView) findViewById(R.id.name_dudogi);
                        String s = s2.getText().toString();
                        intent.putExtra("이름", s);

                        intent.putExtra("종목", name);
                        intent.putExtra("점수", scr);

                        startActivity(intent);

                        finish();
                    }
                }).setNegativeButton("다시하기",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ImageView button1 = (ImageView) findViewById(R.id.dudogi1);
                        ImageView button2 = (ImageView) findViewById(R.id.dudogi2);
                        ImageView button3 = (ImageView) findViewById(R.id.dudogi3);
                        ImageView button4 = (ImageView) findViewById(R.id.dudogi4);
                        ImageView button5 = (ImageView) findViewById(R.id.dudogi5);
                        ImageView button6 = (ImageView) findViewById(R.id.dudogi6);
                        ImageView button7 = (ImageView) findViewById(R.id.dudogi7);
                        ImageView button8 = (ImageView) findViewById(R.id.dudogi8);
                        ImageView button9 = (ImageView) findViewById(R.id.dudogi9);
                        ImageView button10 = (ImageView) findViewById(R.id.dudogi10);
                        ImageView button11 = (ImageView) findViewById(R.id.dudogi11);
                        ImageView button12 = (ImageView) findViewById(R.id.dudogi12);

                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        button10.setVisibility(View.INVISIBLE);
                        button11.setVisibility(View.INVISIBLE);
                        button12.setVisibility(View.INVISIBLE);

                        wait_thread=false;
                        cnt=30;
                        TextView time = (TextView) findViewById(R.id.time_dudogi);
                        time.setText("30");
                        done=0;
                        rndnum=0;
                        rndnum2=0;
                        rndnum3=0;
                        TextView score = (TextView) findViewById(R.id.score_dudogi);
                        score.setText("0");
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alert_confirm.create();
        alert.show();
    }

    private class startGame extends Thread {
        public void run(){
            while(finish_thread==false){
                while(wait_thread==false){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {e.printStackTrace();}

                    if(cnt>0){
                        cnt--;
                        startHandler.sendEmptyMessage(0);
                    }

                }
            }
        }
    }

    private Handler startHandler = new Handler (){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            TextView time = (TextView) findViewById(R.id.time_dudogi);
            time.setText(Integer.toString(cnt));
        }
    };

    private class endGame extends Thread {
        public void run(){
            while(finish_thread==false){
                while(wait_thread==false){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {e.printStackTrace();}

                    if(done==0){
                        if(cnt==0){
                            endHandler.sendEmptyMessage(0);
                            done=1;
                        }
                    }

                }
            }
        }
    }

    private Handler endHandler = new Handler (){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            DialogView_End();
        }
    };

    private class playGame extends Thread{
        public void run(){

            while(finish_thread==false) {
                while (wait_thread == false) {

                    Random rnd = new Random();

                    rndnum = rnd.nextInt(12)+1;

                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    dudogiHandler.sendEmptyMessage(0);
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    dudogiHandler2.sendEmptyMessage(0);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    private class playGame2 extends Thread{
        public void run(){

            while(finish_thread==false) {
                while (wait_thread == false) {

                    Random rnd = new Random();

                    rndnum2 = rnd.nextInt(12)+1;

                    dudogiHandler3.sendEmptyMessage(0);
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    dudogiHandler4.sendEmptyMessage(0);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    private class playGame3 extends Thread{
        public void run(){

            while(finish_thread==false) {
                while (wait_thread == false) {

                    Random rnd = new Random();

                    rndnum3 = rnd.nextInt(12)+1;

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    dudogiHandler5.sendEmptyMessage(0);
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    dudogiHandler6.sendEmptyMessage(0);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    private Handler dudogiHandler = new Handler (){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            ImageView button1 = (ImageView) findViewById(R.id.dudogi1);
            ImageView button2 = (ImageView) findViewById(R.id.dudogi2);
            ImageView button3 = (ImageView) findViewById(R.id.dudogi3);
            ImageView button4 = (ImageView) findViewById(R.id.dudogi4);
            ImageView button5 = (ImageView) findViewById(R.id.dudogi5);
            ImageView button6 = (ImageView) findViewById(R.id.dudogi6);
            ImageView button7 = (ImageView) findViewById(R.id.dudogi7);
            ImageView button8 = (ImageView) findViewById(R.id.dudogi8);
            ImageView button9 = (ImageView) findViewById(R.id.dudogi9);
            ImageView button10 = (ImageView) findViewById(R.id.dudogi10);
            ImageView button11 = (ImageView) findViewById(R.id.dudogi11);
            ImageView button12 = (ImageView) findViewById(R.id.dudogi12);

            if(rndnum==1)
                button1.setVisibility(View.VISIBLE);
            if(rndnum==2)
                button2.setVisibility(View.VISIBLE);
            if(rndnum==3)
                button3.setVisibility(View.VISIBLE);
            if(rndnum==4)
                button4.setVisibility(View.VISIBLE);
            if(rndnum==5)
                button5.setVisibility(View.VISIBLE);
            if(rndnum==6)
                button6.setVisibility(View.VISIBLE);
            if(rndnum==7)
                button7.setVisibility(View.VISIBLE);
            if(rndnum==8)
                button8.setVisibility(View.VISIBLE);
            if(rndnum==9)
                button9.setVisibility(View.VISIBLE);
            if(rndnum==10)
                button10.setVisibility(View.VISIBLE);
            if(rndnum==11)
                button11.setVisibility(View.VISIBLE);
            if(rndnum==12)
                button12.setVisibility(View.VISIBLE);
        }
    };

    private Handler dudogiHandler2 = new Handler (){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            ImageView button1 = (ImageView) findViewById(R.id.dudogi1);
            ImageView button2 = (ImageView) findViewById(R.id.dudogi2);
            ImageView button3 = (ImageView) findViewById(R.id.dudogi3);
            ImageView button4 = (ImageView) findViewById(R.id.dudogi4);
            ImageView button5 = (ImageView) findViewById(R.id.dudogi5);
            ImageView button6 = (ImageView) findViewById(R.id.dudogi6);
            ImageView button7 = (ImageView) findViewById(R.id.dudogi7);
            ImageView button8 = (ImageView) findViewById(R.id.dudogi8);
            ImageView button9 = (ImageView) findViewById(R.id.dudogi9);
            ImageView button10 = (ImageView) findViewById(R.id.dudogi10);
            ImageView button11 = (ImageView) findViewById(R.id.dudogi11);
            ImageView button12 = (ImageView) findViewById(R.id.dudogi12);

            if(rndnum==1)
                button1.setVisibility(View.INVISIBLE);
            if(rndnum==2)
                button2.setVisibility(View.INVISIBLE);
            if(rndnum==3)
                button3.setVisibility(View.INVISIBLE);
            if(rndnum==4)
                button4.setVisibility(View.INVISIBLE);
            if(rndnum==5)
                button5.setVisibility(View.INVISIBLE);
            if(rndnum==6)
                button6.setVisibility(View.INVISIBLE);
            if(rndnum==7)
                button7.setVisibility(View.INVISIBLE);
            if(rndnum==8)
                button8.setVisibility(View.INVISIBLE);
            if(rndnum==9)
                button9.setVisibility(View.INVISIBLE);
            if(rndnum==10)
                button10.setVisibility(View.INVISIBLE);
            if(rndnum==11)
                button11.setVisibility(View.INVISIBLE);
            if(rndnum==12)
                button12.setVisibility(View.INVISIBLE);
        }
    };

    private Handler dudogiHandler3 = new Handler (){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            ImageView button1 = (ImageView) findViewById(R.id.dudogi1);
            ImageView button2 = (ImageView) findViewById(R.id.dudogi2);
            ImageView button3 = (ImageView) findViewById(R.id.dudogi3);
            ImageView button4 = (ImageView) findViewById(R.id.dudogi4);
            ImageView button5 = (ImageView) findViewById(R.id.dudogi5);
            ImageView button6 = (ImageView) findViewById(R.id.dudogi6);
            ImageView button7 = (ImageView) findViewById(R.id.dudogi7);
            ImageView button8 = (ImageView) findViewById(R.id.dudogi8);
            ImageView button9 = (ImageView) findViewById(R.id.dudogi9);
            ImageView button10 = (ImageView) findViewById(R.id.dudogi10);
            ImageView button11 = (ImageView) findViewById(R.id.dudogi11);
            ImageView button12 = (ImageView) findViewById(R.id.dudogi12);

            if(rndnum2==1)
                button1.setVisibility(View.VISIBLE);
            if(rndnum2==2)
                button2.setVisibility(View.VISIBLE);
            if(rndnum2==3)
                button3.setVisibility(View.VISIBLE);
            if(rndnum2==4)
                button4.setVisibility(View.VISIBLE);
            if(rndnum2==5)
                button5.setVisibility(View.VISIBLE);
            if(rndnum2==6)
                button6.setVisibility(View.VISIBLE);
            if(rndnum2==7)
                button7.setVisibility(View.VISIBLE);
            if(rndnum2==8)
                button8.setVisibility(View.VISIBLE);
            if(rndnum2==9)
                button9.setVisibility(View.VISIBLE);
            if(rndnum2==10)
                button10.setVisibility(View.VISIBLE);
            if(rndnum2==11)
                button11.setVisibility(View.VISIBLE);
            if(rndnum2==12)
                button12.setVisibility(View.VISIBLE);
        }
    };

    private Handler dudogiHandler4 = new Handler (){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            ImageView button1 = (ImageView) findViewById(R.id.dudogi1);
            ImageView button2 = (ImageView) findViewById(R.id.dudogi2);
            ImageView button3 = (ImageView) findViewById(R.id.dudogi3);
            ImageView button4 = (ImageView) findViewById(R.id.dudogi4);
            ImageView button5 = (ImageView) findViewById(R.id.dudogi5);
            ImageView button6 = (ImageView) findViewById(R.id.dudogi6);
            ImageView button7 = (ImageView) findViewById(R.id.dudogi7);
            ImageView button8 = (ImageView) findViewById(R.id.dudogi8);
            ImageView button9 = (ImageView) findViewById(R.id.dudogi9);
            ImageView button10 = (ImageView) findViewById(R.id.dudogi10);
            ImageView button11 = (ImageView) findViewById(R.id.dudogi11);
            ImageView button12 = (ImageView) findViewById(R.id.dudogi12);

            if(rndnum2==1)
                button1.setVisibility(View.INVISIBLE);
            if(rndnum2==2)
                button2.setVisibility(View.INVISIBLE);
            if(rndnum2==3)
                button3.setVisibility(View.INVISIBLE);
            if(rndnum2==4)
                button4.setVisibility(View.INVISIBLE);
            if(rndnum2==5)
                button5.setVisibility(View.INVISIBLE);
            if(rndnum2==6)
                button6.setVisibility(View.INVISIBLE);
            if(rndnum2==7)
                button7.setVisibility(View.INVISIBLE);
            if(rndnum2==8)
                button8.setVisibility(View.INVISIBLE);
            if(rndnum2==9)
                button9.setVisibility(View.INVISIBLE);
            if(rndnum2==10)
                button10.setVisibility(View.INVISIBLE);
            if(rndnum2==11)
                button11.setVisibility(View.INVISIBLE);
            if(rndnum2==12)
                button12.setVisibility(View.INVISIBLE);
        }
    };

    private Handler dudogiHandler5 = new Handler (){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            ImageView button1 = (ImageView) findViewById(R.id.dudogi1);
            ImageView button2 = (ImageView) findViewById(R.id.dudogi2);
            ImageView button3 = (ImageView) findViewById(R.id.dudogi3);
            ImageView button4 = (ImageView) findViewById(R.id.dudogi4);
            ImageView button5 = (ImageView) findViewById(R.id.dudogi5);
            ImageView button6 = (ImageView) findViewById(R.id.dudogi6);
            ImageView button7 = (ImageView) findViewById(R.id.dudogi7);
            ImageView button8 = (ImageView) findViewById(R.id.dudogi8);
            ImageView button9 = (ImageView) findViewById(R.id.dudogi9);
            ImageView button10 = (ImageView) findViewById(R.id.dudogi10);
            ImageView button11 = (ImageView) findViewById(R.id.dudogi11);
            ImageView button12 = (ImageView) findViewById(R.id.dudogi12);

            if(rndnum3==1)
                button1.setVisibility(View.VISIBLE);
            if(rndnum3==2)
                button2.setVisibility(View.VISIBLE);
            if(rndnum3==3)
                button3.setVisibility(View.VISIBLE);
            if(rndnum3==4)
                button4.setVisibility(View.VISIBLE);
            if(rndnum3==5)
                button5.setVisibility(View.VISIBLE);
            if(rndnum3==6)
                button6.setVisibility(View.VISIBLE);
            if(rndnum3==7)
                button7.setVisibility(View.VISIBLE);
            if(rndnum3==8)
                button8.setVisibility(View.VISIBLE);
            if(rndnum3==9)
                button9.setVisibility(View.VISIBLE);
            if(rndnum3==10)
                button10.setVisibility(View.VISIBLE);
            if(rndnum3==11)
                button11.setVisibility(View.VISIBLE);
            if(rndnum3==12)
                button12.setVisibility(View.VISIBLE);
        }
    };

    private Handler dudogiHandler6 = new Handler (){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            ImageView button1 = (ImageView) findViewById(R.id.dudogi1);
            ImageView button2 = (ImageView) findViewById(R.id.dudogi2);
            ImageView button3 = (ImageView) findViewById(R.id.dudogi3);
            ImageView button4 = (ImageView) findViewById(R.id.dudogi4);
            ImageView button5 = (ImageView) findViewById(R.id.dudogi5);
            ImageView button6 = (ImageView) findViewById(R.id.dudogi6);
            ImageView button7 = (ImageView) findViewById(R.id.dudogi7);
            ImageView button8 = (ImageView) findViewById(R.id.dudogi8);
            ImageView button9 = (ImageView) findViewById(R.id.dudogi9);
            ImageView button10 = (ImageView) findViewById(R.id.dudogi10);
            ImageView button11 = (ImageView) findViewById(R.id.dudogi11);
            ImageView button12 = (ImageView) findViewById(R.id.dudogi12);

            if(rndnum3==1)
                button1.setVisibility(View.INVISIBLE);
            if(rndnum3==2)
                button2.setVisibility(View.INVISIBLE);
            if(rndnum3==3)
                button3.setVisibility(View.INVISIBLE);
            if(rndnum3==4)
                button4.setVisibility(View.INVISIBLE);
            if(rndnum3==5)
                button5.setVisibility(View.INVISIBLE);
            if(rndnum3==6)
                button6.setVisibility(View.INVISIBLE);
            if(rndnum3==7)
                button7.setVisibility(View.INVISIBLE);
            if(rndnum3==8)
                button8.setVisibility(View.INVISIBLE);
            if(rndnum3==9)
                button9.setVisibility(View.INVISIBLE);
            if(rndnum3==10)
                button10.setVisibility(View.INVISIBLE);
            if(rndnum3==11)
                button11.setVisibility(View.INVISIBLE);
            if(rndnum3==12)
                button12.setVisibility(View.INVISIBLE);
        }
    };

}

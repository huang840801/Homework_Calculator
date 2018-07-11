package com.huang.hello.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button_equal;
    private Button button_plus;
    private Button button_minus;
    private Button button_times;
    private Button button_divide;
    private Button button_percent;
    private Button button_change;
    private Button button_reset;
    private Button button_point;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0=(Button)findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button_equal=(Button)findViewById(R.id.button_equal);
        button_plus=(Button)findViewById(R.id.button_plus);
        button_minus=(Button)findViewById(R.id.button_minus);
        button_times=(Button)findViewById(R.id.button_times);
        button_divide=(Button)findViewById(R.id.button_divide);
        button_percent=(Button)findViewById(R.id.button_percent);
        button_change=(Button)findViewById(R.id.button_change);
        button_reset=(Button)findViewById(R.id.button_reset);
        button_point=(Button)findViewById(R.id.button_point);


        button0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                button0.setBackgroundResource(R.drawable.calculator_0_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button0.setBackgroundResource(R.drawable.calculator_0);

                }
                return false;
            }
        });
            // 測試按鈕圖案改變是因為clicked還是hovering
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"button0 clicked",Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button1.setBackgroundResource(R.drawable.calculator_1_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button1.setBackgroundResource(R.drawable.calculator_1);

                }
                return false;
            }
        });
        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button2.setBackgroundResource(R.drawable.calculator_2_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button2.setBackgroundResource(R.drawable.calculator_2);

                }
                return false;
            }
        });
        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button3.setBackgroundResource(R.drawable.calculator_3_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button3.setBackgroundResource(R.drawable.calculator_3);

                }
                return false;
            }
        });
        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button4.setBackgroundResource(R.drawable.calculator_4_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button4.setBackgroundResource(R.drawable.calculator_4);

                }
                return false;
            }
        });
        button5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button5.setBackgroundResource(R.drawable.calculator_5_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button5.setBackgroundResource(R.drawable.calculator_5);

                }
                return false;
            }
        });
        button6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button6.setBackgroundResource(R.drawable.calculator_6_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button6.setBackgroundResource(R.drawable.calculator_6);

                }
                return false;
            }
        });
        button7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button7.setBackgroundResource(R.drawable.calculator_7_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button7.setBackgroundResource(R.drawable.calculator_7);

                }
                return false;
            }
        });
        button8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button8.setBackgroundResource(R.drawable.calculator_8_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button8.setBackgroundResource(R.drawable.calculator_8);

                }
                return false;
            }
        });
        button9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button9.setBackgroundResource(R.drawable.calculator_9_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button9.setBackgroundResource(R.drawable.calculator_9);

                }
                return false;
            }
        });
        button_point.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button_point.setBackgroundResource(R.drawable.calculator_point_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button_point.setBackgroundResource(R.drawable.calculator_point);

                }
                return false;
            }
        });
        button_equal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button_equal.setBackgroundResource(R.drawable.calculator_equals_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button_equal.setBackgroundResource(R.drawable.calculator_equals);

                }
                return false;
            }
        });
        button_plus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button_plus.setBackgroundResource(R.drawable.calculator_plus_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button_plus.setBackgroundResource(R.drawable.calculator_plus);
                }
                return false;
            }
        });
        button_minus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button_minus.setBackgroundResource(R.drawable.calculator_minus_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button_minus.setBackgroundResource(R.drawable.calculator_minus);

                }
                return false;
            }
        });
        button_times.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button_times.setBackgroundResource(R.drawable.calculator_times_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button_times.setBackgroundResource(R.drawable.calculator_times);

                }
                return false;
            }
        });
        button_divide.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button_divide.setBackgroundResource(R.drawable.calculator_divide_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button_divide.setBackgroundResource(R.drawable.calculator_divide);

                }
                return false;
            }
        });
        button_percent.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button_percent.setBackgroundResource(R.drawable.calculator_percent_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button_percent.setBackgroundResource(R.drawable.calculator_percent);

                }
                return false;
            }
        });
        button_change.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button_change.setBackgroundResource(R.drawable.calculator_changesign_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button_change.setBackgroundResource(R.drawable.calculator_changesign);

                }
                return false;
            }
        });
        button_reset.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    button_reset.setBackgroundResource(R.drawable.calculator_reset_hover);
                }
                else if(event.getAction()==MotionEvent.ACTION_UP){
                    button_reset.setBackgroundResource(R.drawable.calculator_reset);

                }
                return false;
            }
        });


    }
}

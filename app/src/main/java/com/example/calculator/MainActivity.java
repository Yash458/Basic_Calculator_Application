package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1,textview2;
    private double first, second;
    private double result;
    private String operation;
    private String answer;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
    private Button buttonClear,buttonBackspace,buttonPlus,buttonMinus,buttonMultiply,buttonDivide,buttonDot,buttonEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        textView1 = findViewById(R.id.textview1);
        textview2 = findViewById(R.id.textview2);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonClear = findViewById(R.id.buttonClear);
        buttonBackspace = findViewById(R.id.buttonBackspace);
        buttonDot = findViewById(R.id.buttonDot);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);


        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(null);
                textview2.setText(null);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button0.getText().toString();
                textview2.setText(text);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button1.getText().toString();
                textview2.setText(text);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button2.getText().toString();
                textview2.setText(text);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button3.getText().toString();
                textview2.setText(text);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button4.getText().toString();
                textview2.setText(text);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button5.getText().toString();
                textview2.setText(text);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button6.getText().toString();
                textview2.setText(text);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button7.getText().toString();
                textview2.setText(text);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button8.getText().toString();
                textview2.setText(text);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+button9.getText().toString();
                textview2.setText(text);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+buttonDot.getText().toString();
                textview2.setText(text);
            }
        });
        buttonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Backspace = null;
                if(textview2.getText().toString().length()>0)
                {
                    StringBuilder stringBuilder = new StringBuilder(textview2.getText());
                    stringBuilder.deleteCharAt(textview2.getText().length()-1);
                    Backspace = stringBuilder.toString();
                    textview2.setText(Backspace);
                }
            }
        });

        //Code for operators
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble(((String) textview2.getText()));
                primary = String.format("%.2f",first);
                textView1.setText(primary);
                textview2.setText("");
                operation= "+";
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble(((String) textview2.getText()));
                primary = String.format("%.2f",first);
                textView1.setText(primary);
                textview2.setText("");
                operation= "-";
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble(((String) textview2.getText()));
                primary = String.format("%.2f",first);
                textView1.setText(primary);
                textview2.setText("");
                operation= "*";

            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble(((String) textview2.getText()));
                primary = String.format("%.2f",first);
                textView1.setText(primary);
                textview2.setText("");
                operation= "/";
            }
        });

        // Equal button
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second = Double.parseDouble((String) textview2.getText());
                if(operation =="+")
                {
                    result = first + second;
                    answer = String.format("%.2f",result);
                    textview2.setText(answer);
                    textView1.setText(null);
                }
                if(operation =="-")
                {
                    result = first - second;
                    answer = String.format("%.2f",result);
                    textview2.setText(answer);
                    textView1.setText(null);
                }
                if(operation =="*")
                {
                    result = first * second;
                    answer = String.format("%.2f",result);
                    textview2.setText(answer);
                    textView1.setText(null);
                }
                if(operation =="/")
                {
                    result = first / second;
                    answer = String.format("%.2f",result);
                    textview2.setText(answer);
                    textView1.setText(null);
                }
            }
        });

    }
}


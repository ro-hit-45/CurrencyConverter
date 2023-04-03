package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro, pond, dollar, yen, dinar, bitcoin, rubel, southAfrica, turkish;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pond = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen=findViewById(R.id.yen);
        southAfrica=findViewById(R.id.southAfrica);
        turkish=findViewById(R.id.turkish);
        dinar=findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel=findViewById(R.id.rubel);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);



        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editText.getText().toString();

                if (TextUtils.isEmpty(m)){
                    editText.setError("Empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(m);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.012;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                    textView.setText("" + k);
                }
            }
        });

          dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editText.getText().toString();

                if (TextUtils.isEmpty(m)){
                    editText.setError("Empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(m);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 82;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                    textView.setText("" + k);
                }
            }
        });

          pond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editText.getText().toString();

                if (TextUtils.isEmpty(m)){
                    editText.setError("Empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(m);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 101.87;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                    textView.setText("" + k);

                }
            }
        });

          yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editText.getText().toString();

                if (TextUtils.isEmpty(m)){
                    editText.setError("Empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(m);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.62;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                    textView.setText("" + k);

                }
            }
        });

           dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editText.getText().toString();

                if (TextUtils.isEmpty(m)){
                    editText.setError("Empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(m);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 262.21;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                    textView.setText("" + k);
                }
            }
        });

         bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editText.getText().toString();

                if (TextUtils.isEmpty(m)){
                    editText.setError("Empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(m);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 2302181.25;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                    textView.setText("" + k);
                }
            }
        });

         rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editText.getText().toString();

                if (TextUtils.isEmpty(m)){
                    editText.setError("Empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(m);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.05;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                    textView.setText("" + k);
                }
            }
        });

      southAfrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editText.getText().toString();

                if (TextUtils.isEmpty(m)){
                    editText.setError("Empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(m);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 4.62;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                    textView.setText("" + k);

                }
            }
        });

        turkish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = editText.getText().toString();

                if (TextUtils.isEmpty(m)){
                    editText.setError("Empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(m);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 4.29;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));
                    textView.setText("" + k);

                }
            }
        });

    }
}
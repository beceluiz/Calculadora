package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtViewResultado;
    Double valor1;
    String op = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtViewResultado = findViewById(R.id.txtViewResutltado);
        txtViewResultado.setText("0");
    }

    // operações

    public void btnSomar(View v) {
        valor1 = Double.parseDouble(txtViewResultado.getText().toString());
        txtViewResultado.setText(" ");
        op = "+";

    }
    public void btnSubtrair(View v) {
        valor1 = Double.parseDouble(txtViewResultado.getText().toString());
        txtViewResultado.setText(" ");
        op = "-";

    }
    public void btnMultiplicar(View v) {
        valor1 = Double.parseDouble(txtViewResultado.getText().toString());
        txtViewResultado.setText(" ");
        op = "x";

    }
    public void btnDividir(View v) {
        valor1 = Double.parseDouble(txtViewResultado.getText().toString());
        txtViewResultado.setText(" ");
        op = "/";

    }

    public void calcular (View v) {
        Double valor2 = Double.parseDouble(txtViewResultado.getText().toString());

        if(op == "+") {
            Double resultado = valor1 + valor2;
            txtViewResultado.setText(resultado.toString());
        }
        if(op == "-") {
            Double resultado = valor1 - valor2;
            txtViewResultado.setText(resultado.toString());
        }
        if(op == "/") {
            Double resultado = valor1 / valor2;
            txtViewResultado.setText(resultado.toString());
        }
        if(op == "x") {
            Double resultado = valor1 * valor2;
            txtViewResultado.setText(resultado.toString());
        }
    }


    //numeros
    public void btnZero (View v) {
        System.out.println(txtViewResultado.getText());
        if(txtViewResultado.getText() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "0");
    }
    public void btnUm (View v) {
        if(txtViewResultado.getText().toString() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "1");
    }
    public void btnDois (View v) {
        if(txtViewResultado.getText().toString() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "2");
    }
    public void btnTres (View v) {
        if(txtViewResultado.getText().toString() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "3");
    }
    public void btnQuatro (View v) {
        if(txtViewResultado.getText().toString() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "4");
    }
    public void btnCinco (View v) {
        if(txtViewResultado.getText().toString() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "5");
    }
    public void btnSeis (View v) {
        if(txtViewResultado.getText().toString() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "6");
    }
    public void btnSete (View v) {
        if(txtViewResultado.getText().toString() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "7");
    }
    public void btnOito (View v) {
        if(txtViewResultado.getText().toString() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "8");
    }
    public void btnNove (View v) {
        if(txtViewResultado.getText().toString() == "0") {
            txtViewResultado.setText("");
        }
        txtViewResultado.setText(txtViewResultado.getText() + "9");
    }

    // limpar tudo
    public void limpar (View v) {
        txtViewResultado.setText("0");
        valor1 = 0.0;
        op = "";
    }




}
package com.example.asus.calculadora3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.annotation.Documented;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    double resultado, Nun1, Nun2;
    String Operador;
    Boolean estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void bt0 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"0");
    }

    public void bt1 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"1");
    }

    public void bt2 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"2");
    }
    public void bt3 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"3");
    }
    public void bt4 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"4");
    }
    public void bt5 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"5");
    }
    public void bt6 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"6");
    }
    public void bt7 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"7");
    }
    public void bt8 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"8");
    }
    public void bt9 (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+"9");
    }

    public void btpunto (View View)
    { tvDisplay=(TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText(tvDisplay.getText()+".");
    }


    public void CapturaNumero1 (View View){
        tvDisplay= (TextView)findViewById(R.id.tvDisplay);
        Nun1= Double.parseDouble(tvDisplay.getText().toString());
        tvDisplay.setText("");
    }
    public void sumar (View View){
            Operador = "+";
            CapturaNumero1(View);
        }
    }

    public void restar (View View){
        Operador="-";
        CapturaNumero1(View);
    }

    public void multiplicar (View View){
        Operador="*";
        CapturaNumero1(View);
    }

    public void dividir (View View){
        Operador="/";
        CapturaNumero1(View);
    }

    public void bt_igual (View View) {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        Nun2 = Double.parseDouble(tvDisplay.getText().toString());
        switch (Operador) {
            case "+":
                resultado = Nun1 + Nun2;
                break;
            case "-":
                resultado = Nun1 - Nun2;
                break;
            case "*":
                resultado = Nun1 * Nun2;
                break;
            case "/":
                resultado = Nun1 / Nun2;
                break;
        }
        tvDisplay.setText(""+resultado);
    }

    public void borrar(View View){
        if(!tvDisplay.getText().toString().equals("")){

            tvDisplay.setText(tvDisplay.getText().subSequence(0, Integer.parseInt(tvDisplay.getText().length()-1+"")));

        }
    }

    public void bt_Acc(View View){
        Nun1=0.0;
        Nun2=0.0;
        tvDisplay= (TextView)findViewById(R.id.tvDisplay);
        tvDisplay.setText("");
    }

    public void bt_Off(View View){
        finish();
    }





}

package com.example.rael.examenparcial;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CAL(View view) {
        EditText NUMI = (EditText) findViewById(R.id.NUM1);
        EditText NUMII = (EditText) findViewById(R.id.NUM2);
        TextView ERR = (TextView) findViewById(R.id.ERROR);
        TextView COMP = (TextView) findViewById(R.id.COMPA);
        TextView SUM = (TextView) findViewById(R.id.ADD);
        TextView REST = (TextView) findViewById(R.id.SUB);
        TextView MULT = (TextView) findViewById(R.id.PROD);
        TextView DIV = (TextView) findViewById(R.id.DIVE);

        String sNUMI = NUMI.getText().toString().trim();
        String sNUMII = NUMII.getText().toString().trim();

        Integer numberI = Integer.parseInt(sNUMI);
        Integer numberII = Integer.parseInt(sNUMII);

       String message;

        if (iscero(numberI)) {
            message = "ERROR";

        ERR.setText(message);
    }
        String message2;

        if (iscero2(numberII)) {
            message2 = "ERROR";

            ERR.setText(message2);
        }
        if (numberI > numberII) {
            COMP.setText("primernumeroesmayor");

        } else if (numberI < numberII) {
            COMP.setText("segundo numero es mayor");

        } else if (numberI == numberII) {
            COMP.setText("los numeros son iguales");
        }{
            int x = new Integer(NUMI.getText().toString());
            int y = new Integer(NUMII.getText().toString());
            int sum = x + y;

            SUM.setText(sum);

            int rest = x - y ;

            REST.setText(rest);

            int MULTI = x*y ;

            MULT.setText(MULTI);

            int DIVID = x/y;

            DIV.setText(DIVID);


        }
        }




        public boolean iscero(int numberI) {

        if (numberI == 0) {
            return true;
        } else {
            return false;
        }}


    public boolean iscero2(int numberII) {

        if (numberII == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void CLEAN (View view){
        EditText NUMI = (EditText) findViewById(R.id.NUM1);
        EditText NUMII = (EditText) findViewById(R.id.NUM2);
        TextView ERR = (TextView) findViewById(R.id.ERROR);
        TextView COMP = (TextView) findViewById(R.id.COMPA);
        TextView SUM = (TextView) findViewById(R.id.ADD);
        TextView REST = (TextView) findViewById(R.id.SUB);
        TextView MULT = (TextView) findViewById(R.id.PROD);
        TextView DIV = (TextView) findViewById(R.id.DIVE);

        NUMI.setText("");
        NUMII.setText("");
        ERR.setText("");
        COMP.setText("");
        SUM.setText("");
        REST.setText("");
        MULT.setText("");
        DIV.setText("");
    }

    }

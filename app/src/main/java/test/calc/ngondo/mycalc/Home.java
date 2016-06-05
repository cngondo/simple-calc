package test.calc.ngondo.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calc.operations.Operations;

public class Home extends AppCompatActivity implements Operations, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //all view elements here
        final TextView lblTitle = (TextView) findViewById(R.id.titleApp);
        final TextView lblFirstNumber = (TextView) findViewById(R.id.fnumber);
        final TextView lblSecondNumber= (TextView) findViewById(R.id.lnumber);

        final EditText mFirstNumber = (EditText) findViewById(R.id.firstNumber);
        final EditText mSecondNumber = (EditText) findViewById(R.id.secondNumber);
        final EditText manswer = (EditText) findViewById(R.id.answer);

        Button btnAdd = (Button) findViewById(R.id.buttonAdd);
        Button btnSubtract = (Button) findViewById(R.id.buttonSubtract);
        Button btnDivide = (Button) findViewById(R.id.buttonDivide);
        Button btnMultiply = (Button) findViewById(R.id.buttonMultiply);

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }
}

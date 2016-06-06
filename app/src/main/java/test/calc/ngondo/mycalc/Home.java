package test.calc.ngondo.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import calc.operations.Operations;

public class Home extends AppCompatActivity implements Operations, View.OnClickListener {

    double num1;
    double num2;
    double result;

    TextView mAnswer;
    EditText mSecondNumber;
    EditText mFirstNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //all view elements here
        mAnswer = (TextView) findViewById(R.id.answer);
        mFirstNumber = (EditText) findViewById(R.id.firstNumber);
        mSecondNumber = (EditText) findViewById(R.id.secondNumber);

        Button btnAdd = (Button) findViewById(R.id.buttonAdd);
        Button btnSubtract = (Button) findViewById(R.id.buttonSubtract);
        Button btnDivide = (Button) findViewById(R.id.buttonDivide);
        Button btnMultiply = (Button) findViewById(R.id.buttonMultiply);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try {
            num1 = Double.parseDouble(mFirstNumber.getText().toString().replace(",",""));
            num2 = Double.parseDouble(mSecondNumber.getText().toString().replace(",",""));

        }catch (NumberFormatException e){
            num1 = 0;
            num2 = 0;
        }

        switch (view.getId()){
            case R.id.buttonAdd:
                addition(num1, num2);
                break;
            case R.id.buttonSubtract:
                subtraction(num1, num2);
                break;
            case R.id.buttonMultiply:
                multiplication(num1, num2);
                break;
            case R.id.buttonDivide:
                division(num1, num2);
                break;
            default:
                break;
        }
        mAnswer.setText(Double.toString(result));
    }

    @Override
    public double addition(double a, double b) {
        result = a + b;
        return result;
    }

    @Override
    public double subtraction(double a, double b) {
        result = a - b;
        return result;
    }

    @Override
    public double multiplication(double a, double b) {
        result = a * b;
        return result;
    }

    @Override
    public double division(double a, double b) {
        result = a / b;
        return result;
    }
}

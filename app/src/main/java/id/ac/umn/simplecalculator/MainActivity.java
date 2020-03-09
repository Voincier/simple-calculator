package umn.ac.id.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button one,two,three,four,five,six,seven,eight,nine,zero;
    public Button btnAdd,btnSubtr,btnMult,btnDiv;
    public Button btnDel,btnCe,btnC,btnBack,btnNeg,btnDec,btnEq;EditText EditText;
    public TextView resultText;
    public String totalText;
    public char operator=' ';

    float mValueOne, mValueTwo;

    boolean Addition, mSubtract, Multiplication, Division, PlusMin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                checkOp(operator,"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                checkOp(operator,"2");
            }


        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                checkOp(operator,"3");
            }


        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOp(operator, "4");
            }

        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOp(operator, "5");
            }

        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOp(operator, "6");
            }

        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOp(operator, "7");
            }

        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOp(operator, "8");
            }

        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOp(operator, "9");
            }

        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkOp(operator, "0");
            }

        });

/*        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonCE = (Button) findViewById(R.id.buttonCE);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        buttonDel = (Button) findViewById(R.id.buttondel);
        buttonPlusMin = (Button) findViewById(R.id.buttonplusmin);*/
        EditText = (EditText) findViewById(R.id.edt1);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (EditText == null) {
                EditText.setText("");
            } else {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                Addition = true;
                EditText.setText(null);
            }
            }
        });

        btnSubtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                mSubtract = true;
                EditText.setText(null);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                Multiplication = true;
                EditText.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                Division = true;
                EditText.setText(null);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=EditText.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    EditText.setText(str);
                }
                else if (str.length() <=1 ) {
                    EditText.setText("0");
                }
            }
        });

        btnNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText.getText() + "");
                EditText.setText(mValueOne * -1 + "");
                PlusMin = true;
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(EditText.getText() + "");

                if (Addition == true) {
                    EditText.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (mSubtract == true) {
                    EditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (Multiplication == true) {
                    EditText.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    EditText.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText("");
            }
        });

        btnCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText("");
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + ".");
            }
        });
    }

    public void checkOp(char op,String i){
        if(op==' '){
            totalText=resultText.getText().toString();
            totalText=totalText+i;
            resultText.setText(totalText);
        }
        else if(op=='+' || op=='-' || op=='/' || op=='*'){
            operator=' ';
            resultText.setText(null);
            resultText.setText(i);
        }
    }
}

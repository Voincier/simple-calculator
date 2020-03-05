package id.ac.umn.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public Button one,two,three,four,five,six,seven,eight,nine,zero;
    public Button btnAdd,btnSubtr,btnMult,btnDiv;
    public Button btnCe,btnC,btnBack,btnNeg,btnDec,btnEq;
    public TextView resultText;
    public String totalText;
    public float total=0;
    public float prevOp,currOp;
    public char operator=' ';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //number btns
        initNumBtn();

        //operator btns
        initOpBtn();

        //function btns
        btnCe=findViewById(R.id.ce);
        btnC=findViewById(R.id.c);
        btnBack=findViewById(R.id.back);
        btnNeg=findViewById(R.id.negative);
        btnDec=findViewById(R.id.dec);

        //equals ehe
        btnEq=findViewById(R.id.equal);

        //text in screen
        resultText=(TextView) findViewById(R.id.show);

        //digits
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

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung('+');

            }
        });

        btnSubtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung('-');
                //resultText.setText(String.valueOf(total));
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung('*');
                resultText.setText(String.valueOf(total));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung('/');
                resultText.setText(String.valueOf(total));
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(String.valueOf(total));
                total=0;
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

    public void hitung(char op){
        currOp=Float.parseFloat(resultText.getText().toString());

        switch(op){
            case '+':
                operator='+';
                total=prevOp+currOp;
                prevOp=currOp;
                resultText.setText(String.valueOf(total));
                break;
            case '-':
                operator='-';
                total=prevOp-currOp;
                prevOp=currOp;
                resultText.setText(String.valueOf(total));
                break;

        }
    }

    public void initNumBtn(){
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
    }

    public void initOpBtn(){
        btnAdd=findViewById(R.id.add);
        btnSubtr=findViewById(R.id.subtract);
        btnMult=findViewById(R.id.multiply);
        btnDiv=findViewById(R.id.divide);
    }
}

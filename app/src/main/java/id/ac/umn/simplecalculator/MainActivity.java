package id.ac.umn.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public Button one,two,three,four,five,six,seven,eight,nine,zero;
    public TextView res;
    private String res1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        res=(TextView) findViewById(R.id.show);

        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                res1=res.getText().toString();
                res1=res1+"1";
                res.setText(res1);
            }


        });
    }
}

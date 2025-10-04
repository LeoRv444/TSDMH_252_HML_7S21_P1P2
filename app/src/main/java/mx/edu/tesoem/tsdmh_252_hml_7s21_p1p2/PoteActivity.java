package mx.edu.tesoem.tsdmh_252_hml_7s21_p1p2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PoteActivity extends AppCompatActivity {

    EditText txtn1, txtn2;
    TextView lblres;

    Button btnsuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pote);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtn1 = findViewById(R.id.txtn1);
        txtn2 = findViewById(R.id.txtn2);
        lblres = findViewById(R.id.lblres);

        btnsuma = findViewById(R.id.btnsuma);

    }

    public void oclickpote (View v){

        int num1, num2;
        num1 = Integer.parseInt(txtn1.getText().toString());
        num2 = Integer.parseInt(txtn2.getText().toString());
        String cadena = "La potencia del primer numero es: "+String.valueOf(num1*num1)+ " La potencia del segundo numero es: "+ String.valueOf(num2*num2);
        lblres.setText(cadena);

    }

}
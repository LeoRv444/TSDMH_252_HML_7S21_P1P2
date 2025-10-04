package mx.edu.tesoem.tsdmh_252_hml_7s21_p1p2;

import android.content.Intent;
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

public class PrincipalActivity extends AppCompatActivity {

    EditText txtn1, txtn2;

    Button btnsuma, btnresta, btndivicion, btnmulti, btnpote, btnn, btnraiz;

    TextView lblres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btndivicion = findViewById(R.id.btndivicion);
        btnmulti = findViewById(R.id.btnmulti);
        btnpote = findViewById(R.id.btnpot);
        btnn = findViewById(R.id.btnn);
        btnraiz = findViewById(R.id.btnraiz);

    }

    public  void  vsuma (View v) {
        Intent intent = new Intent(this, SumaActivity.class);
        startActivity(intent);

    }

    public  void  vresta (View v) {
        Intent intent = new Intent(this, RestaActivity.class);
        startActivity(intent);

    }

    public  void  vdiv (View v) {
        Intent intent = new Intent(this, DivActivity.class);
        startActivity(intent);

    }

    public  void  vmulti (View v) {
        Intent intent = new Intent(this, MultiActivity.class);
        startActivity(intent);

    }

    public  void  vpote (View v) {
        Intent intent = new Intent(this, PoteActivity.class);
        startActivity(intent);

    }

    public  void  vn (View v) {
        Intent intent = new Intent(this, PotenActivity.class);
        startActivity(intent);

    }

    public  void  vraiz (View v) {
        Intent intent = new Intent(this, RaizActivity.class);
        startActivity(intent);

    }

}
package co.edu.unimagdalena.apmoviles.tallerunimag1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;
    Button suma, resta, multiplica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        n1 = findViewById(R.id.edtn1);
        n2 = findViewById(R.id.edtn2);
        suma = findViewById(R.id.btnsumar);
        resta = findViewById(R.id.btnrestar);
        multiplica = findViewById(R.id.btnmultiplica);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplica.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.m1: Toast.makeText(this,"Menu 1", Toast.LENGTH_LONG).show();
            break;
            case R.id.m2: Toast.makeText(this,"Menu 2", Toast.LENGTH_LONG).show();
                break;
            case R.id.m3: Toast.makeText(this,"Menu 3", Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        switch (v.getId()){
            case R.id.btnsumar:
                Toast.makeText(this,"Suma = " + (num1 + num2), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnrestar:
                Toast.makeText(this,"Resta = " + (num1 - num2), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnmultiplica:
                Toast.makeText(this,"Multiplicación = "+ (num1 * num2), Toast.LENGTH_LONG).show();
                break;
        }
    }
}
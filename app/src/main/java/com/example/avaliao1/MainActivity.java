package com.example.avaliao1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editInput;
    private Button btnConverter;
    private TextView textOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInput = findViewById(R.id.edit_Input);
        textOutput = findViewById(R.id.text_Output);
        btnConverter = findViewById(R.id.btn_Converter);



        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double centimetro = Double.parseDouble(editInput.getText().toString());
                double jardas = centimetro/91.44;
                DecimalFormat df = new DecimalFormat("0.00000");
                textOutput.setText("valor em Jardas: \n"+df.format(jardas));
            }
        });



    }
}
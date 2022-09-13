package com.example.primeiroapppart2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editName)
        campoEmail = findViewById(R.id.editEmail);
        textoMensagem = findViewById(R.id.textView)

    }

        public void enviar(View view) {
            String name = campoNome.getText().toString();
            String email = campoEmail.getText().toString();

            textoMensagem.setText("Nome: " + name + " , " + "Email: " + email);
        }


            public void limpar(View view) {
                campoNome.setText(" ");
                campoEmail.setText(" ");
                textoMensagem.setText(" ");


        }


    }

}
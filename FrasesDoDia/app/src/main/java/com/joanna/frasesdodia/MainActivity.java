package com.joanna.frasesdodia;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

  String[] frases = {
          "Frase 1",
          "Frase 2",
          "Frase 3",
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
      Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
      return insets;
    });
  }

  public void gerarFrase(View view){

    TextView texto = findViewById(R.id.textResultado);
    int numeroAleatorio = new Random().nextInt(3);
    String frase = frases[numeroAleatorio];

    texto.setText( frase );
  }

  public void exibirTodas(View view){

    TextView texto = findViewById(R.id.textResultado);

    StringBuilder textoResultado = new StringBuilder();
    for ( String frase : frases) {
      textoResultado.append(frase).append("\n");
    }

    texto.setText(textoResultado.toString());
  }

}
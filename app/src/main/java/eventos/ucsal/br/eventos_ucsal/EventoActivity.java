package eventos.ucsal.br.eventos_ucsal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EventoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);

        TextView nome_evento = findViewById(R.id.nomeEvento);
        String nome = getIntent().getStringExtra("evento_descricao");

        nome_evento.setText(nome);



    }
}

package eventos.ucsal.br.eventos_ucsal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class ListaEventoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_evento);

        Intent intent = getIntent();

        ListView listaEventos = (ListView) this.findViewById(R.id.list_view_eventos);

        final ArrayList<String> list_eventos = new ArrayList<String>();
        //O ideal seria fazer a iserção pelo MainActivity (Form Cadastrar Evento)
        list_eventos.add("Palestra MongoDB");
        list_eventos.add("Handson MongoDB");
        list_eventos.add("Palestra JavaScript");
        list_eventos.add("Hakathon Java");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list_eventos);

        listaEventos.setAdapter(adapter);

        listaEventos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent eventoActivity = new Intent(ListaEventoActivity.this, EventoActivity.class);

                eventoActivity.putExtra("evento_descricao", list_eventos.get(i));
                startActivity(eventoActivity);
            }
        });
    }
}

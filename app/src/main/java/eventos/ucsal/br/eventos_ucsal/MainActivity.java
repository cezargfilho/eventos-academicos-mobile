package eventos.ucsal.br.eventos_ucsal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "br.ucsal.eventos.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Dificuldade em enviar informação de 2 campos "editText" para uma nova Activity
    public void sendMessage(View view) {
        Intent intent = new Intent(this, ListaEventoActivity.class);
        EditText editTextNome = (EditText) findViewById(R.id.editNomeEvento);
        EditText editTextLocal = (EditText) findViewById(R.id.editLocalEvento);
        String messageNome = editTextNome.getText().toString();
        String messageLocal = editTextLocal.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, messageNome);
        intent.putExtra(EXTRA_MESSAGE, messageLocal);

        startActivity(intent);

    }

}

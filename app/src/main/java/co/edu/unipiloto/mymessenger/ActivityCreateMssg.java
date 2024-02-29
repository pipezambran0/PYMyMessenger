package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class ActivityCreateMssg extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mssg);

        List<String> chat = Historial.getInstance().getMssgs();
        TextView layoutChat = (TextView) findViewById(R.id.textViewACM2);
        StringBuilder formChat = new StringBuilder();
        for(String m: chat){
            formChat.append(m).append("\n");
        }
        layoutChat.setText(formChat);

    }

    public void enviarMssg1(View view){
        EditText obtenerMssg1 = (EditText) findViewById(R.id.editTextACM);
        String mssg1 = "Propietario del Camion : " + obtenerMssg1.getText().toString();
        Historial.getInstance().addMssgs(mssg1);
        Intent intent1 = new Intent(this, ActivityReceiveMssg.class);
        startActivity(intent1);
    }

}
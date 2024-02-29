package co.edu.unipiloto.mymessenger;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ActivityReceiveMssg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_mssg);

        List<String> chat1 = Historial.getInstance().getMssgs();
        TextView layoutChat1 = (TextView) findViewById(R.id.textViewARM2);
        StringBuilder formChat1 = new StringBuilder();
        for(String m: chat1){
            formChat1.append(m).append("\n");
        }
        layoutChat1.setText(formChat1);

    }

    public void enviarMssg2(View view){
        EditText obtenerMssg2 = (EditText) findViewById(R.id.editTextARM);
        String mssg2 = "Conductor del Camion : " + obtenerMssg2.getText().toString();
        Historial.getInstance().addMssgs(mssg2);
        Intent intent2 = new Intent(this, ActivityCreateMssg.class);
        startActivity(intent2);
    }



}

package it.unitn.disi.lpsmt.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Optional;

public class EndActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_end);

        var intent = this.getIntent();
        var name = "nessuno";

        if( intent.hasExtra("name") )
            name = intent.getStringExtra("name");

        var txtName = (TextView) this.findViewById(R.id.lblEndActivity);
        txtName.setText(name);

        final var lambdaName = name;

        var btnShare = (Button) this.findViewById(R.id.btnShare);
        btnShare.setOnClickListener(event -> {

            var shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_TEXT, lambdaName);
            shareIntent.setType("text/plain");

            var sendIntent = Intent.createChooser(shareIntent, "Condividi contenuto");
            this.startActivity(sendIntent);

        });



    }

}

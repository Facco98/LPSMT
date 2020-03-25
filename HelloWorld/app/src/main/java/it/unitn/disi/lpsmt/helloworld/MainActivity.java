package it.unitn.disi.lpsmt.helloworld;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var btnMainActivity = (Button) this.findViewById(R.id.btnMainActivity);
        btnMainActivity.setOnClickListener(event -> {

            var intent = new Intent(MainActivity.this, EndActivity.class);
            intent.putExtra("name", "Pippo");
            this.startActivity(intent);

        });
    }
}

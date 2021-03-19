package hortonomi.ohjelma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Third extends AppCompatActivity
{
    TextView receiver_msg;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageButton imageButtonTakaisin3A = findViewById(R.id.imageButtonTakaisinA3);
        Button buttonKoti3A = findViewById(R.id.buttonKotiA3);
        ImageButton imageButtonKirjoitaKommentti3A = findViewById(R.id.imageButtonKirjoitaKommenttiA3);


        //setContentView(R.layout.activity_third);
        receiver_msg = (TextView) findViewById(R.id.textViewKommenttiPalstaA3);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        receiver_msg.setText(str);


        imageButtonTakaisin3A.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Takaisin nuoli painiketta painettu 3 Avtivityssa");

                Intent SecondIntent = new Intent(getApplicationContext(), Second.class);
                startActivity(SecondIntent);
            }
        });


        buttonKoti3A.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Painiketta Koti painettu 3 Avtivityssa");

                Intent MainActivityIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivityIntent);
            }
        });


        imageButtonKirjoitaKommentti3A.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Kirjoita kommentti painiketta painettu 3Activityssa");

                Intent KommentinLuontiIntent = new Intent(getApplicationContext(), KommentinLuonti.class);
                startActivity(KommentinLuontiIntent);
            }
        });
    }
}

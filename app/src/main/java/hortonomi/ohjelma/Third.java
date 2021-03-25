package hortonomi.ohjelma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Third extends AppCompatActivity
{
    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageButton imageButtonTakaisinA3 = findViewById(R.id.imageButtonTakaisinA3);
        Button buttonKotiA3 = findViewById(R.id.buttonKotiA3);
        Button buttonFoorumiA3 = findViewById(R.id.buttonFoorumiA3);


        imageButtonTakaisinA3.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Takaisin nuoli painiketta painettu 3 Avtivityssa");

                Intent SecondIntent = new Intent(getApplicationContext(), Second.class);
                startActivity(SecondIntent);
            }
        });


        buttonKotiA3.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Painiketta Koti painettu 3 Avtivityssa");

                Intent MainActivityIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivityIntent);
            }
        });


        buttonFoorumiA3.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Kirjoita kommentti painiketta painettu Activity3");

                Intent KommentinLuontiIntent = new Intent(getApplicationContext(), KommentinLuonti.class);
                startActivity(KommentinLuontiIntent);
            }
        });
    }
}

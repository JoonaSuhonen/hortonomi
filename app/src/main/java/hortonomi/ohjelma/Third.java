package hortonomi.ohjelma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageButton ImageButtonTakaisin = findViewById(R.id.imageButtonTakaisin);
        Button buttonKoti = findViewById(R.id.buttonKoti);

        ImageButtonTakaisin.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Takaisin nuoli painiketta painettu");

                Intent SecondIntent = new Intent(getApplicationContext(), Second.class);
                startActivity(SecondIntent);
            }
        });

        buttonKoti.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Painiketta Koti painettu");

                Intent MainActivityIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivityIntent);
            }
        });
    }
}

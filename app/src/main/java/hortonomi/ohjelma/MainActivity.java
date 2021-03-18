package hortonomi.ohjelma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginbutton = findViewById(R.id.loginbutton);



        loginbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Painiketta painettu");

                Intent SecondIntent = new Intent(getApplicationContext(), Second.class);
                startActivity(SecondIntent);
            }
        });


    }
}

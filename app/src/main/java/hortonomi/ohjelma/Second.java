package hortonomi.ohjelma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button buttonTesti3Activityyn = findViewById(R.id.buttonTesti3Activityyn);

        buttonTesti3Activityyn.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Painiketta testiActivity3 painettu");

                Intent ThirdIntent = new Intent(getApplicationContext(), Third.class);
                startActivity(ThirdIntent);
            }
        });
    }
}
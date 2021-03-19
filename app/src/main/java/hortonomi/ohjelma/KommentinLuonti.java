package hortonomi.ohjelma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class KommentinLuonti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kommentin_luonti);

        Button buttonKotiKommentti = findViewById(R.id.buttonKotiKommentti);
        ImageButton imageButtonTakaisinKommentti = findViewById(R.id.imageButtonTakaisinKommentti);
        Button buttonJulkaiseKommentti = findViewById(R.id.buttonJulkaiseKommentti);
//        ImageButton imageButtonPoistaKommentti = findViewById(R.id.imageButtonPoistaKommentti);
        EditText editTextTextMultiLineKommentinKirjoitus = findViewById(R.id.editTextTextMultiLineKommentinKirjoitus);


        buttonKotiKommentti.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Painiketta Koti kommenttiActivissa painettu");

                Intent MainActivityIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivityIntent);
            }
        });

        imageButtonTakaisinKommentti.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Takaisin nuoli painiketta painettu kommenttiosiossa");

                Intent ThirdIntent = new Intent(getApplicationContext(), Third.class);
                startActivity(ThirdIntent);
            }
        });

        buttonJulkaiseKommentti.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                String str = editTextTextMultiLineKommentinKirjoitus.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Third.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
                System.out.println("Julkaiset kommentti painiketta painettu kommenttiosiossa");
            }
        });

     /*   imageButtonPoistaKommentti.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                String str = editTextTextMultiLineKommentinKirjoitus.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
                System.out.println("Poista kommentti painiketta painettu kommenttiosiossa");
            }
        });*/

      /*  edInput.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                if( keyCode == KeyEvent.KEYCODE_ENTER) {
                    edOutput.setText(edInput.getText());
                    return true;
                }
                return false;
            }
        });*/
    }
}

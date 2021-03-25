package hortonomi.ohjelma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class KommentinLuonti extends AppCompatActivity
{
    TextView receiver_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kommentin_luonti);

        ImageButton imageButtonKirjoitaKommenttiA4 = findViewById(R.id.imageButtonKirjoitaKommenttiA4);
       /* receiver_msg = (TextView) findViewById(R.id.textViewKommenttiPalstaA4);
        Intent intent = getIntent();*/
//        String str = intent.getStringExtra("message_key");

        Button buttonKotiKommenttiA4 = findViewById(R.id.buttonKotiKommenttiA4);
        ImageButton imageButtonTakaisinKommenttiA4 = findViewById(R.id.imageButtonTakaisinKommenttiA4);
        Button buttonJulkaiseKommenttiA4 = findViewById(R.id.buttonJulkaiseKommenttiA4);

        EditText editTextTextMultiLineKommentinKirjoitusA4 = findViewById(R.id.editTextTextMultiLineKommentinKirjoitusA4);
        TextView textViewKommenttiPalstaA4 = findViewById(R.id.textViewKommenttiPalstaA4);


        buttonKotiKommenttiA4.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Painiketta Koti kommenttiActivissa eli A4 painettu");

                Intent MainActivityIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivityIntent);
            }
        });

        imageButtonTakaisinKommenttiA4.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Takaisin nuoli painiketta painettu kommenttiosiossa eli A4");

                Intent ThirdIntent = new Intent(getApplicationContext(), Third.class);
                startActivity(ThirdIntent);
            }
        });

        imageButtonKirjoitaKommenttiA4.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                System.out.println("Kirjoitakommentti painiketta painettu kommenttiosiossa eli A4");

                Intent KommentinLuontiIntent = new Intent(getApplicationContext(), KommentinLuonti.class);
                startActivity(KommentinLuontiIntent);
            }
        });

        buttonJulkaiseKommenttiA4.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view)
            {
                String str = editTextTextMultiLineKommentinKirjoitusA4.getText().toString();
                textViewKommenttiPalstaA4.setText(str);
               /* Intent intent = new Intent(getApplicationContext(), KommentinLuonti.class);
                intent.putExtra("message_key", str);
                startActivity(intent);*/
                System.out.println("Julkaiset kommentti painiketta painettu kommenttiosiossa eli A4");
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

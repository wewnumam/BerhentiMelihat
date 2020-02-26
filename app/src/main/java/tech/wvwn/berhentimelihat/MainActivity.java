package tech.wvwn.berhentimelihat;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView title, subtitle;
    Button btn_blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.judul);
        subtitle = (TextView) findViewById(R.id.sub);
        btn_blue = (Button) findViewById(R.id.btn_blue);

        Typeface font1 = Typeface.createFromAsset(getAssets(), "fonts/Font1.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/Font2.ttf");

        title.setTypeface(font2);
        subtitle.setTypeface(font2);
        btn_blue.setTypeface(font1);

        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SW.class));
            }
        });
    }
}

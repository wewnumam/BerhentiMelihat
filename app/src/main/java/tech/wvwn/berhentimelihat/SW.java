package tech.wvwn.berhentimelihat;

import android.graphics.Typeface;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class SW extends AppCompatActivity {

    Chronometer time;
    Button btn_green, btn_red;
    ImageView iv;
    Animation spin;
    long stopOffset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sw);

        time = (Chronometer) findViewById(R.id.chronometer);
        btn_green = (Button) findViewById(R.id.btn_green);
        btn_red = (Button) findViewById(R.id.btn_red);
        iv = (ImageView) findViewById(R.id.iv);

        spin = AnimationUtils.loadAnimation(this, R.anim.roundingalone);

        Typeface font1 = Typeface.createFromAsset(getAssets(), "fonts/Font2.ttf");
        btn_green.setTypeface(font1);
        btn_red.setTypeface(font1);
    }

    public void startChronometer(View view) {
        stopOffset = 0;
        time.setBase(SystemClock.elapsedRealtime());
        iv.startAnimation(spin);
        time.start();
    }

    public void stopChronometer(View view) {
        stopOffset = SystemClock.elapsedRealtime() - time.getBase();
        iv.clearAnimation();
        time.stop();
    }
}

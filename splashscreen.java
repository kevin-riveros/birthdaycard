package pe.com.kevinrsd.birthdaycard;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kevinriverosguia on 28/10/17.
 */


public class splashscreen extends AppCompatActivity {

    private static int timeactivity=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainintent=new Intent(splashscreen.this, MainActivity.class);
                startActivity(mainintent);
                finish();
            }
        },timeactivity);
    }
}

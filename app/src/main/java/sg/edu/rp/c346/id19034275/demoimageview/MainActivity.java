package sg.edu.rp.c346.id19034275.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivDay2;
    ImageView ivDay4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        ivDay2.setImageResource(R.drawable.day2);
        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        ivDay4.setImageResource(R.drawable.day4);
    }
}
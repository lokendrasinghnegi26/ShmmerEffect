package com.lokendrasingh.shmmereffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {

    ShimmerFrameLayout shimmer;
    ImageView img;
    TextView title, subtitle;
    Handler handler= new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shimmer= findViewById(R.id.shimmer);
        img= findViewById(R.id.imageView);
        title= findViewById(R.id.head);
        subtitle= findViewById(R.id.subtitle);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                shimmer.stopShimmer();
                shimmer.hideShimmer();
                shimmer.setVisibility(View.GONE);

                img.setVisibility(View.VISIBLE);
                title.setVisibility(View.VISIBLE);
                subtitle.setVisibility(View.VISIBLE);

            }
        }, 5000);
    }
}
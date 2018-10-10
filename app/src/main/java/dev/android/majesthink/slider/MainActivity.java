package dev.android.majesthink.slider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.synnapps.carouselview.ViewListener;

public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;

    int[] imgBanner = {R.drawable.home_1, R.drawable.home_2, R.drawable.home_3, R.drawable.home_4, R.drawable.home_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = (CarouselView)findViewById(R.id.carouselView);

        carouselView.setPageCount(5);

        carouselView.setViewListener(viewListener);

    }

    /*ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(imgBanner[position]);
        }
    };*/

    ViewListener viewListener = new ViewListener() {
        @Override
        public View setViewForPosition(int position) {
            View customView = getLayoutInflater().inflate(R.layout.custom_slider, null);
            ImageView imageView;
            imageView = (ImageView)customView.findViewById(R.id.sliderImage);

            imageView.setImageResource(imgBanner[position]);
            return customView;
        }
    };
}

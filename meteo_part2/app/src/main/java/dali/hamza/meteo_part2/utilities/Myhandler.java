package dali.hamza.meteo_part2.utilities;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import dali.hamza.meteo_part2.R;


public class Myhandler {


    @BindingAdapter("imagedrawable")
    public static void setImageWeather(ImageView view, double temp){



        if(temp>22){
            view.setImageDrawable(view.getResources().getDrawable(R.drawable.ic_sun,null));
        }else if(temp>0 && temp<22){

            view.setImageDrawable(view.getResources().getDrawable(R.drawable.ic_rain,null));
        }else{

            view.setImageDrawable(view.getResources().getDrawable(R.drawable.ic_snowflake,null));
        }

    }


}

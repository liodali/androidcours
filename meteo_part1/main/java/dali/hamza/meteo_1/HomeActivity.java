package dali.hamza.meteo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView citytxtview;
    private ImageView imageView;
    private TextView temperature;
    private Button add,remove;

    int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String city=getIntent().getExtras().getString("cityname");

        citytxtview=findViewById(R.id.id_city);
        temperature=findViewById(R.id.id_temperature);
        imageView=findViewById(R.id.weather_icon);
        add=findViewById(R.id.add);


        if(city!=null){
            citytxtview.setText(city);
        }


    }

    public void add(View view){
        temp++;
        temperature.setText(String.valueOf(temp));
        changeicon(temp);
    }



    void changeicon(int t){
        if(t>0 && t<17){
            imageView.setImageDrawable(getResources()
                    .getDrawable(R.drawable.ic_rain,null));

        }else if(t>17){
            imageView.setImageDrawable(getResources()
                    .getDrawable(R.drawable.ic_sun,null));
        }
    }
}

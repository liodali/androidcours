package dali.hamza.meteo_part2.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import dali.hamza.meteo_part2.R;
import dali.hamza.meteo_part2.databinding.ActivityMainBinding;
import dali.hamza.meteo_part2.model.Meteo;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    private Meteo meteo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        meteo=new Meteo("tunis",-2);

        binding.setMeteo(meteo);
    }

    public void modif(View view){
        meteo.setTemperature(meteo.getTemperature()+1);
        binding.setMeteo(meteo);
    }
}

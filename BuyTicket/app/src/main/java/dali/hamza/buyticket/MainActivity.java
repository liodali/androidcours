package dali.hamza.buyticket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import dali.hamza.buyticket.databinding.ActivityMainBinding;
import dali.hamza.buyticket.model.Cart;
import dali.hamza.buyticket.model.Ticket;
import dali.hamza.buyticket.viewmodel.MainVIewModel;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    MainVIewModel vIewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        vIewModel= ViewModelProviders.of(this).get(MainVIewModel.class);

        binding.setViewmodel(vIewModel);
        binding.setLifecycleOwner(this);

    }





}

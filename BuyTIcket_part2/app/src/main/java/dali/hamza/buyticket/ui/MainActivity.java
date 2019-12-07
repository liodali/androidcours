package dali.hamza.buyticket.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.zip.Inflater;

import dali.hamza.buyticket.R;
import dali.hamza.buyticket.databinding.ActivityMainBinding;

import dali.hamza.buyticket.model.Ticket;
import dali.hamza.buyticket.ui.adapter.TicketAdapter;
import dali.hamza.buyticket.viewmodel.MainVIewModel;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    MainVIewModel vIewModel;
    //TicketAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        vIewModel= ViewModelProviders.of(this).get(MainVIewModel.class);



        vIewModel.getTicketsLiveData().observe(this, new Observer<ArrayList<Ticket>>() {
            @Override
            public void onChanged(ArrayList<Ticket> tickets) {

            }
        });

        vIewModel.showSnack().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if(s!=null && !s.isEmpty()){
                    Snackbar snack=Snackbar.make(binding.mainCoordinator,s,Snackbar.LENGTH_SHORT);
                    snack.setAction("Hide", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                         snack.dismiss();
                        }
                    });
                    snack.show();
                }
            }
        });


        binding.setViewmodel(vIewModel);
        binding.setLifecycleOwner(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

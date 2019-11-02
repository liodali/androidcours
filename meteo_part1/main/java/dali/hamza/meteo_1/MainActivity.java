package dali.hamza.meteo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText cityinput;
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        cityinput=findViewById(R.id.id_inputcity);
        next=findViewById(R.id.id_btnext);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cityname=cityinput.getText().toString();
                if(cityname.isEmpty()){
                    Toast.makeText(MainActivity.this,getResources().getString(R.string.labelhintwelcome),Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                    intent.putExtra("cityname",cityname);
                    startActivity(intent);
                }
            }
        });
    }
}

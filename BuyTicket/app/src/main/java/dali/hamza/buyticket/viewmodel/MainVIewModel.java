package dali.hamza.buyticket.viewmodel;

import android.app.Application;
import android.app.TaskInfo;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import dali.hamza.buyticket.model.Cart;
import dali.hamza.buyticket.model.Ticket;

public class MainVIewModel extends AndroidViewModel {


    private MutableLiveData<Ticket> ticketMutableLiveData;
    private LiveData<Ticket> ticketLiveData;

    private MutableLiveData<Cart> cartMutableLiveData;
    private LiveData<Cart> cartLiveData;

    public MainVIewModel(@NonNull Application application) {
        super(application);


        ticketMutableLiveData=new MutableLiveData<>();
        cartMutableLiveData=new MutableLiveData<>();
        initData();

        ticketLiveData= Transformations.map(ticketMutableLiveData,(t)->{
            return  t;
        });

        cartLiveData= Transformations.map(cartMutableLiveData,(c)->{
            return  c;
        });
    }

    public LiveData<Ticket> getTicketLiveData(){
        return ticketLiveData;
    }
    public LiveData<Cart> getCart(){
        return cartLiveData;
    }

      void initData(){
        Ticket t =new Ticket("Ticket123456","18/12/2019",30,20);
        Cart c=new Cart(0,0);
        ticketMutableLiveData.setValue(t);
        cartMutableLiveData.setValue(c);
     }


     public void buyTicket(Ticket t){
        Ticket newticket=t;
        newticket.setNombre(t.getNombre()-1);
        ticketMutableLiveData.setValue(t);
        Cart c=cartMutableLiveData.getValue();
        c.setTotalprice(c.getTotalprice()+newticket.getPrice());
        cartMutableLiveData.setValue(c);

     }



}

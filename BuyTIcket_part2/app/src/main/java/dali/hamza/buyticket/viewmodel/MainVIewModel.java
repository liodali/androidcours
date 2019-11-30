package dali.hamza.buyticket.viewmodel;

import android.app.Application;
import android.app.TaskInfo;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import java.util.ArrayList;

import dali.hamza.buyticket.model.Cart;
import dali.hamza.buyticket.model.Ticket;

public class MainVIewModel extends AndroidViewModel {


    private MutableLiveData<ArrayList<Ticket>> ticketsMutableLiveData;
    private MutableLiveData<String> mutableLiveDataMessage;
    private LiveData<ArrayList<Ticket>> ticketsLiveData;

    private MutableLiveData<Cart> cartMutableLiveData;
    private LiveData<Cart> cartLiveData;


    public MainVIewModel(@NonNull Application application) {
        super(application);


        mutableLiveDataMessage = new MutableLiveData<>();
        ticketsMutableLiveData = new MutableLiveData<>();
        cartMutableLiveData = new MutableLiveData<>();
        initData();

        ticketsLiveData = Transformations.map(ticketsMutableLiveData, (t) -> {
            return t;
        });

        cartLiveData = Transformations.map(cartMutableLiveData, (c) -> {
            return c;
        });
    }

    public LiveData<ArrayList<Ticket>> getTicketsLiveData() {
        return ticketsLiveData;
    }

    public LiveData<Cart> getCart() {
        return cartLiveData;
    }

    void initData() {
        ArrayList<Ticket> list = new ArrayList<>();
        Ticket t = new Ticket("Ticket123456", "18/12/2019", 30, 20);
        list.add(t);
        t = new Ticket("Ticket999", "18/12/2019", 150, 5);
        list.add(t);
        Cart c = new Cart(0, 0);
        ticketsMutableLiveData.setValue(list);
        cartMutableLiveData.setValue(c);
    }

    public void setMutableLiveDataMessage(String msg) {
        mutableLiveDataMessage.setValue(msg);
    }

    public MutableLiveData<String> showSnack() {

        return mutableLiveDataMessage;
    }


}

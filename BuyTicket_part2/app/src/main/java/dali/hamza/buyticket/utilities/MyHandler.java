package dali.hamza.buyticket.utilities;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dali.hamza.buyticket.model.Ticket;
import dali.hamza.buyticket.ui.adapter.TicketAdapter;

public class MyHandler {






    @BindingAdapter("adapt")
    public static void setTicketAdapter(RecyclerView view, ArrayList<Ticket> tickets){


        TicketAdapter adapter=new TicketAdapter(tickets);
        view.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));
        view.setAdapter(adapter);
    }

}

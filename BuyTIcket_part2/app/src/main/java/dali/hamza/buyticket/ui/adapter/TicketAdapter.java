package dali.hamza.buyticket.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dali.hamza.buyticket.BR;
import dali.hamza.buyticket.R;
import dali.hamza.buyticket.model.Ticket;

public class TicketAdapter  extends RecyclerView.Adapter<TicketAdapter.MyViewHolder> {

    ArrayList<Ticket> tickets;




    public TicketAdapter(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }





    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        ViewDataBinding binding= DataBindingUtil.inflate(inflater, R.layout.item_list_ticket,parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Ticket t=tickets.get(position);
            holder.setTicket(t);
    }

    @Override
    public int getItemCount() {
        return tickets.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ViewDataBinding binding;
        public MyViewHolder(@NonNull ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
        public void setTicket(Ticket ticket){
            binding.setVariable(BR.ticket,ticket);
            binding.executePendingBindings();
        }
    }
}

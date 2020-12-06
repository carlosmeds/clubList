package br.ufpr.tads.clublist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.ufpr.tads.clublist.R;
import br.ufpr.tads.clublist.model.Club;

import java.util.List;

public class AdapterClubs extends RecyclerView.Adapter<AdapterClubs.MyViewHolder> {

    private List<Club> listClubs;

    public AdapterClubs(List<Club> list) {
        this.listClubs = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, city, state;
        ImageView image;

        public MyViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.textViewName);
            city = view.findViewById(R.id.textViewCity);
            state = view.findViewById(R.id.textViewState);
            image = view.findViewById(R.id.imageViewImage);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list_clubs, parent, false);

        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Club obj = listClubs.get(position);

        holder.name.setText(obj.getName());
        holder.city.setText(obj.getCity());
        holder.state.setText(obj.getState());
        if (position == 0)
        {
            holder.image.setImageResource(R.drawable.atletico);
        }
        else if (position == 1)
        {
            holder.image.setImageResource(R.drawable.gremio);
        }
        else if (position == 2)
        {
            holder.image.setImageResource(R.drawable.sp);
        }
        else if (position == 3)
        {
            holder.image.setImageResource(R.drawable.coxa);
        }

    }

    @Override
    public int getItemCount() {
        return listClubs.size();
    }
}
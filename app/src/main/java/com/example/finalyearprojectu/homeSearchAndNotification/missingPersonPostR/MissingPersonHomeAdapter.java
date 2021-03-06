package com.example.finalyearprojectu.homeSearchAndNotification.missingPersonPostR;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.finalyearprojectu.R;
import com.example.finalyearprojectu.missingPersonDeatail.MissingPersonDetail;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MissingPersonHomeAdapter extends RecyclerView.Adapter<MissingPersonHomeAdapter.ViewHolder> {
    List<MissingPersonHomM> mpHomeArrayList;
    private Context context;

    public MissingPersonHomeAdapter(List<MissingPersonHomM> mpHomeArrayList, Context context) {
        this.mpHomeArrayList = mpHomeArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_missing_bottom_navigation,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MissingPersonHomM missingPersonHomM = mpHomeArrayList.get(position);
        holder.nameP.setText(missingPersonHomM.getMissing_name());
        holder.statusP.setText(missingPersonHomM.getMissing_status());
        holder.dateP.setText(missingPersonHomM.getDisappeared_date());
        Picasso.get()
                .load(missingPersonHomM.getImage_url())
                .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(holder.imageView);
        holder.mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent missingIndividualDetailActivty = new Intent(context, MissingPersonDetail.class);
                missingIndividualDetailActivty.putExtra("name",missingPersonHomM.getMissing_name());
                missingIndividualDetailActivty.putExtra("FromCity",missingPersonHomM.getCity());
                missingIndividualDetailActivty.putExtra("MissingFrom",missingPersonHomM.getDissappeared_city());
                missingIndividualDetailActivty.putExtra("status",missingPersonHomM.getMissing_status());
                missingIndividualDetailActivty.putExtra("age",missingPersonHomM.getAge());
                missingIndividualDetailActivty.putExtra("gender",missingPersonHomM.getGender());
                missingIndividualDetailActivty.putExtra("date",missingPersonHomM.getDisappeared_date());
                missingIndividualDetailActivty.putExtra("fullAddress",missingPersonHomM.getAddress());
                missingIndividualDetailActivty.putExtra("phoneNumber",missingPersonHomM.getPhone_number());
                missingIndividualDetailActivty.putExtra("imageUrl",missingPersonHomM.getImage_url());
                context.startActivity(missingIndividualDetailActivty);
                Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mpHomeArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameP;
        TextView statusP;
        TextView dateP;
        Button mButton;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.my_image_view_missing);
            nameP = itemView.findViewById(R.id.name_missing_txt);
            statusP = itemView.findViewById(R.id.my_status_missing);
            dateP = itemView.findViewById(R.id.my_date_missing);
            mButton = itemView.findViewById(R.id.my_detail_btn_missing);
        }
    }
}

package com.example.gmaillayout;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class EmailAdapter extends BaseAdapter {

    List<EmailModel> items;
    int[]color;

    public EmailAdapter(List<EmailModel> items) {
        this.items = items;
        color=new int[]{Color.parseColor("#ff3838"),Color.parseColor("#ff9f1a"),Color.parseColor("#18dcff"),
                Color.parseColor("#7d5fff"),Color.parseColor("#32ff7e"),Color.parseColor("#7158e2")
                ,Color.parseColor("#3ae374"),Color.parseColor("#44bd32"),Color.parseColor("#192a56")};
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView==null)
        {
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_contact,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.imageFavorite=convertView.findViewById(R.id.image_favorite);
            viewHolder.txtContent=convertView.findViewById(R.id.txt_content);
            viewHolder.txtfullname=convertView.findViewById(R.id.txt_fullname);
            viewHolder.txtTime=convertView.findViewById(R.id.txt_time);
            viewHolder.txtRound=convertView.findViewById(R.id.txt_round);
            viewHolder.txtSubject=convertView.findViewById(R.id.txt_subject);
            convertView.setTag(viewHolder);

        }
        else
        {
            viewHolder=(ViewHolder) convertView.getTag();
        }
        final EmailModel emailModel=items.get(position);

        viewHolder.txtfullname.setText(emailModel.getFullname());
        viewHolder.txtSubject.setText(emailModel.getSubject());
        viewHolder.txtContent.setText(emailModel.getContent());
        viewHolder.txtTime.setText(emailModel.getTime());
        viewHolder.txtRound.setText(emailModel.getFullname().substring(0,1));
        if(emailModel.getColor()==-1) {
            int c=color[new Random().nextInt(color.length)];
            emailModel.setColor(c);
            viewHolder.txtRound.getBackground().setColorFilter(c,PorterDuff.Mode.SRC_IN);
        }
        else
        {
            viewHolder.txtRound.getBackground().setColorFilter(emailModel.getColor(),PorterDuff.Mode.SRC_IN);
        }
        if(emailModel.isSelected()) {
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_favorite);
        }
        else
        {
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_normal);
        }
        viewHolder.imageFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isSelected=items.get(position).isSelected();
                items.get(position).setSelected(!isSelected);
                //báo cho adapter list view thay đổi cần cập nhật tương ứng
                notifyDataSetChanged();
            }
        });

        //viewHolder.textRound.getBackground().setColorFilter();
        return convertView;
    }
    class ViewHolder{
        TextView txtRound;
        TextView txtfullname;
        TextView txtSubject;
        TextView txtContent;
        TextView txtTime;
        ImageView imageFavorite;
    }
}

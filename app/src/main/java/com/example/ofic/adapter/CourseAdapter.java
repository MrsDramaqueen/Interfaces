package com.example.ofic.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ofic.R;
import com.example.ofic.model.Course;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<Course> courses;

    public CourseAdapter(Context context, List<Course> courses) {
        this.context = context;
        this.courses = courses;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View tableItems = LayoutInflater.from(context).inflate(R.layout.course_item, parent, false);
        return new CourseAdapter.CourseViewHolder(tableItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        holder.tableBg.setBackgroundColor(Color.parseColor(courses.get(position).getColor()));

        int imageId = context.getResources().getIdentifier("ic_" + courses.get(position).getImg(), "drawable", context.getPackageName());
        holder.tableImage.setImageResource(imageId);

        holder.tableTittle.setText(courses.get(position).getOfficiant());
        holder.tableGuests.setText(courses.get(position).getGuests());
        holder.tableTime.setText(courses.get(position).getTime());


    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public static final class CourseViewHolder extends RecyclerView.ViewHolder{

        LinearLayout tableBg;
        ImageView tableImage;
        TextView tableTittle, tableGuests, tableTime;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);

            tableBg = itemView.findViewById(R.id.tableBg);
            tableImage = itemView.findViewById(R.id.tableImage);
            tableTittle = itemView.findViewById(R.id.tableTittle);
            tableGuests = itemView.findViewById(R.id.tableGuests);
            tableTime = itemView.findViewById(R.id.tableTime);
        }
    }
}

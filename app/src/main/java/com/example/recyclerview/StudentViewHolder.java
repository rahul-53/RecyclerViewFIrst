package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



    public class StudentViewHolder extends RecyclerView.ViewHolder{
        private TextView mTvName;
        private TextView mTvAge;
        private TextView mTvRoll;

        public StudentViewHolder(@NonNull View itemView){
            super(itemView);
            iniViews(itemView);

        }

        private void iniViews(View itemView) {
            mTvName=itemView.findViewById(R.id.tvName);
            mTvAge=itemView.findViewById(R.id.tvAge);
            mTvRoll=itemView.findViewById(R.id.tvRollNo);

        }
        public void setData(Student student){
            mTvName.setText(student.getName());
            mTvAge.setText(student.getAge());
            mTvRoll.setText(student.getRollNo());
        }
    }

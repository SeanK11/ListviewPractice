package com.example.listviewpractice.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewpractice.R;
import com.example.listviewpractice.datas.Student;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {
    private Context mContext;
    private int resId;
    private ArrayList<Student> mList;
    private LayoutInflater inf;

    public StudentAdapter(Context context, int resId, ArrayList<Student> student){
        super(context, resId, student);
        this.mContext = context;
        this.resId = resId;
        this.mList = student;
        this.inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View tempRow = convertView;
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null);
        }

        return tempRow;
    }
}

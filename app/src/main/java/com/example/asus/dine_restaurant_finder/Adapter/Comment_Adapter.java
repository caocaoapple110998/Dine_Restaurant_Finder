package com.example.asus.dine_restaurant_finder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.asus.dine_restaurant_finder.Event.Comment_Class;
import com.example.asus.dine_restaurant_finder.R;

import java.util.List;

public class Comment_Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Comment_Class> commentList;

    public Comment_Adapter(Context context, int layout, List<Comment_Class> commentList) {
        this.context = context;
        this.layout = layout;
        this.commentList = commentList;
    }

    @Override
    public int getCount() {
        return commentList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtName_Comment, txtContent_Comment, txtHours_Comment;
    }

    @Override
    public View getView(int i, View viewComment, ViewGroup viewGroup) {

        ViewHolder holder_Comment;

        if (viewComment == null){
            holder_Comment = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            viewComment = layoutInflater.inflate(layout,null);
            holder_Comment.txtName_Comment=(TextView)viewComment.findViewById(R.id.txt_name_comment);
            holder_Comment.txtHours_Comment=(TextView)viewComment.findViewById(R.id.txt_hours_comment);
            holder_Comment.txtContent_Comment=(TextView) viewComment.findViewById(R.id.txt_content_comment);

            viewComment.setTag(holder_Comment);
        }else {
            holder_Comment = (ViewHolder) viewComment.getTag();
        }

        Comment_Class comment_class = commentList.get(i);

        holder_Comment.txtName_Comment.setText(comment_class.getName());
        holder_Comment.txtContent_Comment.setText(comment_class.getContent());
        holder_Comment.txtHours_Comment.setText(comment_class.getHours());


        return viewComment;
    }
}

package com.example.listviewnangcao;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
// tạo 1 object adapter ở đây là trái cây adapter
// ListView.setAdapter ( traicayAdapter )
// traicayAdapter( màn hình , file layout , list trái cây )  => tạo constructor => tạo 3 biến ok chưa ?
//
public class TraiCayAdapter extends BaseAdapter {

    private Context context ;
    private int layout ;
    private List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    // trả về số dòng để hiện thị dữ liệu trên listview
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        ImageView imgHinh ;
        TextView txtTen , txtMoTa ;
    }

    @Override
    // đây là hàm xử lí chính của Adapter
    // trả về mỗi dòng trên listview của minh`
    // xử lí từng dòng trên listview
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder ; // để giảm thiểu việc ánh xạ nhiều lần , giữ giá trị của những biến cục bộ lại,..

        // lấy context ở constructer để gắn layout vào
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        // convertView sẽ chứa layout nào sẽ hiển thị mỗi dòng
        convertView = inflater.inflate(layout,null);
        // convertView lúc này sẽ là cái khung hình chữ nhật
        // ánh xạ view

        TextView txtTen = (TextView) convertView.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView) convertView.findViewById(R.id.textviewMoTa);
        ImageView imgvHinh = (ImageView) convertView.findViewById(R.id.imageviewHinh);


        // gán giá trị

        TraiCay traicay = traiCayList.get(position);
        txtTen.setText(traicay.getTen());
        txtMoTa.setText(traicay.getMota());
        imgvHinh.setImageResource(traicay.getHinh());

        //gan animation

        Animation animation = AnimationUtils.loadAnimation(context,R.anim.scale_animation);
        convertView.startAnimation(animation);

        return convertView;
    }
}

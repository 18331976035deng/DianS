package com.example.dengshuke0326.activity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dengshuke0326.R;
import com.example.dengshuke0326.bean.Bean;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter2 extends BaseAdapter {
    Context context;
    List<Bean.ResultBean.PzshBean.CommodityListBeanX> commodityList;

    public MyAdapter2(Context context,  List<Bean.ResultBean.PzshBean.CommodityListBeanX> commodityList) {
        this.context = context;
        this.commodityList = commodityList;
    }

    @Override
    public int getCount() {
        return commodityList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder holder;
        if (convertView==null){
            convertView=View.inflate(context, R.layout.item1,null);
            holder=new ViewHolder();
            holder.iv=convertView.findViewById(R.id.iv);
            holder.t1=convertView.findViewById(R.id.t1);
            holder.t2=convertView.findViewById(R.id.t2);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        Bean.ResultBean.PzshBean.CommodityListBeanX commodityListBeanX = commodityList.get(position);
        String commodityName = commodityListBeanX.getCommodityName();
        String masterPic = commodityListBeanX.getMasterPic();
        int price = commodityListBeanX.getPrice();
        Picasso.get().load(masterPic).into(holder.iv);
        holder.t1.setText(commodityName);
        holder.t2.setText(price+"");
        return convertView;
    }
    class ViewHolder{
        private ImageView iv;
        private TextView t1,t2;
    }
}

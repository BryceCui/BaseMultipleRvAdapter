package com.cuipengyu.basemultiplervadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cuipengyu.basemultiplervadapter.common.AdapterDelegate;
import com.cuipengyu.basemultiplervadapter.common.BaseViewHolder;

import java.util.List;

/**
 * Create by    ： 崔鹏宇
 * Time  is     ： 2018/5/11
 * Email        ： cuipengyusoul@gmail.com
 * Github       ： https://github.com/SolitarySoul
 * Instructions ：
 */
public class cui01 extends AdapterDelegate<Data> {

    @Override
    protected boolean isForViewType(List<Data> itmes, int position) {
        return itmes.get(position).getType()==1;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(ViewGroup parent) {
        return new cui01view(LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_mian_tab_bookcity,parent,false));
    }

    @Override
    protected void onBindViewHolder(List<Data> itmes, int position, BaseViewHolder holder) {
        holder.setText(R.id.shucheng,itmes.get(position).getName());
        holder.setText(R.id.shucheng1,itmes.get(position).getYear());
    }
    static class cui01view extends BaseViewHolder{

        public cui01view(View itemView) {
            super(itemView);
        }
    }
}

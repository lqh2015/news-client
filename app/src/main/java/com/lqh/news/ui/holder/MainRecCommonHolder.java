package com.lqh.news.ui.holder;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.lqh.news.R;
import com.lqh.news.model.beans.TopNews;

/**
 * Created by liqinghai on 2016/12/27.
 */
public class MainRecCommonHolder extends BaseViewHolder<TopNews.NewsBean> {
    private SimpleDraweeView draweeView;
    private TextView newsTitle;
    private TextView newsSource;
    private TextView newsTime;
    public MainRecCommonHolder(ViewGroup parent) {
        super(parent, R.layout.main_recycleview_commen_item);
      //  textView=$(R.id.main_item_tv);
        draweeView=$(R.id.main_common_item_cardView_simdraview);
        newsTitle=$(R.id.main_common_item_cardView_title);
        newsSource=$(R.id.main_common_item_cardView_source);
        newsTime=$(R.id.main_common_item_cardView_time);
    }

    @Override
    public void setData(TopNews.NewsBean data) {
        super.setData(data);
      //  textView.setText(data.getTitle());
        draweeView.setImageURI(data.getImgsrc());
        newsTitle.setText(data.getTitle());
        newsSource.setText(data.getSource());
        newsTime.setText(data.getPtime());
        Log.e("MainRecHeardHolder",data.getTitle());
    }
}

package com.example.dengshuke0326.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.example.dengshuke0326.R;
import com.example.dengshuke0326.adapter.MyAdapter;
import com.example.dengshuke0326.base.BaseActivity;
import com.example.dengshuke0326.bean.Bean;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends BaseActivity{                                                                                                                                      String json="{\"result\":{\"rxxp\":{\"commodityList\":[{\"commodityId\":25,\"commodityName\":\"秋冬季真皮兔毛女鞋韩版休闲平底毛毛鞋软底百搭浅口水钻加绒棉鞋毛毛鞋潮鞋\",\"masterPic\":\"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/1/1.jpg\",\"price\":158,\"saleNum\":684},{\"commodityId\":19,\"commodityName\":\"环球 时尚拼色街拍百搭小白鞋 韩版原宿ulzzang板鞋 女休闲鞋\",\"masterPic\":\"http://mobile.bwstudent.com/images/small/commodity/nx/bx/2/1.jpg\",\"price\":78,\"saleNum\":733},{\"commodityId\":29,\"commodityName\":\"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲\",\"masterPic\":\"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/5/1.jpg\",\"price\":278,\"saleNum\":730}],\"id\":1002,\"name\":\"热销新品\"},\"pzsh\":{\"commodityList\":[{\"commodityId\":6,\"commodityName\":\"轻柔系自然裸妆假睫毛\",\"masterPic\":\"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg\",\"price\":39,\"saleNum\":477},{\"commodityId\":13,\"commodityName\":\"贝览得美妆蛋\",\"masterPic\":\"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/3/1.jpg\",\"price\":44,\"saleNum\":601},{\"commodityId\":11,\"commodityName\":\"盒装葫芦粉扑美妆蛋化妆海绵\",\"masterPic\":\"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/1/1.jpg\",\"price\":9,\"saleNum\":172},{\"commodityId\":5,\"commodityName\":\"双头两用修容笔\",\"masterPic\":\"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg\",\"price\":39,\"saleNum\":541}],\"id\":1004,\"name\":\"品质生活\"},\"mlss\":{\"commodityList\":[{\"commodityId\":32,\"commodityName\":\"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋\",\"masterPic\":\"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg\",\"price\":88,\"saleNum\":842},{\"commodityId\":16,\"commodityName\":\"Lara style清洗剂\",\"masterPic\":\"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/6/1.jpg\",\"price\":12,\"saleNum\":595}],\"id\":1003,\"name\":\"魔力时尚\"}},\"message\":\"查询成功\",\"status\":\"0000\"}";
    private GridView gv3;
    private GridView gv2;
    private GridView gv1;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        gv1 = findViewById(R.id.gv1);
        gv2 = findViewById(R.id.gv2);
        gv3 = findViewById(R.id.gv3);
    }

    @Override
    protected void initData() {
        Gson gson = new Gson();
        Bean bean = gson.fromJson(json, Bean.class);
        Bean.ResultBean result = bean.getResult();
        Bean.ResultBean.RxxpBean rxxp = result.getRxxp();
        List<Bean.ResultBean.RxxpBean.CommodityListBean> commodityList = rxxp.getCommodityList();
        Bean.ResultBean.MlssBean mlss = result.getMlss();
        List<Bean.ResultBean.MlssBean.CommodityListBeanXX> commodityList1 = mlss.getCommodityList();
        Bean.ResultBean.PzshBean pzsh = result.getPzsh();
        List<Bean.ResultBean.PzshBean.CommodityListBeanX> commodityList2 = pzsh.getCommodityList();
        MyAdapter myAdapter = new MyAdapter(this,commodityList);
        MyAdapter1 myAdapter1 = new MyAdapter1(this,commodityList1);
        MyAdapter2 myAdapter2 = new MyAdapter2(this,commodityList2);
        gv1.setAdapter(myAdapter);
        gv2.setAdapter(myAdapter1);
        gv3.setAdapter(myAdapter2);
    }
}

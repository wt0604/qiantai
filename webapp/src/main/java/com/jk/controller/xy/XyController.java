package com.jk.controller.xy;


import com.alibaba.fastjson.JSON;
import com.jk.pojo.Account;
import com.jk.pojo.Shang;
import com.jk.service.XyService;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("test")
public class XyController {
    @Autowired
    private XyService xyservice;


    @RequestMapping("queryGoods")
    public String queryGoods(Model model,@RequestParam("id") Integer id){

        List list = xyservice.queryGoods(id);

        model.addAttribute("list",list);

            return "qianduan/shang";
    }
    @RequestMapping("querylei")
    public String querylei(Model model){
        List lei = xyservice.querylei();
        model.addAttribute("lei",lei);

        return "qianduan/indexone";
    }
        @RequestMapping("queryInfo")
        public String queryinfo(Model model,@RequestParam("id") Integer id){

        Shang info = xyservice.qeuryInfo(id);

            Integer mintypeid = (Integer) info.getMintypeid();
            if(mintypeid!=0){

                List list = xyservice.queryGoods(mintypeid);
                model.addAttribute("list",list);

            }

           model.addAttribute("info",info);

        return "qianduan/xiangxi";
        }



}

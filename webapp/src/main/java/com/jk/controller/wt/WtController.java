package com.jk.controller.wt;

import com.jk.service.WtService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import com.jk.pojo.Member;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("wt")
public class WtController {

    @Resource
    private WtService wtService;
    @RequestMapping("queryMember")
    @ResponseBody
    public Map<String,Object> queryMember(Integer page, Integer rows, Member member){
        Map<String,Object> map = new HashMap<String, Object>();
        //总数据条数
        map.put("total", wtService.queryMemberAll(member).size());
        System.out.println(map);
        //每页的数据
        map.put("rows", wtService.queryMember(page,rows,member));
        return map;
    }
    @RequestMapping("toMemberShow")
    public  String toMemberShow(){
        return "/wt/membershow";
    }
}

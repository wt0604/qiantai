package com.jk.controller.wt;

import com.jk.service.WtService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jk.pojo.Member;
import org.springframework.web.servlet.ModelAndView;

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

        //每页的数据
        map.put("rows", wtService.queryMember(page,rows,member));
        System.out.println(map);
        return map;
    }
    @RequestMapping("toMemberShow")
    public  String toMemberShow(){
        return "/wt/membershow";
    }
    //删除会员信息
    @RequestMapping("delMember")
    @ResponseBody
    public Map<String,Object> delGgoods(String ids){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            wtService.delMember(ids);
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }
    @RequestMapping("toUpdateMember")
    public ModelAndView toUpdateMember(Integer id){
        ModelAndView mav = new ModelAndView("/wt/addMember");
        mav.addObject("member",wtService.getMemberById(id));
        return mav;
    }
    @RequestMapping("addMember")
    @ResponseBody
    public Map<String,Object> addMember(Member member, HttpServletRequest request, HttpServletResponse response ){
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            if(member.getMemberid()!=null){
                //执行修改
                wtService.modifyMember(member);
                map.put("msg", "修改成功！");
            }else{

               /* car.setCreatetime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString());*/
                //执行新增
                wtService.addMember(member);
                map.put("msg", "新增成功！");
            }
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("msg", "执行失败！");
        }
        return map;

    }
}

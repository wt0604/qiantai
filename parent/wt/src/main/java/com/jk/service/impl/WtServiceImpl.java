package com.jk.service.impl;

import com.jk.dao.WtDao;
import com.jk.pojo.Member;
import com.jk.service.WtService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WtServiceImpl  implements WtService{

    @Resource
    private WtDao wtDao;

    @Override
    public List<Member> queryMember(Integer page, Integer rows, Member member) {
        Integer begin = (page-1)*rows;
        Integer end = page*rows;
        return wtDao.queryMember(begin,end,member);
    }

    @Override
    public List<Member> queryMemberAll(Member member) {
        return wtDao.queryMemberAll(member);
    }
}

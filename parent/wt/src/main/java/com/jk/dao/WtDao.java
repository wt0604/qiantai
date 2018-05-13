package com.jk.dao;

import com.jk.pojo.Member;

import java.util.List;

public interface WtDao {
    List<Member> queryMember(Integer begin, Integer end, Member member);

    List<Member> queryMemberAll(Member member);
}

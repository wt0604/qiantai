package com.jk.dao;

import com.jk.pojo.Account;
import com.jk.pojo.Shang;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XyDao {

    Integer getTotalAcc(@Param("emp") Account emp);


    List<Account> queryAccount(@Param("page") Integer page, @Param("rows") Integer rows, @Param("emp") Account emp);
    List<Account> queryAcc();

    void del(@Param("id") Integer id);

    void addAccount(@Param("account") Account account);

    List queryGoods(@Param("id") Integer id);

    List querylei();

    Shang qeuryInfo(@Param("id") Integer id);

}

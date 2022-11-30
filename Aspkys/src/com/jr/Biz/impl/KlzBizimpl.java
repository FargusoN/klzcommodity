package com.jr.Biz.impl;

import com.jr.Biz.KlzBiz;
import com.jr.Dao.impl.KlzDaoimpl;
import com.jr.entry.Klz;

import java.util.List;

/**
 * @auther Summer
 * @create 2022-11-25-18:42
 */
public class KlzBizimpl implements KlzBiz {
    KlzDaoimpl kli=new KlzDaoimpl();


    @Override
    public boolean login(Klz klz) {
        return kli.queryByinfo(klz)!=null;
    }

    @Override
    public boolean register(Klz klz) {
        return false;
    }

    @Override
    public boolean Delelte(Klz klz) {
        return false;
    }

    @Override
    public List<Klz> queryAll() {
        return null;
    }
}

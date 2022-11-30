package com.jr.Biz;

import com.jr.entry.Klz;

import java.util.List;

/**
 * @auther Summer
 * @create 2022-11-25-18:39
 */
public interface KlzBiz {
    public boolean login(Klz klz);
    public boolean register(Klz klz);
    public boolean Delelte(Klz klz);
    public List<Klz> queryAll();
}

package com.jr.Dao;

import com.jr.entry.Klz;

import java.util.List;

/**
 * @auther Summer
 * @create 2022-11-25-18:43
 */
public interface KlzDao {
    public Klz queryByinfo(Klz klz);
    public List<Klz> selectAll();

}

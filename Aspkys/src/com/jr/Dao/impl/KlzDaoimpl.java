package com.jr.Dao.impl;

import com.jr.Dao.KlzDao;
import com.jr.entry.Klz;
import com.jr.util.DBHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther Summer
 * @create 2022-11-25-18:44
 */
public class KlzDaoimpl implements KlzDao {
    ResultSet rs;
    PreparedStatement ps;
    Connection con;

    @Override
    public Klz queryByinfo(Klz klz) { //插入
        Klz z=null;
         try {
             String sql="insert from klz";
             con= DBHelper.getConn();
             ps = con.prepareStatement(sql);
             ps.setInt(1,klz.getItemid());
             ps.setString(2,klz.getItemname());
             ps.setDouble(3,klz.getItemprice());
             ps.setDate(4,klz.getMafactdate());
             ps.setInt(5,klz.getShelflife());
             rs=ps.executeQuery();
             while (rs.next()){
                 z=new Klz();
             }
         } catch (IOException e) {
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
        return z;
    }



    @Override
    public List<Klz> selectAll() {
        List<Klz> list=new ArrayList<>();
        Klz a=new Klz();
        try {
            String sql="insert from klz";
            con= DBHelper.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1,a.getItemid());
            ps.setString(2,a.getItemname());
            ps.setDouble(3,a.getItemprice());
            ps.setDate(4,a.getMafactdate());
            ps.setInt(5,a.getShelflife());
            rs=ps.executeQuery();
            while (rs.next()){
                a=new Klz();
                list.add(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

}

package com.jr.Server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.TreeMap;

/**
 * @auther Summer
 * @create 2022-11-26-14:18
 */
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        req.setCharacterEncoding("utf-8"); //设置请求信息的字符为utf-8
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        String cit=req.getParameter("p");
        if (cit==null){
            login(req,resp);
        }else{

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }


    public  void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setCharacterEncoding("utf-8"); //设置请求信息的字符为utf-8
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        boolean boo=true;
        if(boo){
            req.getRequestDispatcher("asd?i=2").forward(req,resp);
        }else {
            resp.getWriter().println("<h1>您搜索的商品不存在</h1>");
            resp.getWriter().println("<a href='index.jsp'>请重新搜索</a>");
        }
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}

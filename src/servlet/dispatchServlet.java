package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * created with IntelliJ IDEA
 * author      : YaoDong
 * date        : 2020/5/24
 * time        : 15:51
 * description :前端设计模式：也就是所有的请求都会到一个servlet，然后在这个servlet中进行转发或者重定向等处理
 *                      配置的时候：@WebServlet(name = "dispatchServlet", urlPatterns = "/")，urlPatterns为 "/"
 *                      这样会拦截所有的（除jsp以外）的所有请求
 *                      如果 urlPatterns = "/*")，urlPatterns为 "/*"，这样配置，则会拦截包括jsp在内的所有请求
 */
@WebServlet(name = "dispatchServlet", urlPatterns = "/dis")
public class dispatchServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String demo=req.getParameter("demo");
        System.out.println("控制器！！");

        if (demo.equals("demo01")) {
            demo1();
        } else {
            demo2();
        }
    }

    private void demo1() {
        System.out.println("demo01被调用！");
    }

    private void demo2() {
        System.out.println("demo02被调用！");
    }
}


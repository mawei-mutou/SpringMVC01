package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * created with IntelliJ IDEA
 * author      : YaoDong
 * date        : 2020/5/24
 * time        : 19:14
 * description :在springmvc里面的控制器继承的是Controller
 */
public class DemoController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("执行了Spring的控制器！");
        ModelAndView mav = new ModelAndView("/aaa.jsp");//这是ViewedResolver去执行如何跳转。（默认为转发）

        return mav;
    }
}

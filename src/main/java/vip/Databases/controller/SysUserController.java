package vip.Databases.controller;

import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vip.Databases.Service.Impl.SysUserServiceImpl;
import vip.Databases.Service.SysUserService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

/**
 * @author hc
 * @description: TODO 控制器是与前端对接的接口，属于MVC里面的C控制层(M是数据层。V是图层)
 * @date 2021/1/25 17:14
 */

@Controller//EXPOUND：controller层标识，RestController注解只能返回字符串，而本注解可以返回页面
//@RequestMapping("")//EXPOUND：请求头
public class SysUserController {


    @Autowired
    private SysUserServiceImpl sysUserServiceImpl;

    @GetMapping(value="/")
    public Object Index() {
        return "index";
    }

    @PostMapping(value = "/")
    public Object Login(Integer username , String pass , HttpSession httpSession ,Model model){
        if(!sysUserServiceImpl.findById(username).isEmpty() && sysUserServiceImpl.findById(username).get().getName().equals(pass)) {
            httpSession.setAttribute("msg", username);
            return "head";
        }else if (sysUserServiceImpl.findById(username).isEmpty()){
            model.addAttribute("msg","没找到您，请注册账号！😁");
            return "index";
        }else{
            model.addAttribute("msg","账号密码错误，请重新输入！😂");
            return "index";
        }
    }

    @GetMapping(value = "/register")
    public Object Register(){
        return "register";
    }

    @GetMapping(value = "/head.html")
    public Object Reload(HttpSession httpSession ,Model model){
        Object LoginStatus = httpSession.getAttribute("msg");
        if (!LoginStatus.equals(null)){
            return "head";
        }else {
            model.addAttribute("msg","请重新登录！🐷");
            return "index";
        }
    }
}

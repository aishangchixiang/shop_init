package com.example.controller;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //前往登录页
    @RequestMapping("/tologin")
    public ModelAndView tologin() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("login");
        return mav;
    }
    //登录
    @PostMapping("/userlogin")
    @ResponseBody
    public Object login(User user ,HttpSession session) {
        User u  = userService.login(user);
        //登录成功在session中保存用户数据
        if (u!=null) {
            session.setAttribute("user",u);
            return u;
        }
        else{
            return "fail";
        }
    }


    //前往用户详情页
    @RequestMapping("/togetuserdetails")
    public ModelAndView togetuserdetails(String username, ModelMap map) {
        map.put("username",username);
        return new ModelAndView("userdetails");
    }
    //获取用户数据
    @RequestMapping("/getuserdetails")
    public User getuserdetails(String username){
        User user=userService.getUserDetails(username);
        return user;
    }



    //前往更新用户信息界面并获取用户信息
    @RequestMapping("/toupdateuserdetails")
    public ModelAndView toupdateuserdetails(String username,ModelMap map){
        User user=userService.getUserDetails(username);
        map.put("user",user);
        return new ModelAndView("updateuserdetails");
    }
    //更新用户信息
    @RequestMapping("/updateuserdetails")
    public String updateuserdetails(User user){
        userService.updateuserdetails(user);
        return "success";
    }




    //前往注册页
    @RequestMapping( "/toregist")
    @ResponseBody
    public ModelAndView toregist() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("regist");
        return mav;
    }
    //注册
    @PostMapping("/regist")
    @ResponseBody
    public String regist(User user) {
        //用login查询username和password验证一下是否已经被注册
        if(userService.getUserDetails(user.getUsername())==null&&user.getPassword()!=null&&user.getUsername()!=null&&user.getPassword()!=""&&user.getUsername()!=""){
            userService.register(user);
            System.out.println("已添加");
            return "success";
        }
        else{
            return "fail";
        }
    }
    //返回主页
    @RequestMapping( "/toindex")
    @ResponseBody
    public ModelAndView toindex() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping( "/test")
    public String index() {
        return "index";
    }
}

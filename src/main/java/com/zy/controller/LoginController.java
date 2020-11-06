package com.zy.controller;

import com.zy.utils.ActivierUser;
import com.zy.utils.ResultObj;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-11-05 14:10
 * @PS: 用户登录控制器
 */
@RestController
@RequestMapping("login")
public class LoginController {

    /**
     * 做登录
     *
     * @param username
     * @param pwd
     * @param session
     * @return
     */
    @RequestMapping("login")
    public ResultObj login(String username, String pwd, HttpSession session) {
        //得到主体
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, pwd);

        try {
            subject.login(token);
            System.out.println("登录成功");
            ActivierUser activierUser = (ActivierUser) subject.getPrincipal();
            session.setAttribute("user", activierUser.getUser());
            return ResultObj.LOGIN_SUCCESS;
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return ResultObj.LOGIN_ERROR;
        }
    }

}

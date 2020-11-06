package com.zy.filter;

import com.alibaba.fastjson.JSON;
import com.zy.utils.ResultObj;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-11-05 17:26
 * @PS: 解决未登陆时直接返回
 */
public class ShiroLoginFilter extends FormAuthenticationFilter {

    /**
     * 如果用户为登录回调此方法
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletResponse resp = (HttpServletResponse) response;
        ResultObj resultObj = ResultObj.UN_LOGIN;
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.write(JSON.toJSONString(resultObj));
        out.flush();
        out.close();

        return false;
    }
}

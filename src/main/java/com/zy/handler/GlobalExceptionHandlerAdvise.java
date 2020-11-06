package com.zy.handler;

import com.zy.mapper.PermissionMapper;
import com.zy.mapper.UserMapper;
import com.zy.utils.ResultObj;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-11-05 18:45
 * @PS: 全局异常监控
 */
@RestControllerAdvice
public class GlobalExceptionHandlerAdvise {

    /**
     * 未授权
     * 只要当前项目的代码抛出UnauthenticatedException就会回调
     *
     * @return
     */
    @ExceptionHandler(value = {UnauthorizedException.class})
    public ResultObj unauthorized() {
        return ResultObj.UNAUTHORIZED;
    }

}

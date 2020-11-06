package com.zy.controller;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-11-05 14:18
 * @PS:
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequiresPermissions(value = "user:query")
    @RequestMapping("query")
    @ResponseBody
    public Map<String, Object> query() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "query");
        return map;
    }

    @RequiresPermissions(value = "user:add")
    @RequestMapping("add")
    @ResponseBody
    public Map<String, Object> add() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "add");
        return map;
    }

    @RequiresPermissions(value = "user:update")
    @RequestMapping("update")
    @ResponseBody
    public Map<String, Object> update() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "update");
        return map;
    }

    @RequiresPermissions(value = "user:delete")
    @RequestMapping("delete")
    @ResponseBody
    public Map<String, Object> delete() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "delete");
        return map;
    }

    @RequiresPermissions(value = "user:export")
    @RequestMapping("export")
    @ResponseBody
    public Map<String, Object> export() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "export");
        return map;
    }

}
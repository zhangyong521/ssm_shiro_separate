package com.zy.utils;

import com.zy.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-11-05 10:06
 * @PS: User权限和角色类集合
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivierUser {

    private User user;

    private List<String> roles;

    private List<String> permissions;

}

package com.my.blog.website.dto;

import lombok.Data;

/**
 * 建立数据库连接的参数对象
 *  2017/3/4.
 */
@Data
public class DataSource {

    /**
     * 数据库url
     */
    private String url;

    /**
     * 数据库用户名
     */
    private String username;

    /**
     * 数据库密码
     */
    private String password;

    /**
     * 数据库驱动名称
     */
    private String drivercClassName;

    /**
     * 数据库名字
     */
    private String dbName;


}

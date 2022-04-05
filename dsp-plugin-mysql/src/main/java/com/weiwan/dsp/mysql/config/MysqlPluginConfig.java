package com.weiwan.dsp.mysql.config;

import com.weiwan.dsp.api.plugin.PluginConfig;
import com.weiwan.dsp.common.config.ConfigOption;
import com.weiwan.dsp.common.config.ConfigOptions;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/2 18:29
 * @Package: com.weiwan.dsp.mysql.config
 * @ClassName: MysqlPluginConfig
 * @Description: Mysql通用配置类
 **/
public class MysqlPluginConfig extends PluginConfig {

    public static final ConfigOption URL = ConfigOptions.key("jdbc.server")
            .defaultValue("127.0.0.1")
            .description("mysql数据库连接url")
            .required(true)
            .ok(String.class);

    public static final ConfigOption PORT = ConfigOptions.key("jdbc.port")
            .defaultValue(3306)
            .description("mysql数据库连接端口")
            .required(true)
            .ok(Integer.class);

    public static final ConfigOption USERNAME = ConfigOptions.key("jdbc.username")
            .defaultValue("root")
            .description("mysql数据库用户名")
            .required(true)
            .ok(String.class);

    public static final ConfigOption PASSWORD = ConfigOptions.key("jdbc.password")
            .description("mysql数据库密码")
            .required(true)
            .ok(String.class);

    public static final ConfigOption DATABASE = ConfigOptions.key("jdbc.database")
            .description("mysql数据库")
            .required(true)
            .ok(String.class);

    public static final ConfigOption TABLES = ConfigOptions.key("tables")
            .description("mysql数据库表")
            .required(true)
            .ok(String.class);


}

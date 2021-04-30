package com.xdkj.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName FtpDemo
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-26-14:37
 */
@Component
@ConfigurationProperties(prefix = "ftp")
@Data
public class FtpDemo {

    //@Value("${ftp.name}")
    private String name;
    //@Value("${ftp.host}")
    private String host;
    //@Value("${ftp.port}")
    private Integer port;
    //@Value("${ftp.servers}")
    private List<String> servers = new ArrayList<>();
    private Map<String,String> maps = new HashMap<>();
}

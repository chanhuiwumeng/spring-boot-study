package com.xdkj.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName FtpDemo
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-26-11:54
 */

@Service
@ConfigurationProperties(
        prefix = "ftp"
)
@Data
public class FtpDemo {
    @Value("${ftp.host}")
    private String host;
    @Value("${ftp.port}")
    private int port;
    @Value("${ftp.username}")
    private String username;
    @Value("${ftp.names}")
    private List<String> names;
    private Map<String,String> maps = new HashMap<>();

}

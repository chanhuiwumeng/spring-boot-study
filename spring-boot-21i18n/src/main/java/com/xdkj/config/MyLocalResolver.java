package com.xdkj.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * ClassName MylocalResolver
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-30-10:57
 */
public class MyLocalResolver  implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String lo = httpServletRequest.getParameter("lo");
        if(StringUtils.isEmpty(lo)){
            //获取默认的区域解析器
            return  Locale.getDefault();
        }
        //ch_CN
        String[] s = lo.split("_");
        System.out.println(s);
        return new Locale(s[0],s[1]);
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}

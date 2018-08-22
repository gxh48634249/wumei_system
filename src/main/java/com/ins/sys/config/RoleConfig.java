//package com.ins.sys.config;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.Filter;
//
//@Configuration
//public class RoleConfig {
//
//    @Bean
//    public Filter init(){
//        return new RoleFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean uploadFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(init());
//        registration.addUrlPatterns("/*");
//        registration.setOrder(1);
//        return registration;
//    }
//}

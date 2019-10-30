package com.luge.test;

import com.luge.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"); // 加载spring配置文件
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.findAll();
    }
}

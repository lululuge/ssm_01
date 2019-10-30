package com.luge.controller;

import com.luge.domain.Account;
import com.luge.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户的控制类
 */
@Controller
@RequestMapping(path = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService = null;

    /**
     *  查询所有
     */
    @RequestMapping(path = "/findAll")
    public String findAll(Model model) {
        System.out.println("查询用户中。。。");
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts);
        model.addAttribute("accounts", accounts);
        return "success";
    }

    /**
     * 保存
     */
    @RequestMapping(path = "/saveAccount")
    public void saveAccount(HttpServletRequest request, HttpServletResponse response, Account account) throws IOException {
        System.out.println(account);
        System.out.println("保存用户中。。。");
        accountService.saveAccount(account);
        // 跳转查询所有页面
        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }
}

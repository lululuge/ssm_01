package com.luge.service.impl;

import com.luge.dao.AccountDao;
import com.luge.domain.Account;
import com.luge.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户业务层接口的实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao = null;
    @Override
    public List<Account> findAll() {
        System.out.println("查询所有账户信息");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("保存账户");
        accountDao.saveAccount(account);
    }
}

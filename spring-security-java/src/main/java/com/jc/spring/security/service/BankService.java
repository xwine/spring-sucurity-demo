package com.jc.spring.security.service;

import com.jc.spring.security.entity.Account;

import org.springframework.security.access.annotation.Secured;

/**
 * Created by chenjunjun on 2017/11/17.
 */
public interface BankService {

    @Secured("IS_AUTHENTICATED_ANONYMOUSLY")
    public Account readAccount(Long id);

    @Secured("IS_AUTHENTICATED_ANONYMOUSLY")
    public Account[] findAccounts();

    @Secured("ROLE_TELLER")
    public Account post(Account account, double amount);
}

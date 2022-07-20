package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.CreditAccount;
import com.hackthon.codestars.CheckBalanceApp.repository.CreditAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CreditAccountServiceImpl implements CreditAccountService {
    @Autowired
    CreditAccountRepo creditAccountRepo;

    @Override
    public String saveCredit(CreditAccount creditAccount) {
         creditAccountRepo.save(creditAccount);
         return "Record inserted successfully";
    }

    @Override
    public double getBalance1(long mobileNo, String panNo, String dateOfBirth) {
        return creditAccountRepo.findByMobileNoAndDateOfBirth(mobileNo,panNo,dateOfBirth);
    }

}

package com.example.CompositePK;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccRepo repo;

    public void saveData(){
        AccountEntity entity=new AccountEntity();
        entity.setAcc_id(101);
        entity.setAcc_type("Savings");
        entity.setBranch_name("Kondapur");
        entity.setMin_bal(100000L);
        entity.setHolder_name("John");
        repo.save(entity);
    }
}

package com.example.TransactionRollback.Service;

import com.example.TransactionRollback.Entity.AddressEntity;
import com.example.TransactionRollback.Entity.OrdersEntity;
import com.example.TransactionRollback.Repository.addressRepo;
import com.example.TransactionRollback.Repository.orderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
public class OrderService {

    @Autowired
    private orderRepo Order;

    @Autowired
    private addressRepo address;

    @Transactional(rollbackOn = Exception.class)
//    @Transactional(rollbackFor = Exception.class)
    public void saveData(){
        OrdersEntity o1=new OrdersEntity();
        o1.setId(104);
        o1.setOrderDate(new Date());
        o1.setProductId(204);
        Order.save(o1);

//        int i=10/0;

        AddressEntity a1=new AddressEntity();
        a1.setOrderId(104);
        a1.setCountry("India");
        a1.setAddId(304);
        address.save(a1);
    }
}

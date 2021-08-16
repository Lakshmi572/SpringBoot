package com.example.TimeStamping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceService {
    @Autowired
    private insuranceRepo insurance;

    public void saveData(){
        Insurance_Plan plan=new Insurance_Plan();
        plan.setPlan_name("Mutual_Fund");
        plan.setPlan_status(false);
        insurance.save(plan);
    }

    public void update() {
        insurance.update(33,"Hello world");
    }
}

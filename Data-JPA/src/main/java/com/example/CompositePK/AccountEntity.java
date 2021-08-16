package com.example.CompositePK;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@IdClass(AccountPK.class)
public class AccountEntity {

    private String branch_name;

    private Long min_bal;

    @Id
    private Integer acc_id;
    @Id
    private String acc_type;
    @Id
    private String holder_name;

}

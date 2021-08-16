package com.example.CompositePK;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

@Data
public class AccountPK implements Serializable {

    private Integer acc_id;
    private String acc_type;
    private String holder_name;
}

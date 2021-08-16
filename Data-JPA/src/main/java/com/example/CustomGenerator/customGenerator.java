package com.example.CustomGenerator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class customGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String prefix="doppani";
        String suffix = "";

        try {
            Connection connection = session.connection();
            Statement stmt = connection.createStatement();
            String sql= "select count(user_id) from registration";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                int i = rs.getInt(1);
                suffix=String.valueOf(i);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return prefix+suffix;
    }
}

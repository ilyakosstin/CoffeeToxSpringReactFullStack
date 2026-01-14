package ru.coffeetox.cfx.zesty;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import ru.coffeetox.cfx.models.User;

import java.math.BigDecimal;

@Component
@Log
public class UserSeeder {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    private void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }


    public void insertData() {

        User[] toInsert = new User[] {
                User.builder().name("Шум2").username("shum1212321").balance(BigDecimal.valueOf(1535, 3)).build(),
                User.builder().name("Ефирм").username("klown239").balance(BigDecimal.ZERO).build(),
                User.builder().name("Хассан").username("deydanhassan").balance(BigDecimal.ZERO).build(),
        };

        for(User u : toInsert) {

            jdbcTemplate.update("insert into users (name, username, balance) values(?, ?, ?)",
                    u.getName(), u.getUsername(), u.getBalance()
            );

        }

        log.info("Added some people to database");

    }

}

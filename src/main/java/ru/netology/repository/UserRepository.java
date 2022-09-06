package ru.netology.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("artem") && password.equals("password")) {
            return Arrays.asList(Authorities.class.getEnumConstants());
        }
        return new ArrayList<>();
    }
}
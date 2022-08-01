package com.moemao.type;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerTest {
    public static void main(String[] args)
    {
        List<User> list = new ArrayList<>();
        list.add(new User(5));
        list.add(new User(2));
        list.add(new User(9));

        List<User> collect = list.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());

        list.forEach(user -> {
            System.out.print(user.getAge());
        });
        System.out.println();
        collect.forEach(user -> {
            System.out.print(user.getAge());
        });
    }
}

class User {
    private Integer age;

    public User(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }
}

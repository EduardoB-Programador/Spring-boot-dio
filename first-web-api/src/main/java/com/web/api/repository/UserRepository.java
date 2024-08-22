package com.web.api.repository;

import com.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public void save(User user) {
        this.users.add(user);

    }

    public List<User> getAllUsers() {
        return this.users;
    }

    public User findByName(String name) {

        List<User> user = this.users
                .stream()
                .filter(u -> u.getLogin().equals(name))
                .toList();

        if (user.isEmpty()) {
            return null;
        } else {
            return user.getFirst();
        }

    }

    public User findByID(Integer id) {

        List<User> user = this.users
                .stream()
                .filter(u -> u.getId().equals(id))
                .toList();

        if (user.isEmpty()) {
            return null;
        } else {
            return user.getFirst();
        }

    }

    public void deleteByID(Integer id) {
        User user = findByID(id);

        this.users.remove(user);
    }

    public void deleteByName(String name) {
        User user = findByName(name);

        this.users.remove(user);
    }

}

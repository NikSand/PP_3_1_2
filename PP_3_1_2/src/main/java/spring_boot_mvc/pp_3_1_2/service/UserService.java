package spring_boot_mvc.pp_3_1_2.service;

import spring_boot_mvc.pp_3_1_2.model.User;

import java.util.List;

    public interface UserService {

        List<User> getUsersList();

        User getUser(int id);

        void addUser(User user);

        void deleteUser(int id);

        void editUser(User user);
    }


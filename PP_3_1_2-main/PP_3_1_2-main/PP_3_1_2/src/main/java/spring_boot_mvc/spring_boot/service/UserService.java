package spring_boot_mvc.spring_boot.service;

import spring_boot_mvc.spring_boot.model.User;
import java.util.List;

    public interface UserService {

        List<User> getUsersList();

        User getUser(int id);

        void addUser(User user);

        void deleteUser(int id);

        void editUser(User user);
    }


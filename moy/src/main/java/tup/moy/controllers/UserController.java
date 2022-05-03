package tup.moy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tup.moy.dao.UserDaoAble;
import tup.moy.models.User;

@RestController
// @EnableAutoConfiguration
public class UserController {

    // Acá está el patrón de inyección de dependencias.
    @Autowired
    private UserDaoAble userDao;

    // @RequestMapping(value = "create/{id}")
    // public User createUser(@PathVariable Long id) {
    // return new User(id, "José", "Create", "jperez@gmail.com", "123456", "deSol");
    // }

    @GetMapping("/getall")
    public List<User> getAll() {
        List<User> lista = userDao.getAll();
        // return userDao.getAll();
        return null;
    }
    // public String getAll() {
    // return "userDao.getAll()";
    // }

    // @GetMapping("get/{id}")
    // public User getUser(@PathVariable Long id) {
    // return new User(id, "José", "Geti", "jperez@gmail.com", "123456", "deSol");
    // }

    // @PutMapping("update")
    // public User updateUser() {
    // return new User(9876L, "José", "Update", "jperez@gmail.com", "123456",
    // "deSol");
    // }

    // @DeleteMapping("delete")
    // public User deleteUser() {
    // return new User(9876L, "José", "Delete", "jperez@gmail.com", "123456",
    // "deSol");
    // }

}

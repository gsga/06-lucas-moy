package tup.moy.dao;

import java.util.List;

import tup.moy.models.User;

public interface UserDaoAble {

    public List<User> getAll();

    public User getById(Long id);

}

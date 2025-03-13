package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}


//package web.service;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//import org.springframework.stereotype.Service;
//import web.model.User;
//import web.service.UserService;
//
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    @Transactional//(readOnly = true)
//    public List<User> getAllUsers() {
//        TypedQuery<User> query = (TypedQuery<User>) entityManager.createQuery("SELECT u FROM User u", User.class);
//        return query.getResultList();
//    }
//
//    @Override
//    @Transactional //(readOnly = true)
//    public User getUserById(Long id) {
//        return entityManager.find(User.class, id);
//    }
//
//    @Override
//    @Transactional
//    public void addUser(User user) {
//        entityManager.persist(user);
//    }
//
//    @Override
//    @Transactional
//    public void updateUser(User user) {
//        entityManager.merge(user);
//    }
//
//    @Override
//    @Transactional
//    public void deleteUser(Long id) {
//        User user = entityManager.find(User.class, id);
//        if (user != null) {
//            entityManager.remove(user);
//        }
//    }
//}
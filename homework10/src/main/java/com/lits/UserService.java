package com.lits;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private SessionFactory sessionFactory;

    public UserService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addUser(User user) {
        getCurrentSession().save(user);
    }

    public List<User> getAll() {
        return  getCurrentSession().createQuery("FROM  User").getResultList();
    }

    public User getByID(int id) {
        return (User) getCurrentSession().createQuery("FROM User where id = " + id).getSingleResult();
    }

    public void deleteByID(User user){
        Session session = getCurrentSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public void print(List<User> userList) {
        for(User elemList : userList) {
            System.out.println(elemList.toString());
        }
    }

    private Session getCurrentSession() {
        return sessionFactory.openSession();
    }

}
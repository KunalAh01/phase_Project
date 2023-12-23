package com.healthcare.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.healthcare.entity.Login;
import com.healthcare.resource.SessionFactoryResource;

public class LoginDao {
public int signIn(Login login) {
	SessionFactory sf=SessionFactoryResource.getSessionFactory();
	Session session=sf.openSession();
	TypedQuery tq=session.createQuery("select l from Login l where l.email=:a and l.password= :b");
	tq.setParameter("a", login.getEmail());
	tq.setParameter("b", login.getPassword());
	List<Login> list=tq.getResultList();
	return list.size();
}
}

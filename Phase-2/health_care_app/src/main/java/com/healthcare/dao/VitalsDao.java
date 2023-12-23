package com.healthcare.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.healthcare.entity.Vitals;
import com.healthcare.resource.SessionFactoryResource;

public class VitalsDao {
public int storeVitals(Vitals vitals) {
		
		try {
			SessionFactory sf=SessionFactoryResource.getSessionFactory();
			Session session=sf.openSession();
			Transaction tran= session.getTransaction();
			tran.begin();
			session.save(vitals);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println("Error in vitals Dao "+e);
			return 0;
		}
		
	}
	
	public List<Vitals> findAllVitals(){
		SessionFactory sf=SessionFactoryResource.getSessionFactory();
		Session session=sf.openSession();
		TypedQuery tq=session.createQuery("from Vitals");
		List<Vitals> listOfVitals=tq.getResultList();
		return listOfVitals;
	}
	public int deleteVitals(int id) {
		
		SessionFactory sf=SessionFactoryResource.getSessionFactory();
		Session session=sf.openSession();
		Transaction tran= session.getTransaction();
		Vitals v=session.find(Vitals.class,id);
	if(v==null) {
		return 0;
		
	}
	else {
		tran.begin();
		session.delete(v);
		tran.commit();
		return 1;
	}
	
}
}

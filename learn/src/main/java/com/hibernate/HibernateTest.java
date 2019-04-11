package com.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	

	public static void main(String[] args) {
		selectAll();		
	}
	
	public static void selectAll() {
		Session sess = getSession();
		
		Query query = sess.createQuery("from Wallet");

		List<Wallet> walList = query.getResultList();
		
		walList.forEach(e -> System.out.println(e.toString()));
	}
	
	
	public static void select() {
		Wallet wal = new Wallet();

		Session sess = getSession();

		wal = sess.get(Wallet.class, "MA00023609USD");

		System.out.println(wal.toString());
	}
	
	
	
	public  static Session getSession() {
		Configuration conf = new Configuration().configure().addAnnotatedClass(Wallet.class);
		
		SessionFactory sf = conf.buildSessionFactory();

		return sf.openSession();
	}

}

package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.entity.Products;
import com.util.HibernateUtil;

public class HQLOperations {
	public static void main(String[] args) {
//		SelectAll(session);
//		selectById();
//		InsertProduct(session);
//		updateProducts(session);
		
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		deleteProducts(session);
		
	}

	private static void deleteProducts(Session session) {
		MutationQuery mutationQuery = session.createMutationQuery("delete from Products  where Id=?1");
		mutationQuery.setParameter(1, 3);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void updateProducts(Session session) {
		MutationQuery mutationQuery = session.createMutationQuery("update Products set name =?1 where Id=?2");
		mutationQuery.setParameter(1,"Android Mobile" );
		mutationQuery.setParameter(2, 3);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void InsertProduct(Session session) {
		MutationQuery mutationQuery = session.createMutationQuery("insert into Products(productId,name,category) Values (?1,?2,?3)");
		mutationQuery.setParameter(1, 5);
		mutationQuery.setParameter(2, "Mobiles");
		mutationQuery.setParameter(3, "Electronics");
		
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void selectById() {
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
//		SelectionQuery<Products> query = session.createSelectionQuery("From Products where productId = ?1 and name = ?2",Products.class);
		SelectionQuery<Products> query = session.createSelectionQuery("From Products where productId = :id and name = :name",Products.class);
		query.setParameter("id", 2);
		query.setParameter("name", "Sofa");
		List<Products> products = query.list();
		products.forEach(System.out::println);
		System.out.println(products);
	}

	private static void SelectAll(Session session) {
		SelectionQuery<Products> query = session.createSelectionQuery("From Products",Products.class);
		List<Products> products = query.list();
		System.out.println(products);
	}
}

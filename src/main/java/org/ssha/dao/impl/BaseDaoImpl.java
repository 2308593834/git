package org.ssha.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.ssha.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>{
	@Resource
	private SessionFactory sf;
	
	@Override
	public List<T> selectAll(String hql) {
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		List list = query.list();
		return list;
	}

	@Override
	public void delete(T t) {
		Session sessoin = sf.getCurrentSession();
		sessoin.delete(t);
	}

	@Override
	public void update(T t) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(t);
	}
	@Override
	public void add(T t) {
		Session session = sf.getCurrentSession();
		session.save(t);
	}

	@Override
	public List<T> selectBySql(String sql, T t) {
		Session session = sf.getCurrentSession();
		SQLQuery query = session.createSQLQuery(sql);
		List list = query.list();
		return list;
	}


}

package org.ssha.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.ssha.dao.DemoDao;
import org.ssha.pojo.Demo;
import org.ssha.pojo.Guess;
@Repository
public class DemoDaoImpl implements DemoDao{
	@Resource
	private SessionFactory sf;
	@Override
	public List<Demo> selectAll() {
		Session sc = sf.getCurrentSession();
		SQLQuery ae = sc.createSQLQuery("select * from demo").addEntity(Demo.class);
		List list = ae.list();
		return list;
	}

}

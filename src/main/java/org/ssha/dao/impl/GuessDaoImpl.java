package org.ssha.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.ssha.dao.GuessDao;
import org.ssha.pojo.Guess;
@Repository
public class GuessDaoImpl implements GuessDao{
	@Resource
	private SessionFactory sf;
	
	
	@Override
	public List<Guess> selectAll() {
		Session cs = sf.getCurrentSession();
		SQLQuery addEntity = cs.createSQLQuery("select * from guess").addEntity(Guess.class);
		List list = addEntity.list();
		return list;
	}


	@Override
	public void del(Guess guess) {
	
		Session session = sf.getCurrentSession();
		session.delete(guess); 
	}   


	@Override
	public void add(Guess guess) {
		Session session = sf.getCurrentSession();
		session.save(guess);
	}


	@Override
	public void update(Guess guess) {
		Session cs = sf.getCurrentSession();
		cs.saveOrUpdate(guess);
	}


	@Override
	public Guess selectById(Integer gid) {
		Session cs = sf.getCurrentSession();
		Guess loadq = (Guess) cs.get(Guess.class, gid);
		return loadq;
	}

}

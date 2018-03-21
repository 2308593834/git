package org.ssha.dao;

import java.util.List;

public interface BaseDao<T> {
	List<T> selectAll(String hql);
	
	void delete(T t);
	void update(T t);
	void add(T t);
	
	List<T> selectBySql(String sql,T t);
	
	
	
	
}

package org.ssha.dao;

import java.util.List;

import org.ssha.pojo.Guess;

public interface GuessDao {

	List<Guess> selectAll();


	void del(Guess guess);



	void add(Guess guess);



	void update(Guess guess);


	Guess selectById(Integer gid);


	
	
	
}

package org.ssha.service;

import java.util.List;

import org.ssha.pojo.Guess;

public interface GuessService {

	List<Guess> selectAll();

	
	void update(Guess guess);
	
	void add(Guess guess);


	void del(Guess guess);


	Guess selectById(Integer gid);

	


}

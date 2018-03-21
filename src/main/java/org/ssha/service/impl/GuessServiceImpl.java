package org.ssha.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssha.dao.GuessDao;
import org.ssha.pojo.Guess;
import org.ssha.service.GuessService;
@Service
@Transactional
public class GuessServiceImpl implements GuessService{
	
	@Resource
	private GuessDao gd;
	
	@Override
	public List<Guess> selectAll() {
		List<Guess> sa = gd.selectAll();
		return sa;
	}




	@Override
	public void update(Guess guess) {
		 gd.update(guess);
	}

	@Override
	public void add(Guess guess) {
			gd.add(guess);
	}




	@Override
	public void del(Guess guess) {
		gd.del(guess);
	}




	@Override
	public Guess selectById(Integer gid) {
		Guess sb = gd.selectById(gid);
		return sb;
	}




	







	
}

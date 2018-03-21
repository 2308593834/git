package org.ssha.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssha.dao.DemoDao;
import org.ssha.pojo.Demo;
import org.ssha.service.DemoService;

@Service
@Transactional
public class DemoServiceImpl implements DemoService{
	@Resource
	private DemoDao dd;
	@Override
	public List<Demo> selectAll() {
		List<Demo> sa = dd.selectAll();
		return sa;
	}

}

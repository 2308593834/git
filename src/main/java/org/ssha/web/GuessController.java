package org.ssha.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssha.pojo.Demo;
import org.ssha.pojo.Guess;
import org.ssha.service.DemoService;
import org.ssha.service.GuessService;

@Controller
public class GuessController {

	@Resource
	private GuessService gs;
	@Resource
	private DemoService ds;
	
	@RequestMapping("/guess")
	public String selectAll(ModelMap map,Guess guess) {
		List<Guess> sa = gs.selectAll();
		List<Demo> saa = ds.selectAll();
		System.out.println(sa);
		map.put("demo", saa);
		map.put("guess",sa);
		Guess u=null;
		if(guess!=null&&guess.getGid()!=null){
			u = gs.selectById(guess.getGid());
			System.out.println(u+":jinlao");
		}
		map.put("es", u);
		return "main"; 
	}
	
	@RequestMapping("/del")
	public String del(Guess guess) {
		gs.del(guess);
		return "redirect:guess";
	}
	@RequestMapping("/add")
	public String add(Guess guess) {
		gs.add(guess);
		return "redirect:guess";
	}
	@RequestMapping("/update")
	public String update(Guess guess) {
		gs.update(guess);
		return "redirect:guess";
	}
}

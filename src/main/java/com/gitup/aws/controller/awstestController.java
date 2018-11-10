package com.gitup.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gitup.aws.service.awstestService;
import com.gitup.aws.vo.AWS;

@Controller
public class awstestController {

	@Autowired
	private awstestService awss;
	
	@GetMapping(value="/awss")
	public @ResponseBody List<AWS> getAWSList(@ModelAttribute AWS aws){
		return awss.selectAWSList();
	}
	
	@GetMapping(value="/awss/{atnum}")
	public @ResponseBody AWS getAWSList(@PathVariable int atnum){
		return awss.selectAWSOne(atnum);
	}
	
	@PostMapping(value="/awss")
	public @ResponseBody Integer insertAWS(@RequestBody AWS aws) {
		return awss.insertAWS(aws);
	}
	
	@PutMapping(value="/awss/{atnum}")
	public @ResponseBody Integer updateAWS(@RequestBody AWS aws, @PathVariable int atnum) {
		aws.setAtnum(atnum);
		return awss.updateAWS(aws);
	}
	
	@DeleteMapping(value="/awss/{atnum}")
	public @ResponseBody Integer deleteAWS(@PathVariable int atnum) {
		return awss.deleteAWS(atnum);
	}
}

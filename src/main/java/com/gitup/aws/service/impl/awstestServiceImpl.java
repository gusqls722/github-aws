package com.gitup.aws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitup.aws.dao.awstestDAO;
import com.gitup.aws.service.awstestService;
import com.gitup.aws.vo.AWS;

@Service
public class awstestServiceImpl implements awstestService{

	@Autowired
	private awstestDAO awsdao;
	
	@Override
	public List<AWS> selectAWSList() {
		return awsdao.selectAWSList();
	}

	@Override
	public AWS selectAWSOne(int atnum) {
		return awsdao.selectAWSOne(atnum);
	}

	@Override
	public Integer insertAWS(AWS aws) {
		return awsdao.insertAWS(aws);
	}

	@Override
	public Integer deleteAWS(int atnum) {
		return awsdao.deleteAWS(atnum);
	}

	@Override
	public Integer updateAWS(AWS aws) {
		return awsdao.updateAWS(aws);
	}
	
}

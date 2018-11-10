package com.gitup.aws.service;

import java.util.List;

import com.gitup.aws.vo.AWS;

public interface awstestService {

	public List<AWS> selectAWSList();
	public AWS selectAWSOne(int atnum);
	public Integer insertAWS(AWS aws);
	public Integer updateAWS(AWS aws);
	public Integer deleteAWS(int atnum);
}

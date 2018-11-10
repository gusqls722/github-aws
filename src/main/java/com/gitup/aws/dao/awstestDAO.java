package com.gitup.aws.dao;

import java.util.List;

import com.gitup.aws.vo.AWS;

public interface awstestDAO {

	public List<AWS> selectAWSList();
	public AWS selectAWSOne(int atnum);
	public Integer insertAWS(AWS aws);
	public Integer updateAWS(AWS aws);
	public Integer deleteAWS(int atnum);
}

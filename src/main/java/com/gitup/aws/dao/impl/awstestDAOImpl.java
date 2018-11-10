package com.gitup.aws.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gitup.aws.dao.awstestDAO;
import com.gitup.aws.vo.AWS;

@Repository
public class awstestDAOImpl implements awstestDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<AWS> selectAWSList() {
		return ss.selectList("com.gitup.aws.AWS.selectAWSLIST");
	}

	@Override
	public AWS selectAWSOne(int atnum) {
		return ss.selectOne("com.gitup.aws.AWS.selectAWSONE",atnum);
	}

	@Override
	public Integer insertAWS(AWS aws) {
		return ss.insert("com.gitup.aws.AWS.insertAWS",aws);
	}

	@Override
	public Integer deleteAWS(int atnum) {
		return ss.delete("com.gitup.aws.AWS.deleteAWS",atnum);
	}

	@Override
	public Integer updateAWS(AWS aws) {
		return ss.update("com.gitup.aws.AWS.updateAWS", aws);
	}
	
	

}

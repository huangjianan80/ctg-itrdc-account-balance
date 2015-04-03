package com.ctg.itrdc.account.balance.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

public interface ITestMapper {
	int updateTest(Map map);
	
	int selectTest();
	
	String selectSequence();
}

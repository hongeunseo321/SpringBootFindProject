package com.sist.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.sist.web.mapper.FoodMapper;
import com.sist.web.vo.FoodVO;

public interface FoodService {
	public List<FoodVO> foodListData(Map map);
	public int foodTotalPage();
	public FoodVO foodDetailData(int fno);
}

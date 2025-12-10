package com.sist.web.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.web.mapper.*;
import com.sist.web.vo.*;

import lombok.RequiredArgsConstructor;

/*
 * Spring + XML
 * 	=> XML 불편으로 인한 순수 자바로만 코딩: Spring-Boot
 * 	=> MyBatis
 * 		ㄴXML/Annotation => 4.0 (Annotation)
 *  => XML: Properties / yml
 *  	ㄴAnnotation 
 */
@Service
@RequiredArgsConstructor // 매개변수 있는 생성자에 주소값 넣는 메소드
/*
 * @RequiredArgsConstructor의 방식
 * 	private FoodMapper mapper;
 * 	@Autowired 
 * 	public FoodServiceImpl(FoodMapper mapper) { 
 * 		this.mapper=mapper; 
 * 	}
 */
public class FoodServiceImpl implements FoodService {
	private final FoodMapper mapper;

	@Override
	public List<FoodVO> foodListData(Map map) {
		// TODO Auto-generated method stub
		return mapper.foodListData(map);
	}

	@Override
	public int foodTotalPage() {
		// TODO Auto-generated method stub
		return mapper.foodTotalPage();
	}

	@Override
	public FoodVO foodDetailData(int fno) {
		// TODO Auto-generated method stub
		mapper.hitIncrement(fno);
		return mapper.foodDetailData(fno);
	}

}
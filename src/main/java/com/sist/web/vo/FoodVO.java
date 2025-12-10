package com.sist.web.vo;

import lombok.Data;

/*
이름         널? 유형             
---------- -- -------------- 
FNO           NUMBER(38)     
NAME          VARCHAR2(4000) 
TYPE          VARCHAR2(4000) 
PHONE         VARCHAR2(4000) 
ADDRESS       VARCHAR2(4000) 
SCORE         NUMBER(38,1)   
THEME         VARCHAR2(4000) 
POSTER        VARCHAR2(4000) 
IMAGES        VARCHAR2(4000) 
TIME          VARCHAR2(4000) 
PARKING       VARCHAR2(4000) 
CONTENT       VARCHAR2(4000) 
HIT           NUMBER(38)     
PRICE         VARCHAR2(4000) 
JJIMCOUNT     NUMBER(38)     
REPLYCOUNT    NUMBER(38)     
LIKECOUNT     NUMBER(38)     
RDAYS         NUMBER(38)     
 */
@Data
public class FoodVO {
	private int fno,hit;
	private String name,type,phone,address,theme,price,time,parking,poster,images,content;
	private double score;
}

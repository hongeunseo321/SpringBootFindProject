package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
 * 	ThymeLeaf / Vue3 차이점
 * 		=> 렌더링
 * 			ThymeLeaf: 서버 렌더링
 * 			Vue3: 클라이언트 렌더링
 * 		=> 검색 엔진
 * 			ThymeLeaf: 매우 뛰어남 
 * 			Vue3: 서버 렌더링 사용 => Nuxt
 *  	=> 데이터 바인딩
 *  		ThymeLeaf: 단방향 
 * 			Vue3: 양방향 => AugularJS / React
 * 		=> 속도
 *  		ThymeLeaf: 서버 처리 중심 => Back-End 
 * 			Vue3: 브라우저 중심 => Front-End
 *  	=> 사용처
 *  		ThymeLeaf: 관리 페이지 => 공공기업 사이트...
 * 			Vue3: 모바일 (동적 처리) => 페이징, 검색, 예약, 결제, 채팅, AI, GPT...
 * 
 * 		기본: ThymeLeaf / JSP
 *  	동적: React / Vue
 *  
 *  Component => CDN 방식
 *  	=> vuex / pinia
 *  	=> 기본 패턴
 *  		<script>
 *  			const app=Vue.createApp({
 *  				data() {
 *  					return {
 *  
 *  					}
 *  				},
 *  				mounted() {
 *  					시작과 동시에 데이터 읽기
 *  				},
 *  				methods: {
 *  					사용자 정의, 이벤트
 *  				},
 *  				components: {
 *  
 *  				},
 *  				computed: {
 *  
 *  				}
 *  			}) 
 *  		</script>
 *  
 *  1. DOM(Document Object Model): ML => 트리 형태로 저장 
 *  	Vue3 / React
 *  	 |		|
 *  	 --------
 *  		ㄴ가상돔 +반응형=>동작
 *  
 *  	= 가상돔
 *  		브라우저 화면을 직접 실행하는 실제 돔 X
 *  		가상 메모리에 저장 === diff(비교) ===> 변경 시마다 실제 돔에 전송
 *  		속도가 빠르고 깜빡이는 효과 X
 *  	= 컴파일 <===> 렌더링을 실시간 수행
 *  		데이터만 변경
 *  
 *  2. MVVM
 *  	MVC (Model + View + Controller)
 *  		요청 === Controller === Model === Controller === View
 *  			Controller: 요청 받기
 *  			Model: 요청 처리
 *  			Controller: 결괏값 전송
 *  			View: 화면 출력
 *  	MVVM (Model + View + ModelView)
 *  		요청 === Model <===> ViewModel <===> View
 *  			Model: 데이터 관리
 *  				=> data()
 *  					데이터의 상태 관리 (state)
 *  					Pinia / VueX ===> 저장 (store)
 *  					**Model이 변경(설정된 변수 변경)되면 ViewModel ===> HTML 반영
 *  			ViewModel: 데이터 변경 / 데이터 처리
 *  				=> created(), mounted(), updated(), numounted(), methods:{}
 *  					양방향 바인딩, 반응성 관리, 이벤트 처리
 *  			View: 화면 출력 (mount 영역)
 *  				=> <template>
 *  					HTML을 제어
 *  
 *  3. 생명 주기 함수
 *  	created(): Vue 생성 시 자동 호출
 *  	mounted(): 브라우저에 HTML이 번역된 후 출력이 된 경우
 *  	updated(): 데이터 값이 변경된 후
 *  	unmounted(): 화면 변경
 *  	=> CallBack: Vue 시스템에 의해 자동 호출
 *  
 *  	methods: 사용자 정의 함수 => 자동 호출 X		
 *  	=> ***React/Vue/Next/Node/Nuxt => 기본 코딩은 JavaScript 기반
 *  
 *  4. 디렉티브
 *  	v-model: 입력 시에 data()에 있는 변수에 값 설정
 *  		=> 양방향 통신의 기본
 *  			React는 단방향이기 때문에 onchange 사용
 *  	v-bind: 속성에 값 설정
 *  		=> :
 *  			예전 방식: <img v-bind:src="vo.poster">
 *  			현재 방식: <img :src="vo.poster">
 *  	v-on: 이벤트 처리
 *  		=> @click
 *  			예전 방식: <button v-on:click="함수">
 *  			현재 방식: <button @click="함수">
 *  	v-for: 반복문 
 *  		=> for-each만 지원
 *  	v-if/v-slse
 *  		=> v-slse-if... 다중 중첩문 사용 가능
 *  	v-show: 조건문
 *  		=> hide / show
 *  			v-show="조건:false" v-show="조건:true"
 *  	v-html: HTML 변환 	
 *  		=> 뉴스/날짜 => 오픈 API는 HTML 포함
 *  			v-text가 아니라 v-html 사용
 *  			html(), text(), attr()
 *  	v-pre: 있는 그대로 출력
 *  	v-once: 한 번만 수행
 *  	v-slot: 컴포넌트에 데이터 전송 (prop:[])
 */
// router => 화면 변경 
@Controller
public class FoodController {
	@GetMapping("/food/find")
	public String food_find() {
		return "food/find"; // templates/food/find.html
	}
	
	@GetMapping("/food/detail")
	public String food_detail(@RequestParam("fno") int fno, Model model) {
		model.addAttribute("fno", fno);
		return "food/detail";
	}
}
package com.winter.app.langs.ex1;

public class PersonInfo {
	
	private String data;
	
	public PersonInfo() {
		this.data="iu, 010-1234-5678, iu@naver.com, 99-05-05,";
		this.data=this.data+"winter, 010-2222-2222, winter@gmail.com, 01-01-01,";
		this.data=this.data+"suji, 010-3333-3333, suji@naver.com, 99-12-24";
		System.out.println(this.data);
	}
	
	//메서드명 init
	//data의 변수의 값을 파싱
	public Person [] init() {
		String [] datas = this.data.split(",");
		
		//Person객체에 데이터를 대입
		Person [] persons = new Person[datas.length/4]; 
		int idx=0;
		for(int i=0;i<datas.length;i++) {
			Person person = new Person();
			
			persons[i/4]=person;
			person.setName(datas[i]);//4, 8  , 12
			person.setPhone(datas[++i]);//5, 9 , 13
			person.setEmail(datas[++i]);//6, 10, 14
			person.setBirth(datas[++i]);//7, 11, 15
			//idx++;
		}
		//Person객체 들을 리턴
		
		return persons;
	}

}

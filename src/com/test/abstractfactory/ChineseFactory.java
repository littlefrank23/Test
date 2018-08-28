package com.test.abstractfactory;

public class ChineseFactory implements PeopleFactory {
	@Override
	public People CreatePeople(){
		People chPeople = null;
		chPeople = new Chinese();
		chPeople.setName("xiaoming");
		chPeople.setAge(18);
		return chPeople;
	}
}

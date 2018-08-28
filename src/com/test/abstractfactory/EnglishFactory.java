package com.test.abstractfactory;

public class EnglishFactory implements PeopleFactory {

	@Override
	public People CreatePeople() {
		People englishPeople = new English();
		englishPeople.setName("Jack");
		englishPeople.setAge(20);
		return englishPeople;
	}

}

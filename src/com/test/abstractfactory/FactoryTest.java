package com.test.abstractfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void Test(){
		String factoryName = "";
		Properties properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream("src/pro.properties");
			properties.load(inputStream);
			inputStream.close();
			factoryName += properties.getProperty("FACTORY_NAME");
			PeopleFactory chinesePeopleFactory = (PeopleFactory) Class.forName(
					factoryName).newInstance();
			People chinesePeople = chinesePeopleFactory.CreatePeople();
			chinesePeople.Speak();

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

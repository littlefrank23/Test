package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

import javax.sound.sampled.Line;

import org.junit.Test;

public class TestClass {

	// Iterator
	@Test
	public void IteratorTest() {
		List<String> sList = new ArrayList<String>();
		sList.add("haha");
		sList.add("hehe");
		sList.add("oooo");
		Map<String,List<String>> sMap = new HashMap<String, List<String>>();
		sMap.put("slist", sList);
		for (Iterator<String> iterator = sList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			iterator.remove();
			System.out.println(string);
		}
		for (String string : sList) {
			if (string == null) {
				// System.out.println("sListÎª¿Õ£¡");
			}

			System.out.println(string);
		}
	}
	
	@Test
	public void FileTest(){
		String dirPath = "D://fileTest/";
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("haha");
		sBuffer.append("ss");
		sBuffer.delete(1, 3);
		System.out.println(sBuffer);
		/*File file = new File(dirPath);
		if (file.exists()) {
			file.delete();
		}*/
	//	file.mkdirs();
	}
	
	@Test
	public void FileOutputStreamTest(){
		String dirPathString = "D://fieleTest/";
		String fileString = dirPathString + "FileOutputStream" + ".txt";
		String newLineString = System.getProperty("line.separator");
		File dir = new File(dirPathString);
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file = new File(fileString);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		try {
			fos = new FileOutputStream(file,true);
			osw = new OutputStreamWriter(fos,"UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		try {
			List<String> sList = new ArrayList<String>();
			osw.write("FileWriteTest!");
			osw.write(newLineString);
			for (String string : sList) {
				osw.write(string);
				osw.write(newLineString);
			}
	//		StringBuffer sBuffer = new StringBuffer();			
	//		sBuffer.append("haha");
	//		sBuffer.append(newLineString);
	//		osw.write(sBuffer.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fos.flush();
				osw.flush();
				fos.close();
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}

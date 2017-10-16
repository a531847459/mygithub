package cn.mldn.myspring.resource;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

public class FileSystemResourceDemo {
	public static void main(String[] args) {
		ResourceLoader resourceLoader=new DefaultResourceLoader();
		try {
			Scanner sc = new Scanner(resourceLoader.getResource("classpath:spring/spring-context.xml").getInputStream());
			sc.useDelimiter("\n");
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

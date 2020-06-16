package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class SerializationDeserialization {
	private final String FILE_NAME;
	
	private FileOutputStream fos = null;
	private BufferedOutputStream bos = null;
	private ObjectOutputStream out = null;
	
	private FileInputStream fis = null;
	private BufferedInputStream bis = null;
	private ObjectInputStream in = null;
	
	public SerializationDeserialization(String FILE_NAME) {
		this.FILE_NAME = FILE_NAME;
		try {
			fos = new FileOutputStream(FILE_NAME);
//			bos = new BufferedOutputStream(fos);
//			out = new ObjectOutputStream(bos);
			out = new ObjectOutputStream(fos);
			
			fis = new FileInputStream(FILE_NAME);
//			bis = new BufferedInputStream(fis);
//			in = new ObjectInputStream(bis);
			in = new ObjectInputStream(fis);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void serializing(User user1, User user2) {
		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		
		try {
			out.writeObject(user1);
			out.writeObject(user2);
			out.writeObject(list);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deserializing() {
		User user1 = null;
		User user2 = null;
		List<User> list = null;
		try {
			user1 = (User) in.readObject();
			user2 = (User) in.readObject();
			list = (List<User>) in.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(list);
	}
	
	public void close() throws IOException {
		out.close();
		//bos.close();
		fos.close();
		
		in.close();
		//bis.close();
		fis.close();
	}
}

public class SerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User user1 = new User("ÀÌÁøÇõ", "jinhyeok", "aaaaa", "aaaaa@gmail.com");
		User user2 = new User("±è´ë¿õ", "daewoong", "bbbbb", "bbbbb@naver.com");
		User user3 = new User("¼ÕÁ¤¿ì", "jeongwoo", "ccccc", "ccccc@hanmail.net");
		User user4 = new User("À¯½Ã¿Â", "yoozion", "ddddd", "ddddd@github.com");
		
		SerializationDeserialization sd = new SerializationDeserialization("test.txt");
		
		System.out.println("----------------------------------------------------------------------------------------");
		sd.serializing(user1, user2);
		sd.deserializing();
		System.out.println("----------------------------------------------------------------------------------------");
		sd.serializing(user3, user4);
		sd.deserializing();
		System.out.println("----------------------------------------------------------------------------------------");
		
		sd.close();
	}
}
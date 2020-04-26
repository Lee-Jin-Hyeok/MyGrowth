package test.project.main;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import test.project.assembler.StudentAssembler;
import test.project.member.Student;
import test.project.service.StudentAllSelectService;
import test.project.service.StudentRegisterService;
import test.project.service.StudentSelectService;

public class MainClass {
	public static void main(String[] args) {
		String[] serialNumbers = {"1", "2", "3", "4", "5",
							"6", "7", "8", "9", "10"};
		String[] ids = {"aaa", "bbb", "ccc", "ddd", "eee",
						"fff", "ggg", "hhh", "iii", "jjj"};
		String[] passwords = {"a1a1a1a1", "b2b2b2b2", "c3c3c3c3",
				"d4d4d4d4", "e5e5e5e5", "f6f6f6f6", "g7g7g7g7",
				"h8h8h8h8", "i9i9i9i9", "j10j10j10"};
		String[] names = {"Lee", "Kim", "Park", "Son", "Yoo",
						"Gong", "Paek", "Ahn", "Seo", "Hwang"};
		int[] ages = {18, 18, 18, 18, 18, 18, 18, 18, 18, 18};
		
		// StudentAssembler assembler = new StudentAssembler();
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		// StudentRegisterService registerService = assembler.getRegisterService();
		StudentRegisterService registerService = ctx.getBean("registerService", StudentRegisterService.class);
		for(int i = 0 ; i < serialNumbers.length ; i++) {
			registerService.register(new Student(
					serialNumbers[i], ids[i], passwords[i],
					names[i], ages[i]));
		}
		
		// StudentSelectService selectService = assembler.getSelectService();
		StudentSelectService selectService = ctx.getBean("selectService", StudentSelectService.class);
		Student modifiedStudent = selectService.select("2");
		System.out.print("SerialNumber : " + modifiedStudent.getSerialNumber() + "\t");
		System.out.print("ID : " + modifiedStudent.getId() + "\t");
		System.out.print("PW : " + modifiedStudent.getPassword() + "\t");
		System.out.print("Name : " + modifiedStudent.getName() + "\t");
		System.out.print("Age : " + modifiedStudent.getAge() + "\t");
		System.out.println();
		System.out.println();
		
		// StudentAllSelectService allSelectService = assembler.getAllSelectService();
		StudentAllSelectService allSelectService = ctx.getBean("allSelectService", StudentAllSelectService.class);
		Map<String, Student> allStudent = allSelectService.allSelect();
		Set<String> keys = allStudent.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Student student = allStudent.get(key);
			System.out.print("SerialNumber : " + student.getSerialNumber() + "\t");
			System.out.print("ID : " + student.getId() + "\t");
			System.out.print("PW : " + student.getPassword() + "\t");
			System.out.print("Name : " + student.getName() + "\t");
			System.out.print("Age : " + student.getAge() + "\t");
			System.out.println();
		}
	}
}
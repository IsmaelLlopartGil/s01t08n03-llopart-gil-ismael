package edu.n3.exercise_1;

import java.util.*;
import java.util.stream.Collectors;

import com.liche.utils.io.Input;

public class App {

	public static void main(String[] args) {

		List<Student> studentList=new ArrayList<>();
		
		studentList.add(new Student("Oriol"));
		studentList.add(new Student("Aina"));
		studentList.add(new Student("Josep"));
		studentList.add(new Student("Joana"));
		studentList.add(new Student("Artur"));
		studentList.add(new Student("Mercè"));
		studentList.add(new Student("Gerard"));
		studentList.add(new Student("Mireia"));
		studentList.add(new Student("Marc"));
		studentList.add(new Student("Neus"));
		
		System.out.println("Tots els alumnes: \n" + studentList);
		Input.readString("Prem intro");
		
		System.out.println("Alumnes que el seu nom comença per A: ");
		System.out.println(studentList.stream()
				.filter(c -> c.getName().charAt(0)=='A')
				.collect(Collectors.toList()));
		Input.readString("Prem intro");
		
		System.out.println("Alumnes que tenen una nota de 5 o superior: ");
		System.out.println(studentList.stream()
				.filter(c -> c.getGrade() >= 5)
				.collect(Collectors.toList()));
		Input.readString("Prem intro");
		
		System.out.println("Alumnes que tenen un nota de 5 o més, i que no són de PHP: ");
		System.out.println(studentList.stream()
				.filter(c -> c.getGrade() >= 5 && c.getCourse()!="Full Stack PHP")
				.collect(Collectors.toList()));
		Input.readString("Prem intro");
		
		System.out.println("Alumnes que fan JAVA i són majors d’edat");
		System.out.println(studentList.stream()
				.filter(c -> c.getCourse()=="Back End Java" && c.getAge()>=18)
				.collect(Collectors.toList()));
	}
}

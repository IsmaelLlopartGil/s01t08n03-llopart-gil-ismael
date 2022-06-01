package edu.n3.exercise_1;

import java.security.SecureRandom;

public class Student {

	private String name;
	private int age;
	private String course;
	private int grade;

	public enum CourseEnum
	{
		BACKEND_JAVA("Back End Java"), BACKEND_NODEJS("Back End Nodejs"), FRONTEND_ANGULAR("Front End Angular"), FRONTEND_REACT("Front End React"), FULLSTACK_PHP("Full Stack PHP");
		
		private String course;
		
		private CourseEnum (String course){
			this.course = course;
		}

		public String getCourse() {
			return course;
		}	
		
	}
	
	public Student(String nom) {
		this.name = nom;
		fillInRandomData();
	}

	private void fillInRandomData() {
		age = getRandomNumber(12,120);
		grade = getRandomNumber(0,10);
		course=randomEnum(CourseEnum.class).getCourse();
	}
	
	private int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}

	private static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
		SecureRandom random = new SecureRandom();
		int x = random.nextInt(clazz.getEnumConstants().length);
		return clazz.getEnumConstants()[x];
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}

	public int getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Alumne [nom=" + name + ", edat=" + age + ", curs=" + course + ", nota=" + grade + "]\n";
	}
}

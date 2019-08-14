package com.darian.pattern_23._11_Flyweight.darian;

import java.util.HashMap;
import java.util.Map;

public class TeacherFactory {
	private Map<String,Teacher> pool;
	
	public TeacherFactory() {
		pool = new HashMap<String,Teacher>();
	}
	
	public Teacher getTeacher(String number) {
		Teacher teacher = pool.get(number);
		if(teacher == null) {
			teacher = new Teacher();
			teacher.setNumber(number);
			pool.put(number, teacher);
		}
		return teacher;
	}
}

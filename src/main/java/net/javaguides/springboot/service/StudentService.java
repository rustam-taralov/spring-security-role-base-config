package net.javaguides.springboot.service;

import java.util.List;


import net.javaguides.springboot.web.dto.StudentDto;

public interface StudentService {

	
	
	public List<StudentDto> getAllUser();
	
	public void addStudent();
	
	public void updateStudent(StudentDto student);
	
	public List<StudentDto> findByName(String name);
	
	public List<StudentDto> findByNameAndSurname(String name, String surname);
	
	
	
}

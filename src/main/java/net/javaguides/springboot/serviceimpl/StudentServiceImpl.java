package net.javaguides.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.repository.StudentRepository;
import net.javaguides.springboot.service.StudentService;
import net.javaguides.springboot.web.dto.StudentDto;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentrep;
	
	@Override
	public List<StudentDto> getAllUser() {		
		return studentrep.getAllUser();
	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(StudentDto student) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<StudentDto> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> findByNameAndSurname(String name, String surname) {
		// TODO Auto-generated method stub
		return null;
	}

}

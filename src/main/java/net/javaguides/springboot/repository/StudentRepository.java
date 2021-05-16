package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.util.SqlQueries;
import net.javaguides.springboot.web.dto.StudentDto;
@Repository
public interface StudentRepository extends JpaRepository<StudentDto, Integer>{

	@Query(value =SqlQueries.SelectStudentJoin )
	public List<StudentDto> getAllUser();
	public List<StudentDto> findByName(String name);
	public List<StudentDto> findByNameAndSurname(String name, String surname);
	
}

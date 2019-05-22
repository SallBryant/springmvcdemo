package student.service;

import java.util.List;

import student.pojo.Student;

public interface StudentServiceInterface {
	void addStudent(Student s);

	void removeStudent(String id);

	void setStudent(String id);
	
	List<Student> getStudent(String name);
	
	List<Student> getStudentId(String id);
}
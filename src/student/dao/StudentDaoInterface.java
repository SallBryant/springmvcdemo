package student.dao;

import java.util.List;

import student.pojo.Student;

public interface StudentDaoInterface {
	void addStudent(Student s);

	void removeStudent(String id);

	void setStudent(String id);
	
	public List<Student> getStudent(String name);

	List<Student> getStudentId(String id);
}
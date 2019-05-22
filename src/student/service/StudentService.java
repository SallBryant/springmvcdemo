package student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import student.dao.StudentDaoInterface;
import student.pojo.Student;

@Component
public class StudentService implements StudentServiceInterface {
    @Autowired
	StudentDaoInterface studentDao;
    
    public void addStudent(Student stu) {
    	System.out.println("增加学生");
    	studentDao.addStudent(stu);
    }
    public void removeStudent(String id) {
    	studentDao.removeStudent(id);
    }
    public void setStudent(String id) {
    	studentDao.setStudent(id);
    }
    
	@Override
	public List<Student> getStudent(String name) {
        System.out.println("调用到了StudentService" + name);
        List<Student> result = studentDao.getStudent(name);
        return result;
	}
	public List<Student> getStudentId(String id){
		List<Student> result=studentDao.getStudentId(id);
		return result;
	}
}
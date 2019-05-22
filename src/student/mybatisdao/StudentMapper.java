package student.mybatisdao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import student.pojo.Student;

public interface StudentMapper {
	@Select("select * from student where name=?")
	List<Student> get(String name);
}

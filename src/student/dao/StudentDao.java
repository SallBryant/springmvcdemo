package student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import student.pojo.Student;

@Component
public class StudentDao implements StudentDaoInterface {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addStudent(Student s) {
		System.out.println("调用sql语句");
        jdbcTemplate.update("insert into student (id,name) values (?,?)", s.getId(), s.getName());
    }
    public void removeStudent(String id) {
        jdbcTemplate.update("delete from student where id=?",id);
    }
    public void setStudent(String id) {
        jdbcTemplate.update("update student set name=? where id=?",id);
    }
	@Override
	public List<Student> getStudent(String name) {
        return jdbcTemplate.query("select id,name from student where name like ?", new RowMapper<Student>() {
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setName(rs.getString("name"));
                return stu;
            }
        }, "%"+name+"%");
	}
	public List<Student> getStudentId(String id){
		return jdbcTemplate.query("select * from student where id=?", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs,int row) throws SQLException {
				Student stu=new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				return stu;
			}
		},id);
	}
}
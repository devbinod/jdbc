package np.com.pantbinod.dao;

import np.com.pantbinod.model.Student;

import java.util.List;

public interface StudentDao {

    boolean add(Student student);
    boolean update(Student student);
    boolean delete(int id);
    Student findById(int id);
    List<Student> findAll();


}

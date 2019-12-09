package np.com.pantbinod.dao1;

import np.com.pantbinod.model.Student;

import java.util.List;

public interface StudentDao1 {
    boolean add(Student student);
    boolean update(Student student);
    boolean delete(int id);
    Student findById(int id);
    List<Student> findAll();
}

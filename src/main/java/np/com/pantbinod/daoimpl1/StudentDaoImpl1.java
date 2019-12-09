package np.com.pantbinod.daoimpl1;

import np.com.pantbinod.dao.StudentDao;
import np.com.pantbinod.dao1.StudentDao1;
import np.com.pantbinod.daoimpl.StudentDaoImpl;
import np.com.pantbinod.model.Student;

import java.util.List;

public class StudentDaoImpl1 implements StudentDao1 {

    StudentDao studentDao= new StudentDaoImpl();

    @Override
    public boolean add(Student student) {
        System.out.println("called..");

        return studentDao.add(student);
    }

    @Override
    public boolean update(Student student) {
        System.out.println("called..");
        return studentDao.update(student);
    }

    @Override
    public boolean delete(int id) {
        System.out.println("called..");

        return studentDao.delete(id);
    }

    @Override
    public Student findById(int id) {
        System.out.println("called..");

        return studentDao.findById(id);
    }

    @Override
    public List<Student> findAll() {
        System.out.println("called..");

        return studentDao.findAll();
    }
}

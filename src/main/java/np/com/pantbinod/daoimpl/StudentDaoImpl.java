package np.com.pantbinod.daoimpl;

import np.com.pantbinod.dao.StudentDao;
import np.com.pantbinod.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    List<Student> studentList = new ArrayList<>();

    @Override
    public boolean add(Student student) {
        boolean isAdded =  studentList.add(student);
        return isAdded;
    }


    @Override
    public boolean update(Student student) {
        Student student1 = findById(student.getId());
        student1.setFaculty(student.getFaculty());


        return true;
    }

    @Override
    public boolean delete(int id) {

        Student student = findById(id);
         return studentList.remove(student);


    }

    @Override
    public Student findById(int id) {

        Student student= null;
        for(Student s : studentList){
            if(s.getId() == id){
                student =s;
            }
        }
        return student;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

}

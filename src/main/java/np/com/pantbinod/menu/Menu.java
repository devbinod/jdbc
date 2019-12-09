package np.com.pantbinod.menu;

import np.com.pantbinod.dao.StudentDao;
import np.com.pantbinod.dao1.StudentDao1;
import np.com.pantbinod.daoimpl.StudentDaoImpl;
import np.com.pantbinod.daoimpl1.StudentDaoImpl1;
import np.com.pantbinod.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    StudentDao1 studentDao = new StudentDaoImpl1();
    public void displayMenu() {

        String ask = "yes";

        while (ask.equalsIgnoreCase("yes")){
            System.out.println("1: Add");
            System.out.println("2: update");
            System.out.println("3: delete");
            System.out.println("4: findBy id");
            System.out.println("5: find all");
            System.out.println("Enter the number");
            switch (scanner.nextInt()){

                case 1:
                    Student student = new Student();
                    System.out.println("Enter the roll number");
                    student.setId(scanner.nextInt());
                    System.out.println("Enter the first name");
                    student.setFirstName(scanner.next());
                    System.out.println("Enter the lastname");
                    student.setLastName(scanner.next());
                    System.out.println("Enter faculty");
                    student.setFaculty(scanner.next());
                  boolean isSaved =  studentDao.add(student);
                  if(isSaved)
                  {
                      System.out.println("Sucessfully addedd");
                      studentDao.findAll().forEach(student1 -> System.out.println(student1.toString()));
                  }
                  else
                      System.out.println("Oops something went wrong");
                    break;
                case 2:

                    System.out.println("Enter the roll number");
                    Student student1 = studentDao.findById(scanner.nextInt());
                    System.out.println("Enter the first name");
                    student1.setFirstName(scanner.next());
                    System.out.println("Enter the lastname");
                    student1.setLastName(scanner.next());
                    System.out.println("Enter the faculty");
                    student1.setFaculty(scanner.next());

                    if(studentDao.update(student1))
                    {
                        System.out.println("Sucessfully updated..");
                        studentDao.findAll().forEach(student2 -> System.out.println("student2 = " + student2));
                    }
                    else
                        System.out.println("Oops something went wrong");

                    break;
                case 3:

                    System.out.println("Enter the roll number");
                   boolean isDeleted = studentDao.delete(scanner.nextInt());
                   if (isDeleted){
                       System.out.println("Sucessfully deleted");
                       studentDao.findAll().forEach(student2 -> System.out.println("student2 = " + student2));

                   }

                   else
                       System.out.println("Oops something went wrong");

                    break;
                case 4:

                    System.out.println("Enter the roll number");
                    studentDao.findById(scanner.nextInt()).toString();

                    break;
                case 5:
                    System.out.println("find all");
                    
                   studentDao.findAll().forEach(s -> System.out.println("student1 = " + s));
                    break;
                    default:
                        System.out.println("Enter valid number");
            }
            System.out.println("Do you want again");
            ask = scanner.next();

        }

    }
}

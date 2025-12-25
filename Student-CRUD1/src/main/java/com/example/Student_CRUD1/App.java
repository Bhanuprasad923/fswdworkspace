package com.example.Student_CRUD1;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        StudentDAO dao = new StudentDAO();

        // INSERT
     // INSERT
        Student s1 = new Student();
//        s1.setId(1);
        s1.setName("REHMAN");
        s1.setDept("CSE");
        s1.setMarks(90);
        dao.saveStudent(s1);

        Student s2 = new Student();
//        s2.setId(2);
        s2.setName("PRASAD");
        s2.setDept("ECE");
        s2.setMarks(70);
        dao.saveStudent(s2);
        
        Student s3 = new Student();
//      s3.setId(2);
      s3.setName("SOUNDARYA");
      s3.setDept("ECE");
      s3.setMarks(80);
      dao.saveStudent(s3);

        // UPDATE
//        Student s1 = new Student();
//        s1.setId(1);
//        s1.setName("REHMAN");
//        dao.updateStudent(s1);
//        Student s2 = new Student();
//        s2.setId(2);
//      s2.setName("PRASAD");
//      dao.updateStudent(s2);

        // DELETE
//        dao.deleteStudent(1);
//        dao.deleteStudent(2);
//        dao.deleteStudent(3);
//        dao.deleteStudent(4);
//        dao.deleteStudent(5);
//        dao.deleteStudent(6);
//        dao.deleteStudent(7);
//        dao.deleteStudent(8);

        // READ (LIST)
        List<Student> list = dao.getAllStudents();
        for (Student s : list) {
            System.out.println(s.getId() + " " + s.getName());
        }

        System.out.println("Operation completed");
    }
    }

package com.example.Hibernate_CRUD;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory sf = md.getSessionFactoryBuilder().build();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        //Insert
       Employee e1=new Employee();
        e1.setId(1);
        e1.setName("Deva");
        e1.setSalary(25000);
        e1.setExperience("10 years");
        s.save(e1);
        
        
        Employee e2=new Employee();
        e2.setId(2);
        e2.setName("Varadha");
        e2.setSalary(10000);
        e2.setExperience("5 years");
        s.save(e2); 
        
        Employee e3=new Employee();
        e3.setId(3);
        e3.setName("Shivamanar");
        e3.setSalary(2500);
        e3.setExperience("16 years");
        s.save(e3);
        
        Employee e4=new Employee();
        e4.setId(4);
        e4.setName("Rajamanar");
        e4.setSalary(8000);
        e4.setExperience("2 years");
        s.save(e4);       
     System.out.println("Insert Success");
        
        //update
        //Employee e =new Employee();
        //e.setId(1);
        //e.setName("tony stark");
        //s.update(e);
        //System.out.println("Update Success");
        
        //delete
//        Employee e=new Employee();
//        e.setId(4);
//        s.delete(e);
//        System.out.println("Delete Success");
        
        
        
        
        t.commit();
        s.close();
        
        
    }
}

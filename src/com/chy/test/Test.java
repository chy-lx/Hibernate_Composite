package com.chy.test;

import com.chy.po.Address;
import com.chy.po.Stu;
import com.chy.po.Student;
import com.chy.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        Transaction tr = session.beginTransaction();

        Stu stu=new Stu("wangwu","155901080326");
        Student student =new Student();
        student.setStu(stu);
        student.setAddress(new Address("四川","成都","武侯区"));
        session.save(student);
        tr.commit();
        session.close();
    }
}

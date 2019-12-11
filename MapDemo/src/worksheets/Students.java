/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheets;

import java.util.TreeMap;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Students {
    private TreeMap<Short, Student> stuMap;

   public Students()
   {
      stuMap = new TreeMap<Short, Student>();
   }

   public void addStu(Student stu)
   {
      stuMap.put(new Short(stu.getStudentId()), stu);
   }

   public void removeStu(Student stu)
   {
      stuMap.remove(new Short(stu.getStudentId()));
   }

   public Student getStu(short id)
   {
      return stuMap.get(new Short(id));
   }

   public Iterator<Student> listStudents()
   {
      return allStudents().iterator();
   }

   private Collection<Student> allStudents()
   {
      return stuMap.values();
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetails;

/**
 *
 * @author john_m92
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setName("peter");
        s1.setSid(1);
        Student s2 = new Student();
        s2.setName("miko");
        s2.setSid(2);
        //Student s3 = new Student();
        //s3.setName("king");
        //s3.setSid(3);
        Student[] list = new Student[2]; //array of object
        // TODO code application logic here
        list[0]=s1;
        list[1]=s2;
        //list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName()+" "+list[i].getSid());
        }
    }
    
}

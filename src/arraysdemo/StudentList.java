/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysdemo;

/**
 *
 * @author HP
 */
public class StudentList {
    public static void main(String[] args){
        Student s1 = new Student("s101", "Adegoke" );
        Student[] studentList = new Student[3];
        
        studentList[0] = s1;
        studentList[1] = new Student("s102", "abc");
        studentList[2] = new Student("s103", "def");
        
        for (int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i].getsName());
        }
    }
    
}

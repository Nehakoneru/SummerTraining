import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Student{
    int regNo;
    int score;
    Student(int regNo, int score){
        this.regNo = regNo;
        this.score = score;
    }

    public static int toString(Student dequeue) {
        return dequeue.regNo;
    }
}
public class StudentRegQueue {
//    Student []studentList = new Student[5];
    ArrayList<Student> studentList = new ArrayList<>(5);
//    Queue<Student> students = new LinkedList<>();
    void enqueue(Student s){
        studentList.add(s);
    }
    Student dequeue(){
        if(studentList.isEmpty()) {
            System.out.println("Queue is empty..!");
            return null;
        }
        int maxScore = 0;
        Student maxStudent = null;
        for(Student s: studentList){
            if(s.score > maxScore){
                maxScore = s.score;
                maxStudent = s;
            }
        }
        studentList.remove(maxStudent);
        return maxStudent;
    }
    void peek(){
        if(studentList.isEmpty()) {
            System.out.println("Queue is empty..!");
            return;
        }
        int maxScore = 0;
        Student maxStudent = null;
        for(Student s: studentList){
            if(s.score > maxScore){
                maxScore = s.score;
                maxStudent = s;
            }
        }
        System.out.println("Max score student is "+ maxStudent.regNo+" and his score is " +maxScore);
    }
    void display(){
        if(studentList.isEmpty()) {
            System.out.println("Queue is empty..!");
            return;
        }
        for(Student s: studentList){
            System.out.print(s.regNo+ "--> "+s.score + " ");
            }
        System.out.println();
        }


    public static void main(String[] args) {
        StudentRegQueue sq = new StudentRegQueue();
        Student s1 = new Student(12,90);
        Student s2 = new Student(14,95);
        Student s3 = new Student(2,85);
        sq.enqueue(s1);
        sq.enqueue(s2);
        sq.enqueue(s3);
        sq.display();
        System.out.println("----------------------------------------");
        System.out.println(Student.toString(sq.dequeue()));
        System.out.println("----------------------------------------");
        sq.display();
        System.out.println("----------------------------------------");
        sq.peek();
        System.out.println("----------------------------------------");
        System.out.println(Student.toString(sq.dequeue()));
        System.out.println("----------------------------------------");
        sq.display();
        System.out.println("----------------------------------------");
        sq.peek();
        System.out.println("----------------------------------------");

    }
}
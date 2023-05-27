import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Student {
    private String regNo;
    private int score;

    public Student(String regNo, int score) {
        this.regNo = regNo;
        this.score = score;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getScore() {
        return score;
    }
}
public class StudentQueue 
{
    private Queue<Student> queue;

    public StudentQueue() 
    {
        queue = new LinkedList<>();
    }

    public void addStudent(String regNo, int score) 
    {
        Student student = new Student(regNo, score);
        queue.add(student);
        System.out.println("Student with registration number " + regNo + " and score " + score + " added.");
    }

    public void getStudentInfo() 
    {
        if (queue.isEmpty()) 
        {
            System.out.println("No students in the queue.");
        } else {
            Student student = queue.poll();
            System.out.println("Registration Number: " + student.getRegNo() + ", Score: " + student.getScore());
        }
    }

    public void displayQueue() 
    {
        if (queue.isEmpty()) 
        {
            System.out.println("No students in the queue.");
        } else {
            System.out.println("Student Queue:");
            for (Student student : queue) {
                System.out.println("Registration Number: " + student.getRegNo() + ", Score: " + student.getScore());
            }
        }
    }

    public static void main(String[] args) 
    {
        StudentQueue queue = new StudentQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add Student");
            System.out.println("2. Get Student Information");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter registration number: ");
                String regNo = scanner.nextLine();
                System.out.print("Enter score: ");
                int score = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                queue.addStudent(regNo, score);
            } else if (choice == 2) {
                queue.getStudentInfo();
            } else if (choice == 3) {
                queue.displayQueue();
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
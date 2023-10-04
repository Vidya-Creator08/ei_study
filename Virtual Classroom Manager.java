import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Classroom {
    private String name;

    public Classroom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private int id;
    private String className;

    public Student(int id, String className) {
        this.id = id;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }
}

class Assignment {
    private String className;
    private String details;

    public Assignment(String className, String details) {
        this.className = className;
        this.details = details;
    }

    public String getClassName() {
        return className;
    }

    public String getDetails() {
        return details;
    }
}

public class VirtualClassroomManager {
    private Map<String, Classroom> classrooms;
    private Map<Integer, Student> students;
    private Map<String, Assignment> assignments;

    public VirtualClassroomManager() {
        classrooms = new HashMap<>();
        students = new HashMap<>();
        assignments = new HashMap<>();
    }

    public void addClassroom(String className) {
        Classroom classroom = new Classroom(className);
        classrooms.put(className, classroom);
        System.out.println("Classroom Addition: \"Classroom " + className + " has been created.\"");
    }

    public void addStudent(int studentId, String className) {
        Student student = new Student(studentId, className);
        students.put(studentId, student);
        System.out.println("Student Addition: \"Student " + studentId + " has been enrolled in " + className + ".\"");
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Assignment assignment = new Assignment(className, assignmentDetails);
        assignments.put(className, assignment);
        System.out.println("Assignment Scheduled: \"Assignment for " + className + " has been scheduled.\"");
    }

    public void submitAssignment(int studentId, String className, String assignmentDetails) {
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ": " + assignmentDetails);
    }

    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Virtual Classroom Manager Menu:");
            System.out.println("1. Add Classroom");
            System.out.println("2. Add Student");
            System.out.println("3. Schedule Assignment");
            System.out.println("4. Submit Assignment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            if (choice == 1) {
                System.out.print("Enter the classroom name: ");
                String className = scanner.nextLine();
                manager.addClassroom(className);
            } else if (choice == 2) {
                System.out.print("Enter student ID: ");
                int studentId = scanner.nextInt();
                scanner.nextLine();  // Consume newline character
                System.out.print("Enter the classroom name: ");
                String studentClassName = scanner.nextLine();
                manager.addStudent(studentId, studentClassName);
            } else if (choice == 3) {
                System.out.print("Enter the classroom name: ");
                String assignmentClassName = scanner.nextLine();
                System.out.print("Enter assignment details: ");
                String assignmentDetails = scanner.nextLine();
                manager.scheduleAssignment(assignmentClassName, assignmentDetails);
            } else if (choice == 4) {
                System.out.print("Enter student ID: ");
                int submitStudentId = scanner.nextInt();
                scanner.nextLine();  // Consume newline character
                System.out.print("Enter the classroom name: ");
                String submitClassName = scanner.nextLine();
                System.out.print("Enter assignment details: ");
                String submitAssignmentDetails = scanner.nextLine();
                manager.submitAssignment(submitStudentId, submitClassName, submitAssignmentDetails);
            } else if (choice == 5) {
                System.out.println("Exiting Virtual Classroom Manager.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

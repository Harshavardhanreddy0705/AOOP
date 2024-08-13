package student_info_system_5a;

import java.util.Scanner;

public class StudentInformationSystemApp {
    public static void main(String[] args) {
        IEnrollmentService enrollmentService = new EnrollmentService();
        IStudent student1 = new Student("John Doe", "S001");
        IStudent student2 = new Student("Jane Smith", "S002");

        ICourse course1 = new Course("C001", "Mathematics");
        ICourse course2 = new Course("C002", "Physics");

        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter a command (enroll, withdraw, listStudents, listCourses, exit):");
            command = scanner.nextLine();

            switch (command) {
                case "enroll":
                    System.out.println("Enter student ID:");
                    String studentId = scanner.nextLine();
                    System.out.println("Enter course ID:");
                    String courseId = scanner.nextLine();

                    IStudent student = studentId.equals("S001") ? student1 : student2;
                    ICourse course = courseId.equals("C001") ? course1 : course2;

                    enrollmentService.enrollStudentInCourse(student, course);
                    System.out.println("Student enrolled in course.");
                    break;

                case "withdraw":
                    System.out.println("Enter student ID:");
                    studentId = scanner.nextLine();
                    System.out.println("Enter course ID:");
                    courseId = scanner.nextLine();

                    student = studentId.equals("S001") ? student1 : student2;
                    course = courseId.equals("C001") ? course1 : course2;

                    enrollmentService.withdrawStudentFromCourse(student, course);
                    System.out.println("Student withdrawn from course.");
                    break;

                case "listStudents":
                    System.out.println("Students enrolled in Mathematics:");
                    for (IStudent s : course1.getEnrolledStudents()) {
                        System.out.println(s);
                    }
                    System.out.println("Students enrolled in Physics:");
                    for (IStudent s : course2.getEnrolledStudents()) {
                        System.out.println(s);
                    }
                    break;

                case "listCourses":
                    System.out.println("Courses of John Doe:");
                    for (ICourse c : student1.getCourses()) {
                        System.out.println(c);
                    }
                    System.out.println("Courses of Jane Smith:");
                    for (ICourse c : ((IStudent) student2).getCourses()) {
                        System.out.println(c);
                    }
                    break;

                case "exit":
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}

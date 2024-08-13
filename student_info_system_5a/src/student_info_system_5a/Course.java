package student_info_system_5a;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private String courseId;
    private String courseName;
    private List<IStudent> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(IStudent student) {
        enrolledStudents.add(student);
    }

    public void withdrawStudent(IStudent student) {
        enrolledStudents.remove(student);
    }

    public List<IStudent> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}
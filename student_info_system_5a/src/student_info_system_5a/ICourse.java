package student_info_system_5a;

import java.util.List;

public interface ICourse {
    String getCourseId();
    String getCourseName();
    void enrollStudent(IStudent student);
    void withdrawStudent(IStudent student);
    List<IStudent> getEnrolledStudents();
}

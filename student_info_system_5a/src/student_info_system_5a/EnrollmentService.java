package student_info_system_5a;
public class EnrollmentService implements IEnrollmentService {
    public void enrollStudentInCourse(IStudent student, ICourse course) {
        student.enrollInCourse(course);
    }

    public void withdrawStudentFromCourse(IStudent student, ICourse course) {
        student.withdrawFromCourse(course);
    }
}
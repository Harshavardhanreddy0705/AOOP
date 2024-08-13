package student_info_system_5a;

public interface IEnrollmentService {
    void enrollStudentInCourse(IStudent student, ICourse course);
    void withdrawStudentFromCourse(IStudent student, ICourse course);
}
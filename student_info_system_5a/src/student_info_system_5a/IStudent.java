package student_info_system_5a;

public interface IStudent {
    String getName();
    String getId();
    void enrollInCourse(ICourse course);
    void withdrawFromCourse(ICourse course);
	ICourse[] getCourses();
}
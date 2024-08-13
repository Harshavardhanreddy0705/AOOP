package student_info_system_5a;

import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private String name;
    private String id;
    private List<ICourse> courses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void enrollInCourse(ICourse course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void withdrawFromCourse(ICourse course) {
        courses.remove(course);
        course.withdrawStudent(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", courses=" + courses +
                '}';
    }

	@Override
	public ICourse[] getCourses() {
		// TODO Auto-generated method stub
		return null;
	}
}
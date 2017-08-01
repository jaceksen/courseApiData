package pl.com.erkin.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//business service - singelton
@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

//	private List<Course> topics = new ArrayList<>(
//			Arrays.asList(new Course("spring", "Spring Framework", "Spring Framework Description"),
//					new Course("java", "Core Java", "Core Java Description"),
//					new Course("javascript", "JavaScript", "JavaScript Description")));

	public List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}

}

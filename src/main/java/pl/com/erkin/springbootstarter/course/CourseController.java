package pl.com.erkin.springbootstarter.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.com.erkin.springbootstarter.topic.Topic;

@RestController
public class CourseController {

	// I ma declaring a dependency to TopicService
	@Autowired
	private CourseService courseService;

	// GET implementation
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}

	// GET implementation
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	// POST implementation
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicIs}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}

	// PUT implementation
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicIs}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}

	// DELETE implementation
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicIs}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}

}

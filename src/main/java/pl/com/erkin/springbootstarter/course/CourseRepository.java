package pl.com.erkin.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

//data service
public interface CourseRepository extends CrudRepository<Course, String> {
	
	//getAllTopics()
	//getTopic(String id)
	//updataeTopic(Topic t)
	//deleteTopic(String id)

}

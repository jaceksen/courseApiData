package pl.com.erkin.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//data service
public interface TopicRepository extends CrudRepository<Topic, String> {
	
	//getAllTopics()
	//getTopic(String id)
	//updataeTopic(Topic t)
	//deleteTopic(String id)

}

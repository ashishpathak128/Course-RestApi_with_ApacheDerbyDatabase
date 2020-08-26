package io.courseApi.Quickstart.Topic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRpository tp;

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(00001,"Spring","Spring core framework"),
			new Topic(00002,"Spring AOP","Spring AOPframework"),
			new Topic(00003,"Spring DAO","Spring DAO framework"),
			new Topic(00004,"Hibernate","Hibernate framework"),
			new Topic(00005,"Spring Boot ","Spring Boot framework"),
			new Topic(00006,"Spring Boot Micro Services","Spring core framework")
			));
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		tp.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public Topic getTopic(int Id) {
		 //return topics.get(Id);
		Integer id = new Integer(Id);
		return tp.findById(id).get();
		
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		tp.save(topic);
		
	}

	public void updateTopic(Topic topic, int id) {
		/*
		 * for (int i =0; i < topics.size(); i++) { Topic t = topics.get(i); if
		 * (((Integer)t.getId()).equals((Integer)id)) { topics.set(id, topic); return; }
		 * }
		 */
		tp.save(topic);
		
	}

	public void deleteTopic(int id) {
		topics.removeIf(t -> ((Integer)t.getId()).equals((Integer)id));
	}
}


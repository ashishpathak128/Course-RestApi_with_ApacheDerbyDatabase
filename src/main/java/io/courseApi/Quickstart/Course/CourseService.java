package io.courseApi.Quickstart.Course;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRpository cp;

	/*
	 * private List<Course> topics = new ArrayList<>(Arrays.asList( new
	 * Course(00001,"Spring","Spring core framework"), new
	 * Course(00002,"Spring AOP","Spring AOPframework"), new
	 * Course(00003,"Spring DAO","Spring DAO framework"), new
	 * Course(00004,"Hibernate","Hibernate framework"), new
	 * Course(00005,"Spring Boot ","Spring Boot framework"), new
	 * Course(00006,"Spring Boot Micro Services","Spring core framework") ));
	 */
	
	public List<Course> getAllCourses(int id){
		List<Course> courses = new ArrayList<>();
		cp.findByTopicId(id);
		//cp.findAll().forEach(courses::add);
		
		return courses;
	}
	
	public Course getCourse(int Id) {
		 //return topics.get(Id);
		Integer id = new Integer(Id);
		return cp.findById(id).get();
		
	}

	public void addCourse(Course course) {
		//topics.add(topic);
		cp.save(course);
		
	}

	public void updateCourse(Course course, int id) {
		/*
		 * for (int i =0; i < topics.size(); i++) { Topic t = topics.get(i); if
		 * (((Integer)t.getId()).equals((Integer)id)) { topics.set(id, topic); return; }
		 * }
		 */
		cp.save(course);
		
	}

	public void deleteCourse(int id) {
		//topics.removeIf(t -> ((Integer)t.getId()).equals((Integer)id));
		cp.deleteById(id);
	}
}


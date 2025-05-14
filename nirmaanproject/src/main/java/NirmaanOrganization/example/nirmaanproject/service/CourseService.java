package NirmaanOrganization.example.nirmaanproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NirmaanOrganization.example.nirmaanproject.Repository.courseRepository;
import NirmaanOrganization.example.nirmaanproject.entities.courseEntity;
import jakarta.websocket.server.ServerEndpoint;

@Service
public class CourseService implements ICourseRepository{
	
	@Autowired
	courseRepository repo;

	@Override
	public courseEntity addCourse(courseEntity course) {
		// TODO Auto-generated method stub
		return repo.save(course);
	}

	@Override
	public List<courseEntity> getCourses() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public courseEntity getCourse(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public courseEntity updateCourse(long id, courseEntity course) {
		// TODO Auto-generated method stub
		course.setId(id);
		return repo.save(course);
	}

	@Override
	public String deleteCourse(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted";
	}

}

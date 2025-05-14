package NirmaanOrganization.example.nirmaanproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NirmaanOrganization.example.nirmaanproject.Repository.courseRepository;
import NirmaanOrganization.example.nirmaanproject.entities.courseEntity;
import NirmaanOrganization.example.nirmaanproject.service.CourseService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("course")
public class CourseController {
	@Autowired
	private CourseService service;

	@GetMapping("getCourses")
	public List<courseEntity> getMethodName() {
		return service.getCourses();
	}


	@GetMapping("getCourse/{id}")
	public courseEntity getCourse(@PathVariable long id) {
		return service.getCourse(id);
	}
	
	
	@PostMapping("postCourse")
	public courseEntity postCourse(@RequestBody courseEntity course)
	{
		return service.addCourse(course);
	}
	
	@PutMapping("putCourse/{id}")
	public courseEntity updatecourse(@PathVariable long id ,@RequestBody courseEntity course)
	{
		return service.updateCourse(id, course);
	}
	
	
	@DeleteMapping("deleteCourse/{id}")
	public String deleteCourse(@PathVariable long id){
		service.deleteCourse(id);
		return "deleted";
		
	}
	

}

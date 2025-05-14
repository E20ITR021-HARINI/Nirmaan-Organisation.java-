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

import NirmaanOrganization.example.nirmaanproject.entities.registeredcandidateentity;
import NirmaanOrganization.example.nirmaanproject.service.registeredService;

@RestController
@RequestMapping("Candidate")
public class registeredCandidateController {
	@Autowired
	public registeredService RService;
	
	@GetMapping("RegCandidates")
	 
	public List<registeredcandidateentity> getmethod(){
		
		return RService.getRegs();
		}
	
	@GetMapping("RegCandidate/{id}")
	
	public registeredcandidateentity getregs(@PathVariable Long id) {
		
		return RService.getregs(id);
		
	}
	
	@PostMapping("postcandidate")
	    
		public registeredcandidateentity addregs(@RequestBody registeredcandidateentity reg) {
			return RService.addReg(reg);
		}
	
	
	
	@PutMapping("putcandidate/{id}") 
	    
		public registeredcandidateentity updateregs(@PathVariable long id,@RequestBody registeredcandidateentity reg) {
			return RService.updateReg(id, reg);
		}
		
	@DeleteMapping("deletecandidate/{id}")
	    
		public String deletecourse(@PathVariable long id) {
			RService.deleteReg(id);
			return "deleted";
		}
	
	

}

package NirmaanOrganization.example.nirmaanproject.service;

import java.util.List;

import NirmaanOrganization.example.nirmaanproject.Repository.registeredCandidateRepository;
import NirmaanOrganization.example.nirmaanproject.entities.registeredcandidateentity;

public interface IRegisteredrepository {
	
	
 registeredcandidateentity addReg(registeredcandidateentity Reg);

 List<registeredcandidateentity> getRegs();
 
  registeredcandidateentity getregs(long id);
  
  registeredcandidateentity  updateReg (Long id,registeredcandidateentity Reg);
  
  String deleteReg(long id);
  


 

}

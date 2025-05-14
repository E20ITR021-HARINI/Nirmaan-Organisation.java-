package NirmaanOrganization.example.nirmaanproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NirmaanOrganization.example.nirmaanproject.Repository.registeredCandidateRepository;
import NirmaanOrganization.example.nirmaanproject.entities.registeredcandidateentity;

@Service
public class registeredService implements IRegisteredrepository {

	@Autowired
	registeredCandidateRepository repo;
	
	
	@Override
	public registeredcandidateentity addReg(registeredcandidateentity Reg) {
		// TODO Auto-generated method stub
		return repo.save(Reg);
	}

	@Override
	public List<registeredcandidateentity> getRegs() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public registeredcandidateentity getregs(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get() ;
	}

	@Override
	public registeredcandidateentity updateReg(Long id, registeredcandidateentity Reg) {
		// TODO Auto-generated method stub
		Reg.setId(id);
		return repo.save(Reg);
	}

	@Override
	public String deleteReg(long id) {
		// TODO Auto-generated method stub
		return "deleted";
	}

}

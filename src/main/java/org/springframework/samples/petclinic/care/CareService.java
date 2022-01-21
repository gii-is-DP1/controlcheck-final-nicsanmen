package org.springframework.samples.petclinic.care;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CareService {    

	private CareProvisionRepository careProvisionRepository;
	
	@Autowired
	public CareService(CareProvisionRepository careProvisionRepository) {
		this.careProvisionRepository = careProvisionRepository;
	}
	
    public List<Care> getAllCares(){
        return null;
    }

    public List<Care> getAllCompatibleCares(String petTypeName){
        return careProvisionRepository.findCompatibleCares(petTypeName);
    }

    public Care getCare(String careName) {
        return careProvisionRepository.findCareByName(careName);
//    	return null;
    }

    
    public CareProvision save(CareProvision p) throws NonCompatibleCaresException, UnfeasibleCareException {
        return null;   
    }

    public List<CareProvision> getAllCaresProvided(){
        return null;
    }

    public List<CareProvision> getCaresProvided(Integer visitId){
//        return careProvisionRepository.findCaresProvidedByVisitId(visitId);
    	return null;
    }
    
}

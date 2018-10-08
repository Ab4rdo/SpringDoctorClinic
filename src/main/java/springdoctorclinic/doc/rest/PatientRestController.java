package springdoctorclinic.doc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springdoctorclinic.doc.service.ClinicService;

@RestController
@RequestMapping("api/patients")
public class PatientRestController
{
    @Autowired
    private ClinicService clinicService;
    
    
}

package springdoctorclinic.doc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springdoctorclinic.doc.model.Patient;
import springdoctorclinic.doc.service.ClinicService;

import java.util.Collection;

@RestController
@RequestMapping("api/patients")
public class PatientRestController
{
    @Autowired
    private ClinicService clinicService;
    
    @RequestMapping(value = "/*/lastname/{lastName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Collection<Patient>> getPatientsList(@PathVariable("lastName") String patientLastName) {
        if (patientLastName == null) {
            patientLastName = "";
        }
        Collection<Patient> Patients = this.clinicService.findPatientByLastName(patientLastName);
        if (Patients.isEmpty()) {
            return new ResponseEntity<Collection<Patient>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Collection<Patient>>(Patients, HttpStatus.OK);
    }
    
    
}

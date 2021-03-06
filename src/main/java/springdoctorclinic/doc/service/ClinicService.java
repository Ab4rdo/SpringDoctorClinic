package springdoctorclinic.doc.service;

import org.springframework.dao.DataAccessException;
import springdoctorclinic.doc.model.Patient;
import springdoctorclinic.doc.model.Visit;

import java.util.Collection;

public interface ClinicService
{
    
    Patient findPatientById(int Id);
    Collection<Patient> findAllPatients();
    void savePatient(Patient patient);
    void deletePatient(Patient patient);
    Collection<Patient> findPatientByLastName(String lastName);
    
    
    Collection<Visit> findVisitByPatientId(int patientId);
    Visit findVisitById(int visitId);
    Collection<Visit> findAllVisits();
    void saveVisit(Visit visit);
    void deleteVisit(Visit visit);
    
}

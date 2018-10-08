package springdoctorclinic.doc.repository;

import springdoctorclinic.doc.model.Patient;

import java.util.Collection;

public interface PatientRepository
{
    Collection<Patient> findByLastName(String lastName) ;
    
    Patient findById(int id);
    
    void save(Patient patient);
    
    Collection<Patient> findAll();
    
    void delete(Patient patient);
    
}

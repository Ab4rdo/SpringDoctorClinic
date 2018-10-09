package springdoctorclinic.doc.repository.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import springdoctorclinic.doc.model.Patient;
import springdoctorclinic.doc.repository.PatientRepository;

import java.util.Collection;

@Profile("spring-data-jpa")
public interface SpringDataPatientRepository extends PatientRepository, Repository<Patient, Integer>
{
    @Override
    @Query("SELECT patient FROM Patient patient WHERE patient.lastName LIKE :lastName%")
    public Collection<Patient> findByLastName(String lastName);
    
    @Override
    @Query("SELECT patient FROM Patient patient WHERE patient.id =:id")
    public Patient findById(@Param("id") int id);
}

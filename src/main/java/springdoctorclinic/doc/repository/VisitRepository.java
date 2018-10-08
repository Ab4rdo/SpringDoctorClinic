package springdoctorclinic.doc.repository;

import springdoctorclinic.doc.model.Visit;

import java.util.Collection;
import java.util.List;

public interface VisitRepository
{
    void save(Visit visit);
    
    List<Visit> findByPatientId(Integer patientId);
    
    Visit findById(int id) ;
    
    Collection<Visit> findAll();
    
    void delete(Visit visit);
}

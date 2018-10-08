package springdoctorclinic.doc.service;

import springdoctorclinic.doc.model.Patient;
import springdoctorclinic.doc.model.Visit;

import java.util.Collection;

public class ClinicServiceImpl implements ClinicService
{
    @Override
    public Patient findPatientById(int Id)
    {
        return null;
    }
    
    @Override
    public Collection<Patient> findAllPatients()
    {
        return null;
    }
    
    @Override
    public void savePatient(Patient patient)
    {
    
    }
    
    @Override
    public void deletePatient(Patient patient)
    {
    
    }
    
    @Override
    public Collection<Visit> findVisitByPatientId(int patientId)
    {
        return null;
    }
    
    @Override
    public Visit findVisitById(int visitId)
    {
        return null;
    }
    
    @Override
    public Collection<Visit> findAllVisits()
    {
        return null;
    }
    
    @Override
    public void saveVisit(Visit visit)
    {
    
    }
    
    @Override
    public void deleteVisit(Visit visit)
    {
    
    }
}

package springdoctorclinic.doc.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "patient")
public class Patient extends Person
{
    
    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthDate;
    
    @Column(name = "info")
    private String patient_info;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient", fetch = FetchType.EAGER)
    private Set<Visit> visits;
    
    private Date getBirthDate()
    {
        return birthDate;
    }
    
    private void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }
    
    @Override
    public String toString()
    {
        return "Patient{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", birthDate=" + birthDate +
               ", patient_info='" + patient_info + '\'' +
               '}';
    }
}

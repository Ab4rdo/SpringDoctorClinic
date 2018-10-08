package springdoctorclinic.doc.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "visit")
public class Visit extends BaseEntity
{

    @Column(name = "visit_date")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy/MM/dd")
    private Date date;
    
    @NotEmpty
    @Column(name = "description")
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    
    public Visit() {
        this.date = new Date();
    }
    
    private Date getDate()
    {
        return date;
    }
    
    private void setDate(Date date)
    {
        this.date = date;
    }
    
    private String getDescription()
    {
        return description;
    }
    
    private void setDescription(String description)
    {
        this.description = description;
    }
    
    private Patient getPatient()
    {
        return patient;
    }
    
    private void setPatient(Patient patient)
    {
        this.patient = patient;
    }
}

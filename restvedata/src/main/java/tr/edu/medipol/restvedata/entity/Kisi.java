package tr.edu.medipol.restvedata.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Kisi {

    @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;

    String name;
    String surname;
    int yas;

}

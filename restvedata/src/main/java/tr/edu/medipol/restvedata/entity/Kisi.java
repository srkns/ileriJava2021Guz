package tr.edu.medipol.restvedata.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Kisi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;

    String surname;

    int yas;

}

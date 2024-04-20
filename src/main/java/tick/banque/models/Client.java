package tick.banque.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Client {
    @Id
    @Column(name = "idClient")
    public int idClient;
    @Column(name = "nomClient")
    public String nomClient;
    @Column(name = "prenomClient")
    public String prenomClient;
    @Column(name = "adresseClient")
    public String adresseClient;
    @Column(name = "mailClient")
    public String mailClient;
}

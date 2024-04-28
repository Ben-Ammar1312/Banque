package tick.banque.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Operation")
public abstract class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numOp")
    private int numOp;

    @Column(name = "dateOp")
    private Date dateOp;

    @Column(name = "agentId")
    private int agentId;

    @Column(name = "fraisOp")
    private double fraisOp;

    @Column(name = "montant")
    private double montant;

    public Operation() {
    }

    public Operation(int numOp, Date dateOp, int agentId, double fraisOp, double montant) {
        this.numOp = numOp;
        this.dateOp = dateOp;
        this.agentId = agentId;
        this.fraisOp = fraisOp;
        this.montant = montant;
    }

    public int getNumOp() {
        return numOp;
    }

    public void setNumOp(int numOp) {
        this.numOp = numOp;
    }

    public Date getDateOp() {
        return dateOp;
    }

    public void setDateOp(Date dateOp) {
        this.dateOp = dateOp;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public double getFraisOp() {
        return fraisOp;
    }

    public void setFraisOp(double fraisOp) {
        this.fraisOp = fraisOp;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}

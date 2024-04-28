package tick.banque.models;


import jakarta.persistence.*;


@Entity
@Table(name = "Compte")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numCpt")
    private int numCpt;

    @Column(name = "montantGlobal")
    private double montantGlobal;

    @Column(name = "montantInit")
    private double montantInit;

    @Column(name = "codeCli")
    private int codeCli;

    public Compte() {
    }

    public Compte(int numCpt, double montantGlobal, double montantInit, int codeCli) {
        this.numCpt = numCpt;
        this.montantGlobal = montantGlobal;
        this.montantInit = montantInit;
        this.codeCli = codeCli;
    }

    public int getNumCpt() {
        return numCpt;
    }

    public void setNumCpt(int numCpt) {
        this.numCpt = numCpt;
    }

    public double getMontantInit() {
        return montantInit;
    }

    public void setMontantInit(double montantInit) {
        this.montantInit = montantInit;
    }

    public double getMontantGlobal() {
        return montantGlobal;
    }

    public void setMontantGlobal(double montantGlobal) {
        this.montantGlobal = montantGlobal;
    }

    public int getCodeCli() {
        return codeCli;
    }

    public void setCodeCli(int codeCli) {
        this.codeCli = codeCli;
    }
}

package tick.banque.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Credit")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numCre")
    private int numCre;

    @Column(name = "dateCre")
    private Date dateCre;

    @Column(name = "montCre")
    private int montCre;

    @Column(name = "codeCli")
    private int codeCli;

    @Column(name = "numCpt")
    private int numCpt;

    @Column(name = "filesPath")
    private String filesPath;

    @Column(name = "status")
    private String status;

    public Credit() {
    }

    public Credit(int numCre, Date dateCre, int montCre, int codeCli, int numCpt, String filesPath, String status) {
        this.numCre = numCre;
        this.dateCre = dateCre;
        this.montCre = montCre;
        this.codeCli = codeCli;
        this.numCpt = numCpt;
        this.filesPath = filesPath;
        this.status = status;
    }

    public int getNumCre() {
        return numCre;
    }

    public void setNumCre(int numCre) {
        this.numCre = numCre;
    }

    public Date getDateCre() {
        return dateCre;
    }

    public void setDateCre(Date dateCre) {
        this.dateCre = dateCre;
    }

    public int getMontCre() {
        return montCre;
    }

    public void setMontCre(int montCre) {
        this.montCre = montCre;
    }

    public int getCodeCli() {
        return codeCli;
    }

    public void setCodeCli(int codeCli) {
        this.codeCli = codeCli;
    }

    public String getFilesPath() {
        return filesPath;
    }

    public void setFilesPath(String filesPath) {
        this.filesPath = filesPath;
    }

    public int getNumCpt() {
        return numCpt;
    }

    public void setNumCpt(int numCpt) {
        this.numCpt = numCpt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

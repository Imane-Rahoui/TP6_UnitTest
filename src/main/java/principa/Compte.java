package principa;

public class Compte {

    private String name;
    private int numeroCompte;
    private double solde;

    public Compte(String name, int numeroCompte, double solde) {
        this.name = name;
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public Compte() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}

package principa;

public interface ICompte {

    public double retirer(double montant);
    public double deposer(double montant);
    public int getNumeroCompte();
    public double getSolde();
    public String getNom();
    public void testUni();
}

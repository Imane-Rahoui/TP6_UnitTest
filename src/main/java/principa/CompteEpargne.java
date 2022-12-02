package principa;

public class CompteEpargne extends Compte implements ICompte {

    //Ctrl+Shift+T

    final double TAUXINTERET=0.01;

    public CompteEpargne(String name, int numeroCompte, double solde) {
        super(name, numeroCompte, solde);
    }

    public CompteEpargne() {
    }

    @Override
    public double retirer(double montant) {

        System.out.println(montant);
        System.out.println(getSolde());

        if (montant > 0 && this.getSolde() >= montant) {
            System.out.println("oh");
            return this.getSolde() - montant;
        }
        throw new RuntimeException("failed : " + " Solde < montant "+ "OR montant <= 0");
    }

    @Override
    public double deposer(double montant) {
        if(montant>0) {
            double s=this.getSolde()+montant;
            this.setSolde(s);
            System.out.println("SOLDE AFTER : "+s);
            return s;
        }
        throw new RuntimeException("failed : montant <= 0");

    }

    @Override
    public int getNumeroCompte() {
        return this.getNumeroCompte();
    }

    @Override
    public double getSolde() {
        return super.getSolde();
    }

    @Override
    public String getNom() {
        return getNom();
    }

    @Override
    public void testUni() {

    }
}

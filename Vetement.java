package td5;

public  class Vetement extends ProduitGC implements Promotion {
	private String couleur;
	private String taille;
	Vetement(long ref, String lib, float p, int q,String couleur,String taille) {
		super(ref, lib, p, q);
		this.couleur=couleur;
		this.taille=taille;
	}
	
	@Override 
	public void decrire() {
	    super.decrire();
	    System.out.println(" couleur : "+ couleur + " taille : "+taille);
		
	}
	  @Override
	    public float calculPrixTTC() {
	        return prixHt*(1+tva);
	    }
	

	@Override
	public float prixDeVente(String dateStr) {
		float pttc=calculPrixTTC();
		if (estPeriodePromo(dateStr)) {
			return (float)(pttc-pttc*0.3);
		}
		else return 
				pttc;
	}




	
	
}

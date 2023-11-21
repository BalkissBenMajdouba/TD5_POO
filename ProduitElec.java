package td5;

public  class ProduitElec extends ProduitGC implements Promotion {
	private String cat;
	ProduitElec(long ref, String lib, float p, int q,String cat) {
		super(ref, lib, p, q);
		this.cat=cat;
	}
	
	@Override 
	public void decrire() {
	    super.decrire();
	    System.out.println(" categorie : "+cat);
		
	}

	@Override
	public float prixDeVente(String dateStr) {
		float pttc=prixHt * (1.08f + tva);
		if (estPeriodePromo(dateStr)) {
			return (float)(pttc-pttc*0.2);
		}
		else return 
				pttc;
	}

	  @Override
	    public float calculPrixTTC() {
	        return prixHt*(1.08f+tva);
	    }
	




}

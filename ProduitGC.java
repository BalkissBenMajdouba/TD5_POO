package td5;

public   class ProduitGC extends Article{

	ProduitGC(long ref, String lib, float p, int q) {
		super(ref, lib, p, q);
		
	}
	 @Override
	    public void decrire() {
	    super.decrire();
	    }
	  @Override
	    public float calculPrixTTC() {
	        return prixHt*(1+tva);
	    }
	

}

package td5;

abstract public class Article {
	protected long ref;
	protected String libelle;
	protected float prixHt;
	protected int qtStock;
	protected final float tva=0.1f;
	
	Article(long ref, String lib, float p, int q){
		this.ref=ref;
		this.libelle=lib;
		this.prixHt=p;
		this.qtStock=q;
	}
	
	void approvisionner(int nb) {
		this.qtStock+=nb;
	}
	void decrire() {
		
		    System.out.println(getClass().getSimpleName() + " Ref: " + ref + ", Lib: " + libelle + ", PrixHT: " + prixHt + " DT, Qtstock: " + qtStock);
		}
	
	abstract float calculPrixTTC();
	public boolean appartientPromo() {
		return(this instanceof ProduitElec)||(this instanceof Vetement);
	}
	boolean estDispo(int qteAchat) {
		 if(qteAchat>this.qtStock) {
			 return false;}
			 else 
				 return true;
		 
		
	}
 
		
		
	}
	
	
	



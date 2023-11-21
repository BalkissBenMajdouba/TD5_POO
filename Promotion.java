package td5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface Promotion {
	 LocalDate debutPromo = LocalDate.of(2022, 3, 19);
	 LocalDate finPromo = LocalDate.of(2022, 3, 31);
	 float prixDeVente(String dateStr);
	 default boolean estPeriodePromo(String dateStr) {
		 LocalDate achd= LocalDate.parse(dateStr,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 return !achd.isBefore(debutPromo)&& !achd.isAfter(finPromo);
	 }
	  static double calculerRemise(double prixAvantRemise, double prixApresRemise) {
		  return ( (prixAvantRemise - prixApresRemise) / prixAvantRemise) * 100;
	  }
}

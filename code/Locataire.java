import java.util.Date;


public class Locataire {
    public String nom;

    public String prenom;

    public String email;

    public String tel;

    public String password;

    public Date createdAt;

    public Date updatedAt;

    public void reserver(Residence residence, Date dateDébut, Date dateFin) {}

    public boolean payer(Reservation reservation,double montant) {}

    public void laisserAvis(Reservation reservation,int note,String commentaire) {}

}

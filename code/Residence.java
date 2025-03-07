import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Residence {
    public String nom;

    public String adresse;

    public String description;

    public Date createdAt;

    public Date updatedAt;

    public List<Materiel> materiels  = new ArrayList<Materiel> ();

    public List<Prestation> prestations = new ArrayList<Prestation> ();

    public List<ElementResidence> elementResidences = new ArrayList<ElementResidence> ();

    public void ajouterResidence(Residence residence) {}

    public void modifierResidence(Residence résidence) {}

}


**Diagramme de classes du système de gestion de location de résidence à courte durée**


Ce diagramme de classes représente les différentes entités et leurs relations dans un système de réservation de résidences. Il met en évidence les attributs et les méthodes de chaque classe, ainsi que les associations entre elles.

il décrit les entités clés (Locataire, Réservation, Paiement, Avis, Résidence, Prestation, Matériel, ElementResidence, Gestionnaire) et leurs relations dans un système de réservation de résidences. Il détaille les attributs et méthodes principaux de chaque classe.

**Quelques points d'éclaircissement:**

--> Distinction entre residence et ElementDeResidence par la relation de composition
--> Residence et Materiel, Prestation sont liés par une relation de compostion (En cas de retrait d'une residence y sur la plateforme le gestionnaire ne pourra plus louer ses materiels ou offrir des prestations puisqu'il n'aura plus de locataires )
--> Representation des disponibilités en tant que champ booléen
--> Statut de reservation (Confirmé, En attente, Annuler), en type string, et faire un chois entre String ou enum dans le code
-->Les tarifs sont traités comme des champs des Eléments de Résidence et on peut retrouver le montant total d'une résidence, associé à une methode calculMontant qui pourra calculer la somme totale des composant ou élément de cette residence
--> Dans la classe paiement on a un attribut status de type String, un statut qui peut être : (En attente, partiellement payé, payé, annuler )
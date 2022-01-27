package Personnage;

public class Personnage {

//le constructeur

public Personnage (String name, int life) {
this.nom = name;
this.vie = life;
}
//Accesseur du nom du personnage

public String LeNom?() {
return this.nom; }
Les attributs
private String nom;
private String vie;
}

jeuPersonnage :

import Personnage.*;
public class jeuPersonnage {
public static void main (String args []) {
Personnage UnSorcier? = new Personnage("Thomas", 200);
System.out.println("nom du personnage =" + UnSorcier?.LeNom?());
}
}
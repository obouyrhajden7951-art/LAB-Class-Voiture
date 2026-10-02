package ma.ens.classes;

public class Test {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Toyota", "Corolla", 200, 2030);

        // System.out.println(v1.marque);

        // Getters
        System.out.println(v1.getMarque());
        System.out.println(v1.getModele());
        System.out.println(v1.getVitesse());
        System.out.println(v1.getAnnee());

        // Setter puis getter
        v1.setMarque("Renault");
        System.out.println(v1.getMarque());
        
        

        v1.setVitesse(-50);        
        System.out.println(v1.getVitesse());  

        v1.setAnnee(3000);      
        System.out.println(v1.getAnnee());    
        
        // Modèle Métier 
        
        Voiture v = new Voiture("Toyota", "Corolla", 50, 2022);
        v.afficherInformations();
        v.accelerer(30);   
        v.freiner(20);       
        v.freiner(500);   
        v.accelerer(-10);  
        v.afficherInformations();
        
        
    }
}

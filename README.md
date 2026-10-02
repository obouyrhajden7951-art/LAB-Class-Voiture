# LAB-Class-Voiture
  # Étape 1 : Créer la structure de base de la classe Voiture
  
    Pourquoi le nom de la classe doit-il correspondre au nom du fichier ? 
      Le nom de la classe doit correspondre au nom du fichier pour que le compilateur et la JVM puissent retrouver facilement la classe , et c'est ensuite la JVM qui s'appuie sur ce nom pour localiser le fichier .class .
      
  # Étape 2 : Déclarer les attributs privés
    
    Que se passe-t-il si vous oubliez le mot-clé private ?
      Si on oublie private , l'attribut devient accessible depuis les autres classes du même package, donc on perd l'encapsulation, et on ne peut plus contrôler les valeurs.
      
  # Étape 3 : Ajouter le constructeur par défaut
  
    Pourquoi est-il important d'initialiser les attributs dans le constructeur ?
      Il est important d'initialiser les attributs dans le constructeur pour que l'objet soit valide dès sa création, et pour éviter NullPointerException .
      
  # Étape 4 : Ajouter le constructeur paramétré
  
    Que se passe-t-il si vous ne définissez pas de constructeur par défaut et que vous essayez de créer un objet avec new Voiture() ?
      le programme ne compile pas.

<img width="840" height="146" alt="image" src="https://github.com/user-attachments/assets/66820cf2-dd6f-4846-bb85-6fb86f25fd9a" />

  # Étape 5 : Ajouter le constructeur de copie
  
    Une copie superficielle copie les références : les deux objets partagent les mêmes sous-objets.
    Une copie profonde crée de nouveaux sous-objets : les deux objets sont indépendants.
    
  # Étape 6 : Ajouter les getters et setters
  
    Pourquoi ne pas rendre les attributs public au lieu de créer des getters et setters ?
     
      Avec des getters et setters, on peut contrôler les valeurs avant de les enregistrer, ce qui est impossible avec des attributs public.

  # Étape 7 : Ajouter des validations dans les setters

   <img width="670" height="114" alt="image" src="https://github.com/user-attachments/assets/20166745-123f-41bb-b01b-f6fa835135f7" />

     Que se passe-t-il si vous essayez de définir une année future ?
       le setter affiche un message d'erreur, et l'attribut reste inchangé (il garde son ancienne valeur).
       
  <img width="634" height="130" alt="image" src="https://github.com/user-attachments/assets/25c18ffa-1d83-4a70-91bd-858dd9e48d39" />

  # Étape 8 : Ajouter les méthodes métier

  <img width="896" height="384" alt="image" src="https://github.com/user-attachments/assets/92a7d3cd-e5bf-4f67-af45-4c2a6fd50bcc" />
    
    Pourquoi la méthode freiner() vérifie-t-elle si la vitesse devient négative ?
      Sans cette vérification, si la vitesse est 50 et qu'on freine de 100, la vitesse deviendrait négative (50 - 100 = -50), ce qui est impossible pour une voiture.

  # Étape 9 : Créer plusieurs objets dans la méthode main
  
    Pourquoi voiture2 == voiture3 retourne-t-il false même si les valeurs sont identiques ?
      Parce que == en Java compare les références des objets

   # Étape 10 : Modifier et afficher les données des objets
  <img width="1142" height="496" alt="image" src="https://github.com/user-attachments/assets/f9a11d3d-2ae1-44ab-bc0f-5cbbae552abe" />
  <img width="1116" height="567" alt="image" src="https://github.com/user-attachments/assets/e5825531-a120-4aac-89e9-669673bcd3e8" />
    
    Que se passe-t-il si vous modifiez voiture2 après avoir créé voiture3 ? voiture3 est-il affecté ?
        Non, car on a une Indépendance totale : Les modifications sur voiture2 n'ont aucun impact sur voiture3, en plus Le constructeur de copie a dupliqué les données, il n'a pas créé un lien de dépendance.

  # Étape 11 : Tester les cas valides et invalides
  <img width="1170" height="649" alt="image" src="https://github.com/user-attachments/assets/4b491f45-7e40-437a-b6b9-dc329e5081be" />
  <img width="811" height="232" alt="image" src="https://github.com/user-attachments/assets/f8921f72-790f-4209-87ef-99cdbfb1b0f8" />

    Pourquoi est-il important de tester les cas invalides ?
      S'assurer que la classe est robuste et capable de se protéger contre les données erronées ou incohérentes  



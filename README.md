# LAB-Class-Voiture
  # Étape 1 : Créer la structure de base de la classe Voiture
    Pourquoi le nom de la classe doit-il correspondre au nom du fichier ? 
      Le nom de la classe doit correspondre au nom du fichier pour que le compilateur et la JVM puissent retrouver facilement la classe c'est le compilateur qui vérifie la           règle (il refuse de compiler si les noms ne correspondent pas), et c'est ensuite la JVM qui s'appuie sur ce nom pour localiser le fichier `.class` à charger.
  # Étape 2 : Déclarer les attributs privés
    Que se passe-t-il si vous oubliez le mot-clé private ?
      Si on oublie private , l'attribut devient accessible depuis les autres classes du même package, donc on perd l'encapsulation, et on ne peut plus contrôler les valeurs.
  # Étape 3 : Ajouter le constructeur par défaut
    Pourquoi est-il important d'initialiser les attributs dans le constructeur ?
      Il est important d'initialiser les attributs dans le constructeur pour que l'objet soit valide dès sa création, et pour éviter NullPointerException .
  # Étape 4 : Ajouter le constructeur paramétré
    Que se passe-t-il si vous ne définissez pas de constructeur par défaut et que vous essayez de créer un objet avec new Voiture() ?
      le programme ne compile pas.

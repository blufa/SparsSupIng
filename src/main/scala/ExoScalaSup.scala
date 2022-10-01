object ExoScalaSup extends App {

  // Exercice sur les string

  //Q1
  val noel = "Petit papa Noël Quand" +
    "tu descendras du ciel Avec des jouets par milliers N’oublie pas mon petit soulier." +
    "Mais avant de partir Il faudra bien te couvrir Dehors tu vas avoir si froid" +
    "C’est un peu a cause de moi."

  //Q2
  val nbPhrase = noel.count(lettre=>lettre == ".")

  //Q3
  val nbA = noel.toLowerCase().count(lettre=>lettre == 'a')

  //Q4
  val phrasesNoel = noel.split('.')

  //Q5
  val lastPhrase = phrasesNoel.reverse

  //System.out.println(lastPhrase)

  // Exercice sur les operateurs
  //Q1
  val nbPremier = 5
  val vraixOuFaux = (nbPremier*nbPremier +17)%12
 // System.out.println(vraixOuFaux)

  //Q2
  val anciennete = 6
  val salaire = 1490
  val estPrime = (anciennete <= 5 && salaire < 1500 || (5 < anciennete && anciennete <= 10 && 1500 < salaire && salaire <= 2300) ||
    (anciennete > 10 && (salaire < 1500 || salaire > 2300)))

  //Bernadette sera primée et Marc Non

  //System.out.println(estPrime)

  //Exercice sur les tableaux
  val fruits = Array("Pomme", "Poisson", "Mangue")
  val fruits2 = fruits.filter(_ !="Poisson") // fruits.filter(el =>el !="Poisson")
  val fruit3 = fruits2 ++ Array("Oranges", "Papaye")
  val newTaille = fruit3.length
  val indexMangue = fruit3.indexOf("Mangue")
  //System.out.println(indexMangue)

  //Exercie sur les listes
  val fruitsList = List("pomme", "banane", "goyave", "banane", "kaki", "pomplemousse")
  val troisiemeElement = fruitsList(2)
  val fruits_1 = "ananas" +: fruitsList :+ "pastèque"
  val taile_Fruit_1 = fruits_1.size
  System.out.println(s"la nouvelle taille de notre collection est $taile_Fruit_1")

  println(s"Est-ce que goyave est dans fruits, ${fruits_1.contains("goyave")}")
  val nbreOccurenceBanane = fruits_1.count(el=>el =="banane")
  println(s"le nombre d'occurences de banane est $nbreOccurenceBanane")
  val fruits_sorted = fruits_1.sorted

  val fruits_small = fruits_sorted.filter(el => el.length < 5)

  println(s"Les small fruits sont: ${fruits_small.mkString(",")}")
}

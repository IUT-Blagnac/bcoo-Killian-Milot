@startuml
'----------------------------
hide circle
hide empty attributes
hide empty methods
'----------------------------

class Etudiant {
  num etudiant
  nom 
  prenom
  date de naissance
}

Etudiant "1" -- "0..*" Examen

class Examen {
  date 
  coef

}


(Etudiant, Examen) . Note

class Note {
  
}

class Cour{

}

Cour "1" -- "0..*" Examen
Cour "1" -- "0..*" Etudiant 

@enduml
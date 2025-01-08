//Kreiranje klase Student:
//Kreirajte klasu Student s privatnim atributima: DA
//ime (tipa String) DA
//prezime (tipa String) DA
//brojIndeksa (tipa String) DA
//Dodajte konstruktor koji inicijalizira sve atribute.
//Kreirajte metode getIme(), getPrezime(), getBrojIndeksa(), i getProsjekOcjena() kako bi omogućili dohvaćanje tih vrijednosti. DA

class Student {


      private String ime;
      private String prezime;
      private String brojIndeksa;
      private double prosjekOcjena;

      public Student(String ime, String prezime, String brojIndeksa, double prosjekOcjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.prosjekOcjena = prosjekOcjena;

      }

      public String getIme() {
        return this.ime;
      }

      public String getPrezime() {
        return prezime;
      }

      public String getBrojIndeksa() {
        return brojIndeksa;
      }

      public double getProsjekOcjena() {
          return prosjekOcjena;
      }
}






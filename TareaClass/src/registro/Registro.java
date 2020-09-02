package registro;


public class Registro {

    
    public static void main(String[] args) {
       
      Persona P1 , P2 , P3 , P4, P5;
           
      P1 = new Persona();
      P2 = new Persona(22453854);
      P3 = new Persona(33548635 , "Laura");
      P4 = new Persona(44657423,"Jose","Perez");
      P5 = new Persona(34034456, "Camila", "Cancino",25);
      
      P1.mostrar();
      P2.mostrar();
      P3.mostrar();
      P4.mostrar();
      P5.mostrar();
    }
    
}

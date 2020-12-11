public class Prueba
{
   public static void main (String[]args)
   {
      Semaforo s1,s2,s3;
      
      s1 = new Semaforo();
      s1.mostrar();
      
      s2 = new Semaforo();
      s2.setEncendido(false);
      System.out.print("S2: ");
      s2.mostrar();
      
      s1.cambiar();
      System.out.print("S1: ");
      s1.mostrar();
      
      s2.setEncendido(true);
      System.out.print("S2: ");
      s2.mostrar();
   }
}
public class Semaforo
{
   private boolean encendido,rojo,verde,amarillo;
   
   public Semaforo()
   {
      encendido = true;
      rojo = true;
      verde = false;
      amarillo = false;
   }
   
   public boolean getEncendido()
   {
      return encendido;
   }
   
   public void setEncendido(boolean p)
   {
      encendido = p;
   }
   
   public void cambiar()
   {
      if(rojo==true){
      rojo=false;
      amarillo=true;
      verde=false;}  
   }
   
   public void mostrar()
   {
      if(encendido){
         if(rojo)
         System.out.println("Rojo prendido");
         else
            if(amarillo)
            System.out.println("Amarillo prendido");
            else
               System.out.println("Verde prendido");}
               else
               System.out.println("Apagado");
   }
   
}
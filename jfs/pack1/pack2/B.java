package pack2;
public class B extends A{
   public void print(){
     //private variable can't access in its sub class
     //System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     System.out.println(d); 
   }
}
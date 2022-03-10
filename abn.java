import java.util.*;
//Abstract class and Abstract method :
//Abstract method: it is such a method which is only declared in basa class (parent class) and define in derived class 
  //               (child class).
//Abstract class:  it is such a cass in which Abstract class is declared.
//-# Abstract class can have concreate method allow.
//-#Abstract class can not be final.

abstract class parent{

    abstract void disp1();
    void disp2()
    {
        System.out.println("Display sudhakar is parent of vaishu");
    }
}
 class child extends parent{
     void disp1(){
         System.out.println("Display vaishvanvi child of Sudhakar ");

     }
 }

 class abn{
     public static void main(String[] args) {
         child s= new child ();
         s.disp1();
         s.disp2();
     }
 }


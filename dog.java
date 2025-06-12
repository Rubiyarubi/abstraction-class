abstract class animal
 {
  abstract void cat();
 }
{                                                                                                                                                                                                                                                                                                          
  public void meow()
 {
  System.out.println("meow meow");
  }
}
class dog animal
 {
  public void bark() 
{
    System.out.println("Bark bark"); 
}
}
class Main
{
  public static void main(String[] args)
{
    cat c1 = new cat();
    c1.meow();
    dog d1 =new dog();
    d1.bark();
  }
}



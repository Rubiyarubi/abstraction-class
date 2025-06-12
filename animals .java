abstract class animal
{
   public abstract void sound();
}
class Dog extends animal
{
   public void sound()
   {
     system.out.println("Dog is Barking");
   }
}
class Lion extends animal
{
    public void sound()
    {
        System.out.println(Lion is roar");
    }
}
class test
{
    public static void main(string[]args)
    {
      Dog d=new Dog();
      Lion l.sound();
      d.sound();  l.sound();
    }
}x
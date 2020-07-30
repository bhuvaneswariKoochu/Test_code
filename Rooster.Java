//Rooster
//Using interface concept

Interface Birds {
 void chicken ()
 void rooster ()
}

//Implementation 
class bird1 implements Birds {
public void chicken ()
{
System.out.println(“Cluck,cluck”);
}
public void rooster()
{ System.out.println(“Cock-a-doodle-doo”);
}}
public static void main (String[] args)
{ bird1 b = new bird1();
b.chicken();
b.rooster();
}}

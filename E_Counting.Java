    import java.util.ArrayList;
    
    public class Animals{
    
    public static void main(String [] args){
      
      ArrayList<Animal> alist = new ArrayList<Animal>();
      Fly f = new Fly("butterfly","parrot","chicken");
      walk w = new walk("cat","dog","chicken");
      Sing s = new Sing("sing");
      swim  s1= new swim("fish","duck");
      alist.add(f);
      alist.add(w);
      alist.add(s);
      alist.add(s1);
      
     for(Animal animal : alist)
      {
           if(animal instanceOf fly){
              fCount++;
              System.out.println("fly" + fCount++);

         }else if(animal instanceOf w){
             wCount++;
             System.out.println("walk" + wCount++)
         }else if(animal instanceOf s){
             sCount++;
             System.out.println("Sing" + sCount++)
            }else (animal instanceOf s1){
             s1Count++;
             System.out.println("swim" + s1Count++)
            } 
}
}

//Override method
Insect Interface :
public interface Insect
{
}
FlyingInsect Interface :
public interface FlyingInsect extends Insect
{
public boolean fly();
}
Ground Interface :
public interface GroundInsect extends Insect
{
// Walk/Crawl
public boolean walk();
}
Caterpillar Class :
public class Caterpillar implements GroundInsect
{
@Override
public boolean walk()
{
    System.out.println("Caterpillar Walk method");
    return true;
}
}
ButterFly Class :
public class Butterfly implements FlyingInsect
{
@Override
public boolean fly()
{
    System.out.println("ButterFly Flying method");
    return false;
}
}

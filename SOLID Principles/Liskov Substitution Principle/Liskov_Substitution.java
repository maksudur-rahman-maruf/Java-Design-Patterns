## Principle: if S is a subtype of T, then objects of type T
 in a program may be replaced with objects of type S without
 altering any of the desirable properties of that program.

## Bad example
public class Bird{
    public void fly(){}
}
public class Duck extends Bird{}
The duck can fly because it is a bird, but what about this:

public class Ostrich extends Bird{}
Ostrich is a bird, but it can't fly, Ostrich class is a subtype
of class Bird, but it shouldn't be able to use the fly method, 
that means we are breaking the LSP principle.

## Good example
public class Bird{}
public class FlyingBirds extends Bird{
    public void fly(){}
}
public class Duck extends FlyingBirds{}
public class Ostrich extends Bird{}

enum level//enums in java are special data types that allow variables to have perdefined constants,here constants of variable l are HIGH,MEDIUM,LOW
{
    HIGH,
    MEDIUM,
    LOW
}
public class enums {
    public static void main(String[] args)
    {
        level l=level.MEDIUM;//set value of l to MEDIUM
        System.out.println(l);
        //we can also use switch with enum
        switch(l)
        {
            case HIGH :
                System.out.println("HIGH Level");
                break;
            case MEDIUM:
                System.out.println("MEDIUM level");
                break;
            case LOW:
                System.out.println("LOW level");
                break;
            default:
                System.out.println("Wrong input");
        }
//The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
        for(level l1 :level.values())
        {
            System.out.println(l1);
        }
    }
}

/*
Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.


 */

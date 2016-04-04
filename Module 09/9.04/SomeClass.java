public class SomeClass 
{
    String[] fruits = { "apple", "banana", "peach", "strawberry" };
String str = "a";
    for (String item : fruits) 
{
           str += item.substring(1, 2);
}
System.out.println(str);
}
import java.util.*;
class Anagram
{
public static void main(String args[])
{
String a="geetha";
String b="thagee";
char x[]=a.toCharArray();
char y[]=b.toCharArray();
Arrays.sort(x);
Arrays.sort(y);
boolean result=Arrays.equals(x,y);
if(result==true)
{
System.out.println("anagram");
}
else
{
System.out.println("not anagram");
}
}
}


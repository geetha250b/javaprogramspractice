class Uppercase
{
public static void main(String args[])
{
String s="geetha is a developer";
char y[]=s.toCharArray();
int i=0;
int size=y.length;
while(i!=size)
{
if(y[i]!=' ')
{
y[i]=(char)(y[i]-32);

}
i++;
}
System.out.println(y);
System.out.println(s);
}
}

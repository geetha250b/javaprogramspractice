class ReverseString
{
public static void main(String args[])
{
String x="abc tech";
char y[]=x.toCharArray();
int size=y.length;
char z[]=new char[size];
int i=0;
while(i!=size)
{
z[size-1-i]=y[i];
i++;
}
System.out.println(y);
System.out.println(z);
}
}

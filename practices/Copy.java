
class Copy
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
z[i]=y[i];
i++;
}
System.out.println(z);
}
}





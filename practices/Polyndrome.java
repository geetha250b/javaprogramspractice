class Polyndrome
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
i=0;
while(i!=size)
{
if(y[i]!=z[i])
{
System.out.println("not polyndrome");
System.exit(0);
}
else{
i++;
continue;
}
}
}
}

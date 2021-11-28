class FirstUppercase
{
public static void main(String args[])
{
String s="abc tech";
char y[]=s.toCharArray();
int size=y.length;
int i=1;
y[0]=(char)(y[0]-32);
while(i!=size)
{
if(y[i]==' ')
{
y[i+1]=(char)(y[i+1]-32);
}
i++;
}
System.out.println(y);
}
}


class Countnumbersconsonants
{
public static void main(String args[])
{
String s="ABC'S  TECH";
int vcount=0;
int ccount=0;
int splcount=0;
char y[]=s.toCharArray();
int size=y.length;
int i=0;
while(i!=size)
{
if(y[i]>='A' && y[i]<='z')
{
if(y[i]=='A' || y[i]=='E' || y[i]=='I' || y[i]=='O' || y[i]=='U')
{
vcount++;
}
else{
ccount++;
}
}
else
{
splcount++;
}
i++;
}
System.out.println(s);

System.out.println(vcount);
System.out.println(splcount);
System.out.println(ccount);

}
}

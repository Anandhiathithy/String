public class Stringtostrarray
{
public static void main(String args[])
{
String s = "Mississippi is a river";
String x[] = s.split(" ");

for(int i=0;i<x.length;i++)
{
System.out.println(x[i]);

}
}
}

output

Mississippi
is
a
river


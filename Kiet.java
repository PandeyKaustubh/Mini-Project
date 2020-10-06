import java.io.*;
class Company
{
String name,branch;
double amt,t;
Company()
{
name="";
amt=0.0;
t=0.0;
branch="";

}
Company(String n, double amot,String b)
{
name=n;
amt=amot*12;
t=amot;
branch=b;
}
void display()
{
System.out.println("Presenting the gem recruiters of KIET Group of Institution");
System.out.println("Companies visiting us are as follows:-");
System.out.println("Newgen         \t Wipro    \t Oppo     \t Hero            \t Hindustan");
System.out.println("Utlimate KRONOS          \t Infotech \t tata     \t Airtel          \t Tech Mahindra");
System.out.println("Flipkart \t Amazon   \t Sanpdeal \t Grofers         \t HP           \t Capegemini");
System.out.println("Reliance \t Samsung  \t Lava     \t Godrej          \t Syska         \t Axis Bank");
System.out.println("Abbott   \t Nestle   \t Ranbaxy  \t Johnson-Johnson \t Havells");
System.out.println("This program is managed by Internship and Industry cell(IIPC) \n under Corporate Relation and Placement Cell (CRPC)");
}
void department()
{
System.out.println("KIET Btech course offers different departments");
System.out.println("\tComputer Science and Engineering");
System.out.println("\tComputer Science");
System.out.println("\tInformation Technology");
System.out.println("\tComputer Science and Information Technology");
System.out.println("\tElectronic and Communication Engineering");
System.out.println("\tElectrical and Electronics Engineering");
System.out.println("\tElectronic and Instrumentation Engineering");
System.out.println("\tMechanical Engineering");
System.out.println("\tCivil Engineering");
System.out.println("KIET also offers Applied Sciences,MBA, MCA and Pharmacy departments");

}

void showstud()
{
System.out.println("\t |\tName= \t\t\t\t"+name+"\t\t|");
System.out.println("\t |\tBranch=\t\t\t\t"+branch+"\t\t|");
System.out.println("\t |\tMonthly wage=\t\t\t"+t+"\t\t|");
System.out.println("\t |\tAnnual wage=\t\t\t"+amt+"\t|");
System.out.println("______________________________________________________________________________________");
}
}

class Kiet extends Company
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
System.out.println("WELCOME TO THE KIET PLACEMENT CELL");
System.out.println("A place that gives wings to kietian's dream every year");
System.out.println("Kiet offers you different departments like MBA MCA BTech BPharma");
System.out.println("we present you different facilities");
System.out.println(" press 1 for awaring yourself with our mass recruiters");
System.out.println(" press 2 to enter a student placement information");
System.out.println(" press 3 for getting information about depatments in KIET");
int a= Integer.parseInt(br.readLine());
int n=0;
switch(a)
{
case 1:
{ Kiet ob=new Kiet();
ob.display();
}
break;
case 2:
{
System.out.println("enter the no. of student detail you want to enter");
 n= Integer.parseInt(br.readLine());
for(int i=1;i<=n;i++)
{
System.out.println("ENTER DETAILS OF "+i +" STUDENT-------");
System.out.print("\t\t Enter name=\t");
String s= br.readLine();
System.out.print("\t\t Enter branch=\t");
String b= br.readLine();
System.out.print("\t\t Enter monthly wages=\t");
double aa= Double.parseDouble(br.readLine());
Company ob=new Company(s,aa,b);
ob.showstud();
}
} break;
case 3:
{
Kiet ob=new Kiet();
ob.department();
}
break;
default:
System.out.println("WRONG CHOICE!!!");
}


}
}


public class Lingkaran1
{
double radius;
  
public void inputData(int data)
{
 radius=data;
       
}
    
public double hitungLuas()
{
double Luas;
Luas=Math.PI*radius*radius;
return Luas;
}
public double hitungKeliling()
{
    double Keliling;
    Keliling=2*Math.PI*radius;
    return Keliling;    
}
public void cetak()
{
System.out.println("Radius Lingkaran : "+radius);
System.out.println("Luas Lingkaran : "+hitungLuas());
System.out.println("Keliling Lingkaran : "+hitungKeliling());
}

public static void main(String args[])
{
Lingkaran1 ling1=new Lingkaran1();
ling1.inputData (10);
ling1.cetak();
}
}
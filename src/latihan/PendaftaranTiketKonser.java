
package latihan;



import javax.swing.*;
import java.awt.*;

public class PendaftaranTiketKonser extends JFrame
{
   
    JLabel lblnama=new JLabel ("Nama");
    JTextField txnama=new JTextField(20);
    JLabel lbltelpon=new JLabel ("No.HP");
    JTextField txtelpon=new JTextField(20);
    JLabel lblpilih=new JLabel ("Tiket Untuk :");
    String[]jenispilihan={"Dewasa","Anak-Anak"};
    JComboBox cbpilihan =new JComboBox(jenispilihan);
    
    
    
    PendaftaranTiketKonser()
    {
      setTitle("Tiket Konser");
      setLocation(200,100);
      setSize(600,400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
    }

   void komponenVisual()
   {
       getContentPane().setLayout(null);
       getContentPane().add(lblnama);
       lblnama.setBounds(10,20,100,20);
       getContentPane().add(txnama);
       txnama.setBounds(105,20,175,20);
       getContentPane().add(lbltelpon);
       lbltelpon.setBounds(10,50,100,20);
       getContentPane().add(txtelpon);
       txtelpon.setBounds(105,50,175,20);
       getContentPane().add(lblpilih);
       lblpilih.setBounds(10,80,100,20);
       getContentPane().add(cbpilihan);
       cbpilihan.setBounds(10,100,150,20);
              
       
       setVisible(true);
   }
    
    
   public static void main(String args[])
   {
       PendaftaranTiketKonser ta=new PendaftaranTiketKonser();
       ta.komponenVisual();
   }
}


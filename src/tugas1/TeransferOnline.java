
package tugas1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TeransferOnline extends JFrame 
{
    JLabel lbltransfer=new JLabel("Transfer");
    JRadioButton sesama=new JRadioButton("Sesama BRI");
    JRadioButton lain=new JRadioButton("Bank Lain");
    JLabel lblbank=new JLabel ("Nama Bank");
    JTextField txbank=new JTextField(20);
    JLabel lblpilih=new JLabel ("Pilih Transaksi:");
    String[]jenispilihan={"Dengan Konpirmasi","Tanpa Konpirmasi"};
    JComboBox cbpilihan =new JComboBox(jenispilihan);
    JLabel lblnomor=new JLabel ("Masukan nomor rekening");
    JTextField txnomor=new JTextField(20);
    JLabel lbljumlah=new JLabel ("Masukan jumlah teransfer");
    JTextField txjumlah=new JTextField(20);
    JLabel lblstruk=new JLabel("Cetak Struk");
    JCheckBox ya=new JCheckBox ("YA");
    JCheckBox tdk=new JCheckBox ("TIDAK");
    JButton ok=new JButton("OK");
    JTextArea hasil=new JTextArea();
    
TeransferOnline()
{
    setTitle("Transfer Online");
    setLocation(300,100);
    setSize(400,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
void komponenVisual()
{
 getContentPane().setLayout(null);
 getContentPane().add(lbltransfer);
 lbltransfer.setBounds(10,10,70,20);
 getContentPane().add(sesama);
 sesama.setBounds(10,45,100,20);
 getContentPane().add(lain);
 lain.setBounds(120,45,100,20);
 
 getContentPane().add(lblbank);
 lblbank.setBounds(20,85,200,20);
 getContentPane().add(txbank);
 txbank.setBounds(210,85,150,20);
 
 getContentPane().add(lblpilih);
 lblpilih.setBounds(20,110,100,20);
 getContentPane().add(cbpilihan);
 cbpilihan.setBounds(20,140,150,20);
 
 getContentPane().add(lblnomor);
 lblnomor.setBounds(20,170,200,20);
 getContentPane().add(txnomor);
 txnomor.setBounds(210,170,150,20);
 
 getContentPane().add(lbljumlah);
 lbljumlah.setBounds(20,200,150,20);
 getContentPane().add(txjumlah);
 txjumlah.setBounds(210,200,150,20);
 
 getContentPane().add(lblstruk);
 lblstruk.setBounds(20,230,150,20);
 getContentPane().add(ya);
 ya.setBounds(210,230,150,20);
 getContentPane().add(tdk);
 tdk.setBounds(210,250,150,20);
 
 getContentPane().add(hasil);
 hasil.setBounds(20,280,350,100);
 
 getContentPane().add(ok);
 ok.setBounds(250,400,80,20);

 
 setVisible(true);
}

void AksiReaksi()
{
ok.addActionListener (new ActionListener()    
{

public void actionPerformed(ActionEvent e)
{
    hasil.append(txnomor.getText()+"\n");
    hasil.append(txjumlah.getText()+"\n");
   
    if(sesama.isSelected()==true)
    {
        hasil.append(sesama.getText()+"\n");
    }
    if(lain.isSelected()==true)
    {
        hasil.append(lain.getText()+"\n");
    }
    
     hasil.append(txbank.getText()+"\n");
     
    
}     
});
    
}       
        
public static void main (String args[])
{
TeransferOnline ap=new TeransferOnline();
ap.komponenVisual();
ap.AksiReaksi();
}    

}

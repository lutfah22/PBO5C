package programpenilaian;


import javax.swing.*;

public class AplikasiPenilaian extends JFrame
{
    
    JLabel lblnim=new JLabel("NIM");
    JTextField txnim=new JTextField(20);
    JButton tblcari=new JButton("Cari");
    JLabel lblnama=new JLabel("Nama");
    JTextField txnama=new JTextField(20);
    JLabel lblkelas=new JLabel("Kelas");
    JRadioButton kelasA=new JRadioButton("A");
    JRadioButton kelasB=new JRadioButton("B");
    JRadioButton kelasC=new JRadioButton("C");
    ButtonGroup grupkelas=new ButtonGroup();
    JLabel lblkelompok=new JLabel("kelompok");
    String[]jeniskelompok={"1","2","3","4","5","6","7"};
    JComboBox cbkelompok=new JComboBox(jeniskelompok);
    JLabel lblnilai=new JLabel("Nilai");
    JLabel lbltugas1=new JLabel("Tugas1");
    JTextField txtugas1=new JTextField(10);
    JLabel lbltugas2=new JLabel("Tugas2");
    JTextField txtugas2=new JTextField(10);
    JLabel lbltugas3=new JLabel("Tugas3");
    JTextField txtugas3=new JTextField(10);
    JLabel lbltugas4=new JLabel("Tugas4");
    JTextField txtugas4=new JTextField(10);
    JLabel lbltugas5=new JLabel("Tugas5");
    JTextField txtugas5=new JTextField(10);
    JLabel lbluts=new JLabel("UTS");
    JTextField txuts=new JTextField(10);
    JLabel lbluas=new JLabel("UAS");
    JTextField txuas=new JTextField(10);
    JButton tblsave=new JButton("Save");
    JButton tblupgreade=new JButton("Upgreade");
    JButton tblexit=new JButton("Exit");
    
    AplikasiPenilaian()
    {
        setTitle("Lebar Penilaian");
        setLocation(300,100);
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    void komponenVisual()
    {
        getContentPane().setLayout(null);
        getContentPane().add(lblnim);
        lblnim.setBounds(10,10,70,20);
        getContentPane().add(txnim);
        txnim.setBounds(75,10,100,20);
        getContentPane().add(tblcari);
        tblcari.setBounds(180,10,95,20);
        getContentPane().add(lblnama);
        lblnama.setBounds(10,30,70,20);
        getContentPane().add(txnama);
        txnama.setBounds(75,30,200,20);
        getContentPane().add(lblkelas);
        lblkelas.setBounds(10,50,100,20);
        getContentPane().add(kelasA);
        kelasA.setBounds(75,50,50,20);
        getContentPane().add(kelasB);
        kelasB.setBounds(125,50,50,20);
        getContentPane().add(kelasC);
        kelasC.setBounds(175,50,50,20);
        grupkelas.add(kelasA);
        grupkelas.add(kelasB);
        grupkelas.add(kelasC);
        getContentPane().add(lblkelompok);
        lblkelompok.setBounds(10,70,100,20);
        getContentPane().add(cbkelompok);
        cbkelompok.setBounds(75,70,100,20);
        getContentPane().add(lblnilai);
        lblnilai.setBounds(10,90,100,20);
        
        getContentPane().add(lbltugas1);
        lbltugas1.setBounds(10,110,100,20);
        getContentPane().add(txtugas1);
        txtugas1.setBounds(75,110,100,20);
        
        getContentPane().add(lbltugas2);
        lbltugas2.setBounds(10,130,100,20);
        getContentPane().add(txtugas2);
        txtugas2.setBounds(75,130,100,20);
        
        getContentPane().add(lbltugas3);
        lbltugas3.setBounds(10,150,100,20);
        getContentPane().add(txtugas3);
        txtugas3.setBounds(75,150,100,20);
        
        getContentPane().add(lbltugas4);
        lbltugas4.setBounds(10,170,100,20);
        getContentPane().add(txtugas4);
        txtugas4.setBounds(75,170,100,20);
        
        getContentPane().add(lbltugas5);
        lbltugas5.setBounds(10,190,100,20);
        getContentPane().add(txtugas5);
        txtugas5.setBounds(75,190,100,20);
        
        getContentPane().add(lbluts);
        lbluts.setBounds(10,210,100,20);
        getContentPane().add(txuts);
        txuts.setBounds(75,210,100,20);
        
        getContentPane().add(lbluas);
        lbluas.setBounds(10,230,100,20);
        getContentPane().add(txuas);
        txuas.setBounds(75,230,100,20);
        
        getContentPane().add(tblsave);
        tblsave.setBounds(180,190,95,20);
        
        getContentPane().add(tblupgreade);
        tblupgreade.setBounds(180,210,95,20);
        
        getContentPane().add(tblexit);
        tblexit.setBounds(180,230,95,20);
        
        
        
        setVisible(true);
    }
    
    public static void main (String args[])
    {
        AplikasiPenilaian ap=new AplikasiPenilaian();
        ap.komponenVisual();
        
    
}
}

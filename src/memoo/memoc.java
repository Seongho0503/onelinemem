package memoo;

import java.awt.event.ActionEvent;

import javax.servlet.http.HttpServlet;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class memoc extends HttpServlet {
	
	 JFrame f = new JFrame();
     f.setSize(350,250);  
                     
     JTextArea t = new JTextArea();      
     f.add(t);
     
     f.setVisible(true);
     
     JMenuBar m = new JMenuBar();
     f.setJMenuBar( m );
      
     JMenu m_file = new JMenu("����");
     m.add( m_file);
     
     JMenuItem i_save = new JMenuItem("����");
     JMenuItem i_load = new JMenuItem("�ε�");     
     m_file.add( i_save);
     m_file.add( i_load);         
             
     i_save.addActionListener(new ActionListener() {
          
         public void actionPerformed(ActionEvent e) {
             
             FileDialog dialog = new FileDialog(f, "�ε�", FileDialog.SAVE);
             dialog.setVisible(true);        
             
             String path = dialog.getDirectory() + dialog.getFile();             
             
             try {
                
                FileWriter w = new FileWriter( path );
                String s = t.getText();                 
                w.write( s  ); 
                w.close();
         
             } catch (Exception e2) {
             
                 System.out.println("�������"+e2);
             }  
         }            
     }); 
     
     i_load.addActionListener(new ActionListener() {
          
         public void actionPerformed(ActionEvent e) {
             System.out.println("�ε带 �����մϴ�.");               
         }            
     }); 
}

     

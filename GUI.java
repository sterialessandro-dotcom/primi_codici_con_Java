import javax.swing.*;
import java.awt.event.*;

public class EsempioGui {

   
    public static void main(String[] args) {
       JFrame frame = new JFrame("Esempio GUI java");
       frame.setSize(4000,2000);//le dimensioni sono espresse in pixel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JPanel panel =new JPanel();
        frame.add(panel);
       
        panel.setLayout(null);
       
        JLabel label=new JLabel(" Inserire il tuo nome " );
        label.setBounds(20,25,20,20);
        panel.add(label);
       
    frame.setVisible(true);
    }
   
}

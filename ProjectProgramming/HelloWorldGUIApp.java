import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;
public class HelloWorldGUIApp{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");							// ����
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					
                frame.setPreferredSize(new Dimension(300, 300));						// âũ�� 
                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER); 		// ����(��)��ġ
                
                label.setFont(label.getFont().deriveFont(20.0f));						// ���� ������
                
                frame.getContentPane().add(label);                						// �����ӿ� �߰�
                
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();			
                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);				// â ��ġ

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

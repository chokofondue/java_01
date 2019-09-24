import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;
public class HelloWorldGUIApp{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");							// 제목
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					
                frame.setPreferredSize(new Dimension(300, 300));						// 창크기 
                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER); 		// 글자(라벨)위치
                
                label.setFont(label.getFont().deriveFont(20.0f));						// 글자 사이즈
                
                frame.getContentPane().add(label);                						// 프레임에 추가
                
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();			
                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);				// 창 위치

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

package homework4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {
    private JTextField jT = new JTextField(20);
    private JTextArea jA = new JTextArea(20, 30);
    private JButton bj1 = new JButton("Send Message");
    private JPanel jp1 = new JPanel(new BorderLayout());
    private JScrollPane sP = new JScrollPane(jA);
    public MainFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Application");
        setBounds(800, 400, 400, 420);
        setLayout(new FlowLayout());
        setResizable(false);
        jA.setEditable(false);
        jA.setLineWrap(true);
        bj1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        jT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
               // super.keyPressed(e);
                if(e.getKeyCode()== KeyEvent.VK_ENTER){
                    sendMsg();
                }
            }

    });

        jp1.add(jT, BorderLayout.WEST);
        jp1.add(bj1, BorderLayout.CENTER);

        add(sP);
        add(jp1);
        setVisible(true);
    }

    public void sendMsg(){
        jA.append(jT.getText() + "\n");
        jT.setText("");
        jT.grabFocus();
    }
}

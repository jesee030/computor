package computer;/**
 * █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 * ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 * ░     ░ ░      ░  ░
 *
 * @author JESEE030
 * @webadress https://github.com/jesee030
 * @Version 1.0
 * @creat 2021-04-11-下午 2:39
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 *
 *   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 *  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 *  ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 *  ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 *           ░     ░ ░      ░  ░

 @author JESEE030
 @ClassName computor.java
 @Description TODE
 @webadress https://github.com/jesee030
 *@Date 2021/4/11 下午 2:39
 */
public class EasyFrame {
    static JFrame frame;

    public EasyFrame(){
        frame= new JFrame("简易计算器");
        //respond close even
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(355,200);
        //set panel
        JPanel jPanel = new JPanel();
        jPanel.setSize(355,200);
        jPanel.setLayout(null);
        JLabel title = new JLabel("简易计算器");
        title.setBounds(120,20,80,25);
        jPanel.add(title);

        JLabel num1 = new JLabel("运算数一");
        num1.setBounds(20,50,80,25);
        jPanel.add(num1);

        computer.num1Text = new JTextField(28);
        computer.num1Text.setBounds(90,50,200,20);
        computer.num1Text.setText("");
        jPanel.add(computer.num1Text);

        JLabel num2 = new JLabel("运算数二");
        num2.setBounds(20,70,80,25);
        jPanel.add(num2);
        computer.num2Text = new JTextField(28);
        computer.num2Text.setBounds(90,70,200,20);
        computer.num1Text.setText("");
        jPanel.add(computer.num2Text);

        JLabel ans = new JLabel("运算结果");
        ans.setBounds(20,90,80,25);
        jPanel.add(ans);
        computer.ansText = new JTextField(28);
        computer.ansText.setBounds(90,90,200,20);
        computer.num1Text.setText("");
        jPanel.add(computer.ansText);

        JButton plus= new JButton("相加");
        plus.setBounds(20,110,80,20);
        jPanel.add(plus);
        plus.addActionListener(new buttonListener());

        JButton minus= new JButton("相减");
        minus.setBounds(220,110,80,20);
        jPanel.add(minus);
        minus.addActionListener(new buttonListener());

        JButton clear = new JButton("全部清零");
        clear.setBounds(110,120,100,20);
        jPanel.add(clear);
        clear.addActionListener(new buttonListener());


        frame.add(jPanel);
        frame.pack();
        frame.setVisible(true);
    }
}

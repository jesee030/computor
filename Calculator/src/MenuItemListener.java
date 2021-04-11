/**
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
 * @creat 2021-04-10-下午 9:50
 */

import com.sun.deploy.panel.AdvancedPanel;
import com.sun.xml.internal.bind.v2.TODO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 *类功能描述 respond menu even
 *@Authorkeyter
 *@Date 2021/4/10 下午 9:50
 */
public class MenuItemListener implements ActionListener {

    public void actionPerformed(ActionEvent e){
        if("基本计算".equals(e.getActionCommand())){
            new EasyFrame();//shift to easy calculate window
            AdvanceFrame.frame.setVisible(false);
        }else if ("科学计算".equals((e.getActionCommand()))){
            new AdvanceFrame();
            EasyFrame.frame.setVisible(false);
        }else if ("复制".equals(e.getActionCommand())){
            //TODO
        }else if ("粘贴".equals(e.getActionCommand())){
            //TODO
        }else if("使用说明".equals(e.getActionCommand())){
            try {
                FileInputStream fis = new FileInputStream("使用说明.txt");
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                JTextArea helpArea = new JTextArea(15,48);
                helpArea.setEditable(false);
                helpArea.setDisabledTextColor(Color.BLACK);
                JScrollPane scroll = new JScrollPane(helpArea);
                String s ;
                while ((s= br.readLine()) != null){
                    helpArea.append(s);
                    helpArea.append("\n");
                }
                JOptionPane.showMessageDialog(null,scroll,"帮助主题",JOptionPane.PLAIN_MESSAGE);
                br.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            System.exit(0);
        }else if ("About...".equals(e.getActionCommand())){
            JTextArea aboutArea = new JTextArea();
            aboutArea.setText("版权拥有者：public\n开发时间：2008\n");
            JOptionPane.showMessageDialog(null,aboutArea,"关于  计算器",JOptionPane.PLAIN_MESSAGE);
        }
    }
}

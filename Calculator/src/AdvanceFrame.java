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
 * @creat 2021-04-10-下午 10:12
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *类功能描述
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
 @ClassName AdvanceFrame.java
 @Description advance calculate frame
 @webadress https://github.com/jesee030
 *@Date 2021/4/10 下午 10:12
groovyScript("def result=''; def stop=false; def params=\"JESEE030\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList(); if (params.size()==1 && (params[0]==null || params[0]=='null' || params[0]=='')) { stop=true; }; if(!stop) { for(i=0; i < params.size(); i++) {result +=((i==0) ? '\\r\\n' : '') + ((i < params.size() - 1) ? ' * @param: ' + params[i] + '\\r\\n' : ' * @param: ' + params[i] + '')}; }; return result;", methodParameters())
groovyScript("def result=''; def data=\"JESEE030\"; def stop=false; if(data==null || data=='null' || data=='' || data=='void' ) { stop=true; }; if(!stop) { result += '\\r\\n' + ' * @return: ' + data; }; return result;", methodReturnType())
 */
public class AdvanceFrame {
    static JFrame frame;
    public AdvanceFrame(){
        frame = new JFrame("科学计算器");

        JMenuBar mb = new JMenuBar();
        //create menu
        JMenu m1 = new JMenu("编辑");
        JMenu m2 =new JMenu("操作");
        JMenu m3 = new JMenu("帮助");
        //create menu item
        JMenuItem mi1c = new JMenuItem("复制", KeyEvent.VK_C);
        JMenuItem mi1v = new JMenuItem("粘贴",KeyEvent.VK_V);
        JMenuItem mi21 = new JMenuItem("基本计算");
        JMenuItem mi22 = new JMenuItem("科学计算");
        JMenuItem mi31  =new JMenuItem("使用说明");
        JMenuItem mi32 = new JMenuItem("About...");
        //create menubar
        frame.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(mi1c);
        m1.add(mi1v);
        m2.add(mi21);
        m2.add(mi22);
        m3.add(mi31);
        m3.add(mi32);
        //menu item listen even
        mi1c.addActionListener(new MenuItemListener());//copy listen
        mi1v.addActionListener(new MenuItemListener());//paste listen
        mi21.addActionListener(new MenuItemListener());//calculate listen
        mi31.addActionListener(new MenuItemListener());//guild listen
        mi32.addActionListener(new MenuItemListener());//about listen
        Container cp = frame.getContentPane();//get content pane of the frame
        cp.add(new AdvanceCalPanel());//add advance calculate panel
        frame.pack();//set suitable size
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

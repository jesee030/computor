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
 * @creat 2021-04-10-下午 9:56
 */

import javax.swing.*;
import java.awt.*;

/**
 *类功能描述 advance calculate panel
 *@Authorkeyter
 *@Date 2021/4/10 下午 9:56
 */
public class AdvanceCalPanel extends JPanel {
    private static final long serialVersionUID = 2696716054985506500L;
    public AdvanceCalPanel(){
        setLayout(new BorderLayout());
        Calculator.show = new JTextField("0",27);
        Calculator.show.setFont(new Font("Dialog", Font.PLAIN, 16));
        Calculator.show.setHorizontalAlignment(JTextField.RIGHT);//光标设置
        //show zoom text panel
        JPanel ps = new JPanel();
        ps.add(Calculator.show);
        //creat panel load button
        JPanel pb1=new JPanel();
        pb1.setLayout(new GridLayout(10,5,1,1));
        pb1.setBorder(BorderFactory.createEtchedBorder());//create border

        //botton
        String[] larr = {
                "Sta", "F-E", "(", ")", "MC", "clr", "Avg", "dms", "Exp", "ln", "MR",
                "Dec", "Sum", "sin", "x^y", "log", "MS", "Bin", "E(x)", "cos",
                "x^2", "n!", "M+", "Oct", "D(x)", "tan", "x√", "1/x", "PI",
                "Hex", "D", "E", "F", "/", "Mod", "And", "A", "B", "C", "*",
                "Or", "Xor", "7", "8", "9", "-", "Lsh", "Not", "4", "5", "6",
                "+", "Int", "shift", "1", "2", "3", ".", "0", "="
        };
        for (int i  = 0;i < larr.length; i++){
            addButton(pb1,larr[i]);
        }
        setBorder(BorderFactory.createEtchedBorder());
        add(pb1,BorderLayout.CENTER);
        add(ps,BorderLayout.NORTH);
    }

    private void addButton(Container c, String s) {
        //add button to panel listen button even
        JButton bt = new JButton(s);
        c.add(bt);
        bt.addActionListener(new buttonListener());
    }
}

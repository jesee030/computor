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
 * @creat 2021-04-11-上午 10:49
 */

import javax.swing.*;
import java.awt.*;

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
 *@Date 2021/4/11 上午 10:49
 */
public class easyCalPanel extends JPanel {
    private static final long serialVersionUID  = 3224376138339105930L;
    public easyCalPanel(){
        setLayout(new BorderLayout());
        Calculator.show = new JTextField("0", 17);
        Calculator.show.setFont(new Font("Dialog", Font.PLAIN, 18));
        Calculator.show.setHorizontalAlignment(JTextField.RIGHT);
        JPanel ps = new JPanel();
        ps.add(Calculator.show);
        JPanel pb = new JPanel();
        pb.setLayout(new GridLayout(5, 4, 1, 1));
        pb.setBorder(BorderFactory.createEtchedBorder());
        String bts = "%^√!789/456*123-0.=+";
        for (int i = 0; i < bts.length(); i++) {
            addButton(pb, bts.substring(i, i + 1));
        }
        add(pb, BorderLayout.CENTER);
        add(ps, BorderLayout.NORTH);
    }
    private void addButton(Container c, String s) {
        JButton bt = new JButton(s);
        bt.setFont(new Font("Dialog", Font.PLAIN, 18));//设置字体
        c.add(bt);
        bt.addActionListener(new buttonListener());
    }
}

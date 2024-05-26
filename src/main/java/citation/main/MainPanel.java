package citation.main;

import citation.cite.cite;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {


    public MainPanel(){
        components();

    }

    private void components(){
    setTitle("Citation Software");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,450);
    setLocationRelativeTo(null);
    setContentPane(new cite());

    }

    public static void main(String[] args){
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("citation.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY,Font.PLAIN,13));
        FlatMacDarkLaf.setup();
        EventQueue.invokeLater(() -> new MainPanel().setVisible(true));
    }
}
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
       // settings for the main window
    setTitle("Citation Software");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600,700);
    setLocationRelativeTo(null);
    setContentPane(new cite());

    }

    public static void main(String[] args){
        // bringing fonts and colors from FlatLaf
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("citation.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY,Font.PLAIN,13));
        FlatMacDarkLaf.setup();
        EventQueue.invokeLater(() -> new MainPanel().setVisible(true));
    }
}
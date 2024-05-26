package citation.cite;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class cite extends JPanel {
    public cite(){
    components();
    }
    private JTextField url_text;
    private JButton cite;
    private JTextArea result;
    private void components(){
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        url_text = new JTextField();
        cite = new JButton("Cite");
        result = new JTextArea();

        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE,"" +
                "arc:20;"
                + "[light]background:darken(@background,3%);" +
                "[dark]background:lighten(@background,3%);");

        url_text.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,"Enter the url");

        cite.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]background:darken(@background,10%);" +
                "[dark]background:lighten(@background,10%);" +
                "borderWidth:0;" +
                "focusWidth:0;" +
                "innerFocusWidth:0");


       JLabel title = new JLabel("Welcome back!");
       title.putClientProperty(FlatClientProperties.STYLE,"" + "font:bold +10");
       panel.add(title);


        JLabel url = new JLabel("Start Citing Now!");
        url.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%);");
        panel.add(url, "gapy 8");

        panel.add(new JLabel("URL"), "gapy 8");
        panel.add(url_text);
        panel.add(cite, "gapy 10");
        panel.add(result, "gapy 10");

        add(panel);



    }

}

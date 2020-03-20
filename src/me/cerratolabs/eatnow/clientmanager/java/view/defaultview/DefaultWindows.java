package view.defaultview;


import javax.swing.*;
import java.awt.*;

/**
 * @author Alejandro Cerrato Espejo
 */
public class DefaultWindows extends JFrame {

    private JPanel logoPanel;
    private JPanel variablePanel;

    public DefaultWindows() {
        initComponents();
    }

    public static void main(String[] args) {
        new DefaultWindows().setVisible(true);
    }

    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        variablePanel = new JPanel();
        logoPanel = new ImagePanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());

       GroupLayout variablePanelLayout = new GroupLayout(variablePanel);
        variablePanel.setLayout(variablePanelLayout);
        variablePanelLayout.setHorizontalGroup(
                variablePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 1108, Short.MAX_VALUE)
        );
        variablePanelLayout.setVerticalGroup(
                variablePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 487, Short.MAX_VALUE)
        );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1108;
        gridBagConstraints.ipady = 487;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(6, 10, 11, 0);
        getContentPane().add(variablePanel, gridBagConstraints);

       GroupLayout logoPanelLayout = new GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
                logoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 1115, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
                logoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 1115;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(11, 10, 0, 10);
        getContentPane().add(logoPanel, gridBagConstraints);

        pack();
        setResizable(false);
        setSize(1135, 604);
        setTitle(ViewConstants.EATNOW_WINDOWS_TITLE);
    }

}
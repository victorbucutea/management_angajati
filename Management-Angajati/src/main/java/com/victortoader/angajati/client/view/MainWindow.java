package com.victortoader.angajati.client.view;


import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 10/21/2015.
 */
public class MainWindow extends JFrame {

    JPanel upPanel = new UpPanel();
    JPanel downPanel = new DownPanel();

    public MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(700, 500);
        setLocation(100, 100);
        setTitle("Managementul Angajatilor");

        setLayout(new GridBagLayout());
        add(upPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        add(downPanel, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        pack();


        {
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("no nimbus found");

            }
        }

    }

}

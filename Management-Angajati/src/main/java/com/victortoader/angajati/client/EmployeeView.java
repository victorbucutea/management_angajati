package com.victortoader.angajati.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 286868 on 3/3/2016.
 *
 * Tot ce tine de 'display'. Layout, butoane, tabele reactie la interactiune strict vizuala.
 * Interactiunea cu server-ul sau interactiune care genereaza alte efecte este deja comportament si ar
 * trebui sa fie in controller.
 */
public class EmployeeView {

    EmployeeController controller;

    public void init(){
    // initialize layout

        initForm();
        initButtons();
        initTable();

    }

    private void initTable() {

    }

    private void initButtons() {
        JButton x = new JButton();
        x.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.exportReport();
            }
        });

    }

    private void initForm() {


    }
}

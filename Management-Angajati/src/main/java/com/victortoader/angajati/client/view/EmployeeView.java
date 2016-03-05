package com.victortoader.angajati.client.view;

import com.victortoader.angajati.client.controller.EmployeeController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 286868 on 3/3/2016.
 * <p/>
 * Tot ce tine de 'display'. Layout, butoane, tabele reactie la interactiune strict vizuala.
 * Interactiunea cu server-ul sau interactiune care genereaza alte efecte este deja comportament si ar
 * trebui sa fie in controller.
 */
public class EmployeeView {

    JTextField TxtNume;
    JTextField TxtPrenume;
    JTextField TxtSalariu;
    JTextField TxtAdresa;
    JTextField Id;

    JLabel LBNume = new JLabel("Nume:");
    JLabel LBPrenume = new JLabel("Prenume:");
    JLabel LBSalariu = new JLabel("Salariu:");
    JLabel LBAdresa = new JLabel("Adresa:");
    JLabel LBId = new JLabel("Id:");
    JLabel LBPOza=new JLabel("Poza angajat:");

    JButton ButRefresh=new JButton("Refresh");
    JButton ButAdauga=new JButton("Adauga");
    JButton ButSterge=new JButton("Sterge");
    JButton ButEditeaza=new JButton("Editeaza");
    JButton ButExport=new JButton("Exporta XML");
    JButton ButImport=new JButton("Importa XML");

    JTable TableAngajati=new JTable();



    EmployeeController controller;

    public void init() {
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

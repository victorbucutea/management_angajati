package com.victortoader.angajati.client.view;


import com.victortoader.angajati.client.controller.EmployeeController;
import com.victortoader.angajati.client.model.Employee;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * Created by Administrator on 10/21/2015.
 */
public class UpPanel extends JPanel {

    //private UserDao userDao;

    ScrollPane userpanel = new ScrollPane();

    JButton butInsert = new JButton("Add New");
    JLabel lbId = new JLabel("Employee ID:");
    JLabel lbName = new JLabel("Name:");
    JLabel lbFirstName = new JLabel("FirstName:");
    JLabel lbSalary = new JLabel("Salary:");
    JLabel lbAdress = new JLabel("Adress:");
    JLabel lbPicture = new JLabel("Picture:");

    public JTextField tfId = new JTextField(2);
    public JTextField tfName = new JTextField(10);
    public JTextField tfFirstName = new JTextField(10);
    public JTextField tfSalary = new JTextField(10);
    public JTextField tfAdress = new JTextField(10);

    JLabel lbStatus = new JLabel();

    JButton butDelete = new JButton("Delete");
    JButton butShow = new JButton("Show");
    JButton butUpdate = new JButton("Update");
    JButton butRefresh = new JButton("Refresh");
    JButton ButExport = new JButton("XML Export");
    JButton ButImport = new JButton("XML Import");


    UpPanel() {
        // add(new JLabel("user goes here"));
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.GREEN));
        add(butInsert, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));

        add(lbId, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfId, new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbName, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfName, new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbFirstName, new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfFirstName, new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbFirstName, new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfFirstName, new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbSalary, new GridBagConstraints(1, 5, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfSalary, new GridBagConstraints(2, 5, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbAdress, new GridBagConstraints(1, 6, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfAdress, new GridBagConstraints(2, 6, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));

        add(lbPicture, new GridBagConstraints(5, 1, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));

        add(butDelete, new GridBagConstraints(1, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(butShow, new GridBagConstraints(1, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(butShow, new GridBagConstraints(2, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0)); // !!!
        add(butUpdate, new GridBagConstraints(3, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(butRefresh, new GridBagConstraints(4, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(ButImport, new GridBagConstraints(5, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(ButExport, new GridBagConstraints(6, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));

        add(lbStatus, new GridBagConstraints(8, 1, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));


        butInsert.setActionCommand("insert");
        butDelete.setActionCommand("delete");
        butShow.setActionCommand("show");
        butInsert.setActionCommand("creaza");
        butUpdate.setActionCommand("update");
        butRefresh.setActionCommand("refresh");
//        butInsert.addActionListener(new ButtonClickListener());
//        butDelete.addActionListener(new ButtonClickListener());
//        butShow.addActionListener(new ButtonClickListener());
//        butUpdate.addActionListener(new ButtonClickListener());

//        userDao = new UserDaoJdbc();
//        userDao = new UserDaoHibernate();
    }

//    private class ButtonClickListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            String command = e.getActionCommand();
//            if (command.equals("insert")) {
//
//                EmployeeController.addNewEmployee(tfName.getText(), tfFirstName.getText(), Integer.parseInt(tfSalary.getText()), tfAdress.getText());
//                lbStatus.setText("Userul s-a creat.");
//
//                //   insert
//                try {
//                    userDao.insertEmployee(user);
//                    JDBCInsert.insertEmployee(user, getConnection());
//                    ((AbstractTableModel) table.getModel()).fireTableCellUpdated(0, 0);
//                } catch (SQLException e1) {
//                    System.out.print(e1);
//                }
//                table.repaint();
//
//
//            } else if (command.equals("sterge")) {
//
//                try {
//                    userDao.deleteEmployee(Long.parseLong(tfId.getText()));
//
//                } catch (SQLException e1) {
//                    System.out.println(e1);
//                }
//                table.repaint();
//                lbStatus.setText("Inregistrarea s-a sters.");
//            } else {
//                if (command.equals("afiseaza")) {
//                    User user = null;
//                    tfSalary.setText("");
//                    tfFirstName.setText("");
//                    tfAdress.setText("");
//                    tfName.setText("");
//
//                    try {
//                        user = userDao.getUser(Long.parseLong(tfId.getText()));
//
//                    } catch (SQLException e1) {
//                        System.out.println(e1);
//                    }
//                    if (user == null) {
//                        lbStatus.setText("Userul nu exista");
//                    } else {
//                        tfSalary.setText(user.getFullName());
//                        tfFirstName.setText(user.getPassword());
//                        tfAdress.setText(user.getEmail());
//                        tfName.setText(user.getUserName());
//
//                        lbStatus.setText("Userul s-a afisat");
//                    }
//
//
//                } else if (command.equals("creaza")) {
//                    lbStatus.setText("creaza");
//
//
//                } else if (command.equals("populeaza")) {
//                    try {
//                        new UsersPanel().table.setModel(JDBCDAO.buildTableModel(UsersPanel.Populatetable()));
//
//                    } catch (SQLException e1) {
//                        System.out.print(e1);
//                    }
//                    table.setSelectionModel(javax.swing.ListSelectionModel.SINGLE_SELECTION);
//                    JButton button = new JButton("delete");
//                    lbStatus.setText("Tabela s-a populat");
//                } else if (command.equals("modifica")) {
//                    User user = new User();
//
//
//                    user.setId(Long.parseLong(tfId.getText()));
//                    user.setFullName(tfSalary.getText());
//                    user.setPassword(tfFirstName.getText());
//                    user.setEmail(tfAdress.getText());
//                    user.setUserName(tfName.getText());
//                    try {
//                        userDao.updateUser(user);
//                    } catch (SQLException e1) {
//                        System.out.println(e1);
//                    }
//                    table.repaint();
//                    lbStatus.setText("modificarea s-a efectuat");
//                } else {
//                    lbStatus.setText("or else");
//                }
//            }
//        }
//
//
//    }


}


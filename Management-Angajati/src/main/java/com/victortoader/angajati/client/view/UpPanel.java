package com.victortoader.angajati.client.view;




import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 10/21/2015.
 */
class UpPanel extends JPanel {

    //private UserDao userDao;

    ScrollPane userpanel = new ScrollPane();

    JButton butInsert = new JButton("Insereaza");
    JLabel lbId = new JLabel("Employee ID:");
    JLabel lbNume = new JLabel("Nume:");
    JLabel lbPrenume = new JLabel("Prenume:");
    JLabel lbSalariu = new JLabel("Salariu:");
    JLabel lbAdresa = new JLabel("Adresa:");
    JLabel lbPoza = new JLabel("Poza:");

    JTextField tfId = new JTextField(2);
    JTextField tfNume = new JTextField(10);
    JTextField tfPrenume = new JTextField(10);
    JTextField tfSalariu = new JTextField(10);
    JTextField tfAdresa = new JTextField(10);

    JLabel lbStatus = new JLabel();

    JButton butSterge = new JButton("Sterge");
    JButton butAfiseaza = new JButton("Afiseaza");
    JButton butModifica = new JButton("Modifica");
    JButton butRefresh = new JButton("Refresh");
    JButton ButExport = new JButton("Exporta XML");
    JButton ButImport = new JButton("Importa XML");


    UpPanel() {
        // add(new JLabel("user goes here"));
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.GREEN));
        add(butInsert, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));

        add(lbId, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfId, new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbNume, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfNume, new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbPrenume, new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfPrenume, new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbPrenume, new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfPrenume, new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbSalariu, new GridBagConstraints(1, 5, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfSalariu, new GridBagConstraints(2, 5, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(lbAdresa, new GridBagConstraints(1, 6, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(tfAdresa, new GridBagConstraints(2, 6, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));

        add(lbPoza, new GridBagConstraints(5, 1, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));

        add(butSterge, new GridBagConstraints(1, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(butAfiseaza, new GridBagConstraints(1, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(butAfiseaza, new GridBagConstraints(2, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(butModifica, new GridBagConstraints(3, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(butRefresh, new GridBagConstraints(4, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(ButImport, new GridBagConstraints(5, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 20, 0, 0), 0, 0));
        add(ButExport, new GridBagConstraints(6, 7, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));

        add(lbStatus, new GridBagConstraints(8, 1, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));


        butInsert.setActionCommand("insert");
        butSterge.setActionCommand("sterge");
        butAfiseaza.setActionCommand("afiseaza");
        //  buttoncreaza.setActionCommand("creaza");
        butModifica.setActionCommand("modifica");
        butRefresh.setActionCommand("populeaza");
//        butInsert.addActionListener(new ButtonClickListener());
//        butSterge.addActionListener(new ButtonClickListener());
//        butAfiseaza.addActionListener(new ButtonClickListener());
//        butModifica.addActionListener(new ButtonClickListener());
//
//        userDao = new UserDaoJdbc();
////        userDao = new UserDaoHibernate();
    }

//    private class ButtonClickListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            String command = e.getActionCommand();
//            if (command.equals("insert")) {
//                lbStatus.setText("Userul s-a inserat.");
//                User user = new User();
//                user.setUserName(tfNume.getText());
//                user.setPassword(tfPrenume.getText());
//                user.setFullName(tfSalariu.getText());
//                user.setEmail(tfAdresa.getText());
//
//                //insert
//                try {
//                    userDao.insertUser(user);
//                    // JDBCInsert.insertUser(user, getConnection());
//                    // ((AbstractTableModel)table.getModel()).fireTableCellUpdated(0,0);
//                } catch (SQLException e1) {
//                    System.out.print(e1);
//                }
//                //   table.repaint();
//
//
//            } else if (command.equals("sterge")) {
//
//                try {
//                    userDao.deleteUser(Long.parseLong(tfId.getText()));
//
//                } catch (SQLException e1) {
//                    System.out.println(e1);
//                }
//                //  table.repaint();
//                lbStatus.setText("Inregistrarea s-a sters.");
//            } else {
//                if (command.equals("afiseaza")) {
//                    User user = null;
//                    tfSalariu.setText("");
//                    tfPrenume.setText("");
//                    tfAdresa.setText("");
//                    tfNume.setText("");
//
//                    try {
//                        user = userDao.getUser(Long.parseLong(tfId.getText()));
//
//                    } catch (SQLException e1) {
//                        System.out.println(e1);
//                    }
//                    if (user==null) {
//                        lbStatus.setText("Userul nu exista");
//                    } else {
//                        tfSalariu.setText(user.getFullName());
//                        tfPrenume.setText(user.getPassword());
//                        tfAdresa.setText(user.getEmail());
//                        tfNume.setText(user.getUserName());
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
//                    // table.setSelectionModel(javax.swing.ListSelectionModel.SINGLE_SELECTION);
////                    JButton button=new JButton("delete");
//                    lbStatus.setText("Tabela s-a populat");
//                } else if (command.equals("modifica")) {
//                    User user = new User();
//
//
//                    user.setId(Long.parseLong(tfId.getText()));
//                    user.setFullName(tfSalariu.getText());
//                    user.setPassword(tfPrenume.getText());
//                    user.setEmail(tfAdresa.getText());
//                    user.setUserName(tfNume.getText());
//                    try {
//                        userDao.updateUser(user);
//                    } catch (SQLException e1) {
//                        System.out.println(e1);
//                    }
//                    //  table.repaint();
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


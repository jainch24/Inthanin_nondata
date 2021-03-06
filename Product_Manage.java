/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.myapp;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author madmm
 */
public class Product_Manage extends javax.swing.JFrame {

    /**
     * Creates new form Product_Manage
     */
    static String name;
    static String pid;
    static String empid;
    static String logid;
    static String type;

    public Product_Manage() {
        initComponents();
        setTable();
        getTime();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        TextField_search = new javax.swing.JTextField();
        Label_name = new javax.swing.JLabel();
        Button_search = new javax.swing.JButton();
        Combo_type = new javax.swing.JComboBox<>();
        Label_type = new javax.swing.JLabel();
        Button_add = new javax.swing.JButton();
        Button_edit = new javax.swing.JButton();
        Button_rm = new javax.swing.JButton();
        Button_show = new javax.swing.JButton();
        Button_exit = new javax.swing.JButton();
        Label_partner = new javax.swing.JLabel();
        TextField_partner = new javax.swing.JTextField();
        Label_emp = new javax.swing.JLabel();
        Label_date = new javax.swing.JLabel();
        Label_time = new javax.swing.JLabel();
        TextField_time = new javax.swing.JTextField();
        TextField_date = new javax.swing.JTextField();
        TextField_emp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        TextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_searchActionPerformed(evt);
            }
        });

        Label_name.setText("Product Name");

        Button_search.setText("Search");
        Button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_searchActionPerformed(evt);
            }
        });

        Combo_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages", "Bakery", "Etc." }));
        Combo_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_typeActionPerformed(evt);
            }
        });

        Label_type.setText("Product Type");

        Button_add.setText("Add");
        Button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_addActionPerformed(evt);
            }
        });

        Button_edit.setText("Edit");
        Button_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_editActionPerformed(evt);
            }
        });

        Button_rm.setText("Remove");
        Button_rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_rmActionPerformed(evt);
            }
        });

        Button_show.setText("Show all");
        Button_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_showActionPerformed(evt);
            }
        });

        Button_exit.setText("back");
        Button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_exitActionPerformed(evt);
            }
        });

        Label_partner.setText("Partner: ");

        TextField_partner.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_search))
                    .addComponent(Label_type)
                    .addComponent(Label_name)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_show))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Label_partner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_partner)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_name)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_search))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_show)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_partner, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_partner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label_emp.setText("Employee:");

        Label_date.setText("Date:");

        Label_time.setText("Time:");

        TextField_time.setEditable(false);

        TextField_date.setEditable(false);
        TextField_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_dateActionPerformed(evt);
            }
        });

        TextField_emp.setEditable(false);
        TextField_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_empActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_emp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_emp)
                        .addGap(189, 189, 189)
                        .addComponent(Label_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label_time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_time, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_time)
                    .addComponent(Label_date)
                    .addComponent(Label_emp)
                    .addComponent(TextField_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void getPartner(String partner){
        try {

                MongoClient mongo = new MongoClient("localhost", 27017);

                DB db = mongo.getDB("inthanin");

                DBCollection coll = db.getCollection("MS_Partner");
                BasicDBObject searchQuery = new BasicDBObject();
                searchQuery.put("MS_Partner_Type", partner);
                DBCursor cursor = coll.find(searchQuery);

                while (cursor.hasNext()) {
                    DBObject obj = cursor.next();
                    String id = (String) obj.get("MS_Partner_Id");
                    String name = (String) obj.get("MS_Partner_Name");
                    TextField_partner.setText(id+" "+name);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    private void Combo_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_typeActionPerformed
        String chose = (String) Combo_type.getSelectedItem();
        if (chose.equals("All")) {
            System.out.println("ok 0");
            try {

                MongoClient mongo = new MongoClient("localhost", 27017);

                DB db = mongo.getDB("inthanin");

                DBCollection coll = db.getCollection("MS_Product");
                DBCursor cursor = coll.find();

                String[] coln = {"id", "name", "unit", "price", "type"};
                DefaultTableModel model = new DefaultTableModel(coln, 0) {
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }

                };
                while (cursor.hasNext()) {
                    DBObject obj = cursor.next();
                    String id = (String) obj.get("MS_Product_Id");
                    String name = (String) obj.get("MS_Product_Name");
                    String unit = (String) obj.get("MS_Product_Unit");
                    String price = (String) obj.get("MS_Product_Price");
                    String type = (String) obj.get("MS_Product_Type");
                    model.addRow(new Object[]{id, name, unit, price, type});
                }
                jTable1.setModel(model);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (chose.equals("Beverages")) {
            System.out.println("ok 1");
            getPartner("Beverages");
            try {

                MongoClient mongo = new MongoClient("localhost", 27017);

                DB db = mongo.getDB("inthanin");

                DBCollection coll = db.getCollection("MS_Product");
                BasicDBObject searchQuery = new BasicDBObject();

                searchQuery.put("MS_Product_Type", "Beverages");
                DBCursor cursor = coll.find(searchQuery);

                String[] coln = {"id", "name", "unit", "price"};
                DefaultTableModel model = new DefaultTableModel(coln, 0) {
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }

                };
                while (cursor.hasNext()) {
                    DBObject obj = cursor.next();
                    String id = (String) obj.get("MS_Product_Id");
                    String name = (String) obj.get("MS_Product_Name");
                    String unit = (String) obj.get("MS_Product_Unit");
                    String price = (String) obj.get("MS_Product_Price");
                    model.addRow(new Object[]{id, name, unit, price});
                }
                jTable1.setModel(model);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (chose.equals("Bakery")) {
            System.out.println("ok 2");
            getPartner("Bakery");
            try {
                MongoClient mongo = new MongoClient("localhost", 27017);

                DB db = mongo.getDB("inthanin");

                DBCollection coll = db.getCollection("MS_Product");
                BasicDBObject searchQuery = new BasicDBObject();

                searchQuery.put("MS_Product_Type", "Bakery");
                DBCursor cursor = coll.find(searchQuery);

                String[] coln = {"id", "name", "unit", "price"};
                DefaultTableModel model = new DefaultTableModel(coln, 0) {
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                while (cursor.hasNext()) {
                    DBObject obj = cursor.next();
                    String id = (String) obj.get("MS_Product_Id");
                    String name = (String) obj.get("MS_Product_Name");
                    String unit = (String) obj.get("MS_Product_Unit");
                    String price = (String) obj.get("MS_Product_Price");
                    model.addRow(new Object[]{id, name, unit, price});
                }
                jTable1.setModel(model);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (chose.equals("Etc.")) {
            System.out.println("ok 3");
            getPartner("Etc");
            try {
                MongoClient mongo = new MongoClient("localhost", 27017);

                DB db = mongo.getDB("inthanin");

                DBCollection coll = db.getCollection("MS_Product");
                BasicDBObject searchQuery = new BasicDBObject();

                searchQuery.put("MS_Product_Type", "Etc");
                DBCursor cursor = coll.find(searchQuery);

                String[] coln = {"id", "name", "unit", "price"};
                DefaultTableModel model = new DefaultTableModel(coln, 0) {
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                while (cursor.hasNext()) {
                    DBObject obj = cursor.next();
                    String id = (String) obj.get("MS_Product_Id");
                    String name = (String) obj.get("MS_Product_Name");
                    String unit = (String) obj.get("MS_Product_Unit");
                    String price = (String) obj.get("MS_Product_Price");
                    model.addRow(new Object[]{id, name, unit, price});
                }
                jTable1.setModel(model);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {

                    JTable target = (JTable) e.getSource();

                    int selectedRow = target.getSelectedRow();
                    int selectedColumn = target.getSelectedColumn();

                    System.out.println("Selected row " + " " + selectedRow);
                    System.out.println("Selected column" + " " + selectedColumn);

                    Object selectedCellValue = target.getValueAt(selectedRow, selectedColumn);
                    pid = (String) selectedCellValue;
                    System.out.println("selectedCellValue " + " " + pid);

                }
            }
        });
    }//GEN-LAST:event_Combo_typeActionPerformed

    private void Button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_searchActionPerformed
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);

            DB db = mongo.getDB("inthanin");

            DBCollection coll = db.getCollection("MS_Product");
            BasicDBObject searchQuery = new BasicDBObject();

            searchQuery.put("MS_Product_Name", name);
            DBCursor cursor = coll.find(searchQuery);

            String[] coln = {"id", "name", "unit", "price", "type"};
            DefaultTableModel model = new DefaultTableModel(coln, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String id = (String) obj.get("MS_Product_Id");
                String name = (String) obj.get("MS_Product_Name");
                String unit = (String) obj.get("MS_Product_Unit");
                String price = (String) obj.get("MS_Product_Price");
                String type = (String) obj.get("MS_Product_Type");
                model.addRow(new Object[]{id, name, unit, price, type});
            }
            jTable1.setModel(model);
            jTable1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 1) {

                        JTable target = (JTable) e.getSource();

                        int selectedRow = target.getSelectedRow();
                        int selectedColumn = target.getSelectedColumn();

                        System.out.println("Selected row " + " " + selectedRow);
                        System.out.println("Selected column" + " " + selectedColumn);

                        Object selectedCellValue = target.getValueAt(selectedRow, selectedColumn);
                        pid = (String) selectedCellValue;
                        System.out.println("selectedCellValue " + " " + pid);

                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Button_searchActionPerformed

    private void TextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_searchActionPerformed
        name = TextField_search.getText();
        Button_search.requestFocus();
    }//GEN-LAST:event_TextField_searchActionPerformed

    private void Button_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_editActionPerformed
        try {
            Product_Edit pe = new Product_Edit();
            pe.setVisible(true);
            pe.getpid(pid);

        } catch (Exception e) {

        }

    }//GEN-LAST:event_Button_editActionPerformed

    private void Button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_addActionPerformed
        new Product_Add().setVisible(true);
    }//GEN-LAST:event_Button_addActionPerformed

    public void setTable() {
        try {

            MongoClient mongo = new MongoClient("localhost", 27017);

            DB db = mongo.getDB("inthanin");

            DBCollection coll = db.getCollection("MS_Product");
            DBCursor cursor = coll.find();

            String[] coln = {"id", "name", "unit", "price", "type"};
            DefaultTableModel model = new DefaultTableModel(coln, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String id = (String) obj.get("MS_Product_Id");
                String name = (String) obj.get("MS_Product_Name");
                String unit = (String) obj.get("MS_Product_Unit");
                String price = (String) obj.get("MS_Product_Price");
                String type = (String) obj.get("MS_Product_Type");
                model.addRow(new Object[]{id, name, unit, price, type});
            }
            jTable1.setModel(model);
            jTable1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 1) {

                        JTable target = (JTable) e.getSource();

                        int selectedRow = target.getSelectedRow();
                        int selectedColumn = target.getSelectedColumn();

                        System.out.println("Selected row " + " " + selectedRow);
                        System.out.println("Selected column" + " " + selectedColumn);

                        Object selectedCellValue = target.getValueAt(selectedRow, selectedColumn);
                        pid = (String) selectedCellValue;
                        System.out.println("selectedCellValue " + " " + pid);

                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {

                    JTable target = (JTable) e.getSource();

                    int selectedRow = target.getSelectedRow();
                    int selectedColumn = target.getSelectedColumn();

                    System.out.println("Selected row " + " " + selectedRow);
                    System.out.println("Selected column" + " " + selectedColumn);

                    Object selectedCellValue = target.getValueAt(selectedRow, selectedColumn);
                    pid = (String) selectedCellValue;
                    System.out.println("selectedCellValue " + " " + pid);

                }
            }
        });
    }
    private void Button_rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_rmActionPerformed
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);

            DB db = mongo.getDB("inthanin");

            DBCollection coll = db.getCollection("MS_Product");
            BasicDBObject searchQuery = new BasicDBObject();

            System.out.println(pid);
            searchQuery.put("MS_Product_Id", pid);

            WriteResult result = coll.remove(searchQuery);
            System.out.println("Number of documents are deleted : " + result.getN());
            if (result.getN() < 1) {
                System.out.println("Please select Id column.");
                JOptionPane.showMessageDialog(this, "Please select Id column.");
            } else {
                JOptionPane.showMessageDialog(this, "Remove now.");
                setTable();
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_Button_rmActionPerformed

    private void Button_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_showActionPerformed
        setTable();

    }//GEN-LAST:event_Button_showActionPerformed

    private void TextField_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_dateActionPerformed

    }//GEN-LAST:event_TextField_dateActionPerformed

    private void Button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_exitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_Button_exitActionPerformed

    private void TextField_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_empActionPerformed

    public void getTime() {
        Date d = new Date();
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
                SimpleDateFormat t = new SimpleDateFormat("YYYY-MM-dd");
                TextField_date.setText(t.format(d));
                TextField_time.setText(s.format(d));
            }
        }).start();

    }

    public void getid(String id, String loginid) {
        empid = id;
        logid = loginid;
        System.out.println(empid + " " + logid);
        getemp();

    }

    public void getemp() {

        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("inthanin");
            DBCollection table = db.getCollection("MS_Employee");
            BasicDBObject document = new BasicDBObject();
            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("MS_Employee_Id", empid);
            DBCursor cursor = table.find(searchQuery);
            if (cursor.hasNext() == true) {
                for (DBObject a : cursor) {
                    System.out.println(cursor.next());
                    String fname = (String) a.get("MS_Employee_Fname");
                    String lname = (String) a.get("MS_Employee_Lname");
                    type = (String) a.get("MS_Employee_Type");
                    name = lname + " " + fname + " (" + type + ")";
                    TextField_emp.setText(name);
                }
            } else {
                System.out.println("Please select id");
            }

        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Manage().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add;
    private javax.swing.JButton Button_edit;
    private javax.swing.JButton Button_exit;
    private javax.swing.JButton Button_rm;
    private javax.swing.JButton Button_search;
    private javax.swing.JButton Button_show;
    private javax.swing.JComboBox<String> Combo_type;
    private javax.swing.JLabel Label_date;
    private javax.swing.JLabel Label_emp;
    private javax.swing.JLabel Label_name;
    private javax.swing.JLabel Label_partner;
    private javax.swing.JLabel Label_time;
    private javax.swing.JLabel Label_type;
    private javax.swing.JTextField TextField_date;
    private javax.swing.JTextField TextField_emp;
    private javax.swing.JTextField TextField_partner;
    private javax.swing.JTextField TextField_search;
    private javax.swing.JTextField TextField_time;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

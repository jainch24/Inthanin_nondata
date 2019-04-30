/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.myapp;

import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPTable;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author madmm
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    static String menuid;
    static String username;

    static double total_price = 0;
    static String month;

    List<DBObject> list = new ArrayList<>();
    static int countno = 1;

    static String cusid;
    static String date;
    static String ol_id;
    //for header
    static String name;
    static String empid;
    static String logid;
    static String type;
    //for preview
    Font TopFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    Font Topic = new Font(Font.FontFamily.COURIER, 24, Font.BOLD);
    Font Bold = new Font(Font.FontFamily.COURIER, 18, Font.BOLD);
    Font minimal = new Font(Font.FontFamily.COURIER, 8, Font.BOLD);
    Font normal = new Font(Font.FontFamily.COURIER, 15, Font.NORMAL);
    
    PdfPTable table = new PdfPTable(6);
    
    public Report() {
        initComponents();
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

        Label_time = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Label_total = new javax.swing.JLabel();
        TextField_total = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Button_exit = new javax.swing.JButton();
        Combo_type = new javax.swing.JComboBox<>();
        Label_type = new javax.swing.JLabel();
        Button_show = new javax.swing.JButton();
        Label_emp = new javax.swing.JLabel();
        Label_date = new javax.swing.JLabel();
        TextField_emp = new javax.swing.JTextField();
        TextField_date = new javax.swing.JTextField();
        TextField_time = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_time.setText("Time:");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        Label_total.setText("Total:");

        TextField_total.setEditable(false);
        TextField_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_total)
                        .addGap(18, 18, 18)
                        .addComponent(TextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_total)
                    .addComponent(TextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        Button_exit.setText("back");
        Button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_exitActionPerformed(evt);
            }
        });

        Combo_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        Combo_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_typeActionPerformed(evt);
            }
        });

        Label_type.setText("Month in 2019");

        Button_show.setText("Show all");
        Button_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_show))
                    .addComponent(Label_type))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Button_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Label_type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_show))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label_emp.setText("Employee:");

        Label_date.setText("Date:");

        TextField_emp.setEditable(false);
        TextField_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_empActionPerformed(evt);
            }
        });

        TextField_date.setEditable(false);
        TextField_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_dateActionPerformed(evt);
            }
        });

        TextField_time.setEditable(false);
        TextField_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_timeActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextField_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Label_time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextField_time, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextField_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextField_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label_time)
                        .addComponent(Label_date))
                    .addComponent(Label_emp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_totalActionPerformed
        TextField_total.setText(String.valueOf(total_price));
    }//GEN-LAST:event_TextField_totalActionPerformed

    private void TextField_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_empActionPerformed

    private void TextField_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_dateActionPerformed

    }//GEN-LAST:event_TextField_dateActionPerformed

    private void TextField_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_timeActionPerformed

    private void Combo_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_typeActionPerformed
        String chose = (String) Combo_type.getSelectedItem();
        setTable(chose);
    }//GEN-LAST:event_Combo_typeActionPerformed

    private void Button_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_showActionPerformed
        try {
            
            MongoClient mongo = new MongoClient("localhost", 27017);

            DB db = mongo.getDB("inthanin");

            DBCollection coll = db.getCollection("TRN_Order");

            String[] coln = {"id", "date", "totalprice", "cusid", "empid", "ol_id"};
            DefaultTableModel model = new DefaultTableModel(coln, 0);
            Object[] row = new Object[6];
            DBCursor cursor = coll.find();
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();

                row[0] = obj.get("TRN_Order_Id");
                row[1] = obj.get("TRN_Order_Date");
                row[2] = obj.get("TRN_Order_totalprice");
                row[3] = obj.get("MS_Customer_Id");
                row[4] = obj.get("MS_Employee_Id");
                row[5] = obj.get("TRN_Order_List_Id");
                model.addRow(row);
                total_price += Double.parseDouble(obj.get("TRN_Order_totalprice").toString());
                TextField_total.setText(String.valueOf(total_price));
                jTable2.setModel(model);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Button_showActionPerformed

    private void Button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_exitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_Button_exitActionPerformed

    public void setTable(String m) {
        try {

            System.out.print("Month is " + m);
            MongoClient mongo = new MongoClient("localhost", 27017);

            DB db = mongo.getDB("inthanin");

            DBCollection coll = db.getCollection("TRN_Order");

            String[] coln = {"id", "date", "totalprice", "cusid", "empid", "ol_id"};
            DefaultTableModel model = new DefaultTableModel(coln, 0);
            Object[] row = new Object[6];
            DBCursor cursor = coll.find();
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                if ((obj.get("TRN_Order_Date").toString().contains(m) && obj.get("TRN_Order_Date").toString().contains(LocalDate.now().toString().subSequence(0, 4)))) {

                    row[0] = obj.get("TRN_Order_Id");
                    row[1] = obj.get("TRN_Order_Date");
                    row[2] = obj.get("TRN_Order_totalprice");
                    row[3] = obj.get("MS_Customer_Id");
                    row[4] = obj.get("MS_Employee_Id");
                    row[5] = obj.get("TRN_Order_List_Id");
                    model.addRow(row);
                    total_price += Double.parseDouble(obj.get("TRN_Order_totalprice").toString());
                    TextField_total.setText(String.valueOf(total_price));
                    jTable2.setModel(model);
                } else {
                    model.setRowCount(0);
                    total_price = 0;
                    TextField_total.setText(String.valueOf(total_price));
                    jTable2.setModel(model);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

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
                JOptionPane.showMessageDialog(this, "Please select the id");
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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_exit;
    private javax.swing.JButton Button_show;
    private javax.swing.JComboBox<String> Combo_type;
    private javax.swing.JLabel Label_date;
    private javax.swing.JLabel Label_emp;
    private javax.swing.JLabel Label_time;
    private javax.swing.JLabel Label_total;
    private javax.swing.JLabel Label_type;
    private javax.swing.JTextField TextField_date;
    private javax.swing.JTextField TextField_emp;
    private javax.swing.JTextField TextField_time;
    private javax.swing.JTextField TextField_total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
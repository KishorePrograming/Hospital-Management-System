/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Entities;
import RedirectUserType.MainDoctor;
import java.sql.ResultSetMetaData;
import home_page.Login;
import static java.awt.Color.blue;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 91979
 */
public class Doctor extends javax.swing.JFrame {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private String usertype;
    private int id;
    private String username;
    /**
     * Creates new form Patient
     */
    public Doctor(){
      initComponents(); 
    }
    public Doctor(int id, String username, String usertype,Connection con) {
        initComponents();
        this.con=con;
        this.id=id;
        this.username=username;
        this.usertype=usertype;
        autoId();
        doctorTable();
        txtdname.requestFocus();
        btnUpdate.setEnabled(false);
        btndelete.setEnabled(false);
        lbllogid.setText(Integer.toString(this.id));
        lblusername.setText(username);
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbldno = new javax.swing.JLabel();
        txtdname = new javax.swing.JTextField();
        txtspl = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtqualification = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtchennalfee = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtroomno = new javax.swing.JSpinner();
        btnlogout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbllogid = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctor Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Doctor No");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Doctor Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 74, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Specialization");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 115, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Qualification");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 156, -1, -1));

        lbldno.setBackground(new java.awt.Color(51, 102, 255));
        lbldno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbldno.setForeground(new java.awt.Color(0, 102, 255));
        lbldno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbldno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbldno, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 23, 124, 33));

        txtdname.setBackground(new java.awt.Color(102, 255, 204));
        txtdname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtdname.setForeground(new java.awt.Color(0, 51, 255));
        jPanel2.add(txtdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 74, 234, -1));

        txtspl.setBackground(new java.awt.Color(102, 255, 204));
        txtspl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtspl.setForeground(new java.awt.Color(0, 51, 255));
        jPanel2.add(txtspl, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 115, 234, -1));

        btnadd.setBackground(new java.awt.Color(0, 102, 255));
        btnadd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(102, 255, 204));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel2.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 75, 38));

        btndelete.setBackground(new java.awt.Color(0, 102, 255));
        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(102, 255, 204));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 75, 38));

        btnUpdate.setBackground(new java.awt.Color(0, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(102, 255, 204));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 80, 38));

        btnClear.setBackground(new java.awt.Color(0, 102, 255));
        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(102, 255, 204));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 75, 38));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Chennal fee");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, -1));

        txtqualification.setBackground(new java.awt.Color(102, 255, 204));
        txtqualification.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtqualification.setForeground(new java.awt.Color(0, 51, 255));
        jPanel2.add(txtqualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 156, 234, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Phone");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Room No");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtchennalfee.setBackground(new java.awt.Color(102, 255, 204));
        txtchennalfee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtchennalfee.setForeground(new java.awt.Color(0, 51, 255));
        jPanel2.add(txtchennalfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 234, -1));

        txtphone.setBackground(new java.awt.Color(102, 255, 204));
        txtphone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtphone.setForeground(new java.awt.Color(0, 51, 255));
        jPanel2.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 234, -1));

        txtroomno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtroomno.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        txtroomno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtroomno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtroomnoFocusLost(evt);
            }
        });
        txtroomno.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtroomnoCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtroomnoInputMethodTextChanged(evt);
            }
        });
        jPanel2.add(txtroomno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        btnlogout.setBackground(new java.awt.Color(153, 255, 255));
        btnlogout.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(0, 102, 102));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left.png"))); // NOI18N
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        tblPatient.setBackground(new java.awt.Color(153, 255, 255));
        tblPatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblPatient.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblPatient.setForeground(new java.awt.Color(255, 102, 102));
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor No", "Doctor Name", "Specialization", "Qualification", "Chennel fee", "Phone", "Room No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPatient.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblPatient.setSelectionForeground(new java.awt.Color(0, 0, 255));
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPatient);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("Founded By Kishore R");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("Doctor Registration");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 255));
        jLabel10.setText("log id: ");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 255, 255));
        jLabel11.setText("User name:");

        lbllogid.setBackground(new java.awt.Color(255, 255, 255));
        lbllogid.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        lbllogid.setForeground(new java.awt.Color(102, 255, 255));
        lbllogid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        lbllogid.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblusername.setBackground(new java.awt.Color(255, 255, 255));
        lblusername.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        lblusername.setForeground(new java.awt.Color(102, 255, 255));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        lblusername.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnlogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(lbllogid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel6)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbllogid, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnlogout)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void autoId(){
        try {
             Statement st = con.createStatement();
             rs = st.executeQuery("select MAX(Doctorno) from Doctor");
             rs.next();            
             rs.getString("MAX(Doctorno)");
             if(rs.getString("MAX(Doctorno)")==null){
                 lbldno.setText("DS001");
             }else{
                 long id = Long.parseLong(rs.getString("MAX(Doctorno)").substring(2, rs.getString("MAX(Doctorno)").length()));
                 id++;
                 lbldno.setText("DS"+String.format("%03d", id));
             }
             
        } catch (SQLException e) {
            System.out.println("Entities.Doctor.autoId()");
        }
    }
    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        System.gc();
        this.setVisible(false);
        new MainDoctor(this.id,this.username,this.usertype,con).setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed
   
    // all fields are entered or not it will check that functionality
    private boolean checkStatus(){       
        if(!lbldno.getText().equals("")&&
           !txtdname.getText().equals("")&&
           !txtspl.getText().equals("")&&
           !txtqualification.getText().equals("")&&
           !txtchennalfee.getText().equals("")&&
           !txtphone.getText().equals("")&&
           (!txtroomno.getValue().toString().equals("")||!txtroomno.getValue().equals(1))
                           )
        {
            return true;
        }else{
            return false;
        }
    }
    
    private void doctorTable(){
        try {
            pst = con.prepareStatement("select * from Doctor where log_id = ?");
            pst.setInt(1, this.id);
            rs = pst.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)tblPatient.getModel();
            df.setRowCount(0);
            
            while(rs.next()){
                Vector v = new Vector();
                for(int i=1;i<=c;i++){
                    v.add(rs.getString("Doctorno"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("special"));
                    v.add(rs.getString("qualification"));
                    v.add(rs.getString("channelfee"));
                    v.add(rs.getString("phone"));
                    v.add(rs.getString("room"));
                }
                df.addRow(v);
            }
            
            
        } catch (SQLException e) {
        }
    }
    public  boolean intCheckAllLables(){
    boolean flag = false;
    if(numCheck(txtchennalfee)){
    if(numCheck(txtphone)){
    if(numCheck(txtroomno)&&!txtroomno.getValue().toString().equals("0")){
        if(numCheck(txtchennalfee)&&(numCheck(txtphone))&&(numCheck(txtroomno)&&!txtroomno.getValue().toString().equals("0"))){
             return true;
        }else{
            JOptionPane.showMessageDialog(this,"Please Give correct Input");
            return false;
        }
                              
    }else{
    JOptionPane.showMessageDialog(this,"Please Give correct Input in Room No");
    txtroomno.setValue(0);
    txtroomno.requestFocus();
    return false;
    }
    }else{
    JOptionPane.showMessageDialog(this,"Please Give correct Input in Phone");
    txtphone.setText("");
    txtroomno.requestFocus();
    return false;
    }
    }else{
    JOptionPane.showMessageDialog(this,"Please Give correct Input in Chennal fee");
    txtchennalfee.setText("");
    txtroomno.requestFocus();
    return false;
    }
    }
    
    /**
     *
     * @param txt
     * @return
     */
    public boolean numCheck(JSpinner txt){
        boolean flag = false;
        String s = txt.getValue().toString();
        for(int i=0;i<s.length();i++){
            if('0'<=s.charAt(i)&&s.charAt(i)<='9'){
                flag=true;
            }else{
                flag= false;
            }
        }
        return flag;
    }
    
    public boolean numCheck(JLabel txt){
        boolean flag = false;
        String s = txt.getText();
        for(int i=0;i<s.length();i++){
            if('0'<=s.charAt(i)&&s.charAt(i)<='9'){
                flag=true;
            }else{
                flag= false;
            }
        }
        return flag;
    }
    public  boolean numCheck(JTextField txt){
        boolean flag = false;
        String s = txt.getText();
        for(int i=0;i<s.length();i++){
            if('0'<=s.charAt(i)&&s.charAt(i)<='9'){
                flag=true;
            }else{
                flag= false;
            }
        }
        return flag;
    }
       public  boolean numCheck3(JSpinner txt){
        boolean flag = false;
        String s = txt.getValue().toString();
        for(int i=0;i<s.length();i++){
            if('0'<=s.charAt(i)&&s.charAt(i)<='9'){
                flag=true;
            }else{
                flag= false;
            }
        }
        return flag;
    }
    private void tblPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientMouseClicked
        btnUpdate.setEnabled(true);
        btndelete.setEnabled(true);
        DefaultTableModel df = (DefaultTableModel)tblPatient.getModel();
        int selectIndex = tblPatient.getSelectedRow();
        lbldno.setText(df.getValueAt(selectIndex, 0).toString());
        txtdname.setText(df.getValueAt(selectIndex, 1).toString());
        txtspl.setText(df.getValueAt(selectIndex, 2).toString());
        txtqualification.setText(df.getValueAt(selectIndex, 3).toString());
        txtchennalfee.setText(df.getValueAt(selectIndex, 4).toString());
        txtphone.setText(df.getValueAt(selectIndex, 5).toString());
        txtroomno.setValue(Integer.parseInt(df.getValueAt(selectIndex, 6).toString()));
        btnadd.setEnabled(false);        
    }//GEN-LAST:event_tblPatientMouseClicked

    private void txtroomnoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtroomnoCaretPositionChanged

    }//GEN-LAST:event_txtroomnoCaretPositionChanged

    private void txtroomnoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtroomnoInputMethodTextChanged
     
    }//GEN-LAST:event_txtroomnoInputMethodTextChanged

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        autoId();
        //        lbldno,txtdname,txtspl,txtqualification,txtchennalfee1,txtphone,txtroomno
        txtdname.setText("");
        txtspl.setText("");
        txtqualification.setText("");
        txtchennalfee.setText("");
        txtphone.setText("");
        txtroomno.setValue(0);
        btndelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnadd.setEnabled(true);
        txtdname.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(checkStatus()==true){
            if(intCheckAllLables()){
                String dNo = lbldno.getText();
                String dName = txtdname.getText();
                String dSpl = txtspl.getText();
                String dqual = txtqualification.getText();
                String chFee = txtchennalfee.getText();
                String dPhone = txtphone.getText();
                String roomNo = txtroomno.getValue().toString();
                try {
                    pst = con.prepareStatement("Update Doctor set name=?, special=?, qualification=?, channelfee=?, phone=?, room=?, log_id=? where Doctorno=?");
                    //               pst = con.prepareStatement("Update patient set name=?, phone=?, address=? where patientno=?");
                    pst.setString(1, dName);
                    pst.setString(2, dSpl);
                    pst.setString(3, dqual);
                    pst.setString(4, chFee);
                    pst.setString(5, dPhone);
                    pst.setString(6, roomNo);
                    pst.setInt(7, this.id);
                    pst.setString(8, dNo);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Doctor Details Added Succussfully...");
                    doctorTable();
                    autoId();
                    txtdname.setText("");
                    txtspl.setText("");
                    txtqualification.setText("");
                    txtchennalfee.setText("");
                    txtphone.setText("");
                    txtroomno.setValue(0);
                    btndelete.setEnabled(false);
                    btnUpdate.setEnabled(false);
                    btnadd.setEnabled(true);
                    txtdname.requestFocus();
                } catch (SQLException ex) {
                    Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please fill Everything...");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        if(checkStatus()==true){
            if(numCheck(lbldno)==true){
                String pno = lbldno.getText();
                try {
                    pst = con.prepareStatement("delete from Doctor where Doctorno=?");
                    pst.setString(1, pno);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Doctor Information\nDetails Deleted Succussfully...");
                    autoId();
                    txtdname.setText("");
                    txtspl.setText("");
                    txtqualification.setText("");
                    txtchennalfee.setText("");
                    txtphone.setText("");
                    txtroomno.setValue(0);
                    btndelete.setEnabled(false);
                    btnUpdate.setEnabled(false);
                    btnadd.setEnabled(true);
                    txtdname.requestFocus();
                    doctorTable();
                } catch (SQLException ex) {
                    Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please fill Everything...");
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if(checkStatus()==true){
            if(intCheckAllLables()){
                String dNo = lbldno.getText();
                String dName = txtdname.getText();
                String dSpl = txtspl.getText();
                String dqual = txtqualification.getText();
                String chFee = txtchennalfee.getText();
                String dPhone = txtphone.getText();
                String roomNo = txtroomno.getValue().toString();
                try {
                    String sql = "insert into Doctor(Doctorno, name,special,qualification,channelfee,phone,room,log_id)values(?,?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, dNo);
                    pst.setString(2, dName);
                    pst.setString(3, dSpl);
                    pst.setString(4, dqual);
                    pst.setString(5, chFee);
                    pst.setString(6, dPhone);
                    pst.setString(7, roomNo);
                    pst.setInt(8, this.id);
                    int count = pst.executeUpdate();
                    if(0<count){
                        JOptionPane.showMessageDialog(this, "Doctor Details Added Succussfully...");
                        autoId();
                        lbldno.setText("");
                        txtdname.setText("");
                        txtspl.setText("");
                        txtqualification.setText("");
                        txtchennalfee.setText("");
                        txtphone.setText("");
                        txtroomno.setValue(0);
                        btndelete.setEnabled(false);
                        btnUpdate.setEnabled(false);
                        btnadd.setEnabled(true);
                        txtdname.requestFocus();
                        doctorTable();
                    }else{
                        JOptionPane.showMessageDialog(this, "Something went wrong...");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please fill Everything...");
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtroomnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtroomnoFocusLost
       if(numCheck3(txtroomno)){
           
       }else{
            JOptionPane.showMessageDialog(this, "Please enter correct value in RoomNo...");
       }
    }//GEN-LAST:event_txtroomnoFocusLost

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbldno;
    private javax.swing.JLabel lbllogid;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtchennalfee;
    private javax.swing.JTextField txtdname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtqualification;
    private javax.swing.JSpinner txtroomno;
    private javax.swing.JTextField txtspl;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CreationsAndView;
import java.sql.ResultSetMetaData;
import home_page.Login;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 91979
 */
public class ChannelCreation extends javax.swing.JFrame {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private String usertype;
    private int id;
    private String username;
    private String chNo;
    /**
     * Creates new form Patient
     */
    public ChannelCreation(){
      initComponents(); 
    }
    public ChannelCreation(int id, String username, String usertype,Connection con) {
        initComponents();
        this.con=con;
        this.id=id;
        this.username=username;
        this.usertype=usertype;
        lbllogid.setText(Integer.toString(this.id));
        lblusername.setText(username);
        autoId();
        loadDoctor();
        loadPatient();
        channelTable();
       }
       
    private void autoId(){
        try {
             Statement st = con.createStatement();
             rs = st.executeQuery("select MAX(channelno) from CHANNEL");
             rs.next();            
             rs.getString("MAX(channelno)");
             if(rs.getString("MAX(channelno)")==null){
                 lblChannelNo.setText("CH001");
             }else{
                 long id = Long.parseLong(rs.getString("MAX(channelno)").substring(2, rs.getString("MAX(channelno)").length()));
                 id++;
                 lblChannelNo.setText("CH"+String.format("%03d", id));
             }
             
        } catch (SQLException e) {
            System.out.println("Entities.ChannelCreation.autoId()");
        }
    }
    
    public class Doctor{
        private String id;
        private String name;
        public Doctor(String id,String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return name; 
        }
     }
    private void loadDoctor(){
        try {
            String sql = "Select * from Doctor";
            txtDoctor.removeAll();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                txtDoctor.addItem(new Doctor(rs.getString(1),rs.getString(2)));               
                }
        } catch (SQLException ex) {
            Logger.getLogger(ChannelCreation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public class Patient{
        private String id;
        private String name;
        public Patient(String id,String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return name; 
        }
     }
    private void loadPatient(){
        try {
            String sql = "Select * from Patient";
            txtPatient.removeAll();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                txtPatient.addItem(new Patient(rs.getString(1),rs.getString(2)));               
                }
        } catch (SQLException ex) {
            Logger.getLogger(ChannelCreation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnlogout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbllogid = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        creation = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblChannelNo = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JComboBox();
        txtPatient = new javax.swing.JComboBox();
        txtRoom = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbleChannel = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        btnlogout.setBackground(new java.awt.Color(153, 255, 255));
        btnlogout.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(0, 102, 102));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left.png"))); // NOI18N
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("Chennal Creation Page");

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

        creation.setBackground(new java.awt.Color(0, 255, 255));
        creation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Channel Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Patient Name");

        lblChannelNo.setBackground(new java.awt.Color(102, 255, 204));
        lblChannelNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblChannelNo.setForeground(new java.awt.Color(0, 51, 255));
        lblChannelNo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        btnCreate.setBackground(new java.awt.Color(51, 51, 255));
        btnCreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(0, 255, 204));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Doctor Name");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Channel No");

        txtDoctor.setBackground(new java.awt.Color(102, 255, 204));
        txtDoctor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDoctor.setForeground(new java.awt.Color(51, 51, 255));

        txtPatient.setBackground(new java.awt.Color(102, 255, 204));
        txtPatient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPatient.setForeground(new java.awt.Color(51, 51, 255));

        txtRoom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtRoom.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("Room No");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Channel Date");

        txtdate.setBackground(new java.awt.Color(102, 255, 204));
        txtdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtdate.setForeground(new java.awt.Color(51, 51, 255));
        txtdate.setToolTipText("");
        txtdate.setAlignmentX(10.0F);
        txtdate.setAlignmentY(10.0F);
        txtdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnCancel.setBackground(new java.awt.Color(51, 51, 255));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 255, 204));
        btnCancel.setText("Delete");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout creationLayout = new javax.swing.GroupLayout(creation);
        creation.setLayout(creationLayout);
        creationLayout.setHorizontalGroup(
            creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creationLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblChannelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDoctor, 0, 211, Short.MAX_VALUE)
                        .addComponent(txtPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creationLayout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(creationLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel12)
                    .addContainerGap(525, Short.MAX_VALUE)))
        );
        creationLayout.setVerticalGroup(
            creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creationLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblChannelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(creationLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(295, Short.MAX_VALUE)))
        );

        jtbleChannel.setBackground(new java.awt.Color(153, 255, 255));
        jtbleChannel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbleChannel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtbleChannel.setForeground(new java.awt.Color(0, 51, 255));
        jtbleChannel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Channel No", "Doctor Name", "Patient Name", "Room No", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbleChannel.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jtbleChannel.setSelectionForeground(new java.awt.Color(0, 0, 255));
        jtbleChannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbleChannelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbleChannel);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 255));
        jLabel8.setText("Channel Creation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnlogout)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel8)
                                .addGap(133, 133, 133)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(lbllogid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel6))))
                    .addComponent(creation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbllogid, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnlogout)))
                        .addGap(8, 8, 8)
                        .addComponent(creation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        System.gc();
        this.setVisible(false);
        Login.checkUserType(this.id,this.username,this.usertype,con);
    }//GEN-LAST:event_btnlogoutActionPerformed

    
    private boolean checkStatus(){
        return !txtRoom.getValue().toString().equals("0")&&!txtRoom.getValue().toString().equals("")&&txtdate.getDate() != null;
    }
    
    private void channelTable(){
        try {
            pst = con.prepareStatement("select * from Channel");
            rs = pst.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)jtbleChannel.getModel();
            df.setRowCount(0);
            while(rs.next()){
                Vector v = new Vector();
                for(int i=1;i<=c;i++){
                    v.add(rs.getString("channelno"));
                    v.add(rs.getString("doctorname"));
                    v.add(rs.getString("patientname"));
                    v.add(rs.getString("roomno"));
                    v.add(rs.getString("date"));
                     
                 }
                df.addRow(v);
            }
            } catch (SQLException e) {
        }
    }
    
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if(checkStatus()){
        String chNo = lblChannelNo.getText();
        Doctor d = (Doctor) txtDoctor.getSelectedItem();
        Patient p = (Patient) txtPatient.getSelectedItem();
        String roomNo = txtRoom.getValue().toString();
        SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormate.format(txtdate.getDate());
        try {
                String sql = "insert into Channel(channelno, doctorname, patientname, roomno, date)values(?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, chNo);
                pst.setString(2, d.id);
                pst.setString(3, p.id);
                pst.setString(4, roomNo);
                pst.setString(5, date);
                int count = pst.executeUpdate();  
                if(0<count){
                JOptionPane.showMessageDialog(this, "Chennal Created Succussfully...");
                autoId();
                channelTable();
                }else{
                    JOptionPane.showMessageDialog(this, "Something went wrong...");
                }
               } catch (SQLException ex) {
                Logger.getLogger(Entities.Doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please fill everything..");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if(0<=jtbleChannel.getSelectedRow()){
        System.gc();
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Cancel it ?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(response==JOptionPane.YES_OPTION){
           try {
                String sql = "delete from channel where channelno = ?";
                pst = con.prepareStatement(sql);
                pst.setString(1, chNo);
                int count = pst.executeUpdate();  
                if(0<count){
                JOptionPane.showMessageDialog(this, "Chennal Deleted Succussfully...");
                autoId();
                channelTable();
                }else{
                    JOptionPane.showMessageDialog(this, "Something went wrong...");
                }
               } catch (SQLException ex) {
                Logger.getLogger(Entities.Doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
         }else if(response==JOptionPane.NO_OPTION){
            
        }
        }else{
            JOptionPane.showMessageDialog(this, "Please select Row...");
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jtbleChannelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbleChannelMouseClicked
        DefaultTableModel df = (DefaultTableModel) jtbleChannel.getModel();
            
        int selectedIndex = jtbleChannel.getSelectedRow();
            
        chNo = df.getValueAt(selectedIndex, 0).toString();
        
        
    }//GEN-LAST:event_jtbleChannelMouseClicked
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
            java.util.logging.Logger.getLogger(ChannelCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChannelCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChannelCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChannelCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChannelCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel creation;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbleChannel;
    private javax.swing.JLabel lblChannelNo;
    private javax.swing.JLabel lbllogid;
    private javax.swing.JLabel lblusername;
    private javax.swing.JComboBox txtDoctor;
    private javax.swing.JComboBox txtPatient;
    private javax.swing.JSpinner txtRoom;
    private com.toedter.calendar.JDateChooser txtdate;
    // End of variables declaration//GEN-END:variables
}

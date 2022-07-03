
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Main(){
        initComponents();

        File adminFile = new File(System.getProperty("user.dir").toString() + "\\src\\files\\adminfile.txt");
        File studentFile = new File(System.getProperty("user.dir").toString() + "\\src\\files\\studentfile.txt");
        File teacherFile = new File(System.getProperty("user.dir").toString() + "\\src\\files\\teacherfile.txt");
        File currentFile = new File(System.getProperty("user.dir").toString()+"\\src\\files\\currentuser.txt");
        if(!adminFile.exists()){

            try{
                adminFile.createNewFile();
                Admin adm = new Admin("100","100","Admin");
                ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(adminFile));
                oos1.writeObject(adm);
                oos1.close();
            } catch (Exception e){
                System.out.println(e);
            }
        }
        if (!studentFile.exists()){
            try{
                studentFile.createNewFile();
                Student stud = new Student("208","Usman123!","Usman","CS");
                stud.assignCourse(new Course("DLD","D300"));
                stud.assignCourse(new Course("OOP","P400"));
                stud.assignCourse(new Course("STATS","P400"));
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(studentFile));
                oos.writeObject(stud);
                oos.close();
            } catch (Exception e){
                System.out.println(e);
            }
        }
        if(!teacherFile.exists()){
            try{
                teacherFile.createNewFile();
                Teacher teac = new Teacher("100","Twaha123!","Twaha","CS");
                teac.assignCourse(new Course("DLD","D300"));
                teac.assignCourse(new Course("OOP","P400"));
                teac.assignCourse(new Course("STATS","P400"));
                ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(teacherFile));
                oos2.writeObject(teac);
                oos2.close();
            } catch (Exception e){
                System.out.println(e);
            }
        }
        if(!currentFile.exists()){
            try{
                currentFile.createNewFile();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminRadio = new javax.swing.JRadioButton();
        teacherRadio = new javax.swing.JRadioButton();
        studentRadio = new javax.swing.JRadioButton();
        loginId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        invalidField = new javax.swing.JLabel();
        loginPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setBackground(new java.awt.Color(214,217,223));

        jPanel1.setBackground(new java.awt.Color(214,217,223));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Password:");

        buttonGroup1.add(adminRadio);
        adminRadio.setText("Admin");

        buttonGroup1.add(teacherRadio);
        teacherRadio.setText("Teacher");
        teacherRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(studentRadio);
        studentRadio.setText("Student");
        studentRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRadioActionPerformed(evt);
            }
        });

        loginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Role:");

        jButton1.setText("LOGIN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(40, 40, 40)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(loginId, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                                        .addComponent(loginPassword))
                                                .addGap(291, 291, 291))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(adminRadio)
                                                .addGap(36, 36, 36)
                                                .addComponent(teacherRadio)
                                                .addGap(45, 45, 45)
                                                .addComponent(studentRadio))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(77, Short.MAX_VALUE)
                                .addComponent(invalidField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(262, 262, 262))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(loginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(invalidField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(adminRadio)
                                        .addComponent(teacherRadio)
                                        .addComponent(studentRadio))
                                .addGap(39, 39, 39)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void loginIdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void teacherRadioActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void studentRadioActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        //loginId  loginPassword  adminRadio teacherRadio studentRadio invalidField.
        File adminFile = new File(System.getProperty("user.dir").toString() + "\\src\\files\\adminfile.txt");
        File studentFile = new File(System.getProperty("user.dir").toString() + "\\src\\files\\studentfile.txt");
        File teacherFile = new File(System.getProperty("user.dir").toString() + "\\src\\files\\teacherfile.txt");
        File currentFile = new File(System.getProperty("user.dir").toString() + "\\src\\files\\currentuser.txt");
        Student students[] = new Student[50];
        Teacher teachers[] = new Teacher[50];
        Admin admins[] = new Admin[50];
        boolean auhtenticAdmin = false;
        boolean auhtenticTeacher = false;
        boolean auhtenticStudent = false;

        try{
            MyFiler.readFile(adminFile,admins);
            MyFiler.readFile(teachers);
            MyFiler.readFile(students);
        } catch (Exception e){
            System.out.println(e);
        }
        if(adminRadio.isSelected()){
            try{
                for(int i=0; i<50; i++) {
                    if(loginId.getText().compareTo(admins[i].id) == 0){
                        if(loginPassword.getText().compareTo(admins[i].password) == 0){
                            MyFiler.setUser(admins[i]);
                            auhtenticAdmin = true;
                        } else{
                            invalidField.setText("Invalid Password");
                            loginPassword.setText("");
                        }
                    }
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
        else if(teacherRadio.isSelected()){
            try{
                for(int i=0; i<50; i++) {
                    if(loginId.getText().compareTo(teachers[i].id) == 0){
                        if(loginPassword.getText().compareTo(teachers[i].password) == 0){
                            MyFiler.setUser(teachers[i]);
                            auhtenticTeacher = true;
                        } else{
                            invalidField.setText("Invalid Password");
                            loginPassword.setText("");
                        }
                    }
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
        else if(studentRadio.isSelected()){
            try{
                for(int i=0; i<50; i++) {
                    if(loginId.getText().compareTo(students[i].id) == 0){
                        if(loginPassword.getText().compareTo(students[i].password) == 0){
                            MyFiler.setUser(students[i]);
                            auhtenticStudent = true;
                        } else{
                            invalidField.setText("Invalid Password");
                            loginPassword.setText("");
                        }
                    }
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }

        if(auhtenticAdmin){
            AdminPanel obj = new AdminPanel();
            obj.show();
            dispose();
        } else if (auhtenticStudent) {
            StdPanel obj = new StdPanel();
            obj.show();
            dispose();
        } else if(auhtenticTeacher) {
            TeacherPanel obj = new TeacherPanel();
            obj.show();
            dispose();
        }else {
            invalidField.setText("Invalid");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JRadioButton adminRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel invalidField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginId;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JRadioButton studentRadio;
    private javax.swing.JRadioButton teacherRadio;
    // End of variables declaration
}

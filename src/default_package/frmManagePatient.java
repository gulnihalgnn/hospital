package default_package;


import javax.swing.DefaultListModel;

public class frmManagePatient extends javax.swing.JFrame {

	static frmMain frmMain;
	DefaultListModel model;

	public frmManagePatient(frmMain frmMain) {
		this.frmMain = frmMain;
		initComponents();
		getContentPane().setBackground(frmMain.getContentPane().getBackground());
		getContentPane().setForeground(frmMain.getContentPane().getForeground());
		jPanel1.setOpaque(false);
		jPanel2.setOpaque(false);
		jPanel3.setOpaque(false);
		model = new DefaultListModel();
		lstPatients.setModel(model);
		for (int i = 0; i < frmMain.patientManager.patients.length; i++) {
			model.addElement(" " + frmMain.patientManager.patients[i].getNamePatient());
		}

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		btnMainMenu = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		lstPatients = new javax.swing.JList<>();
		jPanel2 = new javax.swing.JPanel();
		lblName = new javax.swing.JLabel();
		lblCode = new javax.swing.JLabel();
		lblStockAmount = new javax.swing.JLabel();
		lblPrize = new javax.swing.JLabel();
		txtName = new javax.swing.JTextField();
		txtCodePatient = new javax.swing.JTextField();
		txtStockAmount = new javax.swing.JTextField();
		txtPrize = new javax.swing.JTextField();
		btnChange = new javax.swing.JButton();
		btnRemove = new javax.swing.JButton();
		btnSold = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		txtName2 = new javax.swing.JTextField();
		txtPrize2 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		lblName2 = new javax.swing.JLabel();
		lblPrize2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		btnMainMenu.setText("Back Main Menu");
		btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnMainMenuActionPerformed(evt);
			}
		});

		lstPatients.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		lstPatients.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lstPatientsMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(lstPatients);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(77, 77, 77)));

		lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblName.setText("Name of a Patient :");

		lblCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblCode.setText("ID :");

		lblStockAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblStockAmount.setText("Care Hours:");

		lblPrize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblPrize.setText("Care Fee Per Hour:");

		txtCodePatient.setEditable(false);
		txtCodePatient.setBackground(new java.awt.Color(255, 255, 255));

		txtStockAmount.setBackground(new java.awt.Color(255, 255, 255));

		btnChange.setText("Change Patient");
		btnChange.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnChangeActionPerformed(evt);
			}
		});

		btnRemove.setText("Remove Patient");
		btnRemove.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnRemoveActionPerformed(evt);
			}
		});

		btnSold.setText("Paid");
		btnSold.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSoldActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblCode, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblStockAmount, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblPrize, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(txtName).addComponent(txtCodePatient).addComponent(txtStockAmount)
										.addComponent(txtPrize, javax.swing.GroupLayout.DEFAULT_SIZE, 249,
												Short.MAX_VALUE))
								.addGap(22, 22, 22))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35,
										Short.MAX_VALUE)
								.addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(30, 30, 30).addComponent(btnSold, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 10, Short.MAX_VALUE)))));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(23, 23, 23)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCodePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(txtStockAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(lblStockAmount, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblPrize, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtPrize, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
						.addGap(31, 31, 31)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSold, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(54, Short.MAX_VALUE)));

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Add Patient");

		lblName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblName2.setText("Name :");

		lblPrize2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblPrize2.setText("Care Fee Per Hour :");

		jButton1.setText("Add");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addGroup(jPanel3Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(lblName2, javax.swing.GroupLayout.DEFAULT_SIZE, 87,
												Short.MAX_VALUE)
										.addComponent(lblPrize2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(18, 18, 18)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtName2).addComponent(txtPrize2)
										.addGroup(jPanel3Layout.createSequentialGroup().addGap(9, 9, 9)
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 121, Short.MAX_VALUE)))))
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(27, 27, 27)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblName2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtName2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(txtPrize2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
								.addComponent(lblPrize2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(46, 46, 46).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(37, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(28, 28, 28)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
						.addGroup(layout.createSequentialGroup().addComponent(btnMainMenu,
								javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addGap(14, 14, 14)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addGap(37, 37, 37).addComponent(jPanel3,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(105, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMainMenuActionPerformed
		// TODO add your handling code here:
		this.setVisible(false);
		frmMain.setVisible(true);
	}// GEN-LAST:event_btnMainMenuActionPerformed

	private void lstPatientsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lstPatientsMouseClicked
		// TODO add your handling code here:
		showProdcut(lstPatients.getSelectedIndex());

	}// GEN-LAST:event_lstPatientsMouseClicked

	private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChangeActionPerformed
		// TODO add your handling code here:
		int index = lstPatients.getSelectedIndex();
		model.removeElementAt(index);
		frmMain.patientManager.patients[index].setNamePatient(txtName.getText());
		frmMain.patientManager.patients[index].setCodePatient();
		frmMain.patientManager.patients[index].setPrize(Integer.parseInt(txtPrize.getText()));
		frmMain.patientManager.patients[index].setStockAmount(Integer.parseInt(txtStockAmount.getText()));
		model.add(index, frmMain.patientManager.patients[index].getNamePatient());
		showProdcut(index);
	}// GEN-LAST:event_btnChangeActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		int prize = Integer.parseInt(txtPrize2.getText());
		frmMain.patientManager.AddPatient(txtName2.getText(), prize);

		model.addElement(" " + frmMain.patientManager.patients[frmMain.patientManager.getSize() - 1].getNamePatient());
	}// GEN-LAST:event_jButton1ActionPerformed

	private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRemoveActionPerformed
		// TODO add your handling code here:
		int index = lstPatients.getSelectedIndex();
		frmMain.patientManager.Remove(index + 1);
		model.removeElementAt(index);

	}// GEN-LAST:event_btnRemoveActionPerformed

	private void btnSoldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSoldActionPerformed
		// TODO add your handling code here:
		int index = lstPatients.getSelectedIndex();
		frmMain.patientManager.patients[index]
				.setStockAmount(frmMain.patientManager.patients[index].getStockAmount() - 1);
		showProdcut(index);
	}// GEN-LAST:event_btnSoldActionPerformed

	private void showProdcut(int index) {
		txtName.setText(frmMain.patientManager.patients[index].getNamePatient());
		txtCodePatient.setText(frmMain.patientManager.patients[index].getCodePatient());
		txtStockAmount.setText(Integer.toString(frmMain.patientManager.patients[index].getStockAmount()));
		txtPrize.setText(Integer.toString(frmMain.patientManager.patients[index].getPrize()));
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(frmManagePatient.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frmManagePatient.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frmManagePatient.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frmManagePatient.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frmManagePatient(frmMain).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnChange;
	private javax.swing.JButton btnMainMenu;
	private javax.swing.JButton btnRemove;
	private javax.swing.JButton btnSold;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lblCode;
	private javax.swing.JLabel lblName;
	private javax.swing.JLabel lblName2;
	private javax.swing.JLabel lblPrize;
	private javax.swing.JLabel lblPrize2;
	private javax.swing.JLabel lblStockAmount;
	private javax.swing.JList<String> lstPatients;
	private javax.swing.JTextField txtCodePatient;
	private javax.swing.JTextField txtName;
	private javax.swing.JTextField txtName2;
	private javax.swing.JTextField txtPrize;
	private javax.swing.JTextField txtPrize2;
	private javax.swing.JTextField txtStockAmount;
	// End of variables declaration//GEN-END:variables
}
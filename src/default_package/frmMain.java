package default_package;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class frmMain extends JFrame {
	PersonnelManager PersonnelManager;
	PatientManager patientManager;
	ThemeColorManager themeColorManager;
	Date nowDate;
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public frmMain() throws ParseException {
		PersonnelManager = new PersonnelManager();
		patientManager = new PatientManager();
		initComponents();
		Date nowDate = new Date();
		lblClock.setText(dateFormat.format(nowDate));
		Timer timer = new Timer(1000, (ActionEvent e) -> {
			DateTimeFormatter myTime = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			lblClock.setText(String.valueOf(myTime.format(now)));
		});
		timer.setRepeats(true);
		timer.start();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		btnManagePersonnel = new javax.swing.JButton();
		btnShowPrize = new javax.swing.JButton();
		cmbThemeBox = new javax.swing.JComboBox<>();
		lblClock = new javax.swing.JLabel();
		btnManagePatient = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				formMouseMoved(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Grand Hospital Management System");
		jLabel1.setToolTipText("");

		btnManagePersonnel.setText("Manage a Personnel");
		btnManagePersonnel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnManagePersonnelActionPerformed(evt);
			}
		});

		btnShowPrize.setText("Show Prizes");
		btnShowPrize.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnShowPrizeActionPerformed(evt);
			}
		});

		cmbThemeBox.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Dark Theme", "Light Theme", "Pink Theme","Orange Theme"}));
		cmbThemeBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cmbThemeBoxActionPerformed(evt);
			}
		});

		lblClock.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
		lblClock.setForeground(new Color(255, 0, 0));
		lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		btnManagePatient.setText("Manage a Patient");
		btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnManagePatientActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(cmbThemeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(269, 269, 269))
				.addGroup(layout.createSequentialGroup().addGap(292, 292, 292)
						.addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 290,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addGap(59, 59, 59)
						.addComponent(btnManagePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(173, 173, 173)
						.addComponent(btnShowPrize, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnManagePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(90, 90, 90)));

		layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { btnManagePersonnel, btnShowPrize });

		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
								.addComponent(cmbThemeBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(38, 38, 38)
						.addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(192, 192, 192)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnManagePersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnShowPrize, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnManagePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(274, 274, 274)));

		layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { btnManagePersonnel, btnShowPrize });

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnManagePersonnelActionPerformed(ActionEvent evt) {// GEN-FIRST:event_btnManagePersonnelActionPerformed

		frmManagerPersonnel frm2 = new frmManagerPersonnel(this);
		frm2.setVisible(true);

		this.setVisible(false);
	}// GEN-LAST:event_btnManagePersonnelActionPerformed

	private void btnShowPrizeActionPerformed(ActionEvent evt) {// GEN-FIRST:event_btnShowPrizeActionPerformed
		frmShowPrize showPrize = new frmShowPrize(this);
		showPrize.setVisible(true);
		this.setVisible(false);
	}

	private void cmbThemeBoxActionPerformed(ActionEvent evt) {
		switch (cmbThemeBox.getSelectedIndex()) {
		case 0:
			getContentPane().setBackground(new Color(214, 217, 223));
			getContentPane().setForeground(Color.BLACK);
			break;
		case 1:
			themeColorManager = new ThemeColorManager(new DarkColorTheme());
			themeColorManager.setBackgroundColor(this);
			themeColorManager.setFont(this);
			break;
		case 2:
			themeColorManager = new ThemeColorManager(new LightColorTheme());
			themeColorManager.setBackgroundColor(this);
			themeColorManager.setFont(this);
			break;
		case 3:
			themeColorManager = new ThemeColorManager(new PinkColorTheme());
			themeColorManager.setBackgroundColor(this);
			themeColorManager.setFont(this);
			break;
		case 4:
			themeColorManager = new ThemeColorManager(new OrangeColorTheme());
			themeColorManager.setBackgroundColor(this);
			themeColorManager.setFont(this);
		default:

			System.out.println("Default");

		}
	}

	private void formMouseMoved(java.awt.event.MouseEvent evt) {
		nowDate = new Date();
		lblClock.setText(dateFormat.format(nowDate));
	}// GEN-LAST:event_formMouseMoved

	private void btnManagePatientActionPerformed(ActionEvent evt) {
		frmManagePatient managePatient = new frmManagePatient(this);
		managePatient.setVisible(true);
		this.setVisible(false);
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new frmMain().setVisible(true);
				} catch (ParseException ex) {
					Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
				}

			}
		});

	}

	private javax.swing.JButton btnManagePersonnel;
	private javax.swing.JButton btnManagePatient;
	private javax.swing.JButton btnShowPrize;
	private javax.swing.JComboBox<String> cmbThemeBox;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel lblClock;
}
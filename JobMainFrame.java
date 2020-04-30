package br.estacio.remoteok.view;

import br.estacio.remoteok.controller.JobController;
import br.estacio.remoteok.model.Job;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JobMainFrame extends javax.swing.JFrame {

	private String searchText;
	private String tagsList;

	ArrayList<Job> jobsList = new ArrayList<>();
	JobController remoteOkJobs;

	public JobMainFrame() {
		this.remoteOkJobs = new JobController();
		this.jobsList = remoteOkJobs.pullApiData("https://remoteok.io/api");

		initComponents();
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jpanel_main = new javax.swing.JPanel();
                jPanel_header = new javax.swing.JPanel();
                jtext_search = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jPanel_footer = new javax.swing.JPanel();
                progresbar_01 = new javax.swing.JProgressBar();
                jlabel_founds = new javax.swing.JLabel();
                jtabbed_body = new javax.swing.JTabbedPane();
                jscrollpane_all = new javax.swing.JScrollPane();
                jpanel_all = new javax.swing.JPanel();
                jscrollpane_bookmarks = new javax.swing.JScrollPane();
                jpanel_bookmarks = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Remote OK Jobs");
                setBackground(new java.awt.Color(255, 255, 255));

                jpanel_main.setBackground(new java.awt.Color(255, 255, 255));
                jpanel_main.setLayout(new java.awt.BorderLayout());

                jPanel_header.setBackground(new java.awt.Color(255, 255, 255));
                jPanel_header.setMinimumSize(new java.awt.Dimension(15, 19));
                jPanel_header.setLayout(new javax.swing.BoxLayout(jPanel_header, javax.swing.BoxLayout.X_AXIS));

                jtext_search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jtext_search.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtext_searchActionPerformed(evt);
                        }
                });
                jPanel_header.add(jtext_search);

                jLabel1.setText("Icon");
                jPanel_header.add(jLabel1);

                jpanel_main.add(jPanel_header, java.awt.BorderLayout.PAGE_START);

                jPanel_footer.setBackground(new java.awt.Color(255, 255, 255));
                jPanel_footer.setLayout(new java.awt.BorderLayout());

                progresbar_01.setBackground(new java.awt.Color(255, 255, 255));
                progresbar_01.setForeground(new java.awt.Color(51, 148, 255));
                jPanel_footer.add(progresbar_01, java.awt.BorderLayout.WEST);
                jPanel_footer.add(jlabel_founds, java.awt.BorderLayout.EAST);

                jpanel_main.add(jPanel_footer, java.awt.BorderLayout.PAGE_END);

                jtabbed_body.setBackground(new java.awt.Color(255, 255, 255));

                jscrollpane_all.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 148, 255), 5, true));

                jpanel_all.setBackground(new java.awt.Color(255, 255, 255));
                jpanel_all.setLayout(new javax.swing.BoxLayout(jpanel_all, javax.swing.BoxLayout.Y_AXIS));
                jscrollpane_all.setViewportView(jpanel_all);

                jtabbed_body.addTab("All", jscrollpane_all);

                jscrollpane_bookmarks.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 148, 255), 5, true));

                jpanel_bookmarks.setBackground(new java.awt.Color(255, 255, 255));
                jpanel_bookmarks.setLayout(new javax.swing.BoxLayout(jpanel_bookmarks, javax.swing.BoxLayout.Y_AXIS));
                jscrollpane_bookmarks.setViewportView(jpanel_bookmarks);

                jtabbed_body.addTab("Bookmarks", jscrollpane_bookmarks);

                jpanel_main.add(jtabbed_body, java.awt.BorderLayout.CENTER);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jtext_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_searchActionPerformed
		// Getting the text to search
		searchText = jtext_search.getText();
		
		// Counting how many jobs we have available
		int allJobs = jobsList.size();
		
		// Adjust progress bar
		progresbar_01.setMaximum(allJobs);
		progresbar_01.setValue(0);
		System.out.println(progresbar_01.getValue());
		
		// Clear the panel
		jpanel_all.removeAll();
		jpanel_all.revalidate();
		
		for (int i = 0; i < allJobs ; i++) {
			if (jobsList.get(i).hasText(searchText)) {
				// Adjusting the percentage of progressbar as information
				progresbar_01.setValue(progresbar_01.getValue() + 1);
				
				// Cretating a new JPanel for the job found
				JobDescription jdsciptioni = new JobDescription(jobsList.get(i));
				
				// Adding the JPanel on scren
				jpanel_all.add(jdsciptioni).revalidate();
				
				System.out.println("------------" + searchText);
			}
			
			
			
			
			
			
			// jlabel_founds.setText(i + " jobs listed from " + allJobs);
			// JPanel jpanel_i = new JPanel();
			// jpanel_i.setBorder(BorderFactory.createLineBorder(Color.black));
			
			// JobDescription jji = new JobDescription(jobsList.get(i));
			
			// JLabel jlabel_company_i = new JLabel("-------------------------");
			// jpanel_i.add(jlabel_company_i);
			
			
			// jpanel_all.add(jji).revalidate();
			
			
			

				//	jPanel_body.revalidate();
				// jPanel1.updateUI();
				// jPanel1.repaint();
				
				/// jTabbedPane1.revalidate();
				// jTabbedPane1.updateUI();
				// jTabbedPane1.repaint();
				
				
				
			// Thread.currentThread().sleep(500);

			
			// System.out.println(jobsList.get(i).getCompany());
		}

		
		jpanel_all.revalidate();
		System.out.println(progresbar_01.getValue());
			
		jlabel_founds.setText(progresbar_01.getValue() + " jobs listed from " + allJobs);
















//                JLabel j = new JLabel("AAAAAAAAAAAAAA");
//		
//		JPanel jp = new JPanel();
//		jp.add(j);
//		jp.setBorder(BorderFactory.createLineBorder(Color.black));
//		jpanel_body.add(jp).repaint();
//	
//		
//		jpanel_main.revalidate();
//		
//		jPanel_footer.add(j);
//		//jPanel_footer.revalidate();
//		// jPanel_footer.repaint();
//		System.out.println("...................");
		
        }//GEN-LAST:event_jtext_searchActionPerformed
	

	
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
			java.util.logging.Logger.getLogger(JobMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(JobMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(JobMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(JobMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JobMainFrame().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel_footer;
        private javax.swing.JPanel jPanel_header;
        private javax.swing.JLabel jlabel_founds;
        private javax.swing.JPanel jpanel_all;
        private javax.swing.JPanel jpanel_bookmarks;
        private javax.swing.JPanel jpanel_main;
        private javax.swing.JScrollPane jscrollpane_all;
        private javax.swing.JScrollPane jscrollpane_bookmarks;
        private javax.swing.JTabbedPane jtabbed_body;
        private javax.swing.JTextField jtext_search;
        private javax.swing.JProgressBar progresbar_01;
        // End of variables declaration//GEN-END:variables
}

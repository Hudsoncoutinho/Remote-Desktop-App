
package br.estacio.remoteok.view;

import br.estacio.remoteok.model.Job;

public class JobDescription extends javax.swing.JPanel {

	/**
	 * Creates new form JobDescription
	 * @param job
	 */
	public JobDescription(Job job) {
		initComponents();
		this.jlabel_company.setText(job.getCompany());
		this.jlabel_description.setText(job.getDescription());
		this.jlabel_date.setText(job.getDate());
		this.jlabel_tags.setText(job.getTags().toString());
		this.jlabel_url.setText(job.getUrl());
	}


	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jlabel_company = new javax.swing.JLabel();
                jlabel_description = new javax.swing.JLabel();
                jlabel_date = new javax.swing.JLabel();
                jlabel_tags = new javax.swing.JLabel();
                jlabel_url = new javax.swing.JLabel();
                btn_bookmark = new javax.swing.JButton();
                btn_share = new javax.swing.JButton();

                setBackground(new java.awt.Color(255, 255, 255));
                setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 148, 255), 5, true));

                jlabel_company.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
                jlabel_company.setText("12");

                jlabel_description.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
                jlabel_description.setText("12");

                jlabel_date.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
                jlabel_date.setText("00");

                jlabel_tags.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
                jlabel_tags.setText("22");

                jlabel_url.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
                jlabel_url.setText("33");

                btn_bookmark.setText("Bookmark");

                btn_share.setText("Share");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_bookmark)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
                                                .addComponent(btn_share))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jlabel_company)
                                                        .addComponent(jlabel_description)
                                                        .addComponent(jlabel_date)
                                                        .addComponent(jlabel_tags)
                                                        .addComponent(jlabel_url))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jlabel_company)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlabel_description)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlabel_date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlabel_tags)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlabel_url)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_bookmark)
                                        .addComponent(btn_share))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btn_bookmark;
        private javax.swing.JButton btn_share;
        private javax.swing.JLabel jlabel_company;
        private javax.swing.JLabel jlabel_date;
        private javax.swing.JLabel jlabel_description;
        private javax.swing.JLabel jlabel_tags;
        private javax.swing.JLabel jlabel_url;
        // End of variables declaration//GEN-END:variables
}

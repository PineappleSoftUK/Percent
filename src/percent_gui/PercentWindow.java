/*
 * Copyright (C) 2018 Pineapple Soft
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package percent_gui;
import percent_core.*;

/**
 * @version 1.0.0
 * @author David Ward
 */
public class PercentWindow extends javax.swing.JFrame {

    /**
     * Creates new form Percent
     */
    public PercentWindow() {
        initComponents();
        pcList.setSelectedIndex(0);
    }
    
    void performCalculation()
    {
        try
        {
            double aNumber = Double.valueOf(pcNumberField.getText());
            double aPercent = Double.valueOf(pcPercentField.getText());   
        
            int selection = pcList.getSelectedIndex();
            Double answer;
            
            if(selection == 0)
            {
                answer = Percent.addPercentage(aNumber, aPercent);
                answer = Percent.makeDecimal(answer);
                pcAnswerBox.setText("" + aNumber + " + " + aPercent + "% = " + answer);
            }
            if(selection == 1)
            {
                answer = Percent.subtractPercentage(aNumber, aPercent);
                answer = Percent.makeDecimal(answer);
                pcAnswerBox.setText("" + aNumber + " - " + aPercent + "% = " + answer);
            }
            if(selection == 2)
            {
                answer = Percent.xPercentOfNumberIs(aNumber, aPercent);
                answer = Percent.makeDecimal(answer);
                pcAnswerBox.setText("" + aPercent + "% of " + aNumber + " = " + answer);
            }
            if(selection == 3)
            {
                answer = Percent.findOriginalNumber(aNumber, aPercent);
                answer = Percent.makeDecimal(answer);
                pcAnswerBox.setText("" + answer + " - " + aPercent + "% = " + aNumber);
            }
            if(selection == 4)
            {
                answer = Percent.findOriginalNumberAfterAdd(aNumber, aPercent);
                answer = Percent.makeDecimal(answer);
                pcAnswerBox.setText("" + answer + " + " + aPercent + "% = " + aNumber);
            }
        }
        catch (NumberFormatException e)
        {
            pcAnswerBox.setText("Please enter numbers only into both the number and percent \nboxes above.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pcList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pcAnswerBox = new javax.swing.JTextArea();
        pcNumberField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pcPercentField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Percent");

        pcList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Number + Percent", "Number - Percent", "𝑥 Percent of Number =", "𝑥 - Percent = Number, Find 𝑥", "𝑥 + Percent = Number, Find 𝑥" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pcList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                pcListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(pcList);

        jLabel3.setText("Answer:");

        pcAnswerBox.setEditable(false);
        pcAnswerBox.setColumns(20);
        pcAnswerBox.setRows(5);
        jScrollPane2.setViewportView(pcAnswerBox);

        pcNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pcNumberFieldKeyReleased(evt);
            }
        });

        jLabel2.setText("Percent:");

        jLabel1.setText("Number:");

        pcPercentField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pcPercentFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(pcNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(pcPercentField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pcNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcPercentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setBounds(0, 0, 585, 472);
    }// </editor-fold>//GEN-END:initComponents

    private void pcListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pcListValueChanged
        performCalculation();
    }//GEN-LAST:event_pcListValueChanged

    private void pcPercentFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcPercentFieldKeyReleased
        performCalculation();
    }//GEN-LAST:event_pcPercentFieldKeyReleased

    private void pcNumberFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcNumberFieldKeyReleased
        performCalculation();
    }//GEN-LAST:event_pcNumberFieldKeyReleased

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
            java.util.logging.Logger.getLogger(PercentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PercentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PercentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PercentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PercentWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pcAnswerBox;
    private javax.swing.JList<String> pcList;
    private javax.swing.JTextField pcNumberField;
    private javax.swing.JTextField pcPercentField;
    // End of variables declaration//GEN-END:variables
}
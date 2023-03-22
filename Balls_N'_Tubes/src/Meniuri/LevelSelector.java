/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Meniuri;

import Nivele.Board1;
import Nivele.Board2;
import Nivele.Board3;
import Nivele.Board4;
import Nivele.Board5;
import Nivele.Board6;
import Nivele.Board7;
import Nivele.Board8;
import Nivele.Board9;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.WindowConstants;

public class LevelSelector extends javax.swing.JFrame {

    public static final String SONG = "src\\Resurse\\LVM.mp3";
    MP3Player mp3player = new MP3Player(new File(SONG));

    public LevelSelector() {
        initComponents();
        mp3player.play();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        N6 = new javax.swing.JButton();
        N7 = new javax.swing.JButton();
        N8 = new javax.swing.JButton();
        N9 = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        N1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        N2 = new javax.swing.JButton();
        N3 = new javax.swing.JButton();
        N4 = new javax.swing.JButton();
        N5 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Level Selector");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setRequestFocusEnabled(false);

        N6.setBackground(new java.awt.Color(192, 192, 192));
        N6.setText("Nivelul 6");
        N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N6ActionPerformed(evt);
            }
        });

        N7.setBackground(new java.awt.Color(192, 192, 192));
        N7.setText("Nivelul 7");
        N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N7ActionPerformed(evt);
            }
        });

        N8.setBackground(new java.awt.Color(192, 192, 192));
        N8.setText("Nivelul 8");
        N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N8ActionPerformed(evt);
            }
        });

        N9.setBackground(new java.awt.Color(192, 192, 192));
        N9.setText("Nivelul 9");
        N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N9ActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(0, 153, 204));
        Back.setForeground(new java.awt.Color(0, 0, 0));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        N1.setBackground(new java.awt.Color(192, 192, 192));
        N1.setText("Nivelul 1");
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Level Selector");

        N2.setBackground(new java.awt.Color(192, 192, 192));
        N2.setText("Nivelul 2");
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });

        N3.setBackground(new java.awt.Color(192, 192, 192));
        N3.setText("Nivelul 3");
        N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });

        N4.setBackground(new java.awt.Color(192, 192, 192));
        N4.setText("Nivelul 4");
        N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N4ActionPerformed(evt);
            }
        });

        N5.setBackground(new java.awt.Color(192, 192, 192));
        N5.setText("Nivelul 5");
        N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N5ActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(255, 0, 0));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(N4)
                    .addComponent(N1)
                    .addComponent(N7)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(N2)
                        .addGap(35, 35, 35)
                        .addComponent(N3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(N5)
                                .addGap(35, 35, 35)
                                .addComponent(N6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(N8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(N9)))))
                .addGap(78, 262, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(529, 529, 529))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public void stop() {
        mp3player.stop();
    }

    public void play() {
        mp3player.play();
    }

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        if (evt.getSource() == Back) {
            Start ba = new Start();
            ba.setVisible(true);
            mp3player.stop();
            close();
        }
    }//GEN-LAST:event_BackActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        if (evt.getSource() == Reset) {
            N1.setBackground(Color.LIGHT_GRAY);
            N1.setText("Nivelul 1");
            N2.setBackground(Color.LIGHT_GRAY);
            N2.setText("Nivelul 2");
            N3.setBackground(Color.LIGHT_GRAY);
            N3.setText("Nivelul 3");
            N4.setBackground(Color.LIGHT_GRAY);
            N4.setText("Nivelul 4");
            N5.setBackground(Color.LIGHT_GRAY);
            N5.setText("Nivelul 5");
            N6.setBackground(Color.LIGHT_GRAY);
            N6.setText("Nivelul 6");
            N7.setBackground(Color.LIGHT_GRAY);
            N7.setText("Nivelul 7");
            N8.setBackground(Color.LIGHT_GRAY);
            N8.setText("Nivelul 8");
            N9.setBackground(Color.LIGHT_GRAY);
            N9.setText("Nivelul 9");
            mp3player.stop();
            mp3player.play();
        }
    }//GEN-LAST:event_ResetActionPerformed

    public void schimb(int n, String score) {
        if (n == 1) {
            N1.setBackground(Color.GREEN);
            N1.setText(N1.getText() + " " + score);
        } else if (n == 2) {
            N2.setBackground(Color.GREEN);
            N2.setText(N2.getText() + " " + score);
        } else if (n == 3) {
            N3.setBackground(Color.GREEN);
            N3.setText(N3.getText() + " " + score);
        } else if (n == 4) {
            N4.setBackground(Color.GREEN);
            N4.setText(N4.getText() + " " + score);
        } else if (n == 5) {
            N5.setBackground(Color.GREEN);
            N5.setText(N5.getText() + " " + score);
        } else if (n == 6) {
            N6.setBackground(Color.GREEN);
            N6.setText(N6.getText() + " " + score);
        } else if (n == 7) {
            N7.setBackground(Color.GREEN);
            N7.setText(N7.getText() + " " + score);
        } else if (n == 8) {
            N8.setBackground(Color.GREEN);
            N8.setText(N8.getText() + " " + score);
        } else if (n == 9) {
            N9.setBackground(Color.GREEN);
            N9.setText(N9.getText() + " " + score);
        } else {

        }
    }



    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        Board1 b = new Board1();
        if (evt.getSource() == N1) {
            Nivel Nivel_inst = Nivel.Singleton();
            Dimension tSize = new Dimension(1000, 1000);
            Nivel_inst.setMinimumSize(tSize);
            Nivel_inst.setMaximumSize(tSize);
            Nivel_inst.setPreferredSize(tSize);
            Nivel_inst.setLocationRelativeTo(null);
            Nivel_inst.setResizable(false);
            Nivel_inst.setTitle("Nivel 1");
            Nivel_inst.setVisible(true);
            Nivel_inst.add(b);
            Nivel_inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            stop();
            close();
        }
    }//GEN-LAST:event_N1ActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        // TODO add your handling code here:
        Board2 b = new Board2();
        if (evt.getSource() == N2) {
            Nivel Nivel_inst = Nivel.Singleton();
            Dimension tSize = new Dimension(1000, 1000);
            Nivel_inst.setMinimumSize(tSize);
            Nivel_inst.setMaximumSize(tSize);
            Nivel_inst.setPreferredSize(tSize);
            Nivel_inst.setLocationRelativeTo(null);
            Nivel_inst.setResizable(false);
            Nivel_inst.setTitle("Nivel 2");
            Nivel_inst.setVisible(true);
            Nivel_inst.add(b);
            Nivel_inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            close();
        }
    }//GEN-LAST:event_N2ActionPerformed

    private void N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N3ActionPerformed

        Board3 b = new Board3();
        if (evt.getSource() == N3) {
            Nivel Nivel_inst = Nivel.Singleton();
            Dimension tSize = new Dimension(1000, 1000);
            Nivel_inst.setMinimumSize(tSize);
            Nivel_inst.setMaximumSize(tSize);
            Nivel_inst.setPreferredSize(tSize);
            Nivel_inst.setLocationRelativeTo(null);
            Nivel_inst.setResizable(false);
            Nivel_inst.setTitle("Nivel 3");
            Nivel_inst.setVisible(true);
            Nivel_inst.add(b);
            Nivel_inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            close();
        }
    }//GEN-LAST:event_N3ActionPerformed

    private void N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N4ActionPerformed

        Board4 b = new Board4();
        if (evt.getSource() == N4) {
            Nivel Nivel_inst = Nivel.Singleton();
            Dimension tSize = new Dimension(1000, 1000);
            Nivel_inst.setMinimumSize(tSize);
            Nivel_inst.setMaximumSize(tSize);
            Nivel_inst.setPreferredSize(tSize);
            Nivel_inst.setLocationRelativeTo(null);
            Nivel_inst.setResizable(false);
            Nivel_inst.setTitle("Nivel 4");
            Nivel_inst.setVisible(true);
            Nivel_inst.add(b);
            Nivel_inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            close();
        }
    }//GEN-LAST:event_N4ActionPerformed

    private void N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N5ActionPerformed

        Board5 b = new Board5();
        if (evt.getSource() == N5) {
            Nivel Nivel_inst = Nivel.Singleton();
            Dimension tSize = new Dimension(1000, 1000);
            Nivel_inst.setMinimumSize(tSize);
            Nivel_inst.setMaximumSize(tSize);
            Nivel_inst.setPreferredSize(tSize);
            Nivel_inst.setLocationRelativeTo(null);
            Nivel_inst.setResizable(false);
            Nivel_inst.setTitle("Nivel 5");
            Nivel_inst.setVisible(true);
            Nivel_inst.add(b);
            Nivel_inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            close();

        }
    }//GEN-LAST:event_N5ActionPerformed

    private void N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N6ActionPerformed

        Board6 b = new Board6();
        if (evt.getSource() == N6) {
            Nivel Nivel_inst = Nivel.Singleton();
            Dimension tSize = new Dimension(1000, 1000);
            Nivel_inst.setMinimumSize(tSize);
            Nivel_inst.setMaximumSize(tSize);
            Nivel_inst.setPreferredSize(tSize);
            Nivel_inst.setLocationRelativeTo(null);
            Nivel_inst.setResizable(false);
            Nivel_inst.setTitle("Nivel 6");
            Nivel_inst.setVisible(true);
            Nivel_inst.add(b);
            Nivel_inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            close();
        }
    }//GEN-LAST:event_N6ActionPerformed

    private void N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N7ActionPerformed

        Board7 b = new Board7();
        if (evt.getSource() == N7) {
            Nivel Nivel_inst = Nivel.Singleton();
            Dimension tSize = new Dimension(1000, 1000);
            Nivel_inst.setMinimumSize(tSize);
            Nivel_inst.setMaximumSize(tSize);
            Nivel_inst.setPreferredSize(tSize);
            Nivel_inst.setLocationRelativeTo(null);
            Nivel_inst.setResizable(false);
            Nivel_inst.setTitle("Nivel 7");
            Nivel_inst.setVisible(true);
            Nivel_inst.add(b);
            Nivel_inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            close();
        }
    }//GEN-LAST:event_N7ActionPerformed

    private void N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N8ActionPerformed

        Board8 b = new Board8();
        if (evt.getSource() == N8) {
            Nivel Nivel_inst = Nivel.Singleton();
            Dimension tSize = new Dimension(1000, 1000);
            Nivel_inst.setMinimumSize(tSize);
            Nivel_inst.setMaximumSize(tSize);
            Nivel_inst.setPreferredSize(tSize);
            Nivel_inst.setLocationRelativeTo(null);
            Nivel_inst.setResizable(false);
            Nivel_inst.setTitle("Nivel 8");
            Nivel_inst.setVisible(true);
            Nivel_inst.add(b);
            Nivel_inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            close();
        }
    }//GEN-LAST:event_N8ActionPerformed

    private void N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N9ActionPerformed

        Board9 b = new Board9();
        if (evt.getSource() == N9) {
            Nivel Nivel_inst = Nivel.Singleton();
            Dimension tSize = new Dimension(1000, 1000);
            Nivel_inst.setMinimumSize(tSize);
            Nivel_inst.setMaximumSize(tSize);
            Nivel_inst.setPreferredSize(tSize);
            Nivel_inst.setLocationRelativeTo(null);
            Nivel_inst.setResizable(false);
            Nivel_inst.setTitle("Nivel 9");
            Nivel_inst.setVisible(true);
            Nivel_inst.add(b);
            Nivel_inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            close();
        }
    }//GEN-LAST:event_N9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton N1;
    private javax.swing.JButton N2;
    private javax.swing.JButton N3;
    private javax.swing.JButton N4;
    private javax.swing.JButton N5;
    private javax.swing.JButton N6;
    private javax.swing.JButton N7;
    private javax.swing.JButton N8;
    private javax.swing.JButton N9;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

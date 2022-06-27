package GUI.TTT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTT_GUI implements ActionListener {

   //PROPERTIES
   JButton button1;
   JButton button2;
   JButton button3;
   JButton button4;
   JButton button5;
   JButton button6;
   JButton button7;
   JButton button8;
   JButton button9;
   JButton resetbutton;

   JFrame theframe;
   JPanel thepanel;

   JLabel p1Label;
   JLabel p2Label;
   JLabel message;
   JLabel playerlabel;

   TicTacToeModel tttmodel;

   //methods
   //Local methods for the GUI VIEW
   public void actionPerformed(ActionEvent evt) {
      if (evt.getSource() == button1) {
         button1.setText(tttmodel.getTurn());
         tttmodel.placeThePiece(0, 0);
         button1.setEnabled(false);
         String strWinner = tttmodel.checkWin();
         if (strWinner.equals("X")) {
            message.setText("P1 Wins");
         } else if (strWinner.equals("O")) {
            message.setText("P2 Wins");
         } else if (strWinner.equals("C")) {
            message.setText("Cat's Game");
         }
      } else if (evt.getSource() == button2) {
         button2.setText(tttmodel.getTurn());
         tttmodel.placeThePiece(0, 1);
         button2.setEnabled(false);
         String strWinner = tttmodel.checkWin();
         if (strWinner.equals("X")) {
            message.setText("P1 Wins");
         } else if (strWinner.equals("O")) {
            message.setText("P2 Wins");
         } else if (strWinner.equals("C")) {
            message.setText("Cat's Game");
         }
      } else if (evt.getSource() == button3) {
         button3.setText(tttmodel.getTurn());
         tttmodel.placeThePiece(0, 2);
         button3.setEnabled(false);
         String strWinner = tttmodel.checkWin();
         if (strWinner.equals("X")) {
            message.setText("P1 Wins");
         } else if (strWinner.equals("O")) {
            message.setText("P2 Wins");
         } else if (strWinner.equals("C")) {
            message.setText("Cat's Game");
         }
      } else if (evt.getSource() == button4) {
         button4.setText(tttmodel.getTurn());
         tttmodel.placeThePiece(1, 0);
         button4.setEnabled(false);
         String strWinner = tttmodel.checkWin();
         if (strWinner.equals("X")) {
            message.setText("P1 Wins");
         } else if (strWinner.equals("O")) {
            message.setText("P2 Wins");
         } else if (strWinner.equals("C")) {
            message.setText("Cat's Game");
         }
      } else if (evt.getSource() == button5) {
         button5.setText(tttmodel.getTurn());
         tttmodel.placeThePiece(1, 1);
         button5.setEnabled(false);
         String strWinner = tttmodel.checkWin();
         if (strWinner.equals("X")) {
            message.setText("P1 Wins");
         } else if (strWinner.equals("O")) {
            message.setText("P2 Wins");
         } else if (strWinner.equals("C")) {
            message.setText("Cat's Game");
         }
      } else if (evt.getSource() == button6) {
         button6.setText(tttmodel.getTurn());
         tttmodel.placeThePiece(1, 2);
         button6.setEnabled(false);
         String strWinner = tttmodel.checkWin();
         if (strWinner.equals("X")) {
            message.setText("P1 Wins");
         } else if (strWinner.equals("O")) {
            message.setText("P2 Wins");
         } else if (strWinner.equals("C")) {
            message.setText("Cat's Game");
         }
      } else if (evt.getSource() == button7) {
         button7.setText(tttmodel.getTurn());
         tttmodel.placeThePiece(2, 0);
         button7.setEnabled(false);
         String strWinner = tttmodel.checkWin();
         if (strWinner.equals("X")) {
            message.setText("P1 Wins");
         } else if (strWinner.equals("O")) {
            message.setText("P2 Wins");
         } else if (strWinner.equals("C")) {
            message.setText("Cat's Game");
         }
      } else if (evt.getSource() == button8) {
         button8.setText(tttmodel.getTurn());
         tttmodel.placeThePiece(2, 1);
         button8.setEnabled(false);
         String strWinner = tttmodel.checkWin();
         if (strWinner.equals("X")) {
            message.setText("P1 Wins");
         } else if (strWinner.equals("O")) {
            message.setText("P2 Wins");
         } else if (strWinner.equals("C")) {
            message.setText("Cat's Game");
         }
      } else if (evt.getSource() == button9) {
         button9.setText(tttmodel.getTurn());
         tttmodel.placeThePiece(2, 2);
         button9.setEnabled(false);
         String strWinner = tttmodel.checkWin();
         if (strWinner.equals("X")) {
            message.setText("P1 Wins");
         } else if (strWinner.equals("O")) {
            message.setText("P2 Wins");
         } else if (strWinner.equals("C")) {
            message.setText("Cat's Game");
         }
         //reset game
      } else if (evt.getSource() == resetbutton) {
         tttmodel.resetBoard();
         button1.setEnabled(true);
         button1.setText("");
         button2.setEnabled(true);
         button2.setText("");
         button3.setEnabled(true);
         button3.setText("");
         button4.setEnabled(true);
         button4.setText("");
         button5.setEnabled(true);
         button5.setText("");
         button6.setEnabled(true);
         button6.setText("");
         button7.setEnabled(true);
         button7.setText("");
         button8.setEnabled(true);
         button8.setText("");
         button9.setEnabled(true);
         button9.setText("");
         message.setText("Let's Play");
         tttmodel.resetBoard();
      }
   }

   //Controller Methods that link the view to the model

   //constructor
   public TTT_GUI() {

      //construct the model
      tttmodel = new TicTacToeModel();
      tttmodel.resetBoard();

      // setup VIEW of the model view controller
      thepanel = new JPanel();
      thepanel.setPreferredSize(new Dimension(300, 600));
      thepanel.setLayout(null);

      button1 = new JButton(" ");
      button1.setSize(100, 100);
      button1.setLocation(0, 0);
      button1.addActionListener(this);
      thepanel.add(button1);

      button2 = new JButton(" ");
      button2.setSize(100, 100);
      button2.setLocation(100, 0);
      button2.addActionListener(this);
      thepanel.add(button2);

      button3 = new JButton(" ");
      button3.setSize(100, 100);
      button3.setLocation(200, 0);
      button3.addActionListener(this);
      thepanel.add(button3);

      button4 = new JButton(" ");
      button4.setSize(100, 100);
      button4.setLocation(0, 100);
      button4.addActionListener(this);
      thepanel.add(button4);

      button5 = new JButton(" ");
      button5.setSize(100, 100);
      button5.setLocation(100, 100);
      button5.addActionListener(this);
      thepanel.add(button5);

      button6 = new JButton(" ");
      button6.setSize(100, 100);
      button6.setLocation(200, 100);
      button6.addActionListener(this);
      thepanel.add(button6);

      button7 = new JButton(" ");
      button7.setSize(100, 100);
      button7.setLocation(0, 200);
      button7.addActionListener(this);
      thepanel.add(button7);

      button8 = new JButton(" ");
      button8.setSize(100, 100);
      button8.setLocation(100, 200);
      button8.addActionListener(this);
      thepanel.add(button8);

      button9 = new JButton(" ");
      button9.setSize(100, 100);
      button9.setLocation(200, 200);
      button9.addActionListener(this);
      thepanel.add(button9);

      p1Label = new JLabel("P1 Wins:");
      p1Label.setSize(100, 100);
      p1Label.setLocation(0, 300);
      p1Label.setHorizontalAlignment(JLabel.CENTER);
      thepanel.add(p1Label);

      p2Label = new JLabel("P2 Wins:");
      p2Label.setSize(100, 100);
      p2Label.setLocation(200, 300);
      p2Label.setHorizontalAlignment(JLabel.CENTER);
      thepanel.add(p2Label);

      message = new JLabel("Let's Play");
      message.setSize(100, 100);
      message.setLocation(100, 300);
      message.setHorizontalAlignment(JLabel.CENTER);
      thepanel.add(message);

      resetbutton = new JButton("Reset");
      resetbutton.setSize(300, 100);
      resetbutton.setLocation(0, 500);
      resetbutton.addActionListener(this);
      thepanel.add(resetbutton);

//      playerlabel = new JLabel("Player 1 Turn");
//      playerlabel.setSize(100, 100);
//      playerlabel.setLocation(100, 400);
//      playerlabel.setHorizontalAlignment(JLabel.CENTER);
//      thepanel.add(playerlabel);

      theframe = new JFrame("TIC TAC TOE");
      theframe.setContentPane(thepanel);
      theframe.pack();
      theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      theframe.setVisible(true);
   }

   //main
   public static void main(String[] args) {
      TTT_GUI ikea = new TTT_GUI();
   }
}
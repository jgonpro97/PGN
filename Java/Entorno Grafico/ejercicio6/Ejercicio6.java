package ejercicio6;

/**
 * 6. Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero. 
 *
 * Componentes gráficos: 
 *
 * Etiquetas.
 * Fichero a comprobar.
 * Caja de texto con resultado.
 * Botón calcular.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ejercicio6 extends JFrame {

  private JPanel contentPane;
  private File fichero;
  private JTextField textField;
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio6 frame = new Ejercicio6();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Ejercicio6() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblFichero = new JLabel("Fichero:");
    lblFichero.setBounds(39, 49, 70, 13);
    contentPane.add(lblFichero);
    
    JLabel lblPalabra = new JLabel("Palabra:");
    lblPalabra.setBounds(235, 49, 68, 13);
    contentPane.add(lblPalabra);
    
    textField = new JTextField();
    textField.setBounds(291, 46, 96, 19);
    contentPane.add(textField);
    textField.setColumns(10);
    
    JButton btnAbrir = new JButton("Abrir");
    btnAbrir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(contentPane);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
          
          fichero = fileChooser.getSelectedFile();
          
        }
      }
    });
    btnAbrir.setBounds(94, 45, 85, 21);
    contentPane.add(btnAbrir);
    
    JButton btnCalcular = new JButton("Calcular");
    btnCalcular.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        try {
          BufferedReader br = new BufferedReader(new FileReader(fichero));
          String palabra = textField.getText();
          String linea = "";
          int i = 0;
          int repetida = 0;
          
          while (linea != null) {
            linea = br.readLine();
            String[] palabras = new String[] { "" }; 
            
            if (linea != null) {
              palabras = linea.split(" ");
            }
            
            for (String p : palabras) {
                if (p.toUpperCase().equals(palabra.toUpperCase())) {
                  repetida++;
                }
              }
            }
                
          
          br.close();
          
          JOptionPane.showMessageDialog(null, "Ocurrencias: " + repetida);
          
        } catch (FileNotFoundException e1) {
          JOptionPane.showMessageDialog(null, "No se encuentra el fichero", "Error" , JOptionPane.ERROR_MESSAGE);
        } catch (IOException e1) {
          JOptionPane.showMessageDialog(null, "No se puede leer el fichero", "Error" , JOptionPane.ERROR_MESSAGE);
        }
        
      }
    });
    
    btnCalcular.setBounds(160, 132, 85, 21);
    contentPane.add(btnCalcular);
   
  }
}

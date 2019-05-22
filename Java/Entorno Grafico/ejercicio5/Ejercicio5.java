package ejercicio5;

/**
 * 5. Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc.
 * 
 * Componentes gráficos: 
 *
 * Etiquetas.
 * Fichero origen y destino.
 * Botón para ejecutar la acción.
 * Caja de texto con el contenido del fichero destino no editable.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Ejercicio5 extends JFrame {

  private JPanel contentPane;
  private JTextField textField;
  private File fichero1;
  private File fichero2;
  
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio5 frame = new Ejercicio5();
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
  public Ejercicio5() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel etFichero1 = new JLabel("Fichero 1:");
    etFichero1.setBounds(90, 37, 73, 13);
    contentPane.add(etFichero1);
    
    JLabel etFichero2 = new JLabel("Fichero 2:");
    etFichero2.setBounds(301, 37, 73, 13);
    contentPane.add(etFichero2);
    
    JButton btnAbrirF1 = new JButton("Abrir");
    btnAbrirF1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(contentPane);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
          
          fichero1 = fileChooser.getSelectedFile();
          
        }
      }
    });
    btnAbrirF1.setBounds(67, 60, 85, 21);
    contentPane.add(btnAbrirF1);
    
    JButton btnAbrirF2 = new JButton("Abrir");
    btnAbrirF2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(contentPane);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
          
          fichero2 = fileChooser.getSelectedFile();
          
        }
      }
    });
    
    btnAbrirF2.setBounds(282, 60, 85, 21);
    contentPane.add(btnAbrirF2);
    
    JButton btCrearFichero = new JButton("Crear Fichero");
    btCrearFichero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          BufferedReader br1 = new BufferedReader(new FileReader(fichero1));
          BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
          BufferedWriter bw = new BufferedWriter(new FileWriter("resultado.txt"));
        
          String linea1 = "";
          String linea2 = "";
          
          while ( (linea1 != null) || (linea2 != null) ) {  
            linea1 = br1.readLine();
            linea2 = br2.readLine();
 
            if (linea1 != null) {
              bw.write(linea1 + "\n");
            }
            
            if (linea2 != null) {
              bw.write(linea2 + "\n");
            }
          
          } 

          br1.close();
          br2.close();
          bw.close();
          
        } catch (FileNotFoundException e1) {
          JOptionPane.showMessageDialog(null, "No se encuentra el fichero", "Error" , JOptionPane.ERROR_MESSAGE);
        } catch (IOException e1) {
          JOptionPane.showMessageDialog(null, "No se puede leer el fichero", "Error" , JOptionPane.ERROR_MESSAGE);
        }
        
        JOptionPane.showMessageDialog(null, "Fichero creado correctamente");
        
      }
    });
    
    btCrearFichero.setBounds(153, 134, 133, 21);
    contentPane.add(btCrearFichero);
    
  }
}

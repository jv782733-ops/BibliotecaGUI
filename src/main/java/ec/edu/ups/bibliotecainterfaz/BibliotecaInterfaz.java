/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.bibliotecainterfaz;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BibliotecaInterfaz {

    public static void main(String[] args) {

        // FRAME 
        Frame frame = new Frame("Sistema de Biblioteca");
        frame.setSize(750, 420);
        frame.setLayout(new BorderLayout());

        //   MENU 
        Panel panelMenu = new Panel();
        panelMenu.setLayout(new GridLayout(5, 1));

        Button btnLibros = new Button("Registro de Libros");
        Button btnUsuarios = new Button("Registro de Usuarios");
        Button btnPrestamos = new Button("Préstamos");
        Button btnDevolucion = new Button("Devolución");
       
        panelMenu.add(btnLibros);
        panelMenu.add(btnUsuarios);
        panelMenu.add(btnPrestamos);
        panelMenu.add(btnDevolucion);
       

        //  PANEL CONTENIDO 
        Panel panelContenido = new Panel();
        panelContenido.setLayout(new FlowLayout());

        frame.add(panelMenu, BorderLayout.WEST);
        frame.add(panelContenido, BorderLayout.CENTER);

        //  EVENTOS

        // REGISTRO LIBROS
        btnLibros.addActionListener(
        new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            panelContenido.removeAll();
            panelContenido.setLayout(new GridLayout(4, 2));

            panelContenido.add(new Label("Código del Libro:"));
            panelContenido.add(new TextField());

            panelContenido.add(new Label("Título:"));
            panelContenido.add(new TextField());

            panelContenido.add(new Label("Autor:"));
            panelContenido.add(new TextField());

            panelContenido.add(new Button("Guardar"));

            panelContenido.revalidate();
            panelContenido.repaint();

            } 
        }
        );
       

        // REGISTRO USUARIOS
        btnUsuarios.addActionListener(
        new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            panelContenido.removeAll();
            panelContenido.setLayout(new GridLayout(3, 2));

            panelContenido.add(new Label("Cédula:"));
            panelContenido.add(new TextField());

            panelContenido.add(new Label("Nombre:"));
            panelContenido.add(new TextField());
           
            panelContenido.add(new Button("Registrar"));

            panelContenido.revalidate();
            panelContenido.repaint();

            }
        }
        );


        // PRESTAMOS
       btnPrestamos.addActionListener(
        new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            panelContenido.removeAll();
            panelContenido.setLayout(new GridLayout(3, 2));

            panelContenido.add(new Label("Código del Libro:"));
            panelContenido.add(new TextField());

            panelContenido.add(new Label("Cédula del Usuario:"));
            panelContenido.add(new TextField());

            panelContenido.add(new Button("Prestar"));

            panelContenido.revalidate();
            panelContenido.repaint();

            }
        }
        );

        // DEVOLUCION
       btnDevolucion.addActionListener(
        new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            panelContenido.removeAll();
            panelContenido.setLayout(new FlowLayout());

            panelContenido.add(new Label("Código del Libro:"));
            panelContenido.add(new TextField(15));
            panelContenido.add(new Button("Devolver"));

            panelContenido.revalidate();
            panelContenido.repaint();

            }
        }
        );

        
       

         //CIERRE DE LA  VENTANA
        frame.addWindowListener(
        new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
            frame.dispose();

            }

        }
        );
        frame.setVisible(true);
    }
}
    

    


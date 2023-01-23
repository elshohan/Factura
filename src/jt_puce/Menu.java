package jt_puce;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;

public class Menu extends JFrame {

    private final JDesktopPane desktopPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Menu frame = new Menu();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Menu() {
        setTitle("Sistema de Facturacion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 889, 690);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255, 255, 128));
        setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("Sistema");
        mnNewMenu.setBackground(Color.WHITE);
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
        mntmNewMenuItem.addActionListener(e -> dispose());
        mnNewMenu.add(mntmNewMenuItem);

        JMenu mnNewMenu_1 = new JMenu("Clientes");
        menuBar.add(mnNewMenu_1);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Crear Clientes");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearCliente crearClientes1 = null;
                for (JInternalFrame frame : desktopPane.getAllFrames()) {
                    if (frame instanceof crearCliente) {
                        crearClientes1 = (crearCliente) frame;
                        break;
                    }
                }
                if (crearClientes1 == null || !crearClientes1.isVisible()) {
                    crearClientes1 = new crearCliente();
                    desktopPane.add(crearClientes1);
                }
                crearClientes1.setVisible(true);
                try {
                    crearClientes1.setSelected(true);
                } catch (PropertyVetoException e1) {
                    e1.printStackTrace();
                }

            }
        });
        mnNewMenu_1.add(mntmNewMenuItem_1);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Lista de Clientes");
        mnNewMenu_1.add(mntmNewMenuItem_2);

        JMenu mnNewMenu_2 = new JMenu("Productos");
        menuBar.add(mnNewMenu_2);

        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Lista de Productos");
        mntmNewMenuItem_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearProductos productos1 = null;
                for (JInternalFrame frame : desktopPane.getAllFrames()) {
                    if (frame instanceof crearProductos) {
                        productos1 = (crearProductos) frame;
                        break;
                    }
                }
                if (productos1 == null || !productos1.isVisible()) {
                    productos1 = new crearProductos();
                    desktopPane.add(productos1);
                }
                productos1.setVisible(true);
                try {
                    productos1.setSelected(true);
                } catch (PropertyVetoException e1) {
                    e1.printStackTrace();
                }
            }
        });
        mnNewMenu_2.add(mntmNewMenuItem_5);

        JMenu mnNewMenu_3 = new JMenu("Redes sociales");
        menuBar.add(mnNewMenu_3);

        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Facebook");
        mntmNewMenuItem_3.setIcon(new ImageIcon("C:\\Users\\cris_\\Desktop\\Imagenes Prilad\\face 50x50.png"));
        mnNewMenu_3.add(mntmNewMenuItem_3);

        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Instagram");
        mntmNewMenuItem_4.setIcon(new ImageIcon("C:\\Users\\cris_\\Desktop\\Imagenes Prilad\\ig 50x50.png"));
        mnNewMenu_3.add(mntmNewMenuItem_4);
        JPanel contenedor = new JPanel();
        contenedor.setBackground(new Color(0, 0, 0));
        contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contenedor);
        contenedor.setLayout(new CardLayout(0, 0));

        desktopPane = new JDesktopPane();
        desktopPane.setBackground(new Color(128, 128, 255));
        contenedor.add(desktopPane, "name_322193500584500");
        desktopPane.setLayout(null);
    }
}
package jt_puce;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class crearCliente extends JInternalFrame {
    private final JTextField textField;
    private final JTextField textField_1;
    private final JTextField textField_2;
    private final JTextField textField_3;
    private final JTextField textField_4;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                crearCliente frame = new crearCliente();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public crearCliente() {
        setBounds(100, 100, 644, 487);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Nombres:");
        lblNewLabel.setBounds(23, 53, 89, 14);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Cedula:");
        lblNewLabel_1.setBounds(23, 28, 89, 14);
        getContentPane().add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(149, 25, 100, 20);
        getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(149, 50, 280, 20);
        getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Dirrecion:");
        lblNewLabel_2.setBounds(23, 81, 89, 14);
        getContentPane().add(lblNewLabel_2);

        textField_2 = new JTextField();
        textField_2.setBounds(149, 81, 279, 20);
        getContentPane().add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Telefono:");
        lblNewLabel_3.setBounds(23, 106, 89, 14);
        getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 =new JLabel("Email:");
        lblNewLabel_4.setBounds(23, 141, 89, 14);
        getContentPane().add(lblNewLabel_4);

        textField_3 = new JTextField();
        textField_3.setBounds(149, 112, 279, 20);
        getContentPane().add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(150, 138, 279, 20);
        getContentPane().add(textField_4);
        textField_4.setColumns(10);

        JButton btnNewButton = new JButton("Nuevo");
        btnNewButton.addActionListener(e -> {
            textField.setText("");
            textField_1.setText("");
            textField_2.setText("");
            textField_3.setText("");
            textField_4.setText("");
        });
        btnNewButton.setBounds(91, 211, 89, 23);
        getContentPane().add(btnNewButton);

        String[] columnNames = {"Cedula", "Nombres", "Direccion", "Telefono", "Email"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(46, 265, 535, 181);
        getContentPane().add(scrollPane);

        JButton btnNewButton_1 = new JButton("Guardar");
        btnNewButton_1.addActionListener(e -> {
            Clientes cliente1 = new Clientes();
            cliente1.setCedula(textField.getText());
            cliente1.setNombre(textField_1.getText());
            cliente1.setDireccion(textField_2.getText());
            cliente1.setTelefono(textField_3.getText());
            cliente1.setEmail(textField_4.getText());

            DefaultTableModel model1 = (DefaultTableModel) table.getModel();
            model1.addRow(new Object[]{cliente1.getCedula(), cliente1.getNombre(), cliente1.getDireccion(), cliente1.getTelefono(), cliente1.getEmail()});
        });

        btnNewButton_1.setBounds(258, 211, 89, 23);
        getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Cancelar");
        btnNewButton_2.addActionListener(e -> dispose());
        btnNewButton_2.setBounds(430, 211, 89, 23);
        getContentPane().add(btnNewButton_2);
    }
}
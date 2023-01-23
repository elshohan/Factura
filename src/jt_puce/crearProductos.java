package jt_puce;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.io.Serial;

public class crearProductos extends JInternalFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    private final JTextField textField;
    private final JTextField textField_1;
    private final JTextField textField_2;
    private final JTextField textField_3;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                crearProductos frame = new crearProductos();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public crearProductos() {
        setBounds(100, 100, 644, 487);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Descripcion:");
        lblNewLabel.setBounds(23, 53, 89, 14);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Codigo");
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

        JLabel lblNewLabel_2 = new JLabel("Cantidad:");
        lblNewLabel_2.setBounds(23, 81, 89, 14);
        getContentPane().add(lblNewLabel_2);

        textField_2 = new JTextField();
        textField_2.setBounds(149, 81, 279, 20);
        getContentPane().add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Precio:");
        lblNewLabel_3.setBounds(23, 106, 89, 14);
        getContentPane().add(lblNewLabel_3);

        textField_3 = new JTextField();
        textField_3.setBounds(149, 112, 279, 20);
        getContentPane().add(textField_3);
        textField_3.setColumns(10);

        JButton btnNewButton = new JButton("Nuevo");
        btnNewButton.addActionListener(e -> {
            textField.setText("");
            textField_1.setText("");
            textField_2.setText("");
            textField_3.setText("");
        });
        btnNewButton.setBounds(91, 211, 89, 23);
        getContentPane().add(btnNewButton);

        String[] columnNames = {"Codigo", "Descripcion", "Cantidad", "Precio"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(46, 265, 535, 181);
        getContentPane().add(scrollPane);

        JButton btnNewButton_1 = new JButton("Guardar");
        btnNewButton_1.addActionListener(e -> {
            Productos productos1 = new Productos();
            productos1.setCodigo(textField.getText());
            productos1.setCantidad(textField_1.getText());
            productos1.setDescripcion(textField_2.getText());
            productos1.setPrecio(textField_3.getText());

            DefaultTableModel model1 = (DefaultTableModel) table.getModel();
            model1.addRow(new Object[]{productos1.getCodigo(),productos1.getCantidad(), productos1.getDescripcion(), productos1.getPrecio()});
        });
        btnNewButton_1.setBounds(258, 211, 89, 23);
        getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Cancelar");
        btnNewButton_2.addActionListener(e -> dispose());
        btnNewButton_2.setBounds(430, 211, 89, 23);
        getContentPane().add(btnNewButton_2);
    }
}
package paneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Renta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;
	
	private static PrincipalPanel panelPrincipal;
	private static Vehiculos vehiculos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Renta frame = new Renta(panelPrincipal);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Renta(PrincipalPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
		this.vehiculos = new Vehiculos(panelPrincipal, this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 682);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(623, 59, 260, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Resumen de precio");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 17));
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel.setBounds(0, 0, 260, 30);
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Precio por dia: ");
		lblNewLabel_1.setBounds(10, 59, 100, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cargo por seguro: ");
		lblNewLabel_1_1.setBounds(10, 110, 115, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblTotalAPagar = new JLabel("  Total a pagar: ");
		lblTotalAPagar.setFont(new Font("Candara", Font.BOLD, 17));
		lblTotalAPagar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblTotalAPagar.setBounds(0, 270, 260, 30);
		panel.add(lblTotalAPagar);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Precio por *tantos dias * :");
		lblNewLabel_1_1_1.setBounds(10, 172, 165, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(25, 59, 524, 300);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAutoARentar = new JLabel("  Auto a rentar");
		lblAutoARentar.setFont(new Font("Candara", Font.BOLD, 17));
		lblAutoARentar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAutoARentar.setBounds(0, 0, 524, 30);
		panel_1.add(lblAutoARentar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Renta.class.getResource("/paneles/blazer.png")));
		lblNewLabel_2.setBounds(10, 41, 200, 130);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("SUV");
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(10, 215, 81, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Chevrolet");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_2.setBounds(10, 240, 81, 14);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Blazer");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_3.setBounds(97, 240, 81, 14);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("2024");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_3_1.setBounds(10, 275, 116, 14);
		panel_1.add(lblNewLabel_3_3_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Blazer", "Wrangler", "Huracan STO", "GTR R35", "Camaro RS", "XM"}));
		comboBox.setBounds(10, 182, 116, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha Inicial");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(281, 109, 109, 14);
		panel_1.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(281, 136, 155, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(281, 212, 155, 20);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("Fecha final");
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(280, 184, 109, 14);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Nombre cliente");
		lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_4_2.setBounds(281, 41, 126, 14);
		panel_1.add(lblNewLabel_4_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(281, 66, 155, 20);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_5 = new JLabel("Automatico");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(97, 216, 81, 14);
		panel_1.add(lblNewLabel_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(25, 409, 524, 204);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblFormaDePago = new JLabel("  Forma de pago");
		lblFormaDePago.setFont(new Font("Candara", Font.BOLD, 17));
		lblFormaDePago.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblFormaDePago.setBounds(0, 0, 524, 30);
		panel_2.add(lblFormaDePago);
		
		JLabel lblNewLabel_3 = new JLabel("Titular de la tarjeta");
		lblNewLabel_3.setBounds(230, 41, 212, 14);
		panel_2.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(230, 66, 212, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_4 = new JLabel("Numero de la tarjeta");
		lblNewLabel_3_4.setBounds(230, 97, 212, 14);
		panel_2.add(lblNewLabel_3_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(230, 115, 212, 20);
		panel_2.add(textField_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Año");
		lblNewLabel_3_4_1.setBounds(230, 146, 103, 14);
		panel_2.add(lblNewLabel_3_4_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(230, 171, 86, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("CVV");
		lblNewLabel_3_4_1_1.setBounds(339, 146, 103, 14);
		panel_2.add(lblNewLabel_3_4_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(339, 171, 86, 20);
		panel_2.add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("Numero de tarjeta");
		lblNewLabel_6.setBounds(230, 41, 103, 14);
		lblNewLabel_6.setVisible(false);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("1234-5678-9123-4567");
		lblNewLabel_7.setBounds(230, 66, 156, 14);
		lblNewLabel_7.setVisible(false);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_5 = new JLabel("Nombre");
		lblNewLabel_3_5.setVisible(false);
		lblNewLabel_3_5.setBounds(230, 97, 212, 14);
		panel_2.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_7_1 = new JLabel("Humberto Peralta Meza");
		lblNewLabel_7_1.setBounds(230, 118, 156, 14);
		lblNewLabel_7_1.setVisible(false);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Banco");
		lblNewLabel_3_5_1.setVisible(false);
		lblNewLabel_3_5_1.setBounds(230, 146, 212, 14);
		panel_2.add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("BBVA");
		lblNewLabel_7_1_1.setBounds(230, 174, 156, 14);
		lblNewLabel_7_1_1.setVisible(false);
		panel_2.add(lblNewLabel_7_1_1);
		
		String[] pago = { "Tarjeta", "Transferencia"};
		
		JComboBox<String> comboBox_1 = new JComboBox<>(pago);
		comboBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox comboBox = (JComboBox) e.getSource();
				switch ((String) comboBox.getSelectedItem()) {
				case "Transferencia":
					lblNewLabel_3.setVisible(false);
					textField.setVisible(false);
					lblNewLabel_3_4.setVisible(false);
					textField_1.setVisible(false);
					lblNewLabel_3_4_1.setVisible(false);
					textField_2.setVisible(false);
					lblNewLabel_3_4_1_1.setVisible(false);
					textField_3.setVisible(false);
					lblNewLabel_6.setVisible(true);
					lblNewLabel_7.setVisible(true);
					lblNewLabel_3_5.setVisible(true);
					lblNewLabel_7_1.setVisible(true);
					lblNewLabel_3_5_1.setVisible(true);
					lblNewLabel_7_1_1.setVisible(true);
					break;
				case "Tarjeta":
					lblNewLabel_3.setVisible(true);
					textField.setVisible(true);
					lblNewLabel_3_4.setVisible(true);
					textField_1.setVisible(true);
					lblNewLabel_3_4_1.setVisible(true);
					textField_2.setVisible(true);
					lblNewLabel_3_4_1_1.setVisible(true);
					textField_3.setVisible(true);
					lblNewLabel_6.setVisible(false);
					lblNewLabel_7.setVisible(false);
					lblNewLabel_3_5.setVisible(false);
					lblNewLabel_7_1.setVisible(false);
					lblNewLabel_3_5_1.setVisible(false);
					lblNewLabel_7_1_1.setVisible(false);
					break;
				}
			}
		});
		comboBox_1.setBounds(10, 41, 124, 22);
		panel_2.add(comboBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(623, 409, 260, 204);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Rentar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(83, 170, 89, 23);
		panel_3.add(btnNewButton);
		
		JLabel lblOpciones = new JLabel("Opciones");
		lblOpciones.setFont(new Font("Candara", Font.BOLD, 17));
		lblOpciones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblOpciones.setBounds(0, 0, 260, 30);
		panel_3.add(lblOpciones);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setBackground(new Color(0, 128, 255));
		btnLimpiar.setBounds(83, 129, 89, 23);
		panel_3.add(btnLimpiar);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(0, 0, 933, 36);
		contentPane.add(panel_4);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(25, 0, 160, 33);
		btnNewButton_6.setBackground(new Color(121, 188, 255));
		btnNewButton_6.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/back.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				vehiculos.setVisible(true);
				vehiculos.setLocationRelativeTo(null);
			}
		});
		panel_4.setLayout(null);
		panel_4.add(btnNewButton_6);
	}
}

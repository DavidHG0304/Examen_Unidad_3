package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 28));
		lblNewLabel.setBounds(87, 49, 189, 39);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("*Logo*");
		lblNewLabel_3.setBounds(146, 159, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Crear cuenta");
		lblNewLabel_1.setFont(new Font("Bell MT", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(150, 49, 148, 36);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(42, 242, 124, 25);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contraseña");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(42, 336, 124, 25);
		panel_2.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(42, 278, 307, 36);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(42, 372, 307, 36);
		panel_2.add(textField_1);
		
		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login login = new Login();
				login.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(225, 561, 124, 36);
		panel_2.add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Crear cuenta");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PrincipalPanel panel_principal= new PrincipalPanel();
				panel_principal.setVisible(true);
			}
		});
		btnRegistrarse.setBackground(new Color(0, 128, 255));
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegistrarse.setBounds(42, 561, 124, 36);
		panel_2.add(btnRegistrarse);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(42, 466, 307, 36);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Confirmar contraseña");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(42, 430, 237, 25);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Correo electronico");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(42, 149, 182, 25);
		panel_2.add(lblNewLabel_2_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(42, 185, 307, 36);
		panel_2.add(textField_3);
	}

}

package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	private JPasswordField textField_2;
	private JTextField textField_3;
	
	
	private Boolean hayCuenta = false;
	//Aniadir al panel principal para definirlo como parametro dentro del registro y del login para utilizarlo una vez y no crear varias instancias
	//de el mismo
	//Modifique el constructor porque no funcionaba el actionListener del Registro al momento de crear la cuenta para validar si la cuenta habia sido creada
	//Tambien hice lo mismo con el login, deberia de funcionar junto con las demas funciones que vayamos a aniadir
	private static PrincipalPanel panelPrincipal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro(panelPrincipal);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	//Getter booleano hayCuenta para saber simular y validar la creacion de la cuenta en este panel de registro
	
	public Boolean getHayCuenta() {
		return hayCuenta;
	}
	
	public void setHayCuenta(Boolean hayCuenta) {
		this.hayCuenta = hayCuenta;
	}
	
	
	
	public Registro(PrincipalPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
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
		
		
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(42, 372, 307, 36);
		panel_2.add(textField_1);
		
		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login login = new Login(panelPrincipal);
				login.setVisible(true);
				login.setLocationRelativeTo(null);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(225, 561, 124, 36);
		panel_2.add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Crear cuenta");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setBorder(new LineBorder(Color.black, 1));
				textField_3.setBorder(new LineBorder(Color.black, 1));
				textField_1.setBorder(new LineBorder(Color.black, 1));
				textField_2.setBorder(new LineBorder(Color.black, 1));
				
				String auxCorreo = new String(textField_3.getText());
				String auxUsuario = new String(textField.getText());
				String auxContra = new String(textField_1.getPassword());
				String auxVerContra = new String(textField_2.getPassword());
				
				if (auxCorreo.isEmpty() || auxUsuario.isEmpty() || auxContra.isEmpty() || auxVerContra.isEmpty()) {
		            if (auxUsuario.isEmpty()) {
		                textField.setBorder(new LineBorder(Color.red, 2));
		            }
		            if (auxCorreo.isEmpty()) {
		                textField_3.setBorder(new LineBorder(Color.red, 2));
		            }
		            if (auxContra.isEmpty()) {
		                textField_1.setBorder(new LineBorder(Color.red, 2));
		            }
		            if (auxVerContra.isEmpty()) {
		                textField_2.setBorder(new LineBorder(Color.red, 2));
		            }
		            JOptionPane.showMessageDialog(null, "Faltan campos por rellenar", "Rellene Campos", JOptionPane.WARNING_MESSAGE);
		        } else if (!auxContra.equals(auxVerContra)) {
		            textField_1.setBorder(new LineBorder(Color.red, 2));
		            textField_2.setBorder(new LineBorder(Color.red, 2));
		            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(null, "Cuenta creada con éxito", "Cuenta creada", JOptionPane.INFORMATION_MESSAGE);
		            JOptionPane.showMessageDialog(null, "Una vez crea la cuenta puede mandarlo al panel directamente de los vehiculos para consultarlos", "IDEA", JOptionPane.INFORMATION_MESSAGE);
		            hayCuenta = true;
		            System.out.println(hayCuenta);
		            dispose();
		            panelPrincipal.setVisible(true);
		            panelPrincipal.setLocationRelativeTo(null);
		        }
		    }
		});
		
		
		System.out.println(hayCuenta);
		btnRegistrarse.setBackground(new Color(0, 128, 255));
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegistrarse.setBounds(42, 561, 124, 36);
		panel_2.add(btnRegistrarse);
		
		textField_2 = new JPasswordField();
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

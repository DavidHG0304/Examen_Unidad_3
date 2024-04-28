package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
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
	private Login login;
	
	
	private Boolean hayCuenta = false;
	
	private String auxUsuario;
	
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
	
	public String getAuxUsuario() {
		return auxUsuario;
	}

	
	public Registro(PrincipalPanel panelPrincipal) {
		login = new Login(panelPrincipal);
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
		
		JPanel panel_1 = new JPanel() {
			public void paintComponent(Graphics g) {

				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(new GradientPaint(0.0f, 0.0f, new Color(0, 128, 255, 255), getWidth(), getHeight(), new Color(2, 27, 121, 255), true));
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};
		panel_1.setBackground(new Color(0, 128, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DahuRental");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 50));
		lblNewLabel.setBounds(65, 228, 313, 54);
		panel_1.add(lblNewLabel);
		
		JLabel lblLema = new JLabel("Preferido por los Amantes de los Autos");
		lblLema.setForeground(new Color(255, 255, 255));
		lblLema.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblLema.setBounds(66, 289, 313, 39);
		panel_1.add(lblLema);
		
		JLabel lblNewLabel_3 = new JLabel("*Logo*");
		lblNewLabel_3.setBounds(190, 359, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Crear cuenta");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblNewLabel_1.setBounds(42, 85, 189, 36);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(new Color(0,0,0,90));
		lblNewLabel_2.setBounds(42, 253, 124, 25);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contraseña");
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2_1.setForeground(new Color(0,0,0,90));
		lblNewLabel_2_1.setBounds(42, 348, 124, 25);
		panel_2.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(Color.GRAY,1,true));
		textField.setBounds(42, 278, 366, 36);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBorder(new LineBorder(Color.GRAY,1,true));
		textField_1.setColumns(10);
		textField_1.setBounds(42, 372, 366, 36);
		panel_2.add(textField_1);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
//				login.setVisible(true);
//				login.setLocationRelativeTo(null);
//				login.setResizable(false);
				
				panelPrincipal.setVisible(true);
				panelPrincipal.setLocationRelativeTo(null);
				panelPrincipal.setResizable(false);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(42, 561, 137, 36);
		panel_2.add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Crear cuenta");
		btnRegistrarse.setForeground(new Color(255, 255, 255));
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setBorder(new LineBorder(Color.black, 1));
				textField_3.setBorder(new LineBorder(Color.black, 1));
				textField_1.setBorder(new LineBorder(Color.black, 1));
				textField_2.setBorder(new LineBorder(Color.black, 1));
				
				String auxCorreo = new String(textField_3.getText());
				auxUsuario = new String(textField.getText());
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
//		            JOptionPane.showMessageDialog(null, "Faltan campos por rellenar", "Rellene Campos", JOptionPane.WARNING_MESSAGE);
		        } else if (!auxContra.equals(auxVerContra)) {
		            textField_1.setBorder(new LineBorder(Color.red, 2));
		            textField_2.setBorder(new LineBorder(Color.red, 2));
		            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
//		            JOptionPane.showMessageDialog(null, "Cuenta creada con éxito", "Cuenta creada", JOptionPane.INFORMATION_MESSAGE);
//		            JOptionPane.showMessageDialog(null, "Una vez crea la cuenta puede mandarlo al panel directamente de los vehiculos para consultarlos", "IDEA", JOptionPane.INFORMATION_MESSAGE);
		            hayCuenta = true;
		            dispose();
		            panelPrincipal.setVisible(true);
		            panelPrincipal.setLocationRelativeTo(null);
		        }
		    }
		});
		
		
		btnRegistrarse.setBackground(new Color(5, 117, 230));
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegistrarse.setBounds(225, 561, 124, 36);
		panel_2.add(btnRegistrarse);
		
		textField_2 = new JPasswordField();
		textField_2.setBorder(new LineBorder(Color.GRAY,1,true));
		textField_2.setColumns(10);
		textField_2.setBounds(42, 466, 366, 36);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Confirmar contraseña");
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setForeground(new Color(0,0,0,90));
		lblNewLabel_2_1_1.setBounds(42, 443, 237, 25);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Correo electronico");
		lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2_2.setForeground(new Color(0,0,0,90));
		lblNewLabel_2_2.setBounds(42, 160, 182, 25);
		panel_2.add(lblNewLabel_2_2);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(Color.GRAY,1,true));
		textField_3.setColumns(10);
		textField_3.setBounds(42, 185, 366, 36);
		panel_2.add(textField_3);
		
//		JLabel lblNewLabel_4 = new JLabel("Ya tiene una cuenta?");
//		lblNewLabel_4.setForeground(new Color(56, 120, 237));
//		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
//		lblNewLabel_4.setBounds(44, 545, 137, 14);
//		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Crea una cuenta para empezar");
		lblNewLabel_1_1.setForeground(new Color(0,0,0,90));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(44, 119, 245, 22);
		panel_2.add(lblNewLabel_1_1);
	}
}

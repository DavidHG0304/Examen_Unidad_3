package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	
	private static PrincipalPanel panelPrincipal;
	String auxUsuario;
	private Boolean hayCuenta = false;
	String auxContra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login(panelPrincipal);
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
	
	public Boolean getHayCuenta() {
		return hayCuenta;
	}
	public void setHayCuenta(Boolean hayCuenta) {
		this.hayCuenta = hayCuenta;
	}
	public String getAuxUsuario() {
		return auxUsuario;
	}

	public Login(PrincipalPanel panelPrincipal) {
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
				g2d.setPaint(new GradientPaint(0.0f, 0.0f, new Color(0, 128, 255,255), getWidth(), getHeight(), new Color(2,27,121,255), true));
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120,440, 350, 350);
				g2d.drawOval(-60,460, 350, 350);
			}
		};
		panel_1.setBackground(new Color(0, 128, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Preferido por los Amantes de los Autos");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(66, 289, 313, 39);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("*Logo*");
		lblNewLabel_3.setBounds(190, 359, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblExampletest = new JLabel("DahuRental");
		lblExampletest.setForeground(new Color(255, 255, 255));
		lblExampletest.setFont(new Font("Segoe UI", Font.BOLD, 50));
		lblExampletest.setBounds(65, 228, 313, 54);
		panel_1.add(lblExampletest);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Iniciar Sesión");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblNewLabel_1.setBounds(42, 85, 194, 36);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(new Color(0,0,0,90));
		lblNewLabel_2.setBounds(42, 253, 124, 25);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contraseña");
		lblNewLabel_2_1.setForeground(new Color(0,0,0,90));
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(42, 348, 124, 25);
		panel_2.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(Color.GRAY,1,true));
		textField.setBounds(42, 278, 366, 36);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField.setBorder(new LineBorder(Color.GRAY,1,true));
		textField_1.setColumns(10);
		textField_1.setBounds(42, 372, 366, 36);
		panel_2.add(textField_1);
		
		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setBorder(new LineBorder(Color.black, 1));
				textField_1.setBorder(new LineBorder(Color.black, 1));
				
				auxUsuario = new String(textField.getText());
				auxContra = new String(textField_1.getPassword());
				
				if (auxUsuario.isEmpty() || auxContra.isEmpty()) {
					if(auxContra.isEmpty() && auxUsuario.isEmpty()) {
						textField.setBorder(new LineBorder(Color.red, 2));
						textField_1.setBorder(new LineBorder(Color.red, 2));
//						JOptionPane.showMessageDialog(null, "Faltan campos por rellenar", "Rellene Campos", JOptionPane.WARNING_MESSAGE);
					}
					else if (auxUsuario.isEmpty()) {
		                textField.setBorder(new LineBorder(Color.red, 2));
//		                JOptionPane.showMessageDialog(null, "Falta el nombre de usuario", "Rellene Campos", JOptionPane.WARNING_MESSAGE);
		            }
					else if (auxContra.isEmpty()) {
		                textField_1.setBorder(new LineBorder(Color.red, 2));
//		                JOptionPane.showMessageDialog(null, "Ingrese su contrasenia", "Rellene Campos", JOptionPane.WARNING_MESSAGE);
		            }
		        }else {
		        	hayCuenta = true;
		            JOptionPane.showMessageDialog(null, "Ha iniciado sesion", "Ingreso Exitoso", JOptionPane.INFORMATION_MESSAGE);
//		            JOptionPane.showMessageDialog(null, "Una vez inicia sesion podria mandarlo al panel directamente de los vehiculos para consultarlos", "IDEA", JOptionPane.INFORMATION_MESSAGE);
		            dispose();
		            panelPrincipal.getBtnLogin().setEnabled(false);
					panelPrincipal.getBtnRegistro().setText("Log Out");
		            panelPrincipal.getBtnLogin().setText(auxUsuario);;
		            panelPrincipal.setVisible(true);
		            panelPrincipal.setLocationRelativeTo(null);
		        }
		    }
		});
		
		btnNewButton.setBackground(new Color(5, 117, 230));
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton.setBounds(225, 561, 124, 36);
		panel_2.add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setForeground(new Color(0, 0, 0));
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Registro registro = new Registro(panelPrincipal);
				registro.setVisible(true);
				registro.setLocationRelativeTo(null);
				registro.setResizable(false);
			}
		});
		
		btnRegistrarse.setBackground(new Color(255, 255, 255));
		btnRegistrarse.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnRegistrarse.setBounds(42, 561, 137, 36);
		panel_2.add(btnRegistrarse);
		
		JLabel lblNewLabel_4 = new JLabel("No tiene una cuenta?");
		lblNewLabel_4.setForeground(new Color(56, 120, 237));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_4.setBounds(42, 545, 137, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Inicie sesion para continuar");
		lblNewLabel_1_1.setForeground(new Color(0,0,0,90));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(44, 119, 220, 22);
		panel_2.add(lblNewLabel_1_1);
	}

	
}

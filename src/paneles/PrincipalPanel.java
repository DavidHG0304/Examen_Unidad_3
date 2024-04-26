package paneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class PrincipalPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel_principal;
	
	Font palabrasNormal = new Font("Arial", Font.BOLD, 20);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalPanel frame = new PrincipalPanel();
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
	public PrincipalPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 682);
		panel_principal = new JPanel();
		panel_principal.setBackground(new Color(240, 197, 64));
		panel_principal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel_principal);
		panel_principal.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_central = new JPanel();
		panel_principal.add(panel_central, BorderLayout.CENTER);
		panel_central.setLayout(new BorderLayout(0, 0));
		
		JPanel panelLogos = new JPanel();
		panel_central.add(panelLogos, BorderLayout.SOUTH);
		panelLogos.setLayout(new GridLayout(2, 10, 0, 0));
		
		JLabel lblLogo = new JLabel("*logo*");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo);
		
		JLabel lblLogo2 = new JLabel("*logo*");
		lblLogo2.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo2);
		
		JLabel lblLogo3 = new JLabel("*logo*");
		lblLogo3.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo3);
		
		JLabel lblLogo4 = new JLabel("*logo*");
		lblLogo4.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo4);
		
		JLabel lblLogo5 = new JLabel("*logo*");
		lblLogo5.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo5);
		
		JLabel lblEspacio1 = new JLabel("");
		lblEspacio1.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblEspacio1);
		
		JLabel lblEspacio2 = new JLabel("");
		lblEspacio2.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblEspacio2);
		
		JLabel lblEspacio3 = new JLabel("");
		lblEspacio3.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblEspacio3);
		
		JLabel lblEspacio4 = new JLabel("");
		lblEspacio4.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblEspacio4);
		
		JLabel lblEspacio5 = new JLabel("");
		lblEspacio5.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblEspacio5);
		
		JPanel panelBotones = new JPanel();
		panel_central.add(panelBotones, BorderLayout.NORTH);
		panelBotones.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panelBotones.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelL = new JPanel();
		panelL.setBackground(new Color(255, 255, 255));
		panel.add(panelL);
		panelL.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNombreE = new JLabel("*NOMBRETIENDA*");
		lblNombreE.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreE.setFont(new Font("Arial", Font.BOLD, 16));
		lblNombreE.setForeground(new Color(78, 121, 222));
		panelL.add(lblNombreE);
		
		JLabel lblEspacio = new JLabel("");
		panelL.add(lblEspacio);
		
		JPanel panelR = new JPanel();
		panelR.setBackground(new Color(128, 128, 128));
		panel.add(panelR);
		panelR.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnReserv = new JButton("Reservacion");
		btnReserv.setFont(new Font("Arial", Font.PLAIN, 14));
		btnReserv.setBackground(new Color(255, 255, 255));
		btnReserv.setForeground(new Color(78, 121, 222));
		btnReserv.setBorderPainted(false);
		panelR.add(btnReserv);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setForeground(new Color(78, 121, 222));
		btnLogin.setBorderPainted(false);
		panelR.add(btnLogin);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setFont(new Font("Arial", Font.PLAIN, 14));
		btnRegistro.setBackground(new Color(254, 180, 54));
		btnRegistro.setForeground(new Color(255, 255, 255));
		btnRegistro.setBorderPainted(false);
		panelR.add(btnRegistro);
		
		JPanel panelCentral = new JPanel();
		panel_central.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelDescripcion = new JPanel();
		panelCentral.add(panelDescripcion);
		panelDescripcion.setLayout(null);
		
		JLabel lblDescripcion1 = new JLabel("Lorem ipsum dolor");
		lblDescripcion1.setFont(new Font("Arial", Font.BOLD, 40));
		lblDescripcion1.setForeground(new Color(51, 101, 217));
		lblDescripcion1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion1.setBounds(55, 125, 407, 47);
		panelDescripcion.add(lblDescripcion1);
		
		JLabel lblDescripcion2 = new JLabel(" Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed");
		lblDescripcion2.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion2.setForeground(new Color(51, 101, 217));
		lblDescripcion2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescripcion2.setBounds(55, 275, 407, 27);
		panelDescripcion.add(lblDescripcion2);
		
		JLabel lblDescripcion3 = new JLabel(" do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		lblDescripcion3.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion3.setForeground(new Color(51, 101, 217));
		lblDescripcion3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescripcion3.setBounds(55, 295, 407, 27);
		panelDescripcion.add(lblDescripcion3);
		
		JLabel lblDescripcion4 = new JLabel(" Ut enim ad minim veniam, quis nostrud exercitation ullamco");
		lblDescripcion4.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion4.setForeground(new Color(51, 101, 217));
		lblDescripcion4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescripcion4.setBounds(55, 317, 407, 27);
		panelDescripcion.add(lblDescripcion4);
		
		JLabel lblDescripcion1_1 = new JLabel("sit amen, consect");
		lblDescripcion1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion1_1.setForeground(new Color(51, 101, 217));
		lblDescripcion1_1.setFont(new Font("Arial", Font.BOLD, 40));
		lblDescripcion1_1.setBounds(55, 165, 407, 47);
		panelDescripcion.add(lblDescripcion1_1);
		
		JLabel lblLoewmIpsumDolor = new JLabel("Lorem ipsum");
		lblLoewmIpsumDolor.setHorizontalAlignment(SwingConstants.LEFT);
		lblLoewmIpsumDolor.setForeground(new Color(254, 180, 54));
		lblLoewmIpsumDolor.setFont(new Font("Arial", Font.BOLD, 40));
		lblLoewmIpsumDolor.setBounds(55, 217, 407, 47);
		panelDescripcion.add(lblLoewmIpsumDolor);
		
		JPanel panelImagen = new JPanel();
		panelCentral.add(panelImagen);
		panelImagen.setLayout(null);
		
		JLabel lblImagen = new JLabel("*imagenCarro*");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBounds(21, 114, 409, 255);
		panelImagen.add(lblImagen);
		JPanel panel_inferior = new JPanel();
		panel_inferior.setBackground(new Color(254, 180, 24));
		panel_principal.add(panel_inferior, BorderLayout.SOUTH);
		panel_inferior.setLayout(new GridLayout(2, 4, 10, 0));
		
		JLabel lblTxt = new JLabel("500+");
		lblTxt.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxt.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTxt.setForeground(new Color(255, 255, 255));
		lblTxt.setFont(new Font("Arial", Font.BOLD, 30));
		panel_inferior.add(lblTxt);
		
		JLabel lblTxt2 = new JLabel("90+");
		lblTxt2.setFont(new Font("Arial", Font.BOLD, 30));
		lblTxt2.setForeground(new Color(255, 255, 255));
		lblTxt2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt2);
		
		JLabel lblTxt3 = new JLabel("200+");
		lblTxt3.setFont(new Font("Arial", Font.BOLD, 30));
		lblTxt3.setForeground(new Color(255, 255, 255));
		lblTxt3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt3);
		
		JLabel lblTxt4 = new JLabel("5000+");
		lblTxt4.setFont(new Font("Arial", Font.BOLD, 30));
		lblTxt4.setForeground(new Color(255, 255, 255));
		lblTxt4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt4);
		
		JLabel lblTxt1_1 = new JLabel("Autos");
		lblTxt1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblTxt1_1.setForeground(new Color(255, 255, 255));
		
		
		lblTxt1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt1_1);
		
		JLabel lblTxt2_2 = new JLabel("Expertos en venta");
		lblTxt2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblTxt2_2.setForeground(new Color(255, 255, 255));
		lblTxt2_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt2_2);
		
		JLabel lblTxt3_3 = new JLabel("Localizaciones");
		lblTxt3_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblTxt3_3.setForeground(new Color(255, 255, 255));
		lblTxt3_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt3_3);
		
		JLabel lblTxt4_4 = new JLabel("Compradores");
		lblTxt4_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblTxt4_4.setForeground(new Color(255, 255, 255));
		lblTxt4_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt4_4);
	}
}

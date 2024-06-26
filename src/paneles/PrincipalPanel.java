package paneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder; 
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;

public class PrincipalPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel_principal;
	private Login login;
	private Registro registro;
	private Vehiculos vehiculos;
	private JButton btnLogin;
	private JButton btnRegistro;
	private Renta renta;
	private CrearRenta crearRenta;
	private AniadirCarro panelAniadir;
	private int diaSeleccionado1;
	private int diaSeleccionado2;
	boolean fechaInicialSeleccionada = false;
	boolean fechaFinalSeleccionada = false;
	private ArrayList<Carros> arrayCarros;
	GradientPaint gradiant = new GradientPaint(50.0f, 300.0f, new Color(0, 58, 156, 255), getWidth(), getHeight(),new Color(10, 112, 255, 255), true);
	
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
	public JButton getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	public JButton getBtnRegistro() {
		return btnRegistro;
	}
	public void setBtnRegistro(JButton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}
	
	public ArrayList<Carros> getArrayCarros() {
		return arrayCarros;
	}
	
	public void setArrayCarros(ArrayList<Carros> arrayCarros) {
		this.arrayCarros = arrayCarros;
	}

//	Podria crear en la instancia el arraylist para poder pasarselo a todos los demas
	

	public PrincipalPanel() {
		arrayCarros = new ArrayList<Carros>();
		arrayCarros.add(new Carros("Deportivo", "Chevrolet", "Camaro RS", 2027, "/paneles/camaroncito.png", "Automatico", 85));		
		arrayCarros.add(new Carros("Deportivo", "Nissan", "GTR R35", 2024, "/paneles/gtr.png", "Automatico", 1000));
		arrayCarros.add(new Carros("Deportivo", "Lamborghini", "Huracan STO", 2021, "/paneles/huracan.png", "Automatico", 3000));
		arrayCarros.add(new Carros("Suv", "BMW", "XM", 2024, "/paneles/xm.png", "Automatico", 500));        
		arrayCarros.add(new Carros("Suv", "Chevrolet", "Blazer", 2024, "/paneles/blazer.png", "Automatico", 300));
		arrayCarros.add(new Carros("Todoterreno", "Jeep", "Wrangler", 2024, "/paneles/wrangler.png", "Automatico", 350));
		
		
		this.panelAniadir = new AniadirCarro(vehiculos, arrayCarros, renta);
		this.login = new Login(this);
		this.registro = new Registro(this, login);
		this.renta = new Renta(this, vehiculos, arrayCarros);
		this.vehiculos = new Vehiculos(this, arrayCarros);
		this.crearRenta = new CrearRenta(this,arrayCarros, renta);
		
		login.setResizable(false);
		registro.setResizable(false);
		crearRenta.setResizable(false);
		renta.setResizable(false);
		vehiculos.setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 682);
		panel_principal = new JPanel() {
			
			public void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(new GradientPaint(0.0f, 0.0f, new Color(0, 169, 255,255), getWidth(), getHeight(), new Color(83, 169, 255,255), true));
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};
		panel_principal.setBackground(new Color(83, 169, 255));
		panel_principal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel_principal);
		panel_principal.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_central = new JPanel();
		panel_principal.add(panel_central, BorderLayout.CENTER);
		panel_central.setLayout(new BorderLayout(0, 0));
		
		JPanel panelLogos = new JPanel();
		panel_central.add(panelLogos, BorderLayout.SOUTH);
		panelLogos.setLayout(new GridLayout(1, 10, 0, 0));
		
		JLabel lblLogo = new JLabel(new ImageIcon(getClass().getResource("nissan.png")));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo);
		
		JLabel lblLogo2 = new JLabel("");
		lblLogo2.setIcon(new ImageIcon(getClass().getResource("volkswagen.png")));
		lblLogo2.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo2);
		
		JLabel lblLogo3 = new JLabel("");
		lblLogo3.setIcon(new ImageIcon(getClass().getResource("honda.png")));
		lblLogo3.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo3);
		
		JLabel lblLogo4 = new JLabel("");
		lblLogo4.setIcon(new ImageIcon(getClass().getResource("jeep.png")));
		lblLogo4.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo4);
		
		JLabel lblLogo5 = new JLabel("");
		lblLogo5.setIcon(new ImageIcon(getClass().getResource("ferrari.png")));
		lblLogo5.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo5);
		
		JLabel lblLogo6 = new JLabel("");
		lblLogo6.setIcon(new ImageIcon(getClass().getResource("mitsubishi.png")));
		lblLogo6.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo6);
		
		JLabel lblLogo7 = new JLabel("");
		lblLogo7.setIcon(new ImageIcon(getClass().getResource("toyota.png")));
		lblLogo7.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo7);
		
		JLabel lblLogo8 = new JLabel("");
		lblLogo8.setIcon(new ImageIcon(getClass().getResource("chevrolet.png")));
		lblLogo8.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo8);
		
		JLabel lblLogo9 = new JLabel("");
		lblLogo9.setIcon(new ImageIcon(getClass().getResource("bmw.png")));
		lblLogo9.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo9);
		
		JLabel lblLogo10 = new JLabel("");
		lblLogo10.setIcon(new ImageIcon(getClass().getResource("lamborghini.png")));
		lblLogo10.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogos.add(lblLogo10);
		
		JPanel panelBotones = new JPanel();
		panel_central.add(panelBotones, BorderLayout.NORTH);
		panelBotones.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panelBotones.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelL = new JPanel() {
			public void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(gradiant);
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};
		
		panelL.setBackground(new Color(255, 255, 255));
		panel.add(panelL);
		panelL.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNombreE = new JLabel("DahuRental");
		lblNombreE.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreE.setFont(new Font("Arial", Font.BOLD, 16));
		lblNombreE.setForeground(new Color(255,255,255));
		panelL.add(lblNombreE);
		
		JLabel lblEspacio = new JLabel("");
		panelL.add(lblEspacio);
		
		JPanel panelR = new JPanel();
		panelR.setBackground(new Color(128, 128, 128));
		panel.add(panelR);
		panelR.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnReserv = new JButton("Catalogo/Renta");
		btnReserv.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnReserv.setBackground(new Color(255, 255, 255));
		btnReserv.setForeground(new Color(78, 121, 222));
		btnReserv.setBorderPainted(false);
		panelR.add(btnReserv);
		
		btnReserv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//Documenta lo de abajo solo por mientras, para hacer pruebas y no tener que estar "logueandose a cada rato"
				//---------------------
//				dispose();
//				vehiculos.setVisible(true);
//				vehiculos.setLocationRelativeTo(null);
				//---------------------
				
				
				if (!login.getHayCuenta()) {
					dispose();
					login.setVisible(true);
					login.setLocationRelativeTo(null);
				}
				if (login.getHayCuenta()) {
					dispose();
					vehiculos.setLocationRelativeTo(null);
					vehiculos.setVisible(true);
				}

			}
		});
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setForeground(new Color(78, 121, 222));
		btnLogin.setBorderPainted(false);
		panelR.add(btnLogin);
		
		//Cambio nomás para hacer test de push
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				login.setVisible(true);
				login.setLocationRelativeTo(null);
			}
		});
		
		btnRegistro = new JButton("Registro");
		btnRegistro.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnRegistro.setBackground(new Color(0, 108, 217));
		btnRegistro.setForeground(new Color(255, 255, 255));
		btnRegistro.setBorderPainted(false);
		panelR.add(btnRegistro);
		
		btnRegistro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!login.getHayCuenta()) {
					dispose();
					registro.setVisible(true);
					registro.setLocationRelativeTo(null);
				}else if(login.getHayCuenta() || !registro.getHayCuenta()){
					JOptionPane.showMessageDialog(null, "Ha cerrado sesion", "Cerrar Sesion", JOptionPane.INFORMATION_MESSAGE);
					btnRegistro.setText("Registro");
		            btnLogin.setText("Login");;
					btnLogin.setEnabled(true);
					registro.setHayCuenta(false);
					login.setHayCuenta(false);
					
				}
			}
		});
		
		JPanel panelCentral = new JPanel();
		panel_central.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelDescripcion = new JPanel();
		panelCentral.add(panelDescripcion);
		panelDescripcion.setLayout(null);
		
		JLabel lblDescripcion1 = new JLabel("Preferido por los");
		lblDescripcion1.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblDescripcion1.setForeground(new Color(51, 101, 217));
		lblDescripcion1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion1.setBounds(55, 125, 407, 47);
		panelDescripcion.add(lblDescripcion1);
		
		JLabel lblDescripcion2 = new JLabel("Encuentranos en cualquier parte del mundo y dsifruta de autos de lujos");
		lblDescripcion2.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion2.setForeground(new Color(51, 101, 217));
		lblDescripcion2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblDescripcion2.setBounds(55, 275, 407, 27);
		panelDescripcion.add(lblDescripcion2);
		
		JLabel lblDescripcion3 = new JLabel("al mejor precio del mercado, comunicate con uno de nuestros expertos ");
		lblDescripcion3.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion3.setForeground(new Color(51, 101, 217));
		lblDescripcion3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblDescripcion3.setBounds(55, 295, 407, 27);
		panelDescripcion.add(lblDescripcion3);
		
		JLabel lblDescripcion4 = new JLabel("para ayudarte a escoger tu mejor opcion y a tus gustos");
		lblDescripcion4.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion4.setForeground(new Color(51, 101, 217));
		lblDescripcion4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblDescripcion4.setBounds(55, 317, 407, 27);
		panelDescripcion.add(lblDescripcion4);
		
		JLabel lblDescripcion1_1 = new JLabel("amantes de los autos");
		lblDescripcion1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion1_1.setForeground(new Color(51, 101, 217));
		lblDescripcion1_1.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblDescripcion1_1.setBounds(55, 165, 407, 47);
		panelDescripcion.add(lblDescripcion1_1);
		
		JLabel lblLoewmIpsumDolor = new JLabel("Las mejores marcas");
		lblLoewmIpsumDolor.setHorizontalAlignment(SwingConstants.LEFT);
		lblLoewmIpsumDolor.setForeground(new Color(240, 116, 55));
		lblLoewmIpsumDolor.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblLoewmIpsumDolor.setBounds(55, 217, 407, 47);
		panelDescripcion.add(lblLoewmIpsumDolor);
		
		JLabel imagenLogo = new JLabel();
		imagenLogo.setBounds(34, 33, 417, 289);
		imagenLogo.setIcon(new ImageIcon(getClass().getResource("logo_dahu_fondo2.png")));
		panelDescripcion.add(imagenLogo);
		
		fechaInicialSeleccionada = false;
		fechaFinalSeleccionada = false;
		
		JPanel panelImagen = new JPanel();
		panelCentral.add(panelImagen);
		panelImagen.setLayout(null);
		
		JLabel labelIMG = new JLabel("");
		labelIMG.setBounds(0, 144, 461, 205);
		panelImagen.add(labelIMG);
		labelIMG.setIcon(new ImageIcon(getClass().getResource("camaron.png")));
		
		JLabel lblAux = new JLabel("") {public void paintComponent(Graphics g) {

				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(gradiant);
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};
		lblAux.setBackground(new Color(0, 128, 255));
		lblAux.setBounds(239, 123, 222, 197);
		lblAux.setOpaque(true);
		
		panelImagen.add(lblAux);
		
		JPanel panel_inferior = new JPanel(){
			public void paintComponent(Graphics g) {

				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(gradiant);
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};
		panel_inferior.setBackground(new Color(0, 108, 217));
		panel_principal.add(panel_inferior, BorderLayout.SOUTH);
		panel_inferior.setLayout(new GridLayout(2, 4, 10, 0));
		
		JLabel lblTxt = new JLabel("500+");
		lblTxt.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxt.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTxt.setForeground(new Color(255, 255, 255));
		lblTxt.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panel_inferior.add(lblTxt);
		
		JLabel lblTxt2 = new JLabel("90+");
		lblTxt2.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblTxt2.setForeground(new Color(255, 255, 255));
		lblTxt2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt2);
		
		JLabel lblTxt3 = new JLabel("200+");
		lblTxt3.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblTxt3.setForeground(new Color(255, 255, 255));
		lblTxt3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt3);
		
		JLabel lblTxt4 = new JLabel("5000+");
		lblTxt4.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblTxt4.setForeground(new Color(255, 255, 255));                                
		lblTxt4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt4);
		
		JLabel lblTxt5 = new JLabel("Autos");
		lblTxt5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblTxt5.setForeground(new Color(255, 255, 255));
		
		lblTxt5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt5);
		
		JLabel lblTxt6 = new JLabel("Expertos en venta");
		lblTxt6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblTxt6.setForeground(new Color(255, 255, 255));
		lblTxt6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt6);
		
		JLabel lblTxt7 = new JLabel("Localizaciones");
		lblTxt7.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblTxt7.setForeground(new Color(255, 255, 255));
		lblTxt7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt7);
		
		JLabel lblTxt8 = new JLabel("Compradores");
		lblTxt8.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblTxt8.setForeground(new Color(255, 255, 255));
		lblTxt8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_inferior.add(lblTxt8);
	}
}

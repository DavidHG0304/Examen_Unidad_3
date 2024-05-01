package paneles;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Font;

public class CrearRenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Vehiculos vehiculos;
	private static PrincipalPanel panelPrincipal;
	private static Renta renta;
	private JLabel lblNombreCar;
	private JLabel lblMarcaCar;
	private JLabel lblModeloCar;
	private JLabel lblAnioCar;
	private JLabel lblTransmisionCar;
	private JLabel lblCostoCar;
	private JLabel lblNombreCliente;
	private JLabel lblMetodoP;
	private JLabel lblTotalPagar;
	private JLabel lblDiasRenta;
	private JLabel lblImgCarros;
	
	GradientPaint gradiant = new GradientPaint(100.0f, 300.0f, new Color(0, 58, 156, 255), getWidth(), getHeight(),new Color(10, 112, 255, 255), true);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearRenta frame = new CrearRenta(panelPrincipal,panelPrincipal.getArrayCarros(), renta);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrearRenta(PrincipalPanel panelPrincipal,ArrayList<Carros> arrayCarros, Renta renta) {
		CrearRenta.panelPrincipal = panelPrincipal;
		this.renta = renta;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(83, 169, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorte = new JPanel(){
			public void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(gradiant);
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);
			}
		};
		contentPane.add(panelNorte, BorderLayout.NORTH);
		panelNorte.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panelPBtn = new JPanel();
		panelPBtn.setBackground(new Color(0,0,0,0));
		panelNorte.add(panelPBtn);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(24, 4, 57, 33);
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/back.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				renta.setVisible(true);
				renta.setLocationRelativeTo(null);
			}
		});
		panelPBtn.setLayout(null);
		panelPBtn.add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("Revision");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 27));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelNorte.add(lblNewLabel_1);
		
		JPanel panelSur = new JPanel(){
			public void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(gradiant);
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);
			}
		};
		contentPane.add(panelSur, BorderLayout.SOUTH);
		panelSur.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel(".");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panelSur.add(lblNewLabel);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(255, 255, 255));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JPanel mostrarInfoR = new JPanel();
		mostrarInfoR.setBackground(new Color(255, 255, 255));
		mostrarInfoR.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		mostrarInfoR.setBounds(40, 222, 444, 130);
		panelCentral.add(mostrarInfoR);
		mostrarInfoR.setLayout(null);
		
		JLabel lblInformacionUsuario = new JLabel("   Informacion Usuario");
		lblInformacionUsuario.setForeground(Color.WHITE);
		lblInformacionUsuario.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblInformacionUsuario.setBounds(0, 0, 444, 20);
		mostrarInfoR.add(lblInformacionUsuario);
		
		JPanel tituloInfoR = new JPanel(){
			public void paintComponent(Graphics g) {

				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(gradiant);
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};
		tituloInfoR.setBounds(0, 0, 444, 20);
		mostrarInfoR.add(tituloInfoR);
		tituloInfoR.setLayout(null);
		tituloInfoR.setBackground(Color.WHITE);
		
		lblNombreCliente = new JLabel("");
		lblNombreCliente.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNombreCliente.setBounds(30, 41, 210, 20);
		mostrarInfoR.add(lblNombreCliente);
		
		lblMetodoP = new JLabel("");
		lblMetodoP.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblMetodoP.setBounds(30, 71, 210, 20);
		mostrarInfoR.add(lblMetodoP);
		
		lblTotalPagar = new JLabel("");
		lblTotalPagar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblTotalPagar.setBounds(250, 71, 150, 20);
		mostrarInfoR.add(lblTotalPagar);
		
		lblDiasRenta = new JLabel("");
		lblDiasRenta.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblDiasRenta.setBounds(250, 41, 150, 20);
		mostrarInfoR.add(lblDiasRenta);
		
		JPanel panelInfoCar = new JPanel();
		panelInfoCar.setLayout(null);
		panelInfoCar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelInfoCar.setBackground(Color.WHITE);
		panelInfoCar.setBounds(40, 21, 444, 174);
		panelCentral.add(panelInfoCar);
		
		lblImgCarros = new JLabel("");
		lblImgCarros.setBackground(new Color(255, 255, 255));
		lblImgCarros.setBounds(234, 30, 200, 130);
		lblImgCarros.setOpaque(true);
		panelInfoCar.add(lblImgCarros);
		
		JLabel lblInfoCar = new JLabel("   Informacion Carro");
		lblInfoCar.setForeground(new Color(255, 255, 255));
		lblInfoCar.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblInfoCar.setBounds(0, 0, 444, 20);
		panelInfoCar.add(lblInfoCar);
		
		JPanel tituloInfoCar = new JPanel(){
			public void paintComponent(Graphics g) {

				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(gradiant);
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};
		tituloInfoCar.setBounds(0, 0, 442, 20);
		panelInfoCar.add(tituloInfoCar);
		
		lblNombreCar = new JLabel("");
		lblNombreCar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNombreCar.setBounds(30, 30, 185, 20);
		panelInfoCar.add(lblNombreCar);
		
		lblMarcaCar = new JLabel("");
		lblMarcaCar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblMarcaCar.setBounds(30, 52, 185, 20);
		panelInfoCar.add(lblMarcaCar);
		
		lblModeloCar = new JLabel("");
		lblModeloCar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblModeloCar.setBounds(30, 95, 185, 20);
		panelInfoCar.add(lblModeloCar);
		
		lblAnioCar = new JLabel("");
		lblAnioCar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblAnioCar.setBounds(30, 73, 185, 20);
		panelInfoCar.add(lblAnioCar);
		
		lblTransmisionCar = new JLabel("");
		lblTransmisionCar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblTransmisionCar.setBounds(30, 138, 185, 20);
		panelInfoCar.add(lblTransmisionCar);
		
		lblCostoCar = new JLabel("");
		lblCostoCar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCostoCar.setBounds(30, 116, 185, 20);
		panelInfoCar.add(lblCostoCar);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBounds(40, 400, 124, 36);
		panelCentral.add(btnNewButton);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(5, 117, 230));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Renta confirmada con exito \nDisfrute sus dias con el auto\n","Dirigiendose al inicio", JOptionPane.INFORMATION_MESSAGE);
				dispose();
				panelPrincipal.setVisible(true);
				panelPrincipal.setLocationRelativeTo(null);
			}
		});
		
	}
	
	public void cambiarElementos(Icon rutaImagen, String nombre, String marca, String modelo, String anio, String transmision, String costo, String nombreCl, String metodoP, String totalPag, String diasRenta) {
		lblImgCarros.setIcon(rutaImagen);
		lblNombreCar.setText("Nombre: "+nombre);
	    lblMarcaCar.setText("Marca: "+marca);
	    lblModeloCar.setText("Modelo: "+modelo);
	    lblAnioCar.setText("Año "+anio);
	    lblTransmisionCar.setText("Transmision: " +transmision);
	    lblCostoCar.setText("Costo P/D $"+costo);
	    lblNombreCliente.setText("Nombre: "+nombreCl);
	    lblMetodoP.setText("Metodo de Pago: "+metodoP);
	    lblTotalPagar.setText("Total a pagar: "+totalPag);
	    lblDiasRenta.setText("Dias a rentar: "+diasRenta);
	    
	}
}

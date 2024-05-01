package paneles;

import java.awt.EventQueue;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class AniadirCarro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Vehiculos vehiculos;
	private static PrincipalPanel panelPrincipal;
	private static Renta renta;
	private JTextField txtFNombre;
	private JTextField txtFMarca;
	private JTextField txtFModelo;
	private JTextField txtFAnio;
	private JTextField txtFTransmision;
	private JTextField txtFCosto;
	private int anio;
	private double costo;
	
	private JLabel lblTitulo;
	private JButton btnAniadir;
	
	private Carros carroSeleccionado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AniadirCarro frame = new AniadirCarro(vehiculos, panelPrincipal.getArrayCarros(), renta);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTextField getTxtFNombre() {
		return txtFNombre;
	}
	public void setTxtFNombre(JTextField txtFNombre) {
		this.txtFNombre = txtFNombre;
	}
	public JTextField getTxtFMarca() {
		return txtFMarca;
	}
	public void setTxtFMarca(JTextField txtFMarca) {
		this.txtFMarca = txtFMarca;
	}
	public JTextField getTxtFModelo() {
		return txtFModelo;
	}
	public void setTxtFModelo(JTextField txtFModelo) {
		this.txtFModelo = txtFModelo;
	}
	public JTextField getTxtFAnio() {
		return txtFAnio;
	}
	public void setTxtFAnio(JTextField txtFAnio) {
		this.txtFAnio = txtFAnio;
	}
	public JTextField getTxtFTransmision() {
		return txtFTransmision;
	}
	public void setTxtFTransmision(JTextField txtFTransmision) {
		this.txtFTransmision = txtFTransmision;
	}
	public JTextField getTxtFCosto() {
		return txtFCosto;
	}
	public void setTxtFCosto(JTextField txtFCosto) {
		this.txtFCosto = txtFCosto;
	}
	public JLabel getLblTitulo() {
		return lblTitulo;
	}
	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}
	public JButton getBtnAniadir() {
		return btnAniadir;
	}
	public void setBtnAniadir(JButton btnAniadir) {
		this.btnAniadir = btnAniadir;
	}

	/**
	 * Create the frame.
	 * 
	 * @param vehiculos
	 */
	public AniadirCarro(Vehiculos vehiculos, ArrayList<Carros> arrayCarros, Renta renta) {
		this.vehiculos = vehiculos;
		this.renta = renta;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 585);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(83, 169, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {

				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(new GradientPaint(0.0f, 0.0f, new Color(40, 112, 255, 255), getWidth(), getHeight(),
						new Color(10, 112, 255, 255), true));
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};

		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255, 0));
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton btnVolver = new JButton("");
		btnVolver.setBounds(10, 4, 57, 33);
		btnVolver.setBackground(new Color(255, 255, 255));
		btnVolver.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/back.png")));
		panel_2.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				vehiculos.setVisible(true);
				vehiculos.setLocationRelativeTo(null);
			}
		});

		lblTitulo = new JLabel("Añadir Auto");
		lblTitulo.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		panel.add(lblTitulo);

		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(255, 255, 255));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(0, 0, 0, 90));
		lblNombre.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNombre.setBounds(40, 11, 124, 25);
		panelCentral.add(lblNombre);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setForeground(new Color(0, 0, 0, 90));
		lblMarca.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblMarca.setBounds(40, 83, 124, 25);
		panelCentral.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(new Color(0, 0, 0, 90));
		lblModelo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblModelo.setBounds(40, 155, 124, 25);
		panelCentral.add(lblModelo);
		
		JLabel lblAnio = new JLabel("Año");
		lblAnio.setForeground(new Color(0, 0, 0, 90));
		lblAnio.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblAnio.setBounds(40, 227, 124, 25);
		panelCentral.add(lblAnio);
		
		JLabel lblTransmision = new JLabel("Transmision");
		lblTransmision.setForeground(new Color(0, 0, 0, 90));
		lblTransmision.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblTransmision.setBounds(40, 299, 124, 25);
		panelCentral.add(lblTransmision);
		
		JLabel lbCosto = new JLabel("Costo p/dia");
		lbCosto.setForeground(new Color(0, 0, 0, 90));
		lbCosto.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lbCosto.setBounds(40, 373, 124, 25);
		panelCentral.add(lbCosto);
		
		txtFNombre = new JTextField();
		txtFNombre.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		txtFNombre.setColumns(10);
		txtFNombre.setBorder(new LineBorder(Color.GRAY, 1, true));
		txtFNombre.setBounds(40, 36, 188, 36);
		panelCentral.add(txtFNombre);

		txtFMarca = new JTextField();
		txtFMarca.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		txtFMarca.setColumns(10);
		txtFMarca.setBorder(new LineBorder(Color.GRAY, 1, true));
		txtFMarca.setBounds(40, 108, 188, 36);
		panelCentral.add(txtFMarca);

		txtFModelo = new JTextField();
		txtFModelo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		txtFModelo.setColumns(10);
		txtFModelo.setBorder(new LineBorder(Color.GRAY, 1, true));
		txtFModelo.setBounds(40, 180, 188, 36);
		panelCentral.add(txtFModelo);

		txtFAnio = new JTextField();
		txtFAnio.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		txtFAnio.setColumns(10);
		txtFAnio.setBorder(new LineBorder(Color.GRAY, 1, true));
		txtFAnio.setBounds(40, 252, 142, 36);
		panelCentral.add(txtFAnio);

		txtFTransmision = new JTextField();
		txtFTransmision.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		txtFTransmision.setColumns(10);
		txtFTransmision.setBorder(new LineBorder(Color.GRAY, 1, true));
		txtFTransmision.setBounds(40, 324, 188, 36);
		panelCentral.add(txtFTransmision);

		txtFCosto = new JTextField();
		txtFCosto.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		txtFCosto.setColumns(10);
		txtFCosto.setBorder(new LineBorder(Color.GRAY, 1, true));
		txtFCosto.setBounds(40, 396, 142, 36);
		panelCentral.add(txtFCosto);

		JPanel panel_1 = new JPanel() {
			public void paintComponent(Graphics g) {

				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(new GradientPaint(0.0f, 0.0f, new Color(40, 112, 255, 255), getWidth(), getHeight(),
						new Color(10, 112, 255, 255), true));
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};

		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(1, 3, 50, 0));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_1);

		btnAniadir = new JButton("Añadir");
		btnAniadir.setBackground(Color.white);
		panel_1.add(btnAniadir);
		btnAniadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnAniadir.setText("Añadir");
				lblTitulo.setText("Añadir carro");
				
				txtFNombre.setBorder(new LineBorder(Color.black, 1));
				txtFMarca.setBorder(new LineBorder(Color.black, 1));
				txtFModelo.setBorder(new LineBorder(Color.black, 1));
				txtFTransmision.setBorder(new LineBorder(Color.black, 1));
				txtFAnio.setBorder(new LineBorder(Color.black, 1));
				txtFCosto.setBorder(new LineBorder(Color.black, 1));

				String auxNombre = new String(txtFNombre.getText());
				String auxMarca = new String(txtFMarca.getText());
				String auxModelo = new String(txtFModelo.getText());
				String auxTransmision = new String(txtFTransmision.getText());
				String auxAnio = new String(txtFAnio.getText());
				String auxCosto = new String(txtFCosto.getText());

				if (auxNombre.isEmpty() || auxMarca.isEmpty() || auxModelo.isEmpty() || auxAnio.isEmpty()
						|| auxTransmision.isEmpty() || auxCosto.isEmpty()) {
					if (auxNombre.isEmpty()) {
						txtFNombre.setBorder(new LineBorder(Color.red, 2));
					}
					if (auxMarca.isEmpty()) {
						txtFMarca.setBorder(new LineBorder(Color.red, 2));
					}
					if (auxModelo.isEmpty()) {
						txtFModelo.setBorder(new LineBorder(Color.red, 2));
					}
					if (auxAnio.isEmpty()) {
						txtFAnio.setBorder(new LineBorder(Color.red, 2));
					}
					if (auxTransmision.isEmpty()) {
						txtFTransmision.setBorder(new LineBorder(Color.red, 2));
					}
					if (auxCosto.isEmpty()) {
						txtFCosto.setBorder(new LineBorder(Color.red, 2));
					}
//		            JOptionPane.showMessageDialog(null, "Faltan campos por rellenar", "Rellene Campos", JOptionPane.WARNING_MESSAGE);
				}
					try {
						anio = Integer.parseInt(auxAnio);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "El año debe ser un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
					    txtFAnio.setBorder(new LineBorder(Color.RED));
					    return;
					}
					try {
						costo = Double.parseDouble(auxCosto);
					} catch (Exception e3) {
						JOptionPane.showMessageDialog(null, "El costo debe ser un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
					    txtFCosto.setBorder(new LineBorder(Color.RED));
					    return;
					}

					if(carroSeleccionado == null) {
						arrayCarros.add(new Carros(auxNombre, auxMarca, auxModelo, anio, "/paneles/bugatata.png", auxTransmision, costo));
					} else {
						carroSeleccionado.setNombre(auxNombre);
						carroSeleccionado.setMarca(auxMarca);
						carroSeleccionado.setModelo(auxModelo);
						carroSeleccionado.setAnio(anio);
						carroSeleccionado.setTransmision(auxTransmision);
						carroSeleccionado.setCosto(costo);
						
					}
					
//					JOptionPane.showMessageDialog(null, "Carro creado con exito", "Carro añadido", JOptionPane.INFORMATION_MESSAGE);
					System.out.println(arrayCarros.size());
					
					
					limpiarTxtFields();
					
					
					vehiculos.actualizarLosVehiculos(arrayCarros);
					dispose();
					vehiculos.setVisible(true);
					renta.actualizarComboBox(arrayCarros);
					vehiculos.setLocationRelativeTo(null);
					
					
				}
			
		});

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_1_1);

	}
	
	public void cambiarTxtFields(String nombre, String marca, String modelo, String anio, String transmision, String costo, Carros carro) {
		lblTitulo.setText("Editar Carro");
		btnAniadir.setText("Editar");
		
		txtFNombre.setText(nombre);
		txtFMarca.setText(marca);
		txtFModelo.setText(modelo);
		txtFTransmision.setText(transmision);
		txtFAnio.setText(anio);
		txtFCosto.setText(costo);	
		
		carroSeleccionado = carro;  
	}
	
	public void limpiarTxtFields() {
	    txtFNombre.setText("");
	    txtFMarca.setText("");
	    txtFModelo.setText("");
	    txtFTransmision.setText("");
	    txtFAnio.setText("");
	    txtFCosto.setText("");
	}
	
	
}

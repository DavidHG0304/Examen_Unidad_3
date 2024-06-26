package paneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Vehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static PrincipalPanel panelPrincipal;
	private static Renta renta;
	private static AniadirCarro panelAniadir;
	private static Vehiculos frame;
	private JPanel panel_5;
	private ActionListener pressBotones;
	private ActionListener accionBtnElim;
	private ActionListener accionBtnEdit;
	private String foto;
	private String marca;
	private String nombre;
	private String modelo;
	private String transmision;
	private static CrearRenta crearRenta;
	private Carros carroSeleccionado;
	GradientPaint gradiant = new GradientPaint(50.0f, 300.0f, new Color(0, 58, 156, 255), getWidth(), getHeight(),new Color(10, 112, 255, 255), true);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Vehiculos(panelPrincipal, panelPrincipal.getArrayCarros());
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param arrayCarros 
	 * @param principal 
	 */
	
	public Vehiculos(PrincipalPanel panelPrincipal, ArrayList<Carros> arrayCarros) {
		Vehiculos.panelPrincipal = panelPrincipal;
		renta = new Renta(panelPrincipal, this, arrayCarros);
		Vehiculos.panelAniadir = new AniadirCarro(this, arrayCarros, renta);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 682);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(83, 169, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel(){
			public void paintComponent(Graphics g) {

				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(gradiant);
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);
			}
		};
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel(".");
		panel_2.add(lblNewLabel_2_1);
		
		panel_5 = new JPanel();
		
//		-----------------------------------------------------------------------------------------------------------------------
//		Paneles vehiculos y accion para los botones de Renta
//		Cambia los labels que se imprimen en el panel de renta al seleccionar algun carro
//		Inicializar Objetos Carritos dentro del arraylist
		
        panel_5.setLayout(new GridLayout(0, 3, 0, 0));
        contentPane.add(panel_5, BorderLayout.CENTER);
        
        pressBotones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                	dispose();
                	JButton btnRentar = (JButton) e.getSource(); 
					for (Carros carro : arrayCarros) {
						if (carro.getBtnRentar() == btnRentar) {
//							HACER GLOBALITOS
							foto = carro.getFoto();
							marca = carro.getMarca();
							nombre = carro.getNombre();
							modelo = carro.getModelo();
							transmision = carro.getTransmision();
							
//							System.out.println("\n"+foto+"\n"+marca+"\n"+nombre+"\n"+modelo+"\n"+transmision);
							
							int auxAnio = carro.getAnio();
							String anio = ""+auxAnio;
							double auxCosto = carro.getCosto();
							String costo = ""+auxCosto;
							
//							renta.actualizarComboBox(arrayCarros);
							renta.cambiarSeleccionComboBox(carro);
							renta.cambiarElementos(foto, nombre, marca, modelo, anio, transmision, costo);
                            break; 
                        }
                    }
                	renta.setVisible(true);
                	renta.setLocationRelativeTo(null);
    				renta.setResizable(false);
                }
            }
        };
        
        accionBtnElim = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (e.getSource() instanceof JButton) {
                	JButton btnEliminar = (JButton) e.getSource();
                	ArrayList<Carros> auxiliarArrayCarros = new ArrayList<>(arrayCarros);
					for (Carros carro : auxiliarArrayCarros) {
						if (carro.getBtnElim() == btnEliminar) {
							arrayCarros.remove(carro);
							actualizarLosVehiculos(arrayCarros);
							renta.actualizarComboBox(arrayCarros);
							System.out.println("Carrito morido");
                          break; 
                        }
                    }
                }
            }
        };
        
        accionBtnEdit = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (e.getSource() instanceof JButton) {
            		
                	JButton btnEdit = (JButton) e.getSource();
					for (Carros carro : arrayCarros) {
						if (carro.getBtnEdit() == btnEdit) {
							nombre = carro.getNombre();
							marca = carro.getMarca();
							modelo = carro.getModelo();
							transmision = carro.getTransmision();
							int auxAnio = carro.getAnio();
							String anio = ""+auxAnio;
							double auxCosto = carro.getCosto();
							String costo = ""+auxCosto;
							
							actualizarLosVehiculos(arrayCarros);
//							System.out.println("\n"+foto+"\n"+marca+"\n"+nombre+"\n"+modelo+"\n"+transmision);
							panelAniadir.cambiarTxtFields(nombre, marca, modelo, anio, transmision, costo, carro);
//							renta.actualizarComboBox(arrayCarros);
							System.out.println("Carrito editado");
							actualizarLosVehiculos(arrayCarros);
							renta.actualizarComboBox(arrayCarros);
							dispose();
							break; 
                        }
                    }
					panelAniadir.setUndecorated(true);
					panelAniadir.setVisible(true);
					panelAniadir.setLocationRelativeTo(null);
					panelAniadir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
            }
        };
        
        for (Carros carro : arrayCarros) {
            panel_5.add(carro.getPanelCatalog());
            carro.getBtnRentar().addActionListener(pressBotones);
            carro.getBtnElim().addActionListener(accionBtnElim);
            carro.getBtnEdit().addActionListener(accionBtnEdit);
        }
		
//		-----------------------------------------------------------------------------------------------------------------------
		JPanel panel_3 = new JPanel(){
			public void paintComponent(Graphics g) {

				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(gradiant);
				g2d.fillRect(0, 0, getWidth(), getHeight());
				g2d.setColor(getBackground());
				g2d.drawOval(-120, 440, 350, 350);
				g2d.drawOval(-60, 460, 350, 350);

			}
		};
		panel_3.setBackground(new Color(121, 188, 255));
		contentPane.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255, 0));
		panel_3.add(panel_4);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(10, 4, 57, 33);
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/home.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				panelPrincipal.setVisible(true);
				panelPrincipal.setLocationRelativeTo(null);
			}
		});
		
		panel_4.setLayout(null);
		panel_4.add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Catalogo",0);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 27));
		panel_3.add(lblNewLabel);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255, 0));
		panel_3.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255, 0));
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(120, 4, 57, 33);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/add.png")));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panelAniadir.getLblTitulo().setText("Aniadir Carro");
				panelAniadir.getBtnAniadir().setText("Añadir");
				panelAniadir.limpiarTxtFields();
//				System.out.println(frame!=null);
				dispose();
				panelAniadir.setUndecorated(true);
				panelAniadir.setVisible(true);
				panelAniadir.setLocationRelativeTo(null);
//				frame.setFocusableWindowState(false);
			}
		});
		actualizarLosVehiculos(arrayCarros);
		panel_7.add(btnNewButton);
	}
	public void actualizarLosVehiculos(ArrayList<Carros> arrayCarros) {
        panel_5.removeAll(); 
        for (Carros carro : arrayCarros) {
            panel_5.add(carro.getPanelCatalog());
            carro.getBtnRentar().addActionListener(pressBotones); 
            carro.getBtnElim().addActionListener(accionBtnElim);
            carro.getBtnEdit().addActionListener(accionBtnEdit);
        }
        panel_5.revalidate();
        panel_5.repaint();
    }
	
}

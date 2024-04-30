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
	private ArrayList<Carros> arrayCarros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vehiculos frame = new Vehiculos(panelPrincipal, renta);
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
	 * @param principal 
	 */
	public Vehiculos(PrincipalPanel panelPrincipal, Renta renta) {
		this.panelPrincipal = panelPrincipal;
		this.renta = renta;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 682);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		
//		-----------------------------------------------------------------------------------------------------------------------
//		Paneles vehiculos y accion para los botones de Renta
//		Cambia los labels que se imprimen en el panel de renta al seleccionar algun carro
//		Inicializar Objetos Carritos dentro del arraylist
		arrayCarros = new ArrayList<Carros>();
		arrayCarros.add(new Carros("Deportivo", "Chevrolet", "Camaro RS", 2027, "/paneles/camaroncito.png", "Automatico", 85));		
		arrayCarros.add(new Carros("Deportivo", "Nissan", "GTR R35", 2024, "/paneles/gtr.png", "Automatico", 1000));
		arrayCarros.add(new Carros("Deportivo", "Lamborghini", "Huracan STO", 2021, "/paneles/huracan.png", "Automatico", 3000));
		arrayCarros.add(new Carros("Suv", "BMW", "XM", 2024, "/paneles/xm.png", "Automatico", 500));        
		arrayCarros.add(new Carros("Suv", "Chevrolet", "Blazer", 2024, "/paneles/blazer.png", "Automatico", 300));
		arrayCarros.add(new Carros("Todoterreno", "Jeep", "Wrangler", 2024, "/paneles/wrangler.png", "Automatico", 350));
		arrayCarros.add(new Carros("ExampleText", "ExampleText", "ExampleText", 0000, "/paneles/wrangler.png", "ExampleText", 0));
		
		
        panel_5.setLayout(new GridLayout(0, 3, 0, 0));
        contentPane.add(panel_5, BorderLayout.CENTER);
        
        ActionListener pressBotones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                	dispose();
                	JButton btnRentar = (JButton) e.getSource(); 
					for (Carros carro : arrayCarros) {
						if (carro.getBtnRentar() == btnRentar) {
//							HACER GLOBALITOS
							String foto = carro.getFoto();
							String marca = carro.getMarca();
							String nombre = carro.getNombre();
							String modelo = carro.getModelo();
							String transmision = carro.getTransmision();
							
							int auxAnio = carro.getAnio();
							String anio = ""+auxAnio;
							double auxCosto = carro.getCosto();
							String costo = ""+auxCosto;

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
        
        for (Carros carro : arrayCarros) {
            panel_5.add(carro.getPanelCatalog());
            carro.getBtnRentar().addActionListener(pressBotones);
        }
		
//		-----------------------------------------------------------------------------------------------------------------------
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(121, 188, 255));
		contentPane.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(121, 188, 255));
		btnNewButton_6.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/home.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				panelPrincipal.setVisible(true);
				panelPrincipal.setLocationRelativeTo(null);
			}
		});
		panel_3.add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Catalogo",0);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		panel_3.add(lblNewLabel);
	}
	
}

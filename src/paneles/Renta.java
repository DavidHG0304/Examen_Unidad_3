package paneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Renta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	
	private static PrincipalPanel panelPrincipal;
	private static Vehiculos vehiculos;
	
	private JLabel lblImgCarros;
	private JLabel lblMarca;
	private JLabel lblNombre;
	private JLabel lblModelo;
	private JLabel lblAnio;
	private JLabel lblTransmision;
	private JLabel lblCosto;
	private JLabel lblPrecioPorDias;
	private JLabel lblCostoPorDias;
	private JLabel lblTotalAPagar;
	
	private JDateChooser dateChooser;
	private JDateChooser dateChooser1;
	
	private int diaSeleccionado1;
	private int diaSeleccionado2;
	private int dias;
	boolean fechaInicialSeleccionada = false;
	boolean fechaFinalSeleccionada = false;
	
	private double costo;
	private double costoPorDias;
	private double totalPagar;
//	private ArrayList<String> nombresItems = new ArrayList<>();
	
	private JComboBox comboBoxItems;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Renta frame = new Renta(panelPrincipal, vehiculos, panelPrincipal.getArrayCarros());
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JLabel getLblImgCarros() {
		return lblImgCarros;
	}
	public void setLblImgCarros(JLabel lblImgCarros) {
		this.lblImgCarros = lblImgCarros;
	}



	/**
	 * Create the frame.
	 * @param arrayCarros 
	 */
	public Renta(PrincipalPanel panelPrincipal, Vehiculos vehiculos, ArrayList<Carros> arrayCarros) {
		Renta.panelPrincipal = panelPrincipal;
		Renta.vehiculos = vehiculos;
		lblCosto = new JLabel("");
		lblCosto.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 682);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel resumenPrecio = new JPanel();
		resumenPrecio.setBackground(new Color(255, 255, 255));
		resumenPrecio.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		resumenPrecio.setBounds(623, 59, 260, 300);
		contentPane.add(resumenPrecio);
		resumenPrecio.setLayout(null);
		
		JLabel lblResumenDePrecio = new JLabel("  Resumen de precio");
		lblResumenDePrecio.setFont(new Font("Candara", Font.BOLD, 17));
		lblResumenDePrecio.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblResumenDePrecio.setBounds(0, 0, 260, 30);
		resumenPrecio.add(lblResumenDePrecio);
		
		
		JLabel lblPrecioPorDia = new JLabel("Precio por dia: ");
		lblPrecioPorDia.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblPrecioPorDia.setBounds(10, 59, 100, 14);
		resumenPrecio.add(lblPrecioPorDia);
		
		lblCosto.setBounds(180, 59, 100, 14);
		resumenPrecio.add(lblCosto);
		
		JLabel lblCargoPorSeguro = new JLabel("Cargo por seguro: ");
		lblCargoPorSeguro.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblCargoPorSeguro.setBounds(10, 110, 115, 18);
		resumenPrecio.add(lblCargoPorSeguro);
		
		lblPrecioPorDias = new JLabel("Precio por dias :");
		lblPrecioPorDias.setFont(new Font("Segoe UI", Font.PLAIN, 13));
 		lblPrecioPorDias.setBounds(10, 172, 154, 14);
 		resumenPrecio.add(lblPrecioPorDias);
 		
		lblTotalAPagar = new JLabel("  Total a pagar:          $");
		lblTotalAPagar.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblTotalAPagar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblTotalAPagar.setBounds(0, 270, 260, 30);
		resumenPrecio.add(lblTotalAPagar);
		
		JLabel lblNewLabel = new JLabel("$ 50");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel.setBounds(180, 112, 46, 14);
		resumenPrecio.add(lblNewLabel);
		
		lblCostoPorDias = new JLabel("$" + lblCosto.getText());
		lblCostoPorDias.setBackground(new Color(255, 255, 255));
		lblCostoPorDias.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblCostoPorDias.setOpaque(true);
		lblCostoPorDias.setBounds(180, 171, 66, 14);
		resumenPrecio.add(lblCostoPorDias);
		
		JPanel panelAutoRentar = new JPanel();
		panelAutoRentar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelAutoRentar.setBackground(new Color(255, 255, 255));
		panelAutoRentar.setBounds(25, 59, 524, 300);
		contentPane.add(panelAutoRentar);
		panelAutoRentar.setLayout(null);
		
		JLabel lblAutoARentar = new JLabel("  Auto a rentar");
		lblAutoARentar.setFont(new Font("Candara", Font.BOLD, 17));
		lblAutoARentar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAutoARentar.setBounds(0, 0, 524, 30);
		panelAutoRentar.add(lblAutoARentar);
		
		
		//Inicializar los labels vacios para despues cambiarlos conforme al carro que selecciona con el metodo para remplazarlos
		
		lblImgCarros = new JLabel("");
		lblMarca = new JLabel("");
		lblNombre = new JLabel("");
		lblModelo = new JLabel("");
		lblAnio = new JLabel("");
		lblTransmision = new JLabel("");
		
//		lblImgCarros.setIcon(new ImageIcon(Renta.class.getResource("/paneles/blazer.png")));
		lblImgCarros.setBounds(10, 41, 200, 130);
		panelAutoRentar.add(lblImgCarros);
		
		lblNombre = new JLabel("");
		lblNombre.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNombre.setBounds(10, 215, 81, 14);
		panelAutoRentar.add(lblNombre);
		
		lblMarca.setFont(new Font("", Font.PLAIN, 13));
		lblMarca.setBounds(10, 240, 81, 14);
		panelAutoRentar.add(lblMarca);
		
		lblModelo = new JLabel("");
		lblModelo .setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblModelo .setBounds(97, 240, 81, 14);
		panelAutoRentar.add(lblModelo );
		
		lblAnio = new JLabel("");
		lblAnio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAnio.setBounds(10, 275, 116, 14);
		panelAutoRentar.add(lblAnio);
		
		
		comboBoxItems = new JComboBox();
		comboBoxItems.setBounds(10, 182, 116, 22);
        panelAutoRentar.add(comboBoxItems);
        
        
		//https://stackoverflow.com/questions/17887927/adding-items-to-a-jcombobox
        for (Carros carro : arrayCarros) {
        	comboBoxItems.addItem(carro.getModelo());
		}
        
		comboBoxItems.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedModelo = (String) comboBoxItems.getSelectedItem();
				for (Carros carro : arrayCarros) {
					if (carro.getModelo().equals(selectedModelo)) {

						String foto = carro.getFoto();
						String marca = carro.getMarca();
						String nombre = carro.getNombre();
						String modelo = carro.getModelo();
						String transmision = carro.getTransmision();

						int auxAnio = carro.getAnio();
						String anio = "" + auxAnio;
						double auxCosto = carro.getCosto();
						String costo = "" + auxCosto;

						cambiarElementos(foto, nombre, marca, modelo, anio, transmision, costo);
						break;
					}
				}
			}
		});
		
		JLabel lblFechaInicial = new JLabel("Fecha Inicial");
		lblFechaInicial.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblFechaInicial.setBounds(281, 157, 109, 14);
		panelAutoRentar.add(lblFechaInicial);
		
		JLabel lblFechaFinal = new JLabel("Fecha final");
		lblFechaFinal.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblFechaFinal.setBounds(389, 157, 109, 14);
		panelAutoRentar.add(lblFechaFinal);
		
		JLabel lblNombreCliente = new JLabel("Nombre cliente");
		lblNombreCliente.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNombreCliente.setBounds(281, 90, 126, 14);
		panelAutoRentar.add(lblNombreCliente);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(281, 115, 155, 20);
		panelAutoRentar.add(textField_5);
		
		lblTransmision = new JLabel("");
		lblTransmision.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTransmision.setBounds(97, 216, 81, 14);
		panelAutoRentar.add(lblTransmision);
		
		JPanel formaDePago = new JPanel();
		formaDePago.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		formaDePago.setBackground(new Color(255, 255, 255));
		formaDePago.setBounds(25, 409, 524, 204);
		contentPane.add(formaDePago);
		formaDePago.setLayout(null);
		
		JLabel lblFormaDePago = new JLabel("  Forma de pago");
		lblFormaDePago.setFont(new Font("Candara", Font.BOLD, 17));
		lblFormaDePago.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblFormaDePago.setBounds(0, 0, 524, 30);
		formaDePago.add(lblFormaDePago);
		
		JLabel lblNewLabel_3 = new JLabel("Titular de la tarjeta");
		lblNewLabel_3.setBounds(230, 41, 212, 14);
		formaDePago.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(230, 66, 212, 20);
		formaDePago.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_4 = new JLabel("Numero de la tarjeta");
		lblNewLabel_3_4.setBounds(230, 97, 212, 14);
		formaDePago.add(lblNewLabel_3_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(230, 115, 212, 20);
		formaDePago.add(textField_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Año");
		lblNewLabel_3_4_1.setBounds(230, 146, 103, 14);
		formaDePago.add(lblNewLabel_3_4_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(230, 171, 86, 20);
		formaDePago.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("CVV");
		lblNewLabel_3_4_1_1.setBounds(339, 146, 103, 14);
		formaDePago.add(lblNewLabel_3_4_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(339, 171, 86, 20);
		formaDePago.add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("Numero de tarjeta");
		lblNewLabel_6.setBounds(230, 41, 103, 14);
		lblNewLabel_6.setVisible(false);
		formaDePago.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("1234-5678-9123-4567");
		lblNewLabel_7.setBounds(230, 66, 156, 14);
		lblNewLabel_7.setVisible(false);
		formaDePago.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_5 = new JLabel("Nombre");
		lblNewLabel_3_5.setVisible(false);
		lblNewLabel_3_5.setBounds(230, 97, 212, 14);
		formaDePago.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_7_1 = new JLabel("Humberto Peralta Meza");
		lblNewLabel_7_1.setBounds(230, 118, 156, 14);
		lblNewLabel_7_1.setVisible(false);
		formaDePago.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Banco");
		lblNewLabel_3_5_1.setVisible(false);
		lblNewLabel_3_5_1.setBounds(230, 146, 212, 14);
		formaDePago.add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("BBVA");
		lblNewLabel_7_1_1.setBounds(230, 174, 156, 14);
		lblNewLabel_7_1_1.setVisible(false);
		formaDePago.add(lblNewLabel_7_1_1);
		
		String[] pago = { "Tarjeta", "Transferencia"};
		
		JComboBox<String> comboBox_1 = new JComboBox<>(pago);
		comboBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox comboBox = (JComboBox) e.getSource();
				switch ((String) comboBox.getSelectedItem()) {
				case "Transferencia":
					lblNewLabel_3.setVisible(false);
					textField.setVisible(false);
					lblNewLabel_3_4.setVisible(false);
					textField_1.setVisible(false);
					lblNewLabel_3_4_1.setVisible(false);
					textField_2.setVisible(false);
					lblNewLabel_3_4_1_1.setVisible(false);
					textField_3.setVisible(false);
					lblNewLabel_6.setVisible(true);
					lblNewLabel_7.setVisible(true);
					lblNewLabel_3_5.setVisible(true);
					lblNewLabel_7_1.setVisible(true);
					lblNewLabel_3_5_1.setVisible(true);
					lblNewLabel_7_1_1.setVisible(true);
					break;
				case "Tarjeta":
					lblNewLabel_3.setVisible(true);
					textField.setVisible(true);
					lblNewLabel_3_4.setVisible(true);
					textField_1.setVisible(true);
					lblNewLabel_3_4_1.setVisible(true);
					textField_2.setVisible(true);
					lblNewLabel_3_4_1_1.setVisible(true);
					textField_3.setVisible(true);
					lblNewLabel_6.setVisible(false);
					lblNewLabel_7.setVisible(false);
					lblNewLabel_3_5.setVisible(false);
					lblNewLabel_7_1.setVisible(false);
					lblNewLabel_3_5_1.setVisible(false);
					lblNewLabel_7_1_1.setVisible(false);
					break;
				}
			}
		});
		comboBox_1.setBounds(10, 41, 124, 22);
		formaDePago.add(comboBox_1);
		
		JPanel opciones = new JPanel();
		opciones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		opciones.setBackground(new Color(255, 255, 255));
		opciones.setBounds(623, 409, 260, 204);
		contentPane.add(opciones);
		opciones.setLayout(null);
		
		JButton btnNewButton = new JButton("Rentar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(83, 170, 89, 23);
		opciones.add(btnNewButton);
		
		JLabel lblOpciones = new JLabel("Opciones");
		lblOpciones.setFont(new Font("Candara", Font.BOLD, 17));
		lblOpciones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblOpciones.setBounds(0, 0, 260, 30);
		opciones.add(lblOpciones);
		
		JPanel barraArriba = new JPanel();
		barraArriba.setBackground(new Color(0, 128, 255));
		barraArriba.setBounds(0, 0, 933, 36);
		contentPane.add(barraArriba);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(25, 0, 160, 33);
		btnNewButton_6.setBackground(new Color(121, 188, 255));
		btnNewButton_6.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/back.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				limpiarDatos(textField_5, dateChooser, dateChooser1, textField, textField_1, textField_2, textField_3, lblPrecioPorDias, lblTotalAPagar, lblCostoPorDias);
				vehiculos.setVisible(true);
				vehiculos.setLocationRelativeTo(null);
			}
		});
		barraArriba.setLayout(null);
		barraArriba.add(btnNewButton_6);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(281, 184, 70, 20);
		panelAutoRentar.add(dateChooser);
		
		dateChooser1 = new JDateChooser();
		dateChooser1.setBounds(389, 184, 70, 20);
		panelAutoRentar.add(dateChooser1);
		
		
		fechaInicialSeleccionada = false;
		fechaFinalSeleccionada = false;
		
		dateChooser.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
		    @Override
		    public void propertyChange(PropertyChangeEvent evt) {
		        if ("date".equals(evt.getPropertyName())) {
		            Date fechaSeleccionada = dateChooser.getDate();
		            if (fechaSeleccionada != null) {
		                Calendar calendar = Calendar.getInstance();
		                calendar.setTime(fechaSeleccionada);
		                diaSeleccionado1 = calendar.get(Calendar.DAY_OF_MONTH);
		                System.out.println("Fecha inicio: " + diaSeleccionado1);
		                System.out.println(fechaSeleccionada != null && dateChooser1.getDate() != null && diaSeleccionado2 < diaSeleccionado1);
		                
		                if(fechaSeleccionada != null && dateChooser1.getDate() != null && dateChooser.getDate() != null) {
		                	
		                	dias=diaSeleccionado2-diaSeleccionado1;
		                	lblPrecioPorDias.setText("Precio por " + dias +  " :");
		                	costo = Double.parseDouble(lblCosto.getText());
		                	costoPorDias=costo*dias;
		                	if(dias==0) {
		                		costo=+50;
		                		lblTotalAPagar.setText("  Total a pagar:          $" + costo );
		                		lblCostoPorDias.setText("$ ");
		                	}else {
		                		lblCostoPorDias.setText("$ "+ costoPorDias);
		                		totalPagar=costoPorDias+50;
		                		lblTotalAPagar.setText("  Total a pagar:          $" + totalPagar );
		                	}
		                }
		                resumenPrecio.add(lblPrecioPorDias);
		                
		                // Verificar si ambas fechas son válidas
		                if (fechaSeleccionada != null && dateChooser1.getDate() != null && diaSeleccionado2 < diaSeleccionado1 ) {
		                	lblPrecioPorDias.setText("Precio por 0 :");
		    				lblTotalAPagar.setText("  Total a pagar:          $");
		    				lblCostoPorDias.setText("$ ");
		                	JOptionPane.showMessageDialog(null, "Ha ingresado una fecha inválida", "Aviso", JOptionPane.WARNING_MESSAGE);
		                    dateChooser.setDate(null);
		                }
		            }
		        }
		    }
		});
		
		dateChooser1.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
		    @Override
		    public void propertyChange(PropertyChangeEvent evt) {
		        if ("date".equals(evt.getPropertyName())) {
		            Date fechaSeleccionada = dateChooser1.getDate();
		            if (fechaSeleccionada != null) {
		                Calendar calendar = Calendar.getInstance();
		                calendar.setTime(fechaSeleccionada);
		                diaSeleccionado2 = calendar.get(Calendar.DAY_OF_MONTH);
		                System.out.println("Fecha fin: " + diaSeleccionado2);
		                System.out.println(fechaSeleccionada != null && dateChooser.getDate() != null && diaSeleccionado2 < diaSeleccionado1 );
		                
		                if(fechaSeleccionada != null && dateChooser1.getDate() != null && dateChooser.getDate() != null) {
		                	
		                	dias=diaSeleccionado2-diaSeleccionado1;
		                	lblPrecioPorDias.setText("Precio por " + dias +  " :");
		                	if(!lblCosto.getText().isEmpty()) {
		                		
		                		costo = Double.parseDouble(lblCosto.getText());
		                	}
		                	costoPorDias=costo*dias;
		                	if(dias==0) {
		                		costo+=50;
		                		lblTotalAPagar.setText("  Total a pagar:          $" + costo );
		                		lblCostoPorDias.setText("$ ");
		                	}else {
		                		lblCostoPorDias.setText("$ "+ costoPorDias);
		                		totalPagar=costoPorDias+50;
		                		lblTotalAPagar.setText("  Total a pagar:          $" + totalPagar );
		                	}
		                }
		             
		        		resumenPrecio.add(lblPrecioPorDias);
		        		
		                System.out.println(dias);

		                // Verificar si ambas fechas son válidas
		                if (fechaSeleccionada != null && dateChooser.getDate() != null && diaSeleccionado2 < diaSeleccionado1 ) {
		                	lblPrecioPorDias.setText("Precio por 0 :");
		    				lblTotalAPagar.setText("  Total a pagar:          $");
		    				lblCostoPorDias.setText("$ ");
		                	JOptionPane.showMessageDialog(null, "Ha ingresado una fecha inválida", "Aviso", JOptionPane.WARNING_MESSAGE);
		                    dateChooser1.setDate(null);
		                }
		            }
		        }
		    }
		});
		
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarDatos(textField_5, dateChooser, dateChooser1, textField, textField_1, textField_2, textField_3, lblPrecioPorDias, lblTotalAPagar, lblCostoPorDias);
			}
		});
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setBackground(new Color(0, 128, 255));
		btnLimpiar.setBounds(83, 129, 89, 23);
		opciones.add(btnLimpiar);
		
	}
	
	
	public void cambiarSeleccionComboBox(Carros carro) {
		
        comboBoxItems.setSelectedItem(carro.getModelo());
    }
	
	public void cambiarElementos(String rutaImagen, String nombre, String marca, String modelo, String anio, String transmision, String costo) {
		limpiarDatos(textField_5, dateChooser, dateChooser1, textField, textField_1, textField_2, textField_3, lblPrecioPorDias, lblTotalAPagar, lblCostoPorDias);
		lblImgCarros.setIcon(new ImageIcon(Renta.class.getResource(rutaImagen)));
	    lblNombre.setText(nombre);
	    lblMarca.setText(marca);
		lblModelo.setText(modelo);
		lblAnio.setText(anio);
		lblTransmision.setText(transmision);
		lblCosto.setText(costo);
	}
	
	public void limpiarDatos(JTextField textField_5, JDateChooser dateChooser, JDateChooser dateChooser1, JTextField textField, JTextField textField_1,
			JTextField textField_2, JTextField textField_3, JLabel lblPrecioPorDias, JLabel lblTotalAPagar, JLabel lblCostoPorDias) {
		textField_5.setText("");
		dateChooser.setDate(null);
		dateChooser1.setDate(null);
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		lblTotalAPagar.setText("  Total a pagar:          $");
		lblCostoPorDias.setText("$ ");
		lblPrecioPorDias.setText("Precio por dias :");
		repaint();
	}
	
	public void actualizarComboBox(ArrayList<Carros> arrayCarros) {
		comboBoxItems.removeAllItems();
		for (Carros carro : arrayCarros) {
        	comboBoxItems.addItem(carro.getModelo());
		}
		comboBoxItems.revalidate();
		comboBoxItems.repaint();
		
		
	}
}

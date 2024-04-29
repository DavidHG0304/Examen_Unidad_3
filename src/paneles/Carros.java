package paneles;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Carros {
	
	private String nombre;
	private String marca;
	private String modelo;
	private int anio;
	private String foto;
	private String transmision;
	private double costo;
	
	private JButton btnRentar;
	
	public Carros(String nombre, String marca, String modelo, int anio, String foto, String transmision, double costo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.foto = foto;
        this.transmision = transmision;
        this.costo = costo;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public JButton getBtnRentar() {
		return btnRentar;
	}

	public void setBtnRentar(JButton btnRentar) {
		this.btnRentar = btnRentar;
	}

	public JPanel getPanelCatalog() {
		
		JPanel panelC = new JPanel();
		panelC.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		panelC.setBackground(new Color(255, 255, 255));
		panelC.setLayout(null);
		
		
		JLabel lblcobroDia = new JLabel("$"+costo+"/Dia");
		lblcobroDia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblcobroDia.setBounds(10, 11, 100, 14);
		panelC.add(lblcobroDia);
		
		JLabel lblTipo = new JLabel(nombre);
        lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTipo.setBounds(10, 44, 90, 19);
        panelC.add(lblTipo);
        
        JLabel lblMarca = new JLabel(marca);
        lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblMarca.setBounds(10, 74, 100, 31);
        panelC.add(lblMarca);
        
        JLabel lblModelo = new JLabel(modelo);
        lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblModelo.setBounds(10, 107, 100, 31);
        panelC.add(lblModelo);
        
        JLabel lblAnio = new JLabel(String.valueOf(anio));
        lblAnio.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblAnio.setBounds(10, 139, 46, 24);
        panelC.add(lblAnio);
        
        JLabel lblTransmision = new JLabel(transmision);
        lblTransmision.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTransmision.setBounds(10, 174, 81, 14);
        panelC.add(lblTransmision);
        
        JLabel lblFoto = new JLabel("", SwingConstants.CENTER);
        lblFoto.setIcon(new ImageIcon(Vehiculos.class.getResource(foto)));
        lblFoto.setBounds(88, 27, 199, 128);
        panelC.add(lblFoto);
        
        btnRentar = new JButton("Rentar");
        btnRentar.setBackground(new Color(0, 128, 255));
        btnRentar.setBounds(198, 172, 89, 23);
        panelC.add(btnRentar);
        
		return panelC;
	}
	
}

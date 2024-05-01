package paneles;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Font;

public class CrearRenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Vehiculos vehiculos;
	private static PrincipalPanel panelPrincipal;
	private static Renta renta;
	
	GradientPaint gradiant = new GradientPaint(100.0f, 300.0f, new Color(0, 58, 156, 255), getWidth(), getHeight(),new Color(10, 112, 255, 255), true);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearRenta frame = new CrearRenta(panelPrincipal.getArrayCarros(), renta);
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
	public CrearRenta(ArrayList<Carros> arrayCarros, Renta renta) {
		this.renta = renta;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 650);
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
		
		JLabel lblNewLabel_1 = new JLabel("Confirmar");
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
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JPanel MostrarInfoRenta = new JPanel();
		MostrarInfoRenta.setBackground(new Color(255, 255, 255));
		MostrarInfoRenta.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		MostrarInfoRenta.setBounds(49, 63, 214, 182);
		panelCentral.add(MostrarInfoRenta);
		MostrarInfoRenta.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 212, 30);
		MostrarInfoRenta.add(panel_1);
		
	}
}

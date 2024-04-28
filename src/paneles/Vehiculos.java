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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vehiculos frame = new Vehiculos();
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
	public Vehiculos() {
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
		panel_2.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel CobroDiaCamaro = new JLabel("$85/Dia");
		CobroDiaCamaro.setFont(new Font("Tahoma", Font.PLAIN, 17));
		CobroDiaCamaro.setBounds(10, 11, 100, 14);
		panel_6.add(CobroDiaCamaro);
		
		JLabel lblNewLabel_2 = new JLabel("Deportivo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 44, 68, 19);
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Chevrolet");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 74, 100, 31);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Camaro RS");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 107, 100, 31);
		panel_6.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("2027");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 139, 46, 24);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Automatico");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 174, 81, 14);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("",0);
		lblNewLabel_6.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/camaroncito.png")));
		lblNewLabel_6.setBounds(88, 27, 199, 128);
		panel_6.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Rentar");
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(198, 172, 89, 23);
		panel_6.add(btnNewButton);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6_1.setLayout(null);
		panel_6_1.setBackground(Color.WHITE);
		panel_5.add(panel_6_1);
		
		JLabel CobroDiaCamaro_1 = new JLabel("$1000/Dia");
		CobroDiaCamaro_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		CobroDiaCamaro_1.setBounds(10, 11, 100, 14);
		panel_6_1.add(CobroDiaCamaro_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Deportivo");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 44, 68, 19);
		panel_6_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nissan");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(10, 74, 100, 31);
		panel_6_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("GTR R35");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(10, 107, 100, 31);
		panel_6_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("2024");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(10, 139, 46, 24);
		panel_6_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Automatico");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(10, 174, 81, 14);
		panel_6_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("", SwingConstants.CENTER);
		lblNewLabel_6_1.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/gtr.png")));
		lblNewLabel_6_1.setBounds(88, 36, 199, 128);
		panel_6_1.add(lblNewLabel_6_1);
		
		JButton btnNewButton_1 = new JButton("Rentar");
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1.setBounds(198, 172, 89, 23);
		panel_6_1.add(btnNewButton_1);
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6_2.setLayout(null);
		panel_6_2.setBackground(Color.WHITE);
		panel_5.add(panel_6_2);
		
		JLabel CobroDiaCamaro_2 = new JLabel("$3000/Dia");
		CobroDiaCamaro_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		CobroDiaCamaro_2.setBounds(10, 11, 100, 14);
		panel_6_2.add(CobroDiaCamaro_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Deportivo");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(10, 44, 68, 19);
		panel_6_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Lamborghini");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(10, 74, 100, 31);
		panel_6_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Huracan STO");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_2.setBounds(10, 107, 100, 31);
		panel_6_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("2021");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2.setBounds(10, 139, 46, 24);
		panel_6_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("Automatico");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_2.setBounds(10, 174, 81, 14);
		panel_6_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("", SwingConstants.CENTER);
		lblNewLabel_6_2.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/huracan.png")));
		lblNewLabel_6_2.setBounds(98, 36, 199, 128);
		panel_6_2.add(lblNewLabel_6_2);
		
		JButton btnNewButton_2 = new JButton("Rentar");
		btnNewButton_2.setBackground(new Color(0, 128, 255));
		btnNewButton_2.setBounds(198, 172, 89, 23);
		panel_6_2.add(btnNewButton_2);
		
		JPanel panel_6_3 = new JPanel();
		panel_6_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6_3.setLayout(null);
		panel_6_3.setBackground(Color.WHITE);
		panel_5.add(panel_6_3);
		
		JLabel CobroDiaCamaro_3 = new JLabel("$500/Dia");
		CobroDiaCamaro_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		CobroDiaCamaro_3.setBounds(10, 11, 100, 14);
		panel_6_3.add(CobroDiaCamaro_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("SUV");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(10, 44, 68, 19);
		panel_6_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("BMW");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(10, 74, 100, 31);
		panel_6_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("XM");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_3.setBounds(10, 107, 100, 31);
		panel_6_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("2024");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_3.setBounds(10, 139, 46, 24);
		panel_6_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("Automatico");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_3.setBounds(10, 174, 81, 14);
		panel_6_3.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("", SwingConstants.CENTER);
		lblNewLabel_6_3.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/xm.png")));
		lblNewLabel_6_3.setBounds(88, 36, 199, 128);
		panel_6_3.add(lblNewLabel_6_3);
		
		JButton btnNewButton_3 = new JButton("Rentar");
		btnNewButton_3.setBackground(new Color(0, 128, 255));
		btnNewButton_3.setBounds(198, 172, 89, 23);
		panel_6_3.add(btnNewButton_3);
		
		JPanel panel_6_4 = new JPanel();
		panel_6_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6_4.setLayout(null);
		panel_6_4.setBackground(Color.WHITE);
		panel_5.add(panel_6_4);
		
		JLabel CobroDiaCamaro_4 = new JLabel("$300/Dia");
		CobroDiaCamaro_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		CobroDiaCamaro_4.setBounds(10, 11, 100, 14);
		panel_6_4.add(CobroDiaCamaro_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("SUV");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_4.setBounds(10, 44, 68, 19);
		panel_6_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Chevrolet");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5.setBounds(10, 74, 100, 31);
		panel_6_4.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Blazer");
		lblNewLabel_3_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_4.setBounds(10, 107, 100, 31);
		panel_6_4.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("2024");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_4.setBounds(10, 139, 46, 24);
		panel_6_4.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_5_4 = new JLabel("Automatico");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_4.setBounds(10, 174, 81, 14);
		panel_6_4.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_6_4 = new JLabel("", SwingConstants.CENTER);
		lblNewLabel_6_4.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/blazer.png")));
		lblNewLabel_6_4.setBounds(88, 36, 199, 128);
		panel_6_4.add(lblNewLabel_6_4);
		
		JButton btnNewButton_4 = new JButton("Rentar");
		btnNewButton_4.setBackground(new Color(0, 128, 255));
		btnNewButton_4.setBounds(198, 172, 89, 23);
		panel_6_4.add(btnNewButton_4);
		
		JPanel panel_6_5 = new JPanel();
		panel_6_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6_5.setLayout(null);
		panel_6_5.setBackground(Color.WHITE);
		panel_5.add(panel_6_5);
		
		JLabel CobroDiaCamaro_5 = new JLabel("$350/Dia");
		CobroDiaCamaro_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		CobroDiaCamaro_5.setBounds(10, 11, 100, 14);
		panel_6_5.add(CobroDiaCamaro_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("Todoterreno");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_5.setBounds(10, 44, 89, 19);
		panel_6_5.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Jeep");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_6.setBounds(10, 74, 100, 31);
		panel_6_5.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_1_5 = new JLabel("Wrangler");
		lblNewLabel_3_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_5.setBounds(10, 107, 100, 31);
		panel_6_5.add(lblNewLabel_3_1_5);
		
		JLabel lblNewLabel_4_5 = new JLabel("2024");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_5.setBounds(10, 139, 46, 24);
		panel_6_5.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_5_5 = new JLabel("Automatico");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_5.setBounds(10, 174, 81, 14);
		panel_6_5.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_6_5 = new JLabel("", SwingConstants.CENTER);
		lblNewLabel_6_5.setIcon(new ImageIcon(Vehiculos.class.getResource("/paneles/wrangler.png")));
		lblNewLabel_6_5.setBounds(88, 36, 199, 128);
		panel_6_5.add(lblNewLabel_6_5);
		
		JButton btnNewButton_5 = new JButton("Rentar");
		btnNewButton_5.setBackground(new Color(0, 128, 255));
		btnNewButton_5.setBounds(198, 172, 89, 23);
		panel_6_5.add(btnNewButton_5);
		
		JPanel panel_6_6 = new JPanel();
		panel_6_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6_6.setLayout(null);
		panel_6_6.setBackground(Color.WHITE);
		panel_5.add(panel_6_6);
		
		JPanel panel_6_7 = new JPanel();
		panel_6_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6_7.setLayout(null);
		panel_6_7.setBackground(Color.WHITE);
		panel_5.add(panel_6_7);
		
		JPanel panel_6_8 = new JPanel();
		panel_6_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6_8.setLayout(null);
		panel_6_8.setBackground(Color.WHITE);
		panel_5.add(panel_6_8);
		
		
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
				PrincipalPanel principal = new PrincipalPanel();
				principal.setVisible(true);
				principal.setLocationRelativeTo(null);
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

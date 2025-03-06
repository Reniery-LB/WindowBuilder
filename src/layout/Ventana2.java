package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

public class Ventana2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 783, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		panel.setBorder(new LineBorder(new Color(0,255,0),20));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel titulo = new JLabel("Registro de Usuario");
		titulo.setBounds(10, 10, 729, 32);
		titulo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 24));
		titulo.setForeground(new Color(255, 0, 0));
		panel.add(titulo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 52, 729, 660);
		panel_1.setBackground(new Color(0, 255, 0));
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_datos = new JPanel();
		panel_datos.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_datos);
		panel_datos.setLayout(null);
		
		JLabel datos = new JLabel(" Datos Generales");
		datos.setBounds(0, 0, 359, 25);
		datos.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		panel_datos.add(datos);
		
		JLabel nombres = new JLabel("Nombres:");
		nombres.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 10));
		nombres.setBounds(59, 35, 79, 25);
		panel_datos.add(nombres);
		
		textField = new JTextField();
		textField.setBounds(168, 35, 122, 19);
		panel_datos.add(textField);
		textField.setColumns(10);
		
		JLabel apellido_paterno = new JLabel("Apellido Paterno:");
		apellido_paterno.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 10));
		apellido_paterno.setBounds(25, 79, 96, 25);
		panel_datos.add(apellido_paterno);
		
		JLabel apellido_materno = new JLabel("Apellido Materno:");
		apellido_materno.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 10));
		apellido_materno.setBounds(25, 114, 96, 25);
		panel_datos.add(apellido_materno);
		
		JLabel fecha = new JLabel("Fecha de Nacimiento:");
		fecha.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 10));
		fecha.setBounds(10, 164, 111, 25);
		panel_datos.add(fecha);
		
		JLabel sexo = new JLabel("Sexo:");
		sexo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 10));
		sexo.setBounds(25, 199, 79, 25);
		panel_datos.add(sexo);
		
		JLabel nacionalidad = new JLabel("Nacionalidad:");
		nacionalidad.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 10));
		nacionalidad.setBounds(25, 262, 79, 25);
		panel_datos.add(nacionalidad);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 120, 122, 19);
		panel_datos.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(168, 82, 122, 19);
		panel_datos.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(168, 167, 122, 19);
		panel_datos.add(textField_3);
		
		JRadioButton opc1 = new JRadioButton("Masculino");
		opc1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		opc1.setBackground(new Color(0, 255, 255));
		opc1.setBounds(168, 201, 103, 21);
		panel_datos.add(opc1);
		
		JRadioButton opc2 = new JRadioButton("Femenino");
		opc2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		opc2.setBackground(Color.CYAN);
		opc2.setBounds(168, 224, 103, 21);
		panel_datos.add(opc2);
		
		ButtonGroup terms_group = new ButtonGroup();
		terms_group.add(opc1);
		terms_group.add(opc2);
		
		String dataset [] = {"México", "Perú", "Argentina", "Chile", "Colombia"};
		
		JComboBox lista = new JComboBox(dataset);
		lista.setBounds(168, 264, 122, 21);
		panel_datos.add(lista);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 128));
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel perfil_usuario = new JLabel(" Perfil del Usuario");
		perfil_usuario.setBounds(0, 0, 359, 25);
		perfil_usuario.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		panel_4.add(perfil_usuario);
		
		JCheckBox check_mostrar = new JCheckBox("Mostrar Foto de Perfil");
		check_mostrar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		check_mostrar.setBackground(new Color(255, 128, 128));
		check_mostrar.setBounds(85, 206, 173, 21);
		panel_4.add(check_mostrar);
		
		JCheckBox check_fecha = new JCheckBox("Mostrar Fecha de Nacimiento");
		check_fecha.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		check_fecha.setBackground(new Color(255, 128, 128));
		check_fecha.setBounds(85, 251, 252, 21);
		panel_4.add(check_fecha);
		
		JLabel usuario = new JLabel(new ImageIcon("D:\\MATERIAS DE LA UNI\\PROGRAMACION 3\\TRABAJOS ECLIPSE\\CalculadoraLayout\\agregar-usuario.png"));
		usuario.setBounds(35,-24,286,290);
		panel_4.add(usuario);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(249, 87, 83));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDatosOpcionales = new JLabel(" Datos Opcionales");
		lblDatosOpcionales.setBounds(0, 0, 359, 25);
		lblDatosOpcionales.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		panel_2.add(lblDatosOpcionales);
		
		JLabel descripción = new JLabel("Preferencias");
		descripción.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		descripción.setBounds(196, 35, 126, 25);
		panel_2.add(descripción);
		
		JLabel descripción_1 = new JLabel("Descripción");
		descripción_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		descripción_1.setBounds(30, 35, 126, 25);
		panel_2.add(descripción_1);
		
		JTextArea descripcion = new JTextArea(10,30);
		descripcion.setText("\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut \r\nlabore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco \r\nlaboris nisi ut aliquip ex ea commodo consequat\r\n. Dui\r\ns aute irure dolor in reprehenderit in \r\nvo\r\nlu\r\nptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non \r\np\r\nr\r\no\r\ni\r\nd\r\n\r\n\r\nt\r\n, \r\ns\r\nu\r\nn\r\nt\r\n in culpa qui officia deserunt mollit anim id est laborum.\"");
		//descripcion.setBounds(40, 70, 82, 15);
		//panel_2.add(descripcion);
		
		JScrollPane scrollPane = new JScrollPane(descripcion);
		scrollPane.setBounds(30, 77, 126, 196);
		
		//scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//scrollPane.setHorizontalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		panel_2.add(scrollPane);
		
		JTextArea preferencia = new JTextArea();
		preferencia.setText("Cantar\r\nEscuchar Músicaaaaaaaaaaaaaaaaaaaaaaaaa\r\nLeer\r\nDeportes\r\nOtros\r\n");
		
		JScrollPane scrollPane_1 = new JScrollPane(preferencia);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_1.setBounds(196, 77, 126, 196);
		panel_2.add(scrollPane_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btn_nuevo = new JButton("Nuevo");
		btn_nuevo.setForeground(new Color(255, 255, 255));
		btn_nuevo.setBackground(new Color(0, 0, 0));
		btn_nuevo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn_nuevo.setBounds(71, 64, 214, 42);
		panel_5.add(btn_nuevo);
		
		JButton btn_guardar = new JButton("Guardar");
		btn_guardar.setForeground(new Color(255, 255, 255));
		btn_guardar.setBackground(new Color(0, 0, 0));
		btn_guardar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn_guardar.setBounds(71, 143, 214, 42);
		panel_5.add(btn_guardar);
		
		JButton añadir = new JButton("Añadir");
		añadir.setSize(200, 0);
		añadir.setLocation(71, 143);
		añadir.setFont(new Font("Britannic",Font.BOLD,12));
		añadir.setBackground(Color.WHITE);
		añadir.setOpaque(true);
		
		panel_5.add(añadir);
		
		JButton btn_salir = new JButton("Salir");
		btn_salir.setForeground(new Color(255, 255, 255));
		btn_salir.setBackground(new Color(0, 0, 0));
		btn_salir.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btn_salir.setBounds(71, 224, 214, 42);
		panel_5.add(btn_salir);
	}
}

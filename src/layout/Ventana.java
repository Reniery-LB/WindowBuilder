package layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("Calculando el Interés");
		this.setVisible(true);
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
		this.add(this.calc_interes());
	}
	
	public JPanel calc_interes()
	{
		//JPANEL PRINCIPAL
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.WHITE);
		mipanel.setOpaque(true);
		mipanel.setPreferredSize(new Dimension(500,600)); //ESTABLECER EL TAMAÑO DEL JPANEL
		mipanel.setLayout(new BorderLayout());
		
		JLabel titulo = new JLabel("Interés");
		titulo.setFont(new Font("Arial", Font.ITALIC, 30));
		titulo.setHorizontalAlignment(JLabel.LEFT);
		titulo.setForeground(Color.RED);
		titulo.setBorder(BorderFactory.createMatteBorder(0, 20, 1, 1, Color.WHITE));
		mipanel.add(titulo, BorderLayout.NORTH);
		
		//JPANEL DE CALCULAR INTERES
		JPanel interes = new JPanel();
		
		interes.setOpaque(true);
		interes.setBackground(Color.decode("#16C47F"));
		interes.setLayout(new GridLayout(4,2, 10, 10));
		interes.setBorder(BorderFactory.createMatteBorder(0, 20, 20, 20, Color.WHITE));
		mipanel.add(interes, BorderLayout.CENTER);
		
		JLabel calc = new JLabel("Calcular Interes");
		calc.setHorizontalAlignment(JLabel.LEFT);
		calc.setFont(new Font("Arial", Font.BOLD, 24));
		calc.setBorder(BorderFactory.createMatteBorder(0, 0, 20, 40, Color.decode("#16C47F")));
		interes.add(calc);
		
		JLabel relleno = new JLabel();
		interes.add(relleno);
		
		JLabel capital = new JLabel("Capital:");
		//capital.setHorizontalAlignment(JLabel.LEFT);
		capital.setFont(new Font("Arial", Font.PLAIN, 20));
		//capital.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.decode("#16C47F")));
		interes.add(capital);
		
		JTextField capital_field = new JTextField("1500");
		capital_field.setHorizontalAlignment(JLabel.LEFT);
		capital_field.setFont(new Font("Arial", Font.PLAIN, 20));
		interes.add(capital_field);

		JLabel tiempo = new JLabel("Tiempo:");
		//tiempo.setHorizontalAlignment(JLabel.LEFT);
		tiempo.setFont(new Font("Arial", Font.PLAIN, 20));
		//tiempo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.decode("#16C47F")));
		interes.add(tiempo);
		
		JTextField tiempo_field = new JTextField("2");
		tiempo_field.setHorizontalAlignment(JLabel.LEFT);
		tiempo_field.setFont(new Font("Arial", Font.PLAIN, 20));
		interes.add(tiempo_field);
		
		JLabel tasa = new JLabel("Tasa Interés:");
		//tasa.setHorizontalAlignment(JLabel.LEFT);
		tasa.setFont(new Font("Arial", Font.PLAIN, 20));
		//tasa.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.decode("#16C47F")));
		interes.add(tasa);
		
		JTextField tasa_field = new JTextField("0.1");
		tasa_field.setHorizontalAlignment(JLabel.LEFT);
		tasa_field.setFont(new Font("Arial", Font.PLAIN, 20));
		interes.add(tasa_field);
		
		//JPANEL DEL FLOWLAYOUT
		JPanel botones = new JPanel();
		botones.setBackground(Color.decode("#16C47F"));
		botones.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		
		JButton calcular = new JButton("Calcular");
		botones.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		botones.add(cancelar);
		
		//CENTRAR LOS BOTONES
		JPanel centrar = new JPanel(new BorderLayout());
		centrar.add(botones, BorderLayout.CENTER);
		
		interes.add(new JLabel()); //ETIQUETA PARA RELLENAR
		interes.add(centrar);
		
		//JPANEL DE RESULTADOS
		JPanel resultados = new JPanel();
		
		resultados.setOpaque(true);
		resultados.setBackground(Color.decode("#E82561"));
		resultados.setLayout(new GridLayout(2,2,20,40));
		resultados.setBorder(BorderFactory.createMatteBorder(0, 20, 20, 20, Color.WHITE));
		mipanel.add(resultados, BorderLayout.SOUTH);
		
		JLabel interes_res = new JLabel("Interés:");
		//interes_res.setLocation(10,10);
		interes_res.setHorizontalAlignment(JLabel.LEFT);
		interes_res.setFont(new Font("Arial", Font.PLAIN, 20));
		resultados.add(interes_res);
		
		JTextField interes_field = new JTextField("315.000000002");
		//interes_field.setLocation(80,20);
		interes_field.setHorizontalAlignment(JLabel.LEFT);
		interes_field.setFont(new Font("Arial", Font.PLAIN, 20));
		resultados.add(interes_field);
		
		JLabel monto_res = new JLabel("Monto:");
		//monto_res.setLocation(10,80);
		monto_res.setHorizontalAlignment(JLabel.LEFT);
		monto_res.setFont(new Font("Arial", Font.PLAIN, 20));
		resultados.add(monto_res);
		
		JTextField monto_field = new JTextField("1815.000000002");
		//monto_field.setLocation(80,80);
		monto_field.setHorizontalAlignment(JLabel.LEFT);
		monto_field.setFont(new Font("Arial", Font.PLAIN, 20));
		resultados.add(monto_field);
		
		return mipanel;
	}

}

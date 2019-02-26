import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class InterfazPrincipal extends JFrame implements ActionListener {
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
	private JTextField textfield1,textfield2,textfield3,textfield4;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JScrollPane scrollpanel1;
	private JMenuBar mb;
	private JMenu menuOpc,menuCalc,menuAcercaDe, menuColorFondo;
	private JMenuItem miCalc,miRojo,miNegro, miMorado, miElCreador,miSalir,miNuevo;
	private JTextArea textarea1;
	String nombre="";
	
	public InterfazPrincipal() {
		setLayout(null);
		setTitle("Pantalla principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		CocaColaProject ventanaBienvenida=new CocaColaProject();
		nombre=ventanaBienvenida.texto;
				
		mb=new JMenuBar();
		mb.setBackground(new Color(255,0,0));
		setJMenuBar(mb);
		
		menuOpc=new JMenu("Opciones");
		menuOpc.setBackground(new Color(255,0,0));
		menuOpc.setFont(new Font("Arial",1,14));
		menuOpc.setForeground(new Color(255,255,255));
		mb.add(menuOpc);
		
		menuCalc=new JMenu("Calcular");
		menuCalc.setBackground(new Color(255,0,0));
		menuCalc.setFont(new Font("Arial",1,14));
		menuCalc.setForeground(new Color(255,255,255));
		mb.add(menuCalc);
		
		menuAcercaDe=new JMenu("Acerca de");
		menuAcercaDe.setBackground(new Color(255,0,0));
		menuAcercaDe.setFont(new Font("Arial",1,14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		mb.add(menuAcercaDe);
		
		menuColorFondo=new JMenu("Color Fondo");
		menuColorFondo.setBackground(new Color(255,0,0));
		menuColorFondo.setFont(new Font("Arial",1,14));
		menuColorFondo.setForeground(new Color(255,255,255));
		menuOpc.add(menuColorFondo);
		
		miCalc=new JMenuItem("Vacaciones");
		miCalc.setFont(new Font("Arial",1,14));
		miCalc.setForeground(new Color(255,0,0));
		menuCalc.add(miCalc);
		miCalc.addActionListener(this);
		
		miRojo=new JMenuItem("Rojo");
		miRojo.setFont(new Font("Arial",1,14));
		miRojo.setForeground(new Color(255,0,0));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);
		
		miNegro=new JMenuItem("Negro");
		miNegro.setFont(new Font("Arial",1,14));
		miNegro.setForeground(new Color(255,0,0));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);
		
		miMorado=new JMenuItem("Morado");
		miMorado.setFont(new Font("Arial",1,14));
		miMorado.setForeground(new Color(255,0,0));
		menuColorFondo.add(miMorado);
		miMorado.addActionListener(this);
	
		miNuevo=new JMenuItem("Nuevo");
		miNuevo.setFont(new Font("Arial",1,14));
		miNuevo.setForeground(new Color(255,0,0));
		menuOpc.add(miNuevo);
		miNuevo.addActionListener(this);
		
		miElCreador=new JMenuItem("ElCreador");
		miElCreador.setFont(new Font("Arial",1,14));
		miElCreador.setForeground(new Color(255,0,0));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);
		
		miSalir=new JMenuItem("Salir");
		miSalir.setFont(new Font("Arial",1,14));
		miSalir.setForeground(new Color(255,0,0));
		menuOpc.add(miSalir);
		miSalir.addActionListener(this);
		
		ImageIcon imagen = new ImageIcon("images/coca-cola.png");
	    label1 = new JLabel(imagen);
	    label1.setBounds(5,5,250,100);
	    add(label1);
		
		label2=new JLabel("BIENVENIDO "+(nombre.toUpperCase()));
		label2.setBounds(280,30,300,50);
		label2.setFont(new Font("Arial",1,25));
		label2.setForeground(new Color(255,255,255));
		add(label2);
		
		label3=new JLabel("Calculo vacaciones");
		label3.setBounds(45,140,900,25);
		label3.setFont(new Font("Arial",1,24));
		label3.setForeground(new Color(255,255,255));
		add(label3);
		
		label4=new JLabel("Nombre completo");
		label4.setBounds(25,188,180,25);
		label4.setFont(new Font("Arial",1,24));
		label4.setForeground(new Color(255,255,255));
		add(label4);
		
		textfield1=new JTextField();
		textfield1.setBounds(25,213,150,25);
		textfield1.setBackground(new Color(255,255,255));
		textfield1.setFont(new Font("Arial",1,14));
		textfield1.setForeground(new Color(0,0,0));
		add(textfield1);
		
		label4=new JLabel("Nombre completo");
		label4.setBounds(25,188,180,25);
		label4.setFont(new Font("Arial",1,24));
		label4.setForeground(new Color(255,255,255));
		add(label4);
		
		textfield1=new JTextField();
		textfield1.setBounds(25,213,150,25);
		textfield1.setBackground(new Color(255,255,255));
		textfield1.setFont(new Font("Arial",1,14));
		textfield1.setForeground(new Color(0,0,0));
		add(textfield1);
		
		label4=new JLabel("Apellido 1");
		label4.setBounds(25,248,180,25);
		label4.setFont(new Font("Arial",1,24));
		label4.setForeground(new Color(255,255,255));
		add(label4);
		
		textfield2=new JTextField();
		textfield2.setBounds(25,273,150,25);
		textfield2.setBackground(new Color(255,255,255));
		textfield2.setFont(new Font("Arial",1,14));
		textfield2.setForeground(new Color(0,0,0));
		add(textfield2);
		
		label5=new JLabel("Apellido 2");
		label5.setBounds(25,308,180,25);
		label5.setFont(new Font("Arial",1,24));
		label5.setForeground(new Color(255,255,255));
		add(label5);
		
		textfield3=new JTextField();
		textfield3.setBounds(25,334,150,25);
		textfield3.setBackground(new Color(255,255,255));
		textfield3.setFont(new Font("Arial",1,14));
		textfield3.setForeground(new Color(0,0,0));
		add(textfield3);
		
		label6=new JLabel("Departamento: ");
		label6.setBounds(220,188,180,25);
		label6.setFont(new Font("Arial",1,24));
		label6.setForeground(new Color(255,255,255));
		add(label6);
		
		comboDepartamento=new JComboBox();
		comboDepartamento.setBounds(220,213,220,25);
		comboDepartamento.setFont(new java.awt.Font("Arial",1,14));
		comboDepartamento.setForeground(new java.awt.Color(255,0,0));
		comboDepartamento.setBackground(new java.awt.Color(254,254,254));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atención al Cliente");
		comboDepartamento.addItem("Logística");
		comboDepartamento.addItem("Gerencia");
		
		label6=new JLabel("Calculo: ");
		label6.setBounds(220,308,180,25);
		label6.setFont(new Font("Arial",1,24));
		label6.setForeground(new Color(255,255,255));
		add(label6);
		
		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(224, 224, 224));
		textarea1.setFont(new Font("Andale Mono", 1, 11));
		textarea1.setForeground(new Color(255, 0, 0));
		textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
		scrollpanel1 = new JScrollPane(textarea1);
		scrollpanel1.setBounds(220,333,385,90);
		add(scrollpanel1);   
		
	    label7=new JLabel("Antiguedad: ");
		label7.setBounds(220,248,180,25);
		label7.setFont(new Font("Arial",1,24));
		label7.setForeground(new Color(255,255,255));
		add(label7);
		
		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
		comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
		comboAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años de servicio");
		comboAntiguedad.addItem("7 años o más de servicio");
		
		label8 = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
		label8.setBounds(135,445,500,30);
		label8.setFont(new java.awt.Font("Andale Mono", 1, 12));
		label8.setForeground(new java.awt.Color(255, 255, 255));
		add(label8);
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalc) {
        	String Trabajador=textfield1.getText();
        	String AP=textfield2.getText();
        	String AM=textfield3.getText();
        	String Depto=comboDepartamento.getSelectedItem().toString();
        	String Ant=comboAntiguedad.getSelectedItem().toString();
        	if(Trabajador.equals("") || AP.equals("") || AM.equals("") || Depto.equals("") || Ant.equals("")) {
        		JOptionPane.showMessageDialog(null,"Llena todo");
        	}else {

                if(Depto.equals("Atención al Cliente")){

                                if(Ant.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + Trabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Depto + " con " + Ant + 
                                                          "\n   recibe 6 días de vacaciones.");
				}
				if(Ant.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + Trabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Depto + " con " + Ant + 
                                                          "\n   recibe 14 días de vacaciones.");
				}
				if(Ant.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + Trabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Depto + " con " + Ant + 
                                                          "\n   recibe 20 días de vacaciones.");
				}
                     
                }
	        if(Depto.equals("Depto de Logística")){

				if(Ant.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + Trabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Depto + " con " + Ant + 
                                                          "\n   recibe 7 días de vacaciones.");
				}
				if(Ant.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + Trabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Depto + " con " + Ant + 
                                                          "\n   recibe 15 días de vacaciones.");
				}
				if(Ant.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + Trabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Depto + " con " + Ant + 
                                                          "\n   recibe 22 días de vacaciones.");
				}
	    	}
	    	if(Depto.equals("Depto de Gerencia")){

				if(Ant.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + Trabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Depto + " con " + Ant + 
                                                          "\n   recibe 10 días de vacaciones.");
				}
				if(Ant.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + Trabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Depto + " con " + Ant + 
                                                          "\n   recibe 20 días de vacaciones.");
				}
				if(Ant.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + Trabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Depto + " con " + Ant + 
                                                          "\n   recibe 30 días de vacaciones.");
				}
	    		}
            }

        }
        
        if (e.getSource() == miRojo){
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource() == miNegro){
            getContentPane().setBackground(new Color(0,0,0));
        }
        if (e.getSource() == miMorado){
            getContentPane().setBackground(new Color(51,0,51));
        }
        if (e.getSource() == miNuevo){
        	/*Trabajador.setText("");
        	AP.setText("");
        	AM.setText("");*/
        	comboDepartamento.setSelectedIndex(0);
        	comboAntiguedad.setSelectedIndex(0);
    		textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");

        }
        if (e.getSource() == miSalir){
        	CocaColaProject ventanaBienvenida=new CocaColaProject();
    		ventanaBienvenida.setBounds(0,0,350,450);
    		ventanaBienvenida.setVisible(true);

    		ventanaBienvenida.setLocationRelativeTo(null);
    		this.setVisible(false);

        }
        if (e.getSource() == miElCreador){
        	JOptionPane.showMessageDialog(null, "Desarrollado por Paula");
        }
    }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazPrincipal ventanaPrincipal=new InterfazPrincipal();
		ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);

	}

}

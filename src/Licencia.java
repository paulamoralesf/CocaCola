import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener,ChangeListener{
	private JLabel label1,label2;
	private JCheckBox check1;
	private JScrollPane scrollpanel1;
	private JButton boton1,boton2;
	private JTextArea textarea1;
	String nombre="";
	
	public Licencia() {
		setLayout(null);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		CocaColaProject ventanaBienvenida=new CocaColaProject();
		nombre=ventanaBienvenida.texto;//se obtiene el dato
		
		label2=new JLabel("TÉRMINOS Y CONDICIONES");
		label2.setBounds(215,5,200,30);
		label2.setFont(new Font("Arial",1,14));
		label2.setForeground(new Color(0,0,0));
		add(label2);
		
		textarea1=new JTextArea();
		textarea1.setEditable(false);
		textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                "\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                "\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                "\n          http://www.youtube.com/ernestoperezm");
		textarea1.setFont(new Font("Arial",0,9));
		
		scrollpanel1= new JScrollPane(textarea1);
		scrollpanel1.setBounds(10,40,575,200);
		add(scrollpanel1);
		
		check1 = new JCheckBox("Yo "+nombre+" Acepto");
	    check1.setBounds(10,250,300,30);
	    check1.addChangeListener(this);
	    add(check1);

		boton1= new JButton("Acepto");
		boton1.setBounds(10,290,100,30);
		boton1.addActionListener(this);//agrega evento
		boton1.setEnabled(false);
		add(boton1);
		
		
		boton2= new JButton("No acepto");
		boton2.setBounds(120,290,100,30);
		boton2.addActionListener(this);//agrega evento
		boton2.setEnabled(true);
		add(boton2);
		
		ImageIcon imagen = new ImageIcon("images/coca-cola.png");
	    label1 = new JLabel(imagen);
	    label1.setBounds(315,135,300,300);
	    add(label1);
		
	}
	
	public void stateChanged(ChangeEvent e) {
		if(check1.isSelected()==true) {
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		}else {
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			InterfazPrincipal ventanaPrincipal=new InterfazPrincipal();
			ventanaPrincipal.setBounds(0,0,640,535);
			ventanaPrincipal.setVisible(true);
			ventanaPrincipal.setResizable(false);
			ventanaPrincipal.setLocationRelativeTo(null);
			this.setVisible(false);
		}else if(e.getSource()==boton2) {
			CocaColaProject ventanaBienvenida=new CocaColaProject();
			ventanaBienvenida.setBounds(0,0,350,450);
			ventanaBienvenida.setVisible(true);
			ventanaBienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Licencia ventanaLicencia=new Licencia();
		ventanaLicencia.setBounds(0,0,600,360);
		ventanaLicencia.setVisible(true);
		ventanaLicencia.setResizable(false);
		ventanaLicencia.setLocationRelativeTo(null);//centro de pantalla
	}

}

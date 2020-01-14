/**
 * 
 */
package clases;
import java.awt.*;
import javax.swing.*;
/**
 * @author MARIO LUZARDO
 *
 */
public class MiVentana extends JFrame{
    JPanel content1;
	/**
	 * 
	 */
	public MiVentana() {
		// TODO Auto-generated constructor stub
		super("Mis datos");
		
		this.setSize(300,400);
		this.setMinimumSize(new Dimension(300, 350));
		this.setLocation(100,100);
		content1 = new JPanel(new BorderLayout());
		setContentPane(content1);
		this.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JTextField text1 = new JTextField();
		text1.setColumns(5);
		panel1.add(new JLabel("Nombre: "));
		panel1.add(text1);
		
		JPanel panel2 = new JPanel();
		JTextField text2 = new JTextField();
		text2.setColumns(5);
		panel2.add(new JLabel("Apellido: "));
		panel2.add(text2);
		
		JPanel panel3 =new JPanel();
		String [] civilState = {"Soltero",
								"Casado",
								"Viudo",
								"Divorciado"};
		JComboBox jComboBox = new JComboBox(civilState);
		jComboBox.setSelectedIndex(0);
		panel3.add(new JLabel("Estado Civil: "));
		panel3.add(jComboBox);
		
		JPanel panel4 = new JPanel();
		JTextArea text3 = new JTextArea(10,10);
		JScrollPane description = new JScrollPane(text3);
		panel4.add(new JLabel("Descripcion: "));
		panel4.add(description);
		
	    JPanel pnlNorte = new JPanel();
	    GridLayout grid0 = new GridLayout (3,1);
	    pnlNorte.setLayout(grid0);
	    pnlNorte.add(panel1);
		pnlNorte.add(panel2);
		pnlNorte.add(panel3);
	    content1.add(pnlNorte, BorderLayout.NORTH);

	    JPanel pnlCentro = new JPanel();
		pnlCentro.add(panel4);
		content1.add(pnlCentro,BorderLayout.CENTER);
		
		JPanel pnlSur = new JPanel();
		GridLayout grid1 = new GridLayout (0,2);
		pnlSur.setLayout(grid1);
		pnlSur.add(new JButton("Guardar"));
		pnlSur.add(new JButton("Cancelar"));
		content1.add(pnlSur, BorderLayout.SOUTH);
		
		this.setContentPane(content1);
		
	}

}

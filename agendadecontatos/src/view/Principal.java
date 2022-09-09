package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtFone_1;
	private JTextField txtEmail_1;
	private JTextField txtNome_1;
	private JTextField txtID_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Agenda De Contatos-Agenda");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/img/iconagenda.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(30, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(30, 121, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fone");
		lblNewLabel_2.setBounds(30, 169, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome");
		lblNewLabel_3.setBounds(30, 75, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtFone = new JTextField();
		txtFone.setBounds(73, 166, 334, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(73, 118, 334, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(73, 72, 333, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtID = new JTextField();
		txtID.setBounds(73, 27, 197, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 225, 589, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnDeletar = new JButton("");
		btnDeletar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeletar.setBorderPainted(false);
		btnDeletar.setContentAreaFilled(false);
		btnDeletar.setIcon(new ImageIcon(Principal.class.getResource("/img/delete.png")));
		btnDeletar.setBounds(516, 11, 64, 64);
		panel.add(btnDeletar);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlterar.setBorderPainted(false);
		btnAlterar.setContentAreaFilled(false);
		btnAlterar.setIcon(new ImageIcon(Principal.class.getResource("/img/alterar.png")));
		btnAlterar.setBounds(442, 11, 64, 64);
		panel.add(btnAlterar);
		
		JButton btnadicionar = new JButton("");
		btnadicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnadicionar.setContentAreaFilled(false);
		btnadicionar.setBorderPainted(false);
		btnadicionar.setIcon(new ImageIcon(Principal.class.getResource("/img/add.png")));
		btnadicionar.setBounds(366, 11, 64, 64);
		panel.add(btnadicionar);
		
		JLabel lblNewLabel_4 = new JLabel("Agenda de contatos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(92, 28, 226, 32);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Principal.class.getResource("/img/iconagenda.png")));
		lblNewLabel_5.setBounds(10, 11, 64, 64);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setToolTipText("pesquisar");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/img/pesquisa.png")));
		btnNewButton.setBounds(280, 13, 48, 48);
		contentPane.add(btnNewButton);
	}//fim do construtor
	DAO dao = new DAO();
	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtFone;
	
	/**
	 * Método Responsável Pela pesquisa do usuario 
	 */
	
	private void pesquisarUsuario() {
		//vaildação 
		if (txtID.getText().isEmpty()) {}
		JOptionPane.showMessageDialog(null, "Digite o ID do Usuario");
	}

}//fim do codigo 

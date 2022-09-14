package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.DAO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// testar conexão
				testarConexao();
			}
		});
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

		btnDeletar = new JButton("");
		btnDeletar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeletar.setBorderPainted(false);
		btnDeletar.setContentAreaFilled(false);
		btnDeletar.setIcon(new ImageIcon(Principal.class.getResource("/img/delete.png")));
		btnDeletar.setBounds(516, 11, 64, 64);
		panel.add(btnDeletar);

		btnAlterar_1 = new JButton("");
		btnAlterar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlterar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlterar_1.setBorderPainted(false);
		btnAlterar_1.setContentAreaFilled(false);
		btnAlterar_1.setIcon(new ImageIcon(Principal.class.getResource("/img/alterar.png")));
		btnAlterar_1.setBounds(442, 11, 64, 64);
		panel.add(btnAlterar_1);

		btnadicionar = new JButton("");
		btnadicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnadicionar.setContentAreaFilled(false);
		btnadicionar.setBorderPainted(false);
		btnadicionar.setIcon(new ImageIcon(Principal.class.getResource("/img/add.png")));
		btnadicionar.setBounds(366, 11, 64, 64);
		panel.add(btnadicionar);
		btnadicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarUsuario();
			}
		});
		

		JLabel lblNewLabel_4 = new JLabel("Agenda de contatos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(92, 28, 226, 32);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Principal.class.getResource("/img/iconagenda.png")));
		lblNewLabel_5.setBounds(10, 11, 64, 64);
		panel.add(lblNewLabel_5);

		btnPesquisar_1 = new JButton("");
		btnPesquisar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisarUsuario();
			}
		});
		btnPesquisar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar_1.setToolTipText("pesquisar");
		btnPesquisar_1.setContentAreaFilled(false);
		btnPesquisar_1.setBorderPainted(false);
		btnPesquisar_1.setIcon(new ImageIcon(Principal.class.getResource("/img/pesquisa.png")));
		btnPesquisar_1.setBounds(280, 11, 48, 48);
		contentPane.add(btnPesquisar_1);
	}
	// fim do construtor

	DAO dao = new DAO();

	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtFone;
	private JButton btnAdicionar;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnPesquisar;
	private JButton btnPesquisar_1;
	private JButton btnadicionar;
	private JButton btnAlterar_1;
	private JButton btnDeletar;
	
	private void testarConexao() {
		try {
			// abrir a conexão
			Connection con = dao.conectar();
			if (con == null) {
				// escolher a imagem dboff
				System.out.println("erro de conexão");
			} else {
				// escolher a imagem dbon
				System.out.println("conectado");
				System.out.println(con);
			}
			// Não esquecer de fechar a conexão
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * Método Responsável Pela pesquisa do usuario
	 */

	private void pesquisarUsuario() {
		// vaildação
		if (txtID.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Digite o ID do Usuario");
			txtID.requestFocus();
		} else {
			// Lógica Principal
			// Querry (instrução SQL)
			String read = "select*from agenda where id=?";
			// Tratar exceções sempre que lidar com o banco
			try {
				// estabelecer conexão
				Connection con = dao.conectar();
				// Preparar execução da Query
				PreparedStatement pst = con.prepareStatement(read);
				// Setar argumentov(ID)
				// Sustituir o ? pelo conteudo da caixa de texto
				pst.setString(1, txtID.getText());
				// executar a Query e exibir o resultado no formulario
				ResultSet rs = pst.executeQuery();
				// validação (existencia de usuario)
				// rs.next()->Existencia do usuário
				if (rs.next()) {
					txtID.setText(rs.getString(1));
					txtNome.setText(rs.getString(2));
					txtFone.setText(rs.getString(3));
					txtEmail.setText(rs.getString(4));
					btnAlterar.setEnabled(true);
					btnExcluir.setEnabled(true);
					// btnPesquisar_1.setEnabled(true);

				} else {
					JOptionPane.showMessageDialog(null, "usuario inexistente ");
					txtNome.setEditable(true);
					txtFone.setEditable(true);
					txtEmail.setEditable(true);
					txtNome.requestFocus();
					btnAdicionar.setEnabled(true);
				}
				// NUNCA Se Esqueça de Encerrar a Conexão
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	/**
	 * Método responsavel por adicionar um novo usuario no banco
	 */

	private void adicionarUsuario() {
		// validação
		if (txtNome.getText().isEmpty()) {
		}
		JOptionPane.showMessageDialog(null, "Prencha o nome");
		txtNome.requestFocus();
	}
	
	
}

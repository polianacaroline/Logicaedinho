package view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import model.DAO;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Servicos extends JDialog {
	private JTextField txtOS;
	private JTextField txtData;
	private JTextField txtEquipamento;
	private JTextField txtDefeito;
	private JTextField txtValor;
	private JTextField txtID;
	DAO dao = new DAO();
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servicos dialog = new Servicos();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Servicos() {
		setModal(true);
		setBounds(100, 100, 568, 394);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OS");
		lblNewLabel.setBounds(25, 22, 46, 14);
		getContentPane().add(lblNewLabel);
		
		txtOS = new JTextField();
		txtOS.setBounds(93, 19, 134, 20);
		getContentPane().add(txtOS);
		txtOS.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data/Hora");
		lblNewLabel_1.setBounds(25, 65, 58, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtData = new JTextField();
		txtData.setBounds(93, 62, 134, 20);
		getContentPane().add(txtData);
		txtData.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Equipamento");
		lblNewLabel_2.setBounds(11, 119, 89, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Defeito");
		lblNewLabel_3.setBounds(25, 169, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Valor");
		lblNewLabel_4.setBounds(25, 218, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		txtEquipamento = new JTextField();
		txtEquipamento.setBounds(93, 116, 303, 20);
		getContentPane().add(txtEquipamento);
		txtEquipamento.setColumns(10);
		
		txtDefeito = new JTextField();
		txtDefeito.setBounds(93, 166, 303, 20);
		getContentPane().add(txtDefeito);
		txtDefeito.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(93, 215, 183, 20);
		getContentPane().add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();
			}
		});
		btnBuscar.setIcon(new ImageIcon(Servicos.class.getResource("/img/510919_find_magnifying glass_search_zoom_icon.png")));
		btnBuscar.setToolTipText("Buscar");
		btnBuscar.setBounds(241, 18, 95, 34);
		getContentPane().add(btnBuscar);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionar();
				
			}
		});
		btnAdicionar.setIcon(new ImageIcon(Servicos.class.getResource("/img/4781840_+_add_circle_create_expand_icon.png")));
		btnAdicionar.setToolTipText("Adicionar");
		btnAdicionar.setBounds(25, 276, 89, 34);
		getContentPane().add(btnAdicionar);
		
		JButton btnEditar = new JButton("");
		btnEditar.setIcon(new ImageIcon(Servicos.class.getResource("/img/4831013_adit_create_pen_pencil_write_icon.png")));
		btnEditar.setToolTipText("Editar");
		btnEditar.setBounds(136, 276, 89, 34);
		getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon(Servicos.class.getResource("/img/4115238_delete_trash_icon (1).png")));
		btnExcluir.setToolTipText("Excluir");
		btnExcluir.setBounds(256, 276, 89, 34);
		getContentPane().add(btnExcluir);
		
		JLabel lblNewLabel_5 = new JLabel("ID do cliente");
		lblNewLabel_5.setBounds(346, 22, 89, 14);
		getContentPane().add(lblNewLabel_5);
		
		txtID = new JTextField();
		txtID.setBounds(434, 19, 86, 20);
		getContentPane().add(txtID);
		txtID.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 321, 552, 34);
		getContentPane().add(panel);
		
		
	}

	private void buscar() {

		// System.out.println("Teste do botão buscar");

		// Criar uma variável com a query (instrução do banco)

		// Tratamento de exceções
		String read = "select * from servicos where os = ?";
		try {
			// abrir a conexão
			con = dao.conectar();
			// preparar a execucão da query( instrução sql - CRUD Read)

			// o parâmetro 1 substitui a ? pelo conteúdo da caixa de texto
			pst = con.prepareStatement(read);
			pst.setString(1, txtOS.getText());
			
			// executar a query e buscar o resultado
			rs = pst.executeQuery();
			// uso da estrutura if else para verificar se existe o contato
			// rs.next() -> se existir um contato no banco
			if (rs.next()) {
				// preencher as caixas de texto com as informações

				txtOS.setText(rs.getString(1)); // 1º Campo da Tabela ID
				txtData.setText(rs.getString(2)); // 3º Campo da Tabela Login
				txtEquipamento.setText(rs.getString(3)); // 4º Campo da Tabela Senha
				txtDefeito.setText(rs.getString(4));
				txtValor.setText(rs.getString(5));
				txtID.setText(rs.getString(6));
				//btn.setEnabled(true);
				//btnApagar.setEnabled(true);

			} else {
				// System.out.println("Contaos não cadastrados");
				JOptionPane.showMessageDialog(null, "Usuario inexistente");
				//btnAdicionar.setEnabled(true);

			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	
		}
	
		private void adicionar() {

			 //System.out.println("teste");
			// systen.out.println("teste")
			// validacao de campos obrigatorios

			if (txtOS.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha a OS");
				txtOS.requestFocus();
			} else if (txtEquipamento.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha o Equipamento");
				txtEquipamento.requestFocus();
			} else if (txtDefeito.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha o Defeito");
				txtDefeito.requestFocus();
			} else if (txtValor.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha o Valor");
				txtValor.requestFocus();
				// logica principal
				// CRUD Create
				String create = "insert into servicos(equipamento,defeito,valor,id) values (?,?,?,?)";
				// tratamento de excecoes
				try {
					
					// abrir a conexao
					con = dao.conectar();
					// preparar a execucao da query(instrucao sql - CRUD create)
					pst = con.prepareStatement(create);
					pst.setString(1, txtEquipamento.getText());
					pst.setString(2, txtDefeito.getText());
					pst.setString(3, txtValor.getText());
					pst.setString(4, txtID.getText());
					// executar a query(instrucao sql (CRUD - Create)
					pst.executeUpdate();
					// confirmar
					JOptionPane.showMessageDialog(null, "OS adicionada");
					// limpar campos
				} catch (java.sql.SQLIntegrityConstraintViolationException e1) {
					JOptionPane.showMessageDialog(null, "OS não adicionada.\nEsta OS já está sendo utilizada.");
					txtOS.setText(null);
					txtOS.requestFocus();
				} catch (Exception e2) {
					System.out.println(e2);
			}
				}
			}
				
				}
			

			
		


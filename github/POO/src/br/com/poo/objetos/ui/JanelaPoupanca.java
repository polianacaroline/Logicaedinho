package br.com.poo.objetos.ui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.poo.classes.ContaPoupanca;
import java.awt.Color;

public class JanelaPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroBanco;
	private JTextField txtBanco;
	private JTextField txtConta;
	private JTextField txtTitular;
	private JTextField txtSaldo;
	private JLabel lblNewLabel_5;
	private JTextField txtAniversario;
	private JButton btnAbrirConta;
	private JButton btnDepositar;
	private JButton btnVerificarSaldo;
	private JButton btnSacar;
	private ContaPoupanca cp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPoupanca frame = new JanelaPoupanca();
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
	public JanelaPoupanca() {
		setBounds(100, 100, 460, 421);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null );

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número do Banco");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 111, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número da Agência");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 49, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Número da Conta");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 101, 126, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Titular da Conta");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 148, 94, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Saldo da Conta");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 191, 95, 14);
		contentPane.add(lblNewLabel_4);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.setBounds(146, 8, 86, 20);
		contentPane.add(txtNumeroBanco);
		txtNumeroBanco.setColumns(10);
		
		txtBanco = new JTextField();
		txtBanco.setBounds(146, 46, 86, 20);
		contentPane.add(txtBanco);
		txtBanco.setColumns(10);
		
		txtConta = new JTextField();
		txtConta.setBounds(146, 98, 86, 20);
		contentPane.add(txtConta);
		txtConta.setColumns(10);
		
		txtTitular = new JTextField();
		txtTitular.setBounds(146, 145, 86, 20);
		contentPane.add(txtTitular);
		txtTitular.setColumns(10);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(146, 188, 86, 20);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Aniversário");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(252, 11, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		txtAniversario = new JTextField();
		txtAniversario.setBounds(348, 8, 86, 20);
		contentPane.add(txtAniversario);
		txtAniversario.setColumns(10);
		
		btnAbrirConta = new JButton("Abrir Conta");
		
		btnAbrirConta.setBounds(10, 282, 126, 39);
		contentPane.add(btnAbrirConta);
		
		btnDepositar = new JButton("Depositar");
		
		btnDepositar.setBounds(10, 332, 126, 39);
		contentPane.add(btnDepositar);
		
		btnVerificarSaldo = new JButton("Verificar Saldo");
		
		btnVerificarSaldo.setBounds(10, 226, 126, 39);
		contentPane.add(btnVerificarSaldo);
		
		btnSacar = new JButton("Sacar");
		
		btnSacar.setBounds(157, 332, 101, 39);
		contentPane.add(btnSacar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(241, 84, 158, 199);
		contentPane.add(scrollPane);
		
		JTextArea txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);
		btnAbrirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp = new ContaPoupanca();
				
				String rs = cp.abrirConta(
				Long.parseLong(txtNumeroBanco.getText()),
				Long.parseLong(txtBanco.getText()),
				Long.parseLong(txtConta.getText()),
				txtTitular.getText(),
				Double.parseDouble(txtSaldo.getText()));
				txtResultado.setText(rs);
				txtBanco.setEnabled(false);
				txtNumeroBanco.setEnabled(false);
				txtConta.setEnabled(false);
				txtTitular.setEnabled(false);
				txtSaldo.setEnabled(false);
				btnAbrirConta.setEnabled(false);
				
               
			}
		});
		btnVerificarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(String.valueOf(cp.verificar()));
				
			}
		});
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        
				String valor = JOptionPane.showInputDialog("Digite o valor do depósito");
				txtResultado.setText(cp.depositar(Double.parseDouble(valor)));
				
				
				
			}
		});
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Digite o valor que deseja sacar");
				txtResultado.setText(cp.sacar(Double.parseDouble(valor)));
				
				
				
			}
		});
	
		
	}
}

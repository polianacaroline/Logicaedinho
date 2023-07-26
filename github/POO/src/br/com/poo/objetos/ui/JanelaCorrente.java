package br.com.poo.objetos.ui;

import java.awt.Color;
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

import br.com.poo.classes.ContaCorrente;
import br.com.poo.classes.ContaPoupanca;

public class JanelaCorrente extends JFrame {

	private JPanel txtlimite;
	private JTextField txtNumeroBanco;
	private JTextField txtBanco;
	private JTextField txtConta;
	private JTextField txtTitular;
	private JTextField txtSaldo;
	private JButton btnAbrirConta;
	private JButton btnDepositar;
	private JButton btnVerificarSaldo;
	private JButton btnSacar;
	private ContaCorrente cp;
	private JTextField txtLimite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCorrente frame = new JanelaCorrente();
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
	public JanelaCorrente() {
		setBounds(100, 100, 460, 421);
		txtlimite = new JPanel();
		txtlimite.setBackground(new Color(255, 128, 128));
		txtlimite.setForeground(new Color(255, 255, 255));
		txtlimite.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(txtlimite);
		txtlimite.setLayout(null);

		JLabel lblNewLabel = new JLabel("Número do Banco");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 111, 14);
		txtlimite.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Número da Agência");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 49, 111, 14);
		txtlimite.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Número da Conta");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 101, 126, 14);
		txtlimite.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Titular da Conta");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 148, 94, 14);
		txtlimite.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Saldo da Conta");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 191, 95, 14);
		txtlimite.add(lblNewLabel_4);

		txtNumeroBanco = new JTextField();
		txtNumeroBanco.setBounds(146, 8, 86, 20);
		txtlimite.add(txtNumeroBanco);
		txtNumeroBanco.setColumns(10);

		txtBanco = new JTextField();
		txtBanco.setBounds(146, 46, 86, 20);
		txtlimite.add(txtBanco);
		txtBanco.setColumns(10);

		txtConta = new JTextField();
		txtConta.setBounds(146, 98, 86, 20);
		txtlimite.add(txtConta);
		txtConta.setColumns(10);

		txtTitular = new JTextField();
		txtTitular.setBounds(146, 145, 86, 20);
		txtlimite.add(txtTitular);
		txtTitular.setColumns(10);

		txtSaldo = new JTextField();
		txtSaldo.setBounds(146, 188, 86, 20);
		txtlimite.add(txtSaldo);
		txtSaldo.setColumns(10);

		btnAbrirConta = new JButton("Abrir Conta");

		btnAbrirConta.setBounds(10, 216, 126, 39);
		txtlimite.add(btnAbrirConta);

		btnDepositar = new JButton("Depositar");
		btnDepositar.setBounds(10, 332, 126, 39);
		txtlimite.add(btnDepositar);

		btnVerificarSaldo = new JButton("Verificar Saldo");

		btnVerificarSaldo.setBounds(10, 270, 126, 39);
		txtlimite.add(btnVerificarSaldo);

		btnSacar = new JButton("Sacar");
		btnSacar.setBounds(157, 332, 101, 39);
		txtlimite.add(btnSacar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(241, 84, 158, 199);
		txtlimite.add(scrollPane);

		JTextArea txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);

		JLabel lblNewLabel_5 = new JLabel("limite");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(267, 11, 70, 14);
		txtlimite.add(lblNewLabel_5);

		txtLimite = new JTextField();
		txtLimite.setBounds(316, 8, 106, 20);
		txtlimite.add(txtLimite);
		txtLimite.setColumns(10);
		btnAbrirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp = new ContaCorrente();

				String rs = cp.abrir(Long.parseLong(txtNumeroBanco.getText()), Long.parseLong(txtBanco.getText()),
						Long.parseLong(txtConta.getText()), txtTitular.getText(),
						Double.parseDouble(txtLimite.getText()), Double.parseDouble(txtSaldo.getText()));

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

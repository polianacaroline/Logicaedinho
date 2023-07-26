package br.com.poo.objetos.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class GerenciarContas extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarContas frame = new GerenciarContas();
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
	public GerenciarContas() {
		getContentPane().setBackground(new Color(255, 128, 64));
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(GerenciarContas.class.getResource("/br/com/poo/objetos/img/itau.png")));
		lblNewLabel.setBounds(115, 48, 230, 225);
		getContentPane().add(lblNewLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 368);
		setLocationRelativeTo(null );
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mniAberturadeConta = new JMenu("Abertura de conta");
		menuBar.add(mniAberturadeConta);
		
		JMenuItem mniPoupanca = new JMenuItem("Conta Poupança");
		mniPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaPoupanca janelapoupanca = new JanelaPoupanca();
				janelapoupanca.setVisible(true);
				
			}
		});
		mniAberturadeConta.add(mniPoupanca);
		
		JMenuItem mniContaCorrente = new JMenuItem("Conta corrente");
		mniContaCorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCorrente janelaCorrente = new JanelaCorrente();
				janelaCorrente.setVisible(true);
				
			}
		});
		mniAberturadeConta.add(mniContaCorrente);
	}
}

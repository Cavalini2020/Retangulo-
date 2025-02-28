package br.com.empresa.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.empresa.model.Retangulo;

public class FrameRetangulo {
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Calculos com ret�ngulo");	
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(3);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// ***  Construir um JLabel
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(10,10,60,30);
		
		// *** Construindo um JTextField Altura
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70,10,60,30);
		
		// *** Construindo um Jlabel Base 
		JLabel labelbase = new JLabel();
		labelbase.setText("Base:");
		labelbase.setBounds(10, 50, 60, 30);
		
		// *** Construindo um JTextField Base
		JTextField textBase = new JTextField();
		textBase.setBounds(70,50,50,30);
		
		// *** Construir o bot�o Calcular
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(10, 100, 110, 30);
		
		// *** Costruindo o bot�o Limpar 
		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(10, 140, 110, 30);
		
		// *** Labels RESULTADO 
		JLabel labelArea = new JLabel ();
		labelArea.setText("�rea:");
		labelArea.setBounds(150, 10, 120, 30);
		
		
		JLabel labelPerimetro = new JLabel ();
		labelPerimetro.setText("Per�metro:");
		labelPerimetro.setBounds(150, 50, 120, 30);

		
		
		tela.getContentPane().add(labelAltura);
		tela.getContentPane().add(textAltura);
		tela.getContentPane().add(labelbase);
		tela.getContentPane().add(textBase);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(labelArea);
		tela.getContentPane().add(labelPerimetro);

		tela.setVisible(true);	
		
		// *** Ouvintes de a��es/eventos
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 
				Retangulo r1 = new Retangulo();
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText()));
	
				labelArea.setText("�rea: " + String.valueOf(r1.calcularArea()));
				labelPerimetro.setText("Per�metro: " + String.valueOf(r1.calcularPerimetro()));
			}
		});

	}

}

;

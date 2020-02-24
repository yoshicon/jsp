package vavo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Grp extends JFrame implements ActionListener{
	
	JButton bt1 = new JButton("란-듐");
	JPanel lap = new JPanel();
	JLabel jl = new JLabel("머머금?");
	
	public Grp() {
		setTitle("점심");
		
		BorderLayout lay = new BorderLayout();
		setLayout(lay);
		
	/*
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setM();
			}
		});
	/*/
		bt1.addActionListener((e) -> {setM();});
	//*/
		add(bt1, BorderLayout.SOUTH);
		add(jl, BorderLayout.CENTER);
		jl.setHorizontalAlignment(JLabel.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 200);
		setVisible(true);
	}
	
	public void setM() {
		EvenMoham.mn = Menu.Menu(EvenMoham.babo);
		jl.setText(EvenMoham.mn);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
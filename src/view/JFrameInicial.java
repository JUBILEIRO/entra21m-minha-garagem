/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class JFrameInicial extends JFrame
implements JFrameComportamentosInterface{
    
    private JButton jButtonListaCarros;
    private JButton jButtonCadastroCarros;

    public JFrameInicial(){
        criarTela();
        criarComponentes();
        definirLocalizacao();
        adicionarComponentes();
        adicionarOnClick();
    }
    
    @Override
    public void criarTela() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void criarComponentes() {
       jButtonListaCarros = new JButton("Lista de Carros");
       jButtonCadastroCarros = new JButton("Cadastro de Carros");
    }

    @Override
    public void definirLocalizacao() {
        jButtonListaCarros.setBounds(10, 10, 200, 35);
        jButtonCadastroCarros.setBounds(10, 55, 200, 35);
    }

    @Override
    public void adicionarComponentes() {
        add(jButtonListaCarros);
        add(jButtonCadastroCarros);
    }

    @Override
    public void adicionarOnClick() {
        jButtonListaCarros.addActionListener((ActionEvent e) -> {
            JFrameListaCarros alfa = new JFrameListaCarros();
        });
        
        jButtonCadastroCarros.addActionListener((ActionEvent e) -> {
            new JFrameCadastroCarro().setVisible(true);
        });
    }
    
}

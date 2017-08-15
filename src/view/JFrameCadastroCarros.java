/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class JFrameCadastroCarros extends JFrame implements JFrameComportamentosInterface{

    public JFrameCadastroCarros() {
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
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void criarComponentes() {

    }

    @Override
    public void definirLocalizacao() {

    }

    @Override
    public void adicionarComponentes() {

    }

    @Override
    public void adicionarOnClick() {

    }
    
}

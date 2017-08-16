/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.CarroDAO;
import java.awt.ScrollPane;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Carro;

/**
 *
 * @author Alunos
 */
public class JFrameListaCarros extends JFrame implements JFrameComportamentosInterface{

    private JTable jTable;
    private DefaultTableModel modelo;
    private JScrollPane scroll;
    
    public JFrameListaCarros() {
        criarTela();
        criarComponentes();
        definirLocalizacao();
        adicionarComponentes();
        adicionarOnClick();
    }

    @Override
    public void criarTela() {
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void criarComponentes() {
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        modelo.addColumn("Id");
        modelo.addColumn("Fabricante");
        modelo.addColumn("Nome");
        modelo.addColumn("Placa");
        modelo.addColumn("Cor");
        modelo.addColumn("Renavam");
        modelo.addColumn("Ano de Fabricação");
        modelo.addColumn("Ano de Lançamento");
        modelo.addColumn("Tipo de Pneu");
        modelo.addColumn("Quantidade de Portas");
        modelo.addColumn("Quantidade de Batidas");
        modelo.addColumn("Chassi");
        modelo.addColumn("Quilometragem");
        modelo.addColumn("Potência");
        modelo.addColumn("Data da Compra do Carro");
        modelo.addColumn("Está Funcional ");
        modelo.addColumn("Permitida Circulação");
        modelo.addColumn("Descrição");
        
        
        popularJTable();
        jTable = new JTable(modelo);
        scroll = new JScrollPane(jTable);
        
    }

    @Override
    public void definirLocalizacao() {
        scroll.setBounds(10, 10, 975, 500);
    }

    @Override
    public void adicionarComponentes() {
        add(scroll);
    }
    
    public void popularJTable(){
        ArrayList<Carro>carros = new CarroDAO().retornarListagem();
        for (Carro carro : carros){
            modelo .addRow(new Object[]{
                carro.getId(),
                carro.getFabricante(),
                carro.getNome(),
                carro.getPlaca(),
                carro.getCor(),
                carro.getRenavam(),    
                carro.getAnoFabricacao(),    
                carro.getAnoLancamento(),    
                carro.getTipoPneu(),    
                carro.getQuantidadePortas(),    
                carro.getQuantidadeBatidas(),    
                carro.getChassi(),    
                carro.getQuilometragem(),    
                carro.getPotencia(),    
                carro.getDataCompra(),    
                carro.isEstaFuncional(),    
                carro.isPermitidaCirculacao(),    
                carro.getDescricao()
            });
        }        
    }

    @Override
    public void adicionarOnClick() {
        
    }
    
}

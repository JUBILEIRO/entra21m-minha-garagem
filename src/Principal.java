
import dao.CarroDAO;
import database.Utilitarios;
import java.awt.EventQueue;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Carro;
import view.JFrameInicial;

/**
 *
 * @author (name=Cristhian Gustavol lourenço,date=08-11-2017)
 */
public class Principal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrameInicial inicial = new JFrameInicial();
            }
        });
        
    }
}

//        public static void main(String[] args) {
//        CarroDAO dao = new CarroDAO();/*
//        Carro peugeot308 = new Carro();
//        peugeot308.setNome("308");
//        peugeot308.setFabricante("Peugeot");
//        peugeot308.setCor("Preto");
//        peugeot308.setAnoFabricacao((short) 2013);
//        peugeot308.setAnoLancamento((short) 2014);
//        peugeot308.setEstaFuncional(true);
//        peugeot308.setPermitidaCirculacao(false);
//        peugeot308.setQuantidadeBatidas((byte) 13);
//        peugeot308.setPlaca("BCAD-4598");
//        peugeot308.setPotencia(145);
//        peugeot308.setDataCompra(new Date(2013, 8, 24));
//        peugeot308.setTipoPneu((short) 17);
//        peugeot308.setRenavam(456873215);
//        peugeot308.setQuilometragem(45678.94f);
//        peugeot308.setQuantidadePortas((byte) 4);
//        peugeot308.setChassi("4652-4565-2456-7954-4651");
//        peugeot308.setDescricao("O 308 é um modelo familiar médio da Peugeot, o sucessor do Peugeot 307. Como de tradição da marca, é o número que sucede o 307. Foi lançado recentemente no Brasil. Em 2014, o Peugeot 308 foi eleito o melhor carro do ano na Europa.");
//        int codigoInserir = dao.inserir(peugeot308);
//        if(codigoInserir != Utilitarios.NAO_FOI_POSSIVEL_INSERIR){
//            peugeot308.setId(codigoInserir);
//        }else{
//            JOptionPane.showMessageDialog(null, "Não foi possível inserir");
//        }
//        
//        peugeot308.setNome("Gol");
//        peugeot308.setFabricante("VW");
//        int codigoAlterar = dao.alterar(peugeot308);
//        if(codigoAlterar != Utilitarios.NAO_FOI_POSSIVEL_ALTERAR){
//            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
//        }else{
//            JOptionPane.showMessageDialog(null, "Deu ruim mano");
//        }*/
//        
//        //cmd que apga todos os dados da tabela.
//        for(int i = 1; i < 100; i++)
//        dao.excluir(i);
//        
//        ArrayList<Carro> carros = dao.retornarListagem();
//        for (Carro carro : carros) {
//            System.out.println(carro.getId() + " - " + carro.getNome());
//        }

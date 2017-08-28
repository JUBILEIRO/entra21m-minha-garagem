/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.Conexao;
import database.Utilitarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Aviao;
import model.Categoria;

/**
 *
 * @author Alunos
 */
public class AviaoDAO {
    
    public ArrayList<Aviao> retornarListaAviao() {
        ArrayList<Aviao> avioes = new ArrayList<>();
        String sql = "SELECT id, id_categoria, nome FROM avioes";
        try {
            Statement st = Conexao.conectar().createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                Aviao aviao = new Aviao();
                aviao.setCodigo(rs.getInt("id"));
                int codigoCategoria = rs.getInt("id_categoria");
                Categoria categoria = new CategoriaDAO()
                        .buscarCategoriaPorid(codigoCategoria);
                aviao.setCategoria(categoria);
                aviao.setNome(rs.getString("nome"));
                avioes.add(aviao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.desconectar();
        }
        return avioes;
    }
    
    public int inserir(Aviao aviao) {
        String sql = "INSERT INTO avioes (id_categoria, nome) VALUE (?,?);";
        int codigoInserido = Utilitarios.NAO_FOI_POSSIVEL_INSERIR;
        try {
            PreparedStatement ps = Conexao.conectar().prepareStatement(sql,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, aviao.getCategoria().getId());
            ps.setString(2, aviao.getNome());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                codigoInserido = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.desconectar();
        }
        return codigoInserido;
    }
    
    public int alterar(Aviao aviao) {
        String sql = "UPDATE avioes SET id_categoria = ?, nome = ?";
        int codigoAlterado = Utilitarios.NAO_FOI_POSSIVEL_ALTERAR;
        try {
            PreparedStatement ps = Conexao.conectar().prepareStatement(sql);
            ps.setInt(1, aviao.getCategoria().getId());
            ps.setString(2, aviao.getNome());
            ps.setInt(3, aviao.getCodigo());
            codigoAlterado = ps.executeUpdate();
        } catch (SQLException alfa) {
            alfa.printStackTrace();
        }
        return codigoAlterado;
    }
    
    public boolean excluir(int id) {
        String sql = "DELETE FROM avioes WHERE id = ?;";
        try {
            PreparedStatement ps = Conexao.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            if(buscarAviaoPorId(id) == null){
                return true;
            }
        } catch (SQLException alfa) {
            alfa.printStackTrace();
        } finally {
            Conexao.desconectar();
        }
        return false;
    }
    
    public Aviao buscarAviaoPorId(int id) {
        Aviao aviao = null;
        String sql = "SELECT id, id_categoria, nome FROM avioes";
        sql += "\nWHERE id = ?";
        try {
            PreparedStatement ps = Conexao.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            if (rs.next()) {
                aviao = new Aviao();
                aviao.setCodigo(rs.getInt("id"));
                aviao.setCategoria(new CategoriaDAO()
                        .buscarCategoriaPorid(rs.getInt("id_categoria")));
                aviao.setNome(rs.getString("nome"));
            }
        } catch (SQLException alfa) {
            alfa.printStackTrace();
        }finally{
            Conexao.desconectar();
        }
        return aviao;
    }
}

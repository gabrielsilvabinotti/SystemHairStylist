package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Cliente;

/**
 *
 * @author Gabriel
 */
public class ClienteDAO {
    Connection conn;

    public ClienteDAO() {
        this.conn = ConnectionFactory.getConnection();
    }
    
    public void insert(Cliente cliente){
        PreparedStatement stmt = null;
        
        try{
            stmt = conn.prepareStatement("INSERT INTO tb_cliente(nome,telefone) VALUES(?,?)");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro,"Erro",JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
    
}

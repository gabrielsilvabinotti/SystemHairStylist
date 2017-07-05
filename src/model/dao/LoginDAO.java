package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Gabriel
 */
public class LoginDAO {
    
    public boolean ValidaLogin(String login, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean valida = false;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM tb_login WHERE login = ? AND senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                valida = true;
            }
        }catch(SQLException erro){
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE,null, erro);
        }finally{
        
    }
        return valida;
    }
}

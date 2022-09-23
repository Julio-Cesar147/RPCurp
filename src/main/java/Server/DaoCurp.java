package Server;

import Utils.MySQLConnection;

import java.sql.*;

public class DaoCurp {

    Connection conn;
    PreparedStatement pste;
    CallableStatement cstn;
    ResultSet rs;

    public boolean save(){
        try{
            conn = new MySQLConnection().connect();
            pste = conn.prepareStatement("INSERT INTO ");
            pste.setString(1, calcu.getType());
            pste.setDouble(2, calcu.getFnum());
            pste.setDouble(3, calcu.getSnum());
            pste.setDouble(4, calcu.getResult());
            pste.setDate(5, (Date) calcu.getCreated());
            //return pste.executeUpdate() == 1;
        }catch (SQLException e){
            Logger.getLogger(DaoCalcu.class.getName()).log(Level.SEVERE, "Error", e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnection();
        }
        return false;
    }

    public void closeConnection(){
        try{
            if(conn != null){
                conn.close();
            }
            if(pste != null){
                pste.close();
            }
            if(cstn != null){
                cstn.close();
            }
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e){

        }
    }

}

package com.test.Controller;

import com.test.Model.Client;
import com.test.connexiontobd.ConnexionToBd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class clientController {
    public boolean addclient(Client client) throws SQLException, ClassNotFoundException {
        ConnexionToBd bd=new ConnexionToBd();
        var conn=bd.connecttodb();
        PreparedStatement stm= conn.prepareStatement("insert into client values(?,?,?,?,?,?)");
        stm.setInt(1,client.getId());
        stm.setString(2,client.getNom());
        stm.setString(3,client.getPrenom());
        stm.setString(4,client.getEmail());
        stm.setString(5,client.getTel());
        stm.setString(6,client.getAdresse());
        var i= stm.executeUpdate();
        if(i==1){
            return true;
        }else{
            return false;
        }
    }
    public boolean updateName(int id,String newname) throws SQLException, ClassNotFoundException {
        ConnexionToBd bd=new ConnexionToBd();
        var conn=bd.connecttodb();
        PreparedStatement stm= conn.prepareStatement("update  client set nom=? where idclient=?");
        stm.setString(1,newname);
        stm.setInt(2,id);
        var i=stm.executeUpdate();
        if(i>0){
            return true;
        }else{
            return false;
        }
    }
    public  boolean deleteclient(int id) throws SQLException, ClassNotFoundException {
        ConnexionToBd bd=new ConnexionToBd();
        var conn=bd.connecttodb();
        PreparedStatement stm= conn.prepareStatement("DELETE FROM `client` WHERE idclient=?");
        stm.setInt(1,id);
        var i=stm.executeUpdate();
        if(i>0){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Client> getallclient() throws SQLException, ClassNotFoundException {
        ArrayList<Client> allclients= new ArrayList<Client>();
        ConnexionToBd bd=new ConnexionToBd();
        var conn=bd.connecttodb();
        PreparedStatement stm= conn.prepareStatement("select * from client");
        ResultSet rs=stm.executeQuery();
        while(rs.next()){
            Client cltmp= new Client();
            cltmp.setId(rs.getInt(1));
            cltmp.setNom(rs.getString(2));
            cltmp.setPrenom(rs.getString(3));
            cltmp.setAdresse(rs.getString(4));
            cltmp.setTel(rs.getString(5));
            cltmp.setEmail(rs.getString(6));
            allclients.add(cltmp);
        }
        return allclients;
    }
}

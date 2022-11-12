package com.test.Model;

import com.test.Controller.clientController;
import com.test.connexiontobd.ConnexionToBd;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class main {
    public static  void main(String args[]){
        try {
            Client client1= new Client(2,"Aziz","Yassine","06 rue ibn tamim 01","0616815066","azizmbu@gmail.com");
            clientController clcon=new clientController();
            // add client
              var x=clcon.addclient(client1);
            if(x){
                System.out.println("added with success");
            }else{
                System.out.println("Error");
            }
            //update
            /*var x=clcon.updateName(1,"khamis");
            if(x){
                System.out.println("updated with success");
            }else{
                System.out.println("Error");
            }*/
            /*var x= clcon.deleteclient(2);
            if(x){
                System.out.println("deleted with success");
            }else{
                System.out.println("Error");
            }*/
            ArrayList<Client> test= clcon.getallclient();
            System.out.println(test);



        } catch (SQLException e) {
            System.out.print(e.getMessage());

        } catch (ClassNotFoundException e) {

            System.out.print(e.getMessage());
        }
    }
}

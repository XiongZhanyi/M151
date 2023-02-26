/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Webserver;

import Dataserver.AdministratorDAO;
import java.io.Serializable;
import java.sql.SQLException;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "loginController")
@SessionScoped
public class LoginController implements Serializable {
    private String username = "";
    private String password = "";
    private AdministratorDAO adminDAO = new AdministratorDAO();
    
    public String doLogin() throws SQLException, ClassNotFoundException{
        if(adminDAO.isAdministrator(username, password)){
            return "/category.xhtml";
        }
        else{
            return "/index.xhtml";
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

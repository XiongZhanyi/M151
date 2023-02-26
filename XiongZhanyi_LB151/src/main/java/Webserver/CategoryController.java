/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Webserver;

import Applicationserver.Category;
import Dataserver.AdministratorDAO;
import Dataserver.FortuneWheelDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "categoryController")
@SessionScoped
public class CategoryController implements Serializable {
    FortuneWheelDAO fortuneWheelDAO = new FortuneWheelDAO();
    List<Category> categorys;

    public CategoryController() throws SQLException, ClassNotFoundException {
        this.categorys = fortuneWheelDAO.getCategory();
    }

    public List<Category> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<Category> categorys) {
        this.categorys = categorys;
    }
        
    public String deleteCategory(Category category) throws SQLException, ClassNotFoundException{
        this.fortuneWheelDAO.deleteCategory(category);
        return "/category.xhtml?faces-redirect=true";
    }
}

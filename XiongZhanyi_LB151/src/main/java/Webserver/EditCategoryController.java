/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Webserver;

import Applicationserver.Category;
import Applicationserver.PuzzleWord;
import Dataserver.AdministratorDAO;
import Dataserver.FortuneWheelDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "editCategoryController1")
@SessionScoped
public class EditCategoryController implements Serializable {
    
    private Category category;
    private String categoryString = "";
    
    public String editCategory(Category category){
        this.category = category;
        this.categoryString = category.getCategoryName();
        return "categoryEdit.xhtml";
    }

    public Category getCategory() {
        return category;
    }

    public String getCategoryString() {
        return categoryString;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setCategoryString(String categoryString) {
        this.categoryString = categoryString;
    }

    public String edit(){
        return "category.xhtml";
    }
}

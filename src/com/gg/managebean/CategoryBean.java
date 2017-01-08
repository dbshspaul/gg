package com.gg.managebean;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.gg.model.Category;
import com.gg.transaction.Ejb;

@ManagedBean(name="product")
public class CategoryBean {
	
	@EJB
	private Ejb ejb;
	
	private Category category=new Category();

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public void createCategory(){		
		try {
			Category category=getCategory();
			category.setCreatedDateTime(new Date());
			category.setActive(true);
			
			ejb.setData(category);
			FacesContext.getCurrentInstance().addMessage("msg", new FacesMessage(FacesMessage.SEVERITY_INFO,"Success","Category added successfully"));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("msg", new FacesMessage(FacesMessage.SEVERITY_FATAL,"Fatel Error","failed to add new Category."));
			e.printStackTrace();
		}
	}
	
	public List<Category> getAllCategories(){
		return ejb.getAllEntities(Category.class);				
	}
	
	public void selectCategory(){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}

}

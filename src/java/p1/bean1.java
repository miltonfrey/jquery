/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author abc
 */
@Named(value = "bean1")
@Dependent
public class bean1 {
private int i1=5;
private Integer i2;    
    public bean1() {
        
        
    }
    
    public void m1(){
        
        FacesContext context=FacesContext.getCurrentInstance();
        FacesMessage message= new FacesMessage("metodo");
        
        context.addMessage(null,message);
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public Integer getI2() {
        return i2;
    }

    public void setI2(Integer i2) {
        this.i2 = i2;
    }
    
    
    
    
}

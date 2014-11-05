/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;


import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.inject.Named;

import javax.faces.application.FacesMessage;


import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;



import org.primefaces.component.datatable.DataTable;

@ViewScoped
@Named(value = "bean1")



public class bean1 implements Serializable{
private int i1=5;
private Integer i2;   
private String cadena="tres";
private ArrayList<String> lista=new ArrayList<String>();
private ArrayList<String> selectedString=new ArrayList<String>();
    public bean1(){
        
        
    }
    @PostConstruct
    public void init() {
         
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
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

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public ArrayList<String> getSelectedString() {
        return selectedString;
    }

    public void setSelectedString(ArrayList<String> selectedString) {
        this.selectedString = selectedString;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    
    
    
    
    
    public void procesa(){
    String str="";
    DataTable d=(DataTable)FacesContext.getCurrentInstance().getViewRoot().findComponent("form1:tabla");
    
    Object o=d.getRowData("dos");
    String dos=(String)o;
    
    
    FacesContext context=FacesContext.getCurrentInstance();
            FacesMessage message=new FacesMessage(dos);
            message.setSeverity(FacesMessage.SEVERITY_INFO);
            context.addMessage(null, message);
    
    
}   
    
           
    
    
    
}

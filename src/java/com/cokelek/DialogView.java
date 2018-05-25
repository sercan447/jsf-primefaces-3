
package com.cokelek;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean    
public class DialogView {
    String a;
    String b;
    int c;
    
    public void destroyWorld(){
        
        addMessage("System Bilgi", "Tekrardan dene kardeşim");
     }
    
    public void addMessage(String summary,String detail){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,summary,detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
        
      
        
    }
}
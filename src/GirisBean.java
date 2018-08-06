

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;


public class GirisBean {
	
	Giris g=new Giris();
	
public Giris getG() {
		return g;
	}

	public void setG(Giris g) {
		this.g = g;
	}

public String giriskontrol() {
		
		if(g.getKadi().equals("king") && g.getSifre().equals("1234")) {
			g.setKadi("");
			g.setSifre("");
			return "index.xhtml?faces-redirect=true";
		}
		
		RequestContext.getCurrentInstance().update("growl");
        FacesContext context= FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata","Kullanýcý Adý veya Þifre hatalý.!!!"));
		
		return "";
		
	}
	
	
}



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Kisi")
public class Kisi {
	
	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	private String soyad;
	private String eposta;
	private String adres;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "iletisimID")
	private Iletisim i=new Iletisim();

	public Iletisim getI() {
		return i;
	}

	public void setI(Iletisim i) {
		this.i = i;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	

}

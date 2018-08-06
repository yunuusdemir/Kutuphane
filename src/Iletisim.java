

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="iletisim")
public class Iletisim {

	@Id
	@GeneratedValue
private Long id;
	private String telno;
	
	@OneToOne(mappedBy = "iletisim")
	private Kisi kisi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public Kisi getKisi() {
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}
	
	
}

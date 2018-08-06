

import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;


public class Bean {

	Kisi kisi=new Kisi();
	
	public void ekle()
	{
		
		EntityManager em=EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(kisi);
		em.getTransaction().commit();
		kisi=new Kisi();
		
	}
	
	
	public void sil()
	{
		EntityManager em=EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(kisi);
		em.getTransaction().commit();
		kisi=new Kisi();
		
	}
	
	public void duzenle()
	{
		EntityManager em=EntityUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(kisi);
		em.getTransaction().commit();
		kisi=new Kisi();
	}
	
	public List<Kisi> getListe()
	{
		EntityManager em= EntityUtil.getEntityManager();
		return em.createQuery("from Kisi").getResultList();
		
	}


	public Kisi getKisi() {
		return kisi;
	}


	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}
	
	
	
}

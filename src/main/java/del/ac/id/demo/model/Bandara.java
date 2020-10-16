package del.ac.id.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bandara")
public class Bandara {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "nama_bandara")
    private String namaBandara;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNamaBandara() {
		return namaBandara;
	}

	public void setNamaBandara(String namaBandara) {
		this.namaBandara = namaBandara;
	}
	
	
}

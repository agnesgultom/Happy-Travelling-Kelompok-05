package del.ac.id.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import del.ac.id.demo.model.Bandara;
import del.ac.id.demo.repository.BandaraRepository;

public class BandaraServiceImpl implements BandaraService{
	@Autowired
    private BandaraRepository bandaraRepository;
	
	@Override
	public void saveBandara(Bandara bandara) {
		this.bandaraRepository.save(bandara);	
	}
}

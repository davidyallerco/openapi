package net.yallerco.openapi.service;

import net.yallerco.openapi.model.Pais;
import net.yallerco.openapi.persistence.entity.PaisEntity;
import net.yallerco.openapi.repository.PaisRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaisServiceImpl implements PaisService {

    private final PaisRepository paisRepository;

    public PaisServiceImpl(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @Override
    public List<Pais> findAll() {
        List<PaisEntity> paises = paisRepository.findAll();
        
        return paises.stream()
                .map(this::mapToPais)
                .collect(Collectors.toList());
    }
    
    private Pais mapToPais(PaisEntity entity) {
        Pais pais = new Pais();
        pais.setId(entity.getId());
        pais.setPais(entity.getPais());
        pais.setCapital(entity.getCapital());
        pais.setCodigo(entity.getCodigo());
        return pais;
    }
}
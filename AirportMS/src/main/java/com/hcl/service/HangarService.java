package com.hcl.service;

import java.util.List;



import com.hcl.entities.Hangar;

 

public interface HangarService {
    public void insertHangar(Hangar hangar);
    
    public List<Hangar> getAllHangar();
}

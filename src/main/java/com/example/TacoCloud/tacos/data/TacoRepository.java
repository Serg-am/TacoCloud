package com.example.TacoCloud.tacos.data;

import com.example.TacoCloud.tacos.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}

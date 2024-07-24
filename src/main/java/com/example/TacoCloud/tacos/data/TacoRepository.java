package com.example.TacoCloud.tacos.data;

import com.example.TacoCloud.tacos.Taco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository
        extends PagingAndSortingRepository<Taco, Long> {
}

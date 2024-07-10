package com.example.TacoCloud.tacos.data;

import com.example.TacoCloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}

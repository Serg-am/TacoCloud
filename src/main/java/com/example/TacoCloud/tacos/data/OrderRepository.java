package com.example.TacoCloud.tacos.data;

import com.example.TacoCloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

}

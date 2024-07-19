package com.example.TacoCloud.tacos.data;

import com.example.TacoCloud.tacos.TacoOrder;
import com.example.TacoCloud.tacos.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface OrderRepository extends CrudRepository<TacoOrder, String> {
    List<TacoOrder> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);
}

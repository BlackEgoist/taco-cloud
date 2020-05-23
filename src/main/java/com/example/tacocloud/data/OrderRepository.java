package com.example.tacocloud.data;

import com.example.tacocloud.Order;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String zip);

    List<Order> readOrdersByZipAndPlacedAtBetween(String zip, Date startDate, Date endDate);
}

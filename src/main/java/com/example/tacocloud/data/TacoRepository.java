package com.example.tacocloud.data;

import com.example.tacocloud.Taco;
import java.net.ContentHandler;
import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
}

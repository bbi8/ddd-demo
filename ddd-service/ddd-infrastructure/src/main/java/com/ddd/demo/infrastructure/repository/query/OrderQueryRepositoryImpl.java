package com.ddd.demo.infrastructure.repository.query;

import com.ddd.demo.domain.repository.OrderRepository;
import com.ddd.demo.facade.model.dto.OrderDTO;
import com.ddd.demo.infrastructure.model.po.OrderPO;
import com.ddd.demo.support.infrastructure.repository.BaseRepository;

public class OrderQueryRepositoryImpl extends BaseRepository<OrderPO, OrderDTO> implements OrderRepository {
}

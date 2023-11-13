package com.ddd.demo.infrastructure.repository.cmd;

import com.ddd.demo.domain.repository.OrderRepository;
import com.ddd.demo.facade.model.dto.OrderDTO;
import com.ddd.demo.infrastructure.model.po.OrderPO;
import com.ddd.demo.support.infrastructure.repository.BaseRepository;

public class OrderRepositoryImpl extends BaseRepository<OrderPO, OrderDTO> implements OrderRepository {
}

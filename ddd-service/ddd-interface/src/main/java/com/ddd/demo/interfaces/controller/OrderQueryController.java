package com.ddd.demo.interfaces.controller;

import com.ddd.demo.facade.model.dto.OrderDTO;
import com.ddd.demo.support.api.IQueryApi;
import com.ddd.demo.support.interfaces.controller.BaseQueryApi;

public class OrderQueryController extends BaseQueryApi<OrderDTO> implements IQueryApi<OrderDTO> {
}

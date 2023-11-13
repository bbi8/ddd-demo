package com.ddd.demo.interfaces.controller;

import com.ddd.demo.facade.model.dto.OrderDTO;
import com.ddd.demo.support.api.IApi;
import com.ddd.demo.support.interfaces.controller.BaseApi;

public class OrderController extends BaseApi<OrderDTO> implements IApi<OrderDTO> {
}

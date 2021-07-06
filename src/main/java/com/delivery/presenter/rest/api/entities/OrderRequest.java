package com.delivery.presenter.rest.api.entities;

import lombok.AllArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Value
@AllArgsConstructor
public class OrderRequest {
    @NotNull
    private final Long storeId;

    @NotEmpty
    private final List<OrderRequestItem> orderItems;

	public OrderRequest() {
		super();
		this.storeId = null;
		this.orderItems = null;
	}
    
    
}

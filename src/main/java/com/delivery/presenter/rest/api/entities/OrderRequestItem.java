package com.delivery.presenter.rest.api.entities;

import lombok.AllArgsConstructor;
import lombok.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Value
@AllArgsConstructor
public class OrderRequestItem {
    @NotNull
    private final Long id;

    @Min(1)
    @NotNull
    private final Integer quantity;

	public OrderRequestItem() {
		super();
		this.id = null;
		this.quantity = null;
	}
    
    
}

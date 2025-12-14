package com.aditya.cartify.models;
import javax.validation.constraints.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartDTO {
	
	@NotNull
	private Integer productId;
	
	private String productName;
	
	private Double price;
	
	@Min(1)
	private Integer quantity;
	
}

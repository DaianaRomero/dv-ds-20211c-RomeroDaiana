package ar.edu.davinci.dvds20211cRomeroDaiana.controller.request;


import java.math.BigDecimal;

import ar.edu.davinci.dvds20211cRomeroDaiana.domain.TipoPrenda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrendaInsertRequest {
	
	private BigDecimal precioBase;
	
	private TipoPrenda tipo;
	
	private String descripcion;

}


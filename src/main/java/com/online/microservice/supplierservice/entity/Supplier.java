package com.online.microservice.supplierservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Document(collection = "supplier")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of={"id", "regNumber"})
public class Supplier {

	@Id
	private String id;
	private String regNumber;
	private String name;
	private String phone;
	private String mobile;
	private String address;

	
	
	

}

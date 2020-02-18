package com.online.microservice.supplierservice.service;

import java.util.List;

import com.online.microservice.supplierservice.entity.Supplier;
import com.online.microservice.supplierservice.exceptions.SupplierAlreadyExistedException;
import com.online.microservice.supplierservice.exceptions.SupplierNotFoundException;

public interface SupplierService {

	List<Supplier> getAllSuppliers();

	List<Supplier> getAllSuppliers(String[] supplierIds);

	Supplier getSupplierById(String id) throws SupplierNotFoundException;

	void saveSupplier(Supplier supplier) throws SupplierAlreadyExistedException;

	void updateSupplier(Supplier supplier) throws SupplierNotFoundException;

}

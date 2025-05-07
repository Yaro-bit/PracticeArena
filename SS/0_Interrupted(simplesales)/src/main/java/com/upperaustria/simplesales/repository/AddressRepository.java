package com.upperaustria.simplesales.repository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.upperaustria.simplesales.model.Address;

public class AddressRepository {
	private static final Address Address = null;

	public Address findById(String string) {
		return Address;
	}

	public Address save(Address address) {
		return null;
	}

	public void deleteById(String string) {

	}

	void findAll() {

	}
}
//Ein Interface, das von JpaRepository erbt und damit Methoden für CRUD-Operationen 
//für die Address-Entität bereitstellt.
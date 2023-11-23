package be.abis.acca.repository;

import be.abis.acca.model.Address;

import java.util.List;

public interface AddressRepository {

    List<Address> findAllAddresses();

    void insertAddress(Address a);

}

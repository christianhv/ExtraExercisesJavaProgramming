package be.abis.acca.test;

import be.abis.acca.model.Address;
import be.abis.acca.repository.AddressRepository;
import be.abis.acca.repository.FileAddressRepository;

public class TestReadFile {

    public static void main(String[] args) {
        AddressRepository ar = new FileAddressRepository();

        Address a = new Address("Some street","1","1000","Brussels","Belgium","B");
        ar.insertAddress(a);

        System.out.println("ALL ADDRESSES:");
        ar.findAllAddresses().forEach(System.out::println);

        System.out.println("\nFIND ADDRESS BY STREET,NR, AND ZIPCODE:");
        System.out.println(ar.findAddress("Diestsevest","32 bus 4B","3000"));



    }
}

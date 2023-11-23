package be.abis.acca.test;

import be.abis.acca.model.Address;
import be.abis.acca.repository.AddressRepository;
import be.abis.acca.repository.FileAddressRepository;

import java.util.Comparator;

public class TestReadFile {

    public static void main(String[] args) {
        AddressRepository ar = new FileAddressRepository();

        Address a = new Address("Some street","1","1000","Brussels","Belgium","B");
        ar.insertAddress(a);

        System.out.println("ALL ADDRESSES:");
        ar.findAllAddresses().forEach(System.out::println);


    }
}

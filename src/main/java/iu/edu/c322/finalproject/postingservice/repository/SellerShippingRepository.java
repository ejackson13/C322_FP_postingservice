package iu.edu.c322.finalproject.postingservice.repository;

import iu.edu.c322.finalproject.postingservice.model.Seller;
import iu.edu.c322.finalproject.postingservice.model.SellerShipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerShippingRepository extends JpaRepository<SellerShipping, Integer> {
}

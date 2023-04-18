package iu.edu.c322.finalproject.postingservice.repository;

import iu.edu.c322.finalproject.postingservice.model.PostingInformation;
import iu.edu.c322.finalproject.postingservice.model.SellerItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostingRepository extends JpaRepository<PostingInformation, Integer> {
}

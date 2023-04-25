package iu.edu.c322.finalproject.postingservice.controller;

import iu.edu.c322.finalproject.postingservice.model.SellerItem;
import iu.edu.c322.finalproject.postingservice.repository.SellerItemRepository;
import iu.edu.c322.finalproject.postingservice.repository.SellerRepository;
import iu.edu.c322.finalproject.postingservice.repository.SellerShippingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
public class PostingController {

    private SellerItemRepository repository;

    private SellerRepository sellerRepository;

    private SellerShippingRepository sellerShippingRepository;

    public PostingController(SellerItemRepository repository, SellerRepository sellerRepository, SellerShippingRepository sellerShippingRepository) {
        this.sellerShippingRepository = sellerShippingRepository;
        this.sellerRepository = sellerRepository;
        this.repository = repository;
    }

    @GetMapping
    public List<SellerItem> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody SellerItem sellerItem) {
        sellerShippingRepository.save(sellerItem.getSeller().getSellerShipping());
        sellerRepository.save(sellerItem.getSeller());
        repository.save(sellerItem);
    }

}

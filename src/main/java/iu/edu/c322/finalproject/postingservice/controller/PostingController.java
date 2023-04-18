package iu.edu.c322.finalproject.postingservice.controller;

import iu.edu.c322.finalproject.postingservice.model.PostingInformation;
import iu.edu.c322.finalproject.postingservice.model.SellerItem;
import iu.edu.c322.finalproject.postingservice.repository.PostingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
public class PostingController {

    private PostingRepository repository;

    public PostingController(PostingRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PostingInformation> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody PostingInformation postingInformation) {
        PostingInformation addedPostingInformation = repository.save(postingInformation);
    }

}

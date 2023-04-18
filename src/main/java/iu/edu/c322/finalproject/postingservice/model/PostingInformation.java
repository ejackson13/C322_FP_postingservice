package iu.edu.c322.finalproject.postingservice.model;

import jakarta.persistence.*;

@Entity
public class PostingInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sellerItem_id")
    private SellerItem sellerItem;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sellerShipping_id")
    private SellerShipping sellerShipping;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public SellerItem getSellerItem() {
        return sellerItem;
    }

    public void setSellerItem(SellerItem sellerItem) {
        this.sellerItem = sellerItem;
    }

    public SellerShipping getSellerShipping() {
        return sellerShipping;
    }

    public void setSellerShipping(SellerShipping sellerShipping) {
        this.sellerShipping = sellerShipping;
    }
}

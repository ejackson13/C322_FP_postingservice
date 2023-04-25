package iu.edu.c322.finalproject.postingservice.model;

import jakarta.persistence.*;

@Entity
public class Seller {

    @Id
    private int sellerId;

    private String venmoId;

    @OneToOne
    @JoinColumn(name = "shippingId")
    private SellerShipping sellerShipping;

    private String sellerName;

    private String sellerEmail;

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public SellerShipping getSellerShipping() {
        return sellerShipping;
    }

    public void setSellerShipping(SellerShipping sellerShipping) {
        this.sellerShipping = sellerShipping;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getVenmoId() {
        return venmoId;
    }

    public void setVenmoId(String venmoId) {
        this.venmoId = venmoId;
    }
}

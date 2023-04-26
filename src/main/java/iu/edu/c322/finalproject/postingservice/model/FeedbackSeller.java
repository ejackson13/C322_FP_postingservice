package iu.edu.c322.finalproject.postingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FeedbackSeller {

    @Id
    private int feedbackSellerId;

    private int numOfSellerScores;

    private float sumOfSellerScores;

    public int getFeedbackSellerId() {
        return feedbackSellerId;
    }

    public void setFeedbackSellerId(int feedbackSellerId) {
        this.feedbackSellerId = feedbackSellerId;
    }

    public int getNumOfSellerScores() {
        return numOfSellerScores;
    }

    public void setNumOfSellerScores(int numOfSellerScores) {
        this.numOfSellerScores = numOfSellerScores;
    }

    public float getSumOfSellerScores() {
        return sumOfSellerScores;
    }

    public void setSumOfSellerScores(float sumOfSellerScores) {
        this.sumOfSellerScores = sumOfSellerScores;
    }

}

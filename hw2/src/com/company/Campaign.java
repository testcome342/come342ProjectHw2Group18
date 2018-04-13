package com.company;

public class Campaign {
    private String title;
    private String campaignStartDate;
    private String campaignFinishDate;
    private int estimatedCost;


    public Campaign(String title, String campaignStartDate, String campaignFinishDate, int estimatedCost) {
        this.title = title;
        this.campaignStartDate = campaignStartDate;
        this.campaignFinishDate = campaignFinishDate;
        this.estimatedCost = estimatedCost;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCampaignStartDate() {
        return this.campaignStartDate;
    }

    public String getCampaignFinishDate() {
        return this.campaignFinishDate;
    }

    public int getEstimatedCost() {
        return this.estimatedCost;
    }
}

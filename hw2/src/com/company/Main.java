package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Client> clients = new HashMap<>();
        Map<String, Campaign> campaigns = new HashMap<>();
        /*Creating new client for test*/
        Client client1 = new Client("Mnm", "Fenerbahçe", "Talip");
        /*Addling client object to a listing purpose arraylist*/
        clients.put("client", client1);
        /*Creating new campaign for test*/
        Campaign campaign1 = new Campaign("Indirim", "13/04/2018", "15/04/2018", 500);
        /*Addling client object to a listing purpose arraylist*/
        campaigns.put("campaign1", campaign1);
        /*Creating new campaign for test*/
        Campaign campaign2 = new Campaign("Indirim2", "13/04/2018", "15/04/2018", 1500);
        /*Addling client object to a listing purpose arraylist*/
        campaigns.put("campaign2", campaign2);
        /*Adding campaign to client*/
        client1.addNewCampaign(campaign1);
        /*User choice value*/
        int choice;

        /*User created client attributes*/
        String clientName;
        String companyName;
        String companyAddress;
        String contactName;

        /*User created campaign attributes*/
        String campaignName;
        String title;
        String campaignStartDate;
        String campaignFinishDate;
        int estimatedCost;

        Scanner input = new Scanner(System.in);

        do {
            /*Choice area*/
            System.out.println("0) Exit");
            System.out.println("1) Create new Client");
            System.out.println("2) Create new Campaign");
            System.out.println("3) List all Campaigns");
            System.out.println("4) List all Clients");
            System.out.println("5) Add Campaign to Client");
            System.out.println("6) List client campaigns");
            /*Choice value*/
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    /*Getting client name*/
                    System.out.println("Enter Client name");
                    clientName = input.nextLine();
                    clientName = input.nextLine();
                    /*Checking if client exist if exist re-enter client name*/
                    if (clients.containsKey(clientName)) {
                        do {
                            System.out.println("There is a client with this name, please enter again");
                            clientName = input.nextLine();
                        } while (clients.containsKey(clientName));

                    }
                    /*Getting company name*/
                    System.out.println("Enter company name");
                    companyName = input.nextLine();
                    /*Getting company name*/
                    System.out.println("Enter company address");
                    companyAddress = input.nextLine();
                    /*Getting contact name*/
                    System.out.println("Enter contact name");
                    contactName = input.nextLine();
                    /*Putting new client object to clients map*/
                    clients.put(clientName, new Client(companyName, companyAddress, contactName));
                    break;
                case 2:
                    /*Getting campaign name*/
                    System.out.println("Enter Campaign name");
                    campaignName = input.nextLine();
                    campaignName = input.nextLine();
                    /*Checking if campaign exist, if exist re-enter campaign name*/
                    if (campaigns.containsKey(campaignName)) {
                        do {
                            System.out.println("There is a campaign with this name, please enter again");
                            campaignName = input.nextLine();
                        } while (!campaigns.containsKey(campaignName));

                    }
                    /*Getting title*/
                    System.out.println("Enter title");
                    title = input.nextLine();
                    /*Getting campaign start date*/
                    System.out.println("Enter campaign start date");
                    campaignStartDate = input.nextLine();
                    /*Geting campaign finish date*/
                    System.out.println("Enter campaign finish date");
                    campaignFinishDate = input.nextLine();
                    /*Getting estimated cost*/
                    System.out.println("Enter estimated cost");
                    estimatedCost = input.nextInt();
                    /*Putting new campaign object to campaigns map*/
                    campaigns.put(campaignName, new Campaign(title, campaignStartDate, campaignFinishDate, estimatedCost));
                    break;
                case 3:
                    /*Listing all the campaigns*/
                    for (String key : campaigns.keySet()) {
                        System.out.print("Campaign name : " + key);
                        System.out.println(" | Campaign title : " + campaigns.get(key).getTitle() + " | Campaign start date : " + campaigns.get(key).getCampaignStartDate() + " | Campaign finish date : " + campaigns.get(key).getCampaignFinishDate() + " | Campaign estimated cost : " + campaigns.get(key).getEstimatedCost());
                    }
                    break;
                case 4:
                    /*Listing all the clients*/
                    for (String key : clients.keySet()) {
                        System.out.print("Client name : " + key);
                        System.out.println(" | Client company name : " + clients.get(key).getCompanyName() + " | Client company address : " + clients.get(key).getCompanyAddress() + " | Client contact name : " + clients.get(key).getContactName());
                    }
                    break;
                case 5:
                    /*Getting client name*/
                    System.out.println("Enter a client name that you want to add campaign");
                    clientName = input.nextLine();
                    clientName = input.nextLine();
                    /*Checking if campaign exist, if not re-enter client name*/
                    if (!clients.containsKey(clientName)) {
                        do {
                            System.out.println("There is not a client with this name, please choose one of these");
                            for (String key : clients.keySet()) {
                                System.out.println("Client name : " + key);
                            }
                            System.out.println("Enter a client name that you want to add campaign");
                            clientName = input.nextLine();
                        } while (!clients.containsKey(clientName));

                    }
                    /*Getting campaign name*/
                    System.out.println("Enter a campaign name to add the client");
                    campaignName = input.nextLine();
                    /*Checking if campaign exist, if not re-enter campaign name*/
                    if (!campaigns.containsKey(campaignName)) {
                        do {
                            System.out.println("There is not a campaign with this name, please choose one of these");
                            for (String key : campaigns.keySet()) {
                                System.out.println("Campaign name : " + key);
                            }
                            System.out.println("Enter a campaign name to add the client");
                            campaignName = input.nextLine();
                        } while (!campaigns.containsKey(campaignName));

                    }
                    /*Getting the campaign that entered*/
                    Campaign campaign = campaigns.get(campaignName);
                    /*Getting the client that entered*/
                    Client client = clients.get(clientName);
                    /*Adding the campaign to client*/
                    client.addNewCampaign(campaign);
                    break;
                case 6:
                    /*Getting client name*/
                    System.out.println("Enter a client name");
                    clientName = input.nextLine();
                    clientName = input.nextLine();
                    /*Checking if campaign exist, if not re-enter client name*/
                    if (!clients.containsKey(clientName)) {
                        do {
                            System.out.println("There is not a client with this name, please choose one of these");
                            for (String key : clients.keySet()) {
                                System.out.println("Client name : " + key);
                            }
                            System.out.println("Enter a client name");
                            clientName = input.nextLine();
                        } while (!clients.containsKey(clientName));

                    }
                    /*Getting the client that entered*/
                    Client client2 = clients.get(clientName);
                    /*Checking if client has campaign, if not return a message*/
                    if (client2.getClientCampaigns().size() > 0){
                        for (int key = 0; key < client2.getClientCampaigns().size(); key++) {
                            System.out.print("Client name : " + clientName);
                            System.out.println(" |  Campaign title : " + client2.getClientCampaigns().get(key).getTitle() + " |  Campaign start date : " + client2.getClientCampaigns().get(key).getCampaignStartDate() + " | Campaign finish date : " + client2.getClientCampaigns().get(key).getCampaignFinishDate() + " |  Campaign estimated cost : " + client2.getClientCampaigns().get(key).getEstimatedCost());
                        }
                    } else{
                        System.out.println("This client doesn't have any campaign");
                    }

                    break;
                default:
                    /*Exit message*/
                    System.out.println("Good bye!");
            }
            /*Exit*/
        } while (choice != 0);


    }
}

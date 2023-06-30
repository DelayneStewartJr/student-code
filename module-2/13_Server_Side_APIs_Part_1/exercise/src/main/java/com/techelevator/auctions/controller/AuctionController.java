package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao auctionDao;

    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }

    @GetMapping()
    public List<Auction> list() {
        List<Auction> auctionList = auctionDao.getAuctions();
        return auctionList;
    }

    @GetMapping("{id}")
    public Auction get(@PathVariable int id) {
        Auction auction = auctionDao.getAuctionById(id);
        return auction;
    }


    @PostMapping()
    public Auction addReservation(@RequestBody Auction auction){
        Auction newAuction = auctionDao.createAuction(auction);
        return newAuction;
    }



}

package com.baazi.questionThree;

class Account implements OnlineAccount, Comparable<Account> {
    Integer noOfRegularMovies;
    Integer noOfExclusiveMovies;
    String ownerName;

    public Account(Integer noOfRegularMovies, Integer noOfExclusiveMovies, String ownerName) {
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
        this.ownerName = ownerName;
    }

    public Integer monthlyCost() {
        return basePrice + noOfRegularMovies * regularMoviePrice +
                noOfExclusiveMovies * exclusiveMoviePrice;
    }

    @Override
    public String toString() {
        return "Owner is [" + ownerName + "] and monthly cost is [" + this.monthlyCost() + "] USD.";
    }

    @Override
    public int compareTo(Account account) {
        if (this.monthlyCost() < account.monthlyCost()) return -1;
        else if (this.monthlyCost() > account.monthlyCost()) return 1;
        return 0;
    }
}
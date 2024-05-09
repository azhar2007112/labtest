package com.example.labtest;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    private List<String> mystery = new ArrayList<>();
    private List<String> fantasy = new ArrayList<>();
    private List<String> thriller = new ArrayList<>();

    public void showBookInfoByGenre(String genre) {
        switch (genre.toLowerCase()) {
            case "mystery":
                System.out.println("Mystery Books: " + mystery);
                break;
            case "fantasy":
                System.out.println("Fantasy Books: " + fantasy);
                break;
            case "thriller":
                System.out.println("Thriller Books: " + thriller);
                break;
            default:
                System.out.println("Invalid genre.");
        }
    }
}

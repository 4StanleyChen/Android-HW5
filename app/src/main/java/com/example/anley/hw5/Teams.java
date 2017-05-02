package com.example.anley.hw5;

public class Teams {
    String name1;
    String name2;
    String score1;
    String score2;
    int logo1;
    int logo2;

    Teams(int image1, String name1, String score1, int image2, String name2, String score2){
        this.name1 = name1;
        this.score1 = score1;
        this.logo1 = image1;
        this.name2 = name2;
        this.score2 = score2;
        this.logo2 = image2;
    }
}

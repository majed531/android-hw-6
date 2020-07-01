package com.example.cw6;



public class movie {
   private String movie ;
    private String  mainactor;
     private double Movierate;
     private int pgrate;
     private String genre;

    public movie(String movie, String mainactor, double movierate, int pgrate, String genre) {
        this.movie = movie;
        this.mainactor = mainactor;
        Movierate = movierate;
        this.pgrate = pgrate;
        this.genre = genre;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setMainactor(String mainactor) {
        this.mainactor = mainactor;
    }

    public void setMovierate(double movierate) {
        Movierate = movierate;
    }

    public void setPgrate(int pgrate) {
        this.pgrate = pgrate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMovie() {
        return movie;
    }

    public String getMainactor() {
        return mainactor;
    }

    public double getMovierate() {
        return Movierate;
    }

    public int getPgrate() {
        return pgrate;
    }

    public String getGenre() {
        return genre;
    }
}


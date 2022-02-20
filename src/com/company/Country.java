package com.company;

public enum Country {
    POLAND("Polish","POL",594.2), NORWAY("Norwegian","NOR",362.0), CANADA("English","CAN",1643000000000.0), ITALY("Italian","IT",12412412.0), GERMANY("German","GER", 23133213.0);

    public String language;
    public String code;
    private Double GDP;

    Country(String language, String code, Double GDP) {
        this.language = language;
        this.code = code;
        this.GDP = GDP;
    }

    public Double getGDPinPLN(){
        return this.GDP = this.GDP*4;
    }

}

package br.com.marmodale.model;

public enum DayOfWeek {
    SEGUNDA("Segunda-feira",1),
    TERCA("Terça-feira",2),
    QUARTA("Quarta-feira",3),
    QUINTA("Quinta-feira",4),
    SEXTA("Sexta-feira",5),
    SABADO("Sabado",6),
    DOMINGO("Domingo",7),
    TODOS("Todos os dias", 8);

    private int code;
    private String description;

    DayOfWeek(String description, int code){
        this.description = description;
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }

    public String getDescription(){
        return this.description;
    }

}

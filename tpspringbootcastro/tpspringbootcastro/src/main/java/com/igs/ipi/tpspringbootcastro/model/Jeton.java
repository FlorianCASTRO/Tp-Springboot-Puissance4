package com.igs.ipi.tpspringbootpcastro.model;

public enum Jeton {
    ROUGE, JAUNE, VIDE;

    public String getCode() {

        switch (this) {
            case ROUGE:
                return "rouge.png";
            case JAUNE:
                return "bleu.png";
            default:
                return null;
        }
    }
}
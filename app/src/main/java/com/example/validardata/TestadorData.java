package com.example.validardata;

import androidx.annotation.NonNull;

public class TestadorData {
    private byte dia, mes;
    private int ano;

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public boolean validarData(){
        int maxDias;
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDias = 30;
                break;
            default:
                maxDias = ano % 4 == 0 && ano %100  != 0 && mes == 2 ? 29 : 28;
        }

        return
                 dia > 0 && dia <= maxDias &&
                 mes > 0 && mes <= 13 &&
                 ano > 0 && ano < 2100;
    }

    @NonNull
    @Override
    public String toString() {

        if(validarData()) {
            return
                    "dia: " + dia +"/" + mes +"/"+ ano;
        }
        return "Data inválida";
    }
}

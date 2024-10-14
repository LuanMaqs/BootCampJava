package Enum;

import Enum.AulaEnum.EstadoBrasileiro;

public class SistemaIBGE {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
    }
}

package Lojas;

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Petshop {

    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo!");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado!");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Com saudade! :(");
    }
}

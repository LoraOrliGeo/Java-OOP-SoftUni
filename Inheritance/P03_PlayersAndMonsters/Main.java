package Inheritance.P03_PlayersAndMonsters;

import Inheritance.P03_PlayersAndMonsters.hero.*;

public class Main {
    public static void main(String[] args) {

        Elf elf = new Elf("ARWEN", 10);
        Wizard wizard = new Wizard("Gandalf", 15);
        Knight knight = new Knight("Aragorn", 13);

        System.out.println(elf.toString());
        System.out.println(wizard.toString());
        System.out.println(knight.toString());

        MuseElf museElf = new MuseElf("Eowin", 14);
        DarkWizard darkWizard = new DarkWizard("Sauron", 15);
        DarkKnight darkKnight = new DarkKnight("Nazgul", 11);

        System.out.println(museElf);
        System.out.println(darkWizard);
        System.out.println(darkKnight);

        SoulMaster soulMaster = new SoulMaster("Arven", 16);
        BladeKnight bladeKnight = new BladeKnight("Balrog", 10);

        System.out.println(soulMaster);
        System.out.println(bladeKnight);
    }
}

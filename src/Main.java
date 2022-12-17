public class Main {
    public static void main(String[] args) {

        Human maxim = new Human(-1,"Максим.", "Минск.", " бренд-менеджером");
        Human anya = new Human(1993," ", "Москва.", " методистом образовательных программ");
        Human katya = new Human(1994,"Катя.", " ", " продакт-менеджером");
        Human artem = new Human(1995,"Артем.", "Москва.", " ");
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
    }
}
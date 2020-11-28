package com.company;

public class Array {
    //TODO(2) Deklarujemy utworzenie tabeli liczb, ale jej nie inicjalizujemy
    //TODO(3) Deklarujemy licznik ilości itemów naszej tabeli
    private int[] items;
    private int count;

    //TODO(4) Tworzymy konstruktor klasy Lista z jednym parametrem (wielkość listy)
    Array(int length){
        //TODO(5) Inicjalizujemy listę
        items = new int[length];
    }

    //TODO(6) Tworzymy metodę która bedzie drukować wszystkie elementy tabeli (UWAGA! jeżeli do tabeli nie wprowadzimy żadnych wartości, funkcja ma NIE drukować zer!)
    //TODO(7) TESTUJEMY METODĘ, jak nie działa, poprawiamy aż do skutku
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    //TODO(8) Tworzymy metodę dodaj - metoda ma mieć jeden parametr (element który chcemy dodać)
    //TODO(9) Dodawanie elementu do tabeli po ostatnio dodanym elemencie (pamiętaj o zwiększeniu licznika ilości elementów po dodatniu elementu!)
        //TODO(10) Jeżeli tabela jest pełna, musimy zrobić nową
            //TODO(11) Tworzymy nową tabelę z większą pojemnością (2x większą niż poprzednia)
            //TODO(12) Kopiujemy wszystkie elementy z pierwotnej tabeli do tabeli nowej
            //TODO(13) Przypisujemy starej tabeli wartość nowej
    //TODO(14) TESTUJEMY METODĘ!

    public void insert(int item){
        if(items.length == count){
            int[] newItems = new int[count*2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = item;
        count++;
    }
    //TODO(15)Tworzymy metodę usuńIndex - metoda z jednym parametrem, który jest indeksem
        //TODO(16) Sprawdzenie czy index podany w metodzie nie jest poza zasięgiem naszej listy - w przypadku indeksu z poza zakresu powinna zostać wydrukowana informacja o tym
        //TODO(17) Przesuwamy wszystkie elementy tak, żeby zapełnić "dziurę" po usunieciu elementu (wskazówka: użyj pętli for)
    //TODO(18) TESTUJEMY METODĘ, jak nie działa, poprawiamy aż do skutku

    public void removeAt(int index){
        if (index < 0 || index >= count){
            System.out.println("Illegal argument");
        }else{
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
        }
    }
    //TODO(19) Tworzymy metodę jakiIndex - metoda z jednym parametrem tj. wartością którą chcemy znaleźć i odnaleźć index - metoda ma ZWRACAć int (numer inddexu, lub -1 w przypadku braku takiej wartości w tabeli)
    public int indexOf(int item){
        for (int i = 0; i < count; i++) {
            if (items[i] == item){
                return i;
            }
        }
        return -1;
    }

}

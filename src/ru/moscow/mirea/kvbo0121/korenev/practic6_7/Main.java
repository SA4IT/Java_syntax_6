package ru.moscow.mirea.kvbo0121.korenev.practic6_7;

public class Main {
    public static void main(String[] args) {
        Printable book = new Printable.Book(false, false,true);

        if(book.ind1() == true && book.ind2() == false && book.ind3() == false){
            book.process_of_reading();
        }
        if(book.ind1() == false && book.ind2() == true && book.ind3() == false){
            book.read_it();
        }
        if(book.ind1() == false && book.ind2() == false && book.ind3() == true){
            book.read_it_yet();
        }
    }
}

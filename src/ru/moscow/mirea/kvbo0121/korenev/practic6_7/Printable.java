package ru.moscow.mirea.kvbo0121.korenev.practic6_7;

public interface Printable {
    void process_of_reading();
    void read_it_yet();
    void read_it();
    boolean ind1();
    boolean ind2();
    boolean ind3();

    class Book implements Printable{
        @Override
        public boolean ind1() {
            return this.indic_first_method;
        }
        @Override
        public boolean ind2() {
            return this.indic_second_method;
        }
        @Override
        public boolean ind3() {
            return this.indic_fird_method;
        }

        private boolean indic_first_method;
        private boolean indic_second_method;
        private boolean indic_fird_method;


        public Book(boolean indic_first_method, boolean indic_second_method, boolean indic_fird_method) {
            this.indic_first_method = indic_first_method;
            this.indic_second_method = indic_second_method;
            this.indic_fird_method = indic_fird_method;
        }

        @Override
        public void process_of_reading() {
            System.out.println("Я читаю эту книгу в данный момент!");
        }
        @Override
        public void read_it() {
            System.out.println("Я уже прочёл эту книгу!!!");
        }

        @Override
        public void read_it_yet() {
            System.out.println("Я пока не прочитал эту книгу...");
        }
    }
}

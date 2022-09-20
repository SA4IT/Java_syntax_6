package ru.moscow.mirea.kvbo0121.korenev.practic6_3;

public interface Nameable {
    String getName();

    class Get implements Nameable{

        private String name;

        public Get(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
}

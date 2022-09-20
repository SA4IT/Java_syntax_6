package ru.moscow.mirea.kvbo0121.korenev.practic6_11;

public interface Convertable {
    void convert();
    void celsius();
    void kelvin();
    void fahrenheit();

    void setCelsius(double temp_cels);

    class Temperature implements Convertable{

        @Override
        public void setCelsius(double temp_celsius) {
            this.celsius = temp_celsius;
        }

        private double celsius;
        private double kelvin;
        private double fahrenheit;

        @Override
        public void celsius() {
            System.out.println("Температура по Цельсию = "+ this.celsius);
        }

        @Override
        public void kelvin() {
            System.out.println("Температура по Кельвину = "+ this.kelvin);
        }

        @Override
        public void fahrenheit() {
            System.out.println("Температура по Фаренгейту = "+ this.fahrenheit);
        }

        @Override
        public void convert() {
            this.fahrenheit = this.celsius * 9/5 + 32;
            this.kelvin = this.celsius + 273;
        }
    }
}

package creational.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.ComputerBuilder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setOS("Windows 11")
                .setGraphicCard("NVIDIA GeForce RTX 3080")
                .build();

        System.out.println("Gaming PC us"+ gamingPC);

        Computer officePC = new Computer.ComputerBuilder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("Integrated Graphics")
                .setOS("Windows 10")
                .build();

        System.out.println("Office PC is " + officePC);

    }
}

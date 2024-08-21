package org.example.oop;

/**
 * Compozitia = este procesul prin care o clasa principala este asamblata pe baza altor clase secundare
 */

class Laptop{

    private String model;
    private Double price;
    private int nrOfAux;
    private CPU cpu;
    private RAM ram;
    private GPU gpu;
    // todo: Motherbord, etc


    public Laptop(String model, RAM ram, CPU cpu, Double price, int nrOfAux, GPU gpu) {
        this.model = model;
        this.ram = ram;
        this.cpu = cpu;
        this.price = price;
        this.nrOfAux = nrOfAux;
        this.gpu = gpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public int getNrOfAux() {
        return nrOfAux;
    }

    public void setNrOfAux(int nrOfAux) {
        this.nrOfAux = nrOfAux;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

class CPU {

    private String model;
    private int cores;
    private int threads;


    public CPU(int threads, int cores, String model) {
        this.threads = threads;
        this.cores = cores;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }
}

class RAM {
    private String model;
    private int capacity;
    private String type;

    public RAM(int capacity, String type, String model) {
        this.capacity = capacity;
        this.type = type;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class GPU {

    private String model;
    private int memorySize;
    private String memoryType;

    public GPU(String model, String memoryType, int memorySize) {
        this.model = model;
        this.memoryType = memoryType;
        this.memorySize = memorySize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }
}

public class CompositionPrincipile {

    public static void main(String[] args) {

        // Initializare babeasca
        CPU cpu1 = new CPU("Inteli7", 8, 16);
        RAM ram1 = new RAM(16, "DDR4", "Sirius",);
        GPU gpu1 = new GPU(8, "Gforce 1090", "Gdr4");
        Laptop laptop1 = new Laptop(
                "MSI",
                09501025,
                900,

                cpu1;
                ram1;
                gpu1;
        );



        // Initializare tinereasca
    }
}

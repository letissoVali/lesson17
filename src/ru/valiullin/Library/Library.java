package ru.valiullin.Library;

import java.io.*;
import java.util.Arrays;

public class Library implements Serializable {
    private static final long serialVersionUID = -9150740122685917591L;
    private Literature[] literatures = new Literature[0];
    private YongReadeer yongReadeer;

    public Library(YongReadeer yongReadeer) {
        this.yongReadeer = yongReadeer;
    }

    public void addLiterature(Literature literature) {
        final int newSize = literatures.length + 1;
        Literature[] newLiteratures = new Literature[newSize];
        System.arraycopy(literatures,0, newLiteratures, 0, literatures.length);
        newLiteratures[newSize-1] = literature;
        literatures = newLiteratures;
    }

    public static Library loadLib() {
        //load lib from somewhere
        try (
                FileInputStream fis = new FileInputStream("Library.bin");
                ObjectInputStream ois = new ObjectInputStream(fis)
                )
        {
            return (Library) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка ", e);
        }
    }

    public void saveLib() {
        //save lib to somewhere
        try (FileOutputStream fos = new FileOutputStream("Library.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showLib() {
        for (Literature literature : literatures) {
            System.out.println(literature.showInLib() + literature.getName() + " в библиотеке");

        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "literatures=" + Arrays.toString(literatures) +
                ", yongReadeer=" + yongReadeer +
                '}';
    }
}

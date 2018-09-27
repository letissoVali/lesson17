package ru.valiullin.Library;

public class Journal extends Literature {
    private static final long serialVersionUID = 37714798771853096L;

    @Override
    String showInLib() {
        return "Журнал ";
    }

    @Override
    public String toString() {
        return "Журнал {" + super.toString() + "}";
    }
}

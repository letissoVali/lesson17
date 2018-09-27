package ru.valiullin.Library;

public class Book extends Literature {
    private static final long serialVersionUID = 4516732331828629003L;

    @Override
    String showInLib() {
       return "Книга ";
    }

    @Override
    public String toString() {
        return "Книга {" + super.toString() + "}";
    }
}

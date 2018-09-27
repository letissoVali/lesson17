package ru.valiullin.Library;

public class Newspapper extends Literature {
    private static final long serialVersionUID = 5015572009392261575L;

    @Override
    String showInLib() {
        return "Газета ";
    }

    @Override
    public String toString() {
        return "Газета {" + super.toString() + "}";
    }
}

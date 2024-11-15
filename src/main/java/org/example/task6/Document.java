package org.example.task6;

abstract class Document {

    // Шаблонный метод
    public final void processDocument() {
        open();
        edit();
        save();
    }

    protected abstract void open();
    protected abstract void edit();
    protected abstract void save();
}

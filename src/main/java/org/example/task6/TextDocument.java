package org.example.task6;

class TextDocument extends Document {

    @Override
    protected void open() {
        System.out.println("Открытие текстового документа...");
    }

    @Override
    protected void edit() {
        System.out.println("Редактирование текста в текстовом документе...");
    }

    @Override
    protected void save() {
        System.out.println("Сохранение текстового документа...");
    }
}

package org.example.task6;

class GraphicDocument extends Document {

    @Override
    protected void open() {
        System.out.println("Открытие графического документа...");
    }

    @Override
    protected void edit() {
        System.out.println("Редактирование изображения в графическом документе...");
    }

    @Override
    protected void save() {
        System.out.println("Сохранение графического документа...");
    }
}

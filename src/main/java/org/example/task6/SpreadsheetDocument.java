package org.example.task6;

class SpreadsheetDocument extends Document {

    @Override
    protected void open() {
        System.out.println("Открытие табличного документа...");
    }

    @Override
    protected void edit() {
        System.out.println("Редактирование ячеек в табличном документе...");
    }

    @Override
    protected void save() {
        System.out.println("Сохранение табличного документа...");
    }
}

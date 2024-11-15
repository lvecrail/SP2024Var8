package org.example.task12;

public class Main {
    public static void main(String[] args) {
        // Создаем файлы
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Создаем папки
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Добавляем файлы в папки
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        folder2.addComponent(file3);

        // Создаем еще одну папку и добавляем в нее папки
        Folder mainFolder = new Folder("MainFolder");
        mainFolder.addComponent(folder1);
        mainFolder.addComponent(folder2);

        // Отображаем структуру файлов и папок
        mainFolder.display();
    }
}

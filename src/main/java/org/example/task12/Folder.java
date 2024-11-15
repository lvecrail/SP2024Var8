package org.example.task12;

class Folder implements FileSystemComponent {
    private String name;
    private FileSystemComponent[] components = new FileSystemComponent[10];  // Массив для хранения дочерних элементов
    private int count = 0;  // Количество добавленных элементов

    public Folder(String name) {
        this.name = name;
    }

    // Добавление компонента в папку
    public void addComponent(FileSystemComponent component) {
        if (count < 10) {
            components[count++] = component;
        } else {
            System.out.println("Cannot add more components to folder " + name);
        }
    }

    // Удаление компонента из папки
    public void removeComponent(FileSystemComponent component) {
        for (int i = 0; i < count; i++) {
            if (components[i].equals(component)) {
                components[i] = null;
                for (int j = i; j < count - 1; j++) {
                    components[j] = components[j + 1];
                }
                components[--count] = null;
                return;
            }
        }
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (int i = 0; i < count; i++) {
            if (components[i] != null) {
                components[i].display();
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }
}

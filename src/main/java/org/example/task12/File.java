package org.example.task12;

class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}

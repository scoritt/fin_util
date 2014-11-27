package ru.sct.fin.core;

/**
 * Created by Maxim Petrov 26/11/14
 */
public class Classifier {
    private String classifierString;
    private String name;

    public Classifier(String classifierString, String name) {
        this.classifierString = classifierString;
        this.name = name;
    }



    public String getClassifierString() {
        return classifierString;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Classifier{" +
                "classifierString='" + classifierString + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

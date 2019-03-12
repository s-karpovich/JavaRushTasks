package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";

            //Add your code here
            // Проверяем чьей сущностью является объект(this), на котором вызываем метод getOutputByBookType() и в зависимости
            //от этого выводим output
            if(this instanceof MarkTwainBook) {output = markTwainOutput;}
            if (this instanceof AgathaChristieBook) {output = agathaChristieOutput;}
            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        private String title ;
        // Создаем конструктор, устанавливем в нем title, а также передаем автора в конструктор super-класса
        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title=title;
        }

        @Override
        // Реализуем абстрактный метод getBook() для ообъекта типа MarkTwainBook, возвращаем this
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String title ;
        // Создаем конструктор, устанавливем в нем title, а также передаем автора в конструктор super-класса
        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title=title;
        }

        @Override
        // Реализуем абстрактный метод getBook() для ообъекта типа MarkTwainBook, возвращаем this
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}

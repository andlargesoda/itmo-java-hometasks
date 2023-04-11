package ru.itmo.homeworks.homework11;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class App {
    public static void main(String[] args) {

        // объявление объектов класса Status и присвоение значения из перечисления enum
        Status status01 = Status.FILE_NOT_FOUND;
        Status status02 = Status.ACCESS_DENIED;
        Status status03 = Status.JAR_ERROR;

        // вызываем метод throwException
        try { // блок кода, в котором может произойти исключение
            throwException(status01);
        } catch (AccessDeniedException exception) { // обработка исключения AccessDeniedException
            throw new RuntimeException(exception.getMessage(), exception);
        } catch (JarException exception) { // обработка исключения JarException
            exception.printStackTrace();
        } catch (FileNotFoundException exception) { // обработка исключения FileNotFoundException
            exception.printStackTrace();
        }

        try {
            throwException(status02);
        } catch (AccessDeniedException exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        } catch (JarException exception) {
            exception.printStackTrace();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        try {
            throwException(status03);
        } catch (AccessDeniedException exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        } catch (JarException exception) {
            exception.printStackTrace();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    // объявляем метод, который принимает на вход enum и выбрасывает следующие исключения в зависимости от значения status
    // throws ТипДанных - в методе выбрасывается только исключение времени КОМПИЛЯЦИИ и оно не обработано
    // обработка осуществляется при вызове метода
    static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException {
        if (status.equals(Status.FILE_NOT_FOUND)) { // если status FILE_NOT_FOUND,
            throw new FileNotFoundException("Файл не найден"); // выбрасывает FileNotFoundException
        }
        if (status.equals(Status.ACCESS_DENIED)) { // если status ACCESS_DENIED,
            throw new AccessDeniedException("Доступ запрещен"); // выбрасывает AccessDeniedException
        }
        if (status.equals(Status.JAR_ERROR)) { // если status JAR_ERROR
            throw new JarException("Ошибка при чтении/записи в JAR файл"); // выбрасывает JarException
        }
    }
}

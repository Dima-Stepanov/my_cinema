package ru.my.cinema.service;

import ru.my.cinema.model.dto.FileDto;

import java.util.Optional;

/**
 * 3. Мидл
 * 3.2. Web
 * 3.2.9. Контрольные вопросы
 * 2. Сервис - Кинотеатр [#504869 #293473]
 * FileService interface описывает поведение бизнес логики обработки модели File;
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 14.02.2023
 */
public interface FileService {
    Optional<FileDto> getFileById(int fileId);
}

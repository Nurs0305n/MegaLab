package kg.mega.jdqlsqlex.services;

import kg.mega.jdqlsqlex.models.Printer;

import java.util.List;

public interface PrinterService {
    List<Printer> findAllByColor(char color);
}

package kg.mega.jdqlsqlex.services.impl;

import kg.mega.jdqlsqlex.models.Printer;
import kg.mega.jdqlsqlex.repositories.PrinterRepo;
import kg.mega.jdqlsqlex.services.PrinterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrinterServiceImpl implements PrinterService {
    private final PrinterRepo printerRepo;

    public PrinterServiceImpl(PrinterRepo printerRepo) {
        this.printerRepo = printerRepo;
    }

    @Override
    public List<Printer> findAllByColor(char color) {
        List<Printer> printers = printerRepo.findAllByColor(color);

        return printers.stream().filter(printer -> printer.getColor() == color).collect(Collectors.toList());
    }
}

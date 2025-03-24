package kg.mega.jdqlsqlex.controllers;

import kg.mega.jdqlsqlex.models.Printer;
import kg.mega.jdqlsqlex.models.dto.MakerDto;
import kg.mega.jdqlsqlex.models.dto.MakerSpeedDto;
import kg.mega.jdqlsqlex.models.dto.ModelRamScreen;
import kg.mega.jdqlsqlex.models.dto.ModelSpeedHdDto;
import kg.mega.jdqlsqlex.services.LaptopService;
import kg.mega.jdqlsqlex.services.PcService;
import kg.mega.jdqlsqlex.services.PrinterService;
import kg.mega.jdqlsqlex.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/task/")
public class TaskController {

    private final PcService pcService;

    private final LaptopService laptopService;

    private final ProductService productService;

    private final PrinterService printerService;

    public TaskController(PcService pcService, LaptopService laptopService, ProductService productService, PrinterService printerService) {
        this.pcService = pcService;
        this.laptopService = laptopService;
        this.productService = productService;
        this.printerService = printerService;
    }

    @GetMapping("/execute/{taskNo}")
    public ResponseEntity <?> executeTask(@PathVariable int taskNo, @RequestParam Map<String, String> params){
        switch (taskNo) {
            case 1:
                List<ModelSpeedHdDto> modelSpeedHdDtos = pcService.findByPriceLessThan(Double.parseDouble(params.get("price")));
                if (modelSpeedHdDtos.isEmpty()) {
                    return ResponseEntity.noContent().build();
                }
                return ResponseEntity.ok(modelSpeedHdDtos);
            case 2:
                List<MakerDto> makerDtos = productService.findByType(params.get("type"));
                if (makerDtos.isEmpty()) {
                    return ResponseEntity.noContent().build();
                }
                return ResponseEntity.ok(makerDtos);
            case 3:
                List<ModelRamScreen> modelRamScreens = laptopService.findByPrice(Double.parseDouble(params.get("price")));
                if (modelRamScreens.isEmpty()) {
                    return ResponseEntity.noContent().build();
                }
                return ResponseEntity.ok(modelRamScreens);
            case 4:
                String colorStr = params.get("color");
                char color = (colorStr != null && !colorStr.isEmpty()) ? colorStr.charAt(0) : ' ';

                List<Printer> printers = printerService.findAllByColor(color);
                if (printers.isEmpty()) {
                    return ResponseEntity.noContent().build();
                }
                return ResponseEntity.ok(printers);
            case 5:
                List<String> cdList = Arrays.asList(params.get("cd").split(","));
                List<ModelSpeedHdDto> modelSpeedHdDtos1 = pcService.findAllByCdInAndPriceLessThan(cdList, Double.parseDouble(params.get("price")));
                if (modelSpeedHdDtos1.isEmpty()) {
                    return ResponseEntity.noContent().build();
                }
                return ResponseEntity.ok(modelSpeedHdDtos1);
            case 6:
                List<MakerSpeedDto> makerSpeedDtos = laptopService.findByHd(Double.parseDouble(params.get("hd")));
                if (makerSpeedDtos.isEmpty()) {
                    return ResponseEntity.noContent().build();
                }
                return ResponseEntity.ok(makerSpeedDtos);
            default:
                throw new IllegalStateException("Unexpected value: " + taskNo);
        }

    }
}

package kg.mega.sqlexjpatest.controllers;

import kg.mega.sqlexjpatest.models.dto.ModelSpeedHdDto;
import kg.mega.sqlexjpatest.services.PcService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final PcService pcService;

    public TaskController(PcService pcService) {
        this.pcService = pcService;
    }

    @GetMapping("/{taskNo}")
    public ResponseEntity<?> executeTask(@PathVariable int taskNo, @RequestParam Map<String, String> params) {
        switch (taskNo) {
            case 1:
                double price = Double.parseDouble(params.get("price"));
                List<ModelSpeedHdDto> modelSpeedHdDtos = pcService.findByPricesLessThan(price);
                if (modelSpeedHdDtos.isEmpty()) {
                    return ResponseEntity.noContent().build();
                }
                return ResponseEntity.ok(modelSpeedHdDtos);
            default:
                return null;

        }
    }

}

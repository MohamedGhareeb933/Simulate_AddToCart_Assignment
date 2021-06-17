package cart.demo.example.controller;

import cart.demo.example.dto.Response;
import cart.demo.example.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/purchase")
public class PurchaseController {

    private PurchaseService purchaseService;

    @Autowired
    PurchaseController(PurchaseService purchaseService) {this.purchaseService = purchaseService;}

    @PostMapping("/add")
    private String placeOrder(@RequestBody Response response) {
        return purchaseService.placeOrder(response);
    }

}

package net.ausiasmarch.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ausiasmarch.calculator.entity.Calculation;
import net.ausiasmarch.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add/{op1}/{op2}")
    public ResponseEntity<Calculation> add(@PathVariable int op1, @PathVariable int op2) {
   
        return calculatorService.add(op1,op2);
    }
    
    @GetMapping("/minus/{op1}/{op2}")
    public ResponseEntity<Calculation> minus(@PathVariable int op1, @PathVariable int op2) {
   
        return calculatorService.minus(op1,op2);
    }

    @GetMapping("/multiply/{op1}/{op2}")
    public ResponseEntity<Calculation> multiply(@PathVariable int op1, @PathVariable int op2) {
   
        return calculatorService.multiply(op1,op2);
    }

    @GetMapping("/div/{op1}/{op2}")
    public ResponseEntity<Calculation> div(@PathVariable int op1, @PathVariable int op2) {
   
        return calculatorService.div(op1,op2);
    }


}

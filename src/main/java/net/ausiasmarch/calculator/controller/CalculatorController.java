package net.ausiasmarch.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ausiasmarch.calculator.entity.Calculation;
import net.ausiasmarch.calculator.service.CalculatorService;
// hehe xD
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
//modificar para que funcione con el resto
    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @CrossOrigin
    @GetMapping("/add/{op1}/{op2}")
    public ResponseEntity<Calculation> add(@PathVariable(value="op1") int op1, @PathVariable(value="op2") int op2) {
   
        return calculatorService.add(op1,op2);
    }
    @CrossOrigin
    @GetMapping("/minus/{op1}/{op2}")
    public ResponseEntity<Calculation> minus(@PathVariable int op1, @PathVariable int op2) {
   
        return calculatorService.minus(op1,op2);
    }
    @CrossOrigin
    @GetMapping("/multiply/{op1}/{op2}")
    public ResponseEntity<Calculation> multiply(@PathVariable int op1, @PathVariable int op2) {
   
        return calculatorService.multiply(op1,op2);
    }
    @CrossOrigin
    @GetMapping("/div/{op1}/{op2}")
    public ResponseEntity<Calculation> div(@PathVariable int op1, @PathVariable int op2) {
   
        return calculatorService.div(op1,op2);
    }

    @CrossOrigin
    @PostMapping(path = "/add")
    public ResponseEntity<Calculation> calculadoraSuma(@RequestBody Calculation oCalc){
    
        oCalc.setResult(oCalc.getOp1() + oCalc.getOp2());
        return new ResponseEntity<Calculation>(oCalc, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path = "/minus")
    public ResponseEntity<Calculation> calculadoraResta(@RequestBody Calculation oCalc){
    
        oCalc.setResult(oCalc.getOp1() - oCalc.getOp2());
        return new ResponseEntity<Calculation>(oCalc, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path = "/multiply")
    public ResponseEntity<Calculation> calculadoraMult(@RequestBody Calculation oCalc){
    
        oCalc.setResult(oCalc.getOp1() * oCalc.getOp2());
        return new ResponseEntity<Calculation>(oCalc, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path = "/div")
    public ResponseEntity<Calculation> calculadoraDiv(@RequestBody Calculation oCalc){
    
        oCalc.setResult(oCalc.getOp1() / oCalc.getOp2());
        return new ResponseEntity<Calculation>(oCalc, HttpStatus.OK);
    }

}

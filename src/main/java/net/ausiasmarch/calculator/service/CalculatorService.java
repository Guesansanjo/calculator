package net.ausiasmarch.calculator.service;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import net.ausiasmarch.calculator.entity.Calculation;

@Service
public class CalculatorService {
    
    public ResponseEntity<Calculation> add(int op1, int op2){
        Calculation calc = new Calculation(op1 , op2);
        calc.setOp1(op1);
        calc.setOp2(op2);
        calc.setResult(calc.getOp1() + calc.getOp2());
        return new ResponseEntity<>(calc,HttpStatus.OK);
    }

    public ResponseEntity<Calculation> minus(int op1, int op2){
        Calculation calc = new Calculation(op1 , op2);
        calc.setOp1(op1);
        calc.setOp2(op2);
        calc.setResult(calc.getOp1() - calc.getOp2());
        return new ResponseEntity<>(calc,HttpStatus.OK);
    }

    public ResponseEntity<Calculation> multiply(int op1, int op2){
        Calculation calc = new Calculation(op1 , op2);
        calc.setOp1(op1);
        calc.setOp2(op2);
        calc.setResult(calc.getOp1() * calc.getOp2());
        return new ResponseEntity<>(calc,HttpStatus.OK);
    }

    public ResponseEntity<Calculation> div(int op1, int op2){
        Calculation calc = new Calculation(op1 , op2);
        calc.setOp1(op1);
        calc.setOp2(op2);
        calc.setResult(calc.getOp1() / calc.getOp2());
        return new ResponseEntity<>(calc,HttpStatus.OK);
    }
}

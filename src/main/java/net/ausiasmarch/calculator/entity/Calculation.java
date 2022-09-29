package net.ausiasmarch.calculator.entity;

public class Calculation {
   private Integer op1;
   private Integer op2;
   private Integer result;
   
   public Calculation(int op1, int op2) {
    this.op1 = op1;
    this.op2 = op2;
}
public Integer getOp1() { 
    return this.op1; 
}
    public Integer getOp2() {   
        return this.op2; 
    }
    public Integer getResult() { return this.result;
    }

    public void setOp1(Integer op1) { this.op1 = op1; }

    public void setOp2(Integer op2) {
        this.op2 = op2;
    }
    public void setResult(Integer string){
        this.result = string;
    }
}

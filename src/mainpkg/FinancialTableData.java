/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author HP
 */

public class FinancialTableData {
    private String Scope;
    private float Budget;

    public FinancialTableData(String Scope, float Budget) {
        this.Scope = Scope;
        this.Budget = Budget;
    }

    public FinancialTableData() {
    }
       

    public String getScope() {
        return Scope;
    }

    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    public float getBudget() {
        return Budget;
    }

    public void setBudget(float Budget) {
        this.Budget = Budget;
    }

    @Override
    public String toString() {
        return "FinancialTableData{" + "Scope=" + Scope + ", Budget=" + Budget + '}';
    }
}
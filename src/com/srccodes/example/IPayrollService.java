package com.srccodes.example;

import java.time.LocalDate;
import java.util.List;
//import entity.Payroll;
public interface IPayrollService {
    void generatePayroll(int employeeId, LocalDate startDate, LocalDate endDate);
    Payroll getPayrollById(int payrollId);
    List<Payroll> getPayrollsForEmployee(int employeeId);
    List<Payroll> getPayrollsForPeriod(LocalDate startDate, LocalDate endDate);
}

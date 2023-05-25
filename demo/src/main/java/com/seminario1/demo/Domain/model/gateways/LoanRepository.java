package com.seminario1.demo.Domain.model.gateways;

import com.seminario1.demo.Domain.model.Loan;

public interface LoanRepository {
    Loan saveLoan(Loan loan);
    Loan getLoanById(Loan loan);
}

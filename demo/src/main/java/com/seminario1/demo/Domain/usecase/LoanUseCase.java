package com.seminario1.demo.Domain.usecase;

import com.seminario1.demo.Domain.model.Loan;
import com.seminario1.demo.Domain.model.gateways.LoanRepository;

public class LoanUseCase {
    private final LoanRepository loanRepository;

    public LoanUseCase(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Loan createLoan(Loan loan){
        return loanRepository.saveLoan(loan);
    }
    public Loan getLoanUseCase(Loan loan) {
        return loanRepository.getLoanById(loan);
    }
}

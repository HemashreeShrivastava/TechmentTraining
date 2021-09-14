package com.techment.service;

import java.util.List;

import com.techment.dto.LoanApplicationDto;
import com.techment.entity.LoanApplication;
import com.techment.exception.GlobalException;
import com.techment.exception.LoanApplicationNotFoundException;

public interface ILoanApplicationService {

	LoanApplication saveLoanApplication(LoanApplicationDto loanApplicationDto) ;
	LoanApplication approveLoanApplication(int loanId)throws LoanApplicationNotFoundException;
	LoanApplication rejectLoanApplication(int loanId);
	public List<LoanApplication> getAllLoanApplication();

}

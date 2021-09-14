package com.techment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.LoanApplicationDto;
import com.techment.entity.LoanApplication;
import com.techment.exception.GlobalException;
import com.techment.exception.LoanApplicationNotFoundException;
import com.techment.repository.LoanApplicationRepository;

@Service
public class LoanApplicationServiceImpl implements ILoanApplicationService {

	@Autowired
	LoanApplicationRepository applicationRepository;
	@Override
	public LoanApplication saveLoanApplication(LoanApplicationDto loanApplicationDto) {
		LoanApplication loanApplication =new LoanApplication();
		loanApplication.setBankName(loanApplicationDto.getBankName());
		loanApplication.setMaxLoanAmount(loanApplicationDto.getMaxLoanAmount());
		loanApplication.setMinCreditScore(loanApplicationDto.getMinCreditScore());
		loanApplication.setMinInterestRate(loanApplicationDto.getMinInterestRate());
		loanApplication.setMinLoanAmount(loanApplicationDto.getMinLoanAmount());
		loanApplication.setProcessingFee(loanApplicationDto.getProcessingFee());
		loanApplication.setRating(loanApplicationDto.getRating());
		loanApplication.setStatus(loanApplicationDto.getStatus());
		loanApplication.setTermLength(loanApplicationDto.getTermLength());
		applicationRepository.save(loanApplication);
		return loanApplication;
	}

	
	@Override
	public LoanApplication approveLoanApplication(int loanId) throws LoanApplicationNotFoundException {
	
		LoanApplication approveLoanApplication;
		if(applicationRepository.findById(loanId).isEmpty())
		{
			throw new LoanApplicationNotFoundException("not found");
		}
		else
		{
		applicationRepository.findById(loanId);
		 approveLoanApplication=applicationRepository.findById(loanId).get();
		approveLoanApplication.setStatus("approve");
		applicationRepository.save(approveLoanApplication);
		}
		return approveLoanApplication;
		

		
		
		
		
	}

	@Override
	public LoanApplication rejectLoanApplication(int loanId) throws LoanApplicationNotFoundException{
		LoanApplication rejectLoanApplication;
		if(applicationRepository.findById(loanId).isEmpty())
		{
			throw new LoanApplicationNotFoundException("not found");
		
		}
		else
		{
		 rejectLoanApplication=applicationRepository.findById(loanId).get();
		rejectLoanApplication.setStatus("reject");
		applicationRepository.save(rejectLoanApplication);
		}
		
		return rejectLoanApplication;
	}

	@Override
	public List<LoanApplication> getAllLoanApplication() {
		
		
		
		List<LoanApplication> loanApplications = new ArrayList<LoanApplication>();  
		applicationRepository.findAll().forEach(loanApplication1 -> loanApplications.add(loanApplication1));  
		
		
		return loanApplications;
	}

	

}

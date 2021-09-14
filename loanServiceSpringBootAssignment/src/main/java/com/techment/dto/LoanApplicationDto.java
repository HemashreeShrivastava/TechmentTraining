package com.techment.dto;

public class LoanApplicationDto {
	private int Id ;
	private String bankName;
	private double  minLoanAmount;
	private double maxLoanAmount;
	private float minInterestRate;
	private int minCreditScore;
	private int termLength;
	private float processingFee;
	private int rating;
	private String Status;
	
	public LoanApplicationDto(int id, String bankName, double minLoanAmount, double maxLoanAmount,
			float minInterestRate, int minCreditScore, int termLength, float processingFee, int rating, String status) {
		super();
		Id = id;
		this.bankName = bankName;
		this.minLoanAmount = minLoanAmount;
		this.maxLoanAmount = maxLoanAmount;
		this.minInterestRate = minInterestRate;
		this.minCreditScore = minCreditScore;
		this.termLength = termLength;
		this.processingFee = processingFee;
		this.rating = rating;
		Status = status;
	}
	public LoanApplicationDto() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getMinLoanAmount() {
		return minLoanAmount;
	}
	public void setMinLoanAmount(double minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}
	public double getMaxLoanAmount() {
		return maxLoanAmount;
	}
	public void setMaxLoanAmount(double maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}
	public float getMinInterestRate() {
		return minInterestRate;
	}
	public void setMinInterestRate(float minInterestRate) {
		this.minInterestRate = minInterestRate;
	}
	public int getMinCreditScore() {
		return minCreditScore;
	}
	public void setMinCreditScore(int minCreditScore) {
		this.minCreditScore = minCreditScore;
	}
	public int getTermLength() {
		return termLength;
	}
	public void setTermLength(int termLength) {
		this.termLength = termLength;
	}
	public float getProcessingFee() {
		return processingFee;
	}
	public void setProcessingFee(float processingFee) {
		this.processingFee = processingFee;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	

}

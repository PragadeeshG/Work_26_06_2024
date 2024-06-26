package com.test1;

public class CataystFatcaAccountResponse {
	private Integer fatcaId;
	private String fatcaOwner;
	private boolean activeAccount;
	private Integer fatcaTypeId;
	private String fatcaType;
	private String fatcaStatus;
	private Integer fatcaDescription;
	private Integer authorizerCount;
	private String authCountry;
	private Integer authRegionCode;
	private String exceptions;
	private String status;
	private String remarks;

	public CataystFatcaAccountResponse() {

	}

	public CataystFatcaAccountResponse(Integer fatcaId, String fatcaOwner, boolean activeAccount, Integer fatcaTypeId,
			String fatcaType, String fatcaStatus, Integer fatcaDescription, Integer authorizerCount, String authCountry,
			Integer authRegionCode, String exceptions, String status, String remarks) {
		super();
		this.fatcaId = fatcaId;
		this.fatcaOwner = fatcaOwner;
		this.activeAccount = activeAccount;
		this.fatcaTypeId = fatcaTypeId;
		this.fatcaType = fatcaType;
		this.fatcaStatus = fatcaStatus;
		this.fatcaDescription = fatcaDescription;
		this.authorizerCount = authorizerCount;
		this.authCountry = authCountry;
		this.authRegionCode = authRegionCode;
		this.exceptions = exceptions;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getFatcaId() {
		return fatcaId;
	}

	public void setFatcaId(Integer fatcaId) {
		this.fatcaId = fatcaId;
	}

	public String getFatcaOwner() {
		return fatcaOwner;
	}

	public void setFatcaOwner(String fatcaOwner) {
		this.fatcaOwner = fatcaOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getFatcaTypeId() {
		return fatcaTypeId;
	}

	public void setFatcaTypeId(Integer fatcaTypeId) {
		this.fatcaTypeId = fatcaTypeId;
	}

	public String getFatcaType() {
		return fatcaType;
	}

	public void setFatcaType(String fatcaType) {
		this.fatcaType = fatcaType;
	}

	public String getFatcaStatus() {
		return fatcaStatus;
	}

	public void setFatcaStatus(String fatcaStatus) {
		this.fatcaStatus = fatcaStatus;
	}

	public Integer getFatcaDescription() {
		return fatcaDescription;
	}

	public void setFatcaDescription(Integer fatcaDescription) {
		this.fatcaDescription = fatcaDescription;
	}

	public Integer getAuthorizerCount() {
		return authorizerCount;
	}

	public void setAuthorizerCount(Integer authorizerCount) {
		this.authorizerCount = authorizerCount;
	}

	public String getAuthCountry() {
		return authCountry;
	}

	public void setAuthCountry(String authCountry) {
		this.authCountry = authCountry;
	}

	public Integer getAuthRegionCode() {
		return authRegionCode;
	}

	public void setAuthRegionCode(Integer authRegionCode) {
		this.authRegionCode = authRegionCode;
	}

	public String getExceptions() {
		return exceptions;
	}

	public void setExceptions(String exceptions) {
		this.exceptions = exceptions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}

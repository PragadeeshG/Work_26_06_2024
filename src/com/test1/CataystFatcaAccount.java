package com.test1;

public class CataystFatcaAccount {
	private Integer recordKey;
	private Integer cataystFatcaCode;
	private String cataystFatcaCodePosition;
	private String cataystFatcaCodeLength;
	private String fatcaDigitsPosition;
	private String fatcaDigitsLength;
	private boolean withHoldingTaxPosition;
	private String withHoldingTaxLength;
	private String requiredTaxPosition;
	private String requiredTaxLength;
	private String fundraisingIdLength;
	private String fundraisingSpace;
	private String pulseSpaceName;
	private String futureMarket;

	public CataystFatcaAccount() {

	}

	public CataystFatcaAccount(Integer recordKey, Integer cataystFatcaCode, String cataystFatcaCodePosition,
			String cataystFatcaCodeLength, String fatcaDigitsPosition, String fatcaDigitsLength,
			boolean withHoldingTaxPosition, String withHoldingTaxLength, String requiredTaxPosition,
			String requiredTaxLength, String fundraisingIdLength, String fundraisingSpace, String pulseSpaceName,
			String futureMarket) {
		super();
		this.recordKey = recordKey;
		this.cataystFatcaCode = cataystFatcaCode;
		this.cataystFatcaCodePosition = cataystFatcaCodePosition;
		this.cataystFatcaCodeLength = cataystFatcaCodeLength;
		this.fatcaDigitsPosition = fatcaDigitsPosition;
		this.fatcaDigitsLength = fatcaDigitsLength;
		this.withHoldingTaxPosition = withHoldingTaxPosition;
		this.withHoldingTaxLength = withHoldingTaxLength;
		this.requiredTaxPosition = requiredTaxPosition;
		this.requiredTaxLength = requiredTaxLength;
		this.fundraisingIdLength = fundraisingIdLength;
		this.fundraisingSpace = fundraisingSpace;
		this.pulseSpaceName = pulseSpaceName;
		this.futureMarket = futureMarket;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getCataystFatcaCode() {
		return cataystFatcaCode;
	}

	public void setCataystFatcaCode(Integer cataystFatcaCode) {
		this.cataystFatcaCode = cataystFatcaCode;
	}

	public String getCataystFatcaCodePosition() {
		return cataystFatcaCodePosition;
	}

	public void setCataystFatcaCodePosition(String cataystFatcaCodePosition) {
		this.cataystFatcaCodePosition = cataystFatcaCodePosition;
	}

	public String getCataystFatcaCodeLength() {
		return cataystFatcaCodeLength;
	}

	public void setCataystFatcaCodeLength(String cataystFatcaCodeLength) {
		this.cataystFatcaCodeLength = cataystFatcaCodeLength;
	}

	public String getFatcaDigitsPosition() {
		return fatcaDigitsPosition;
	}

	public void setFatcaDigitsPosition(String fatcaDigitsPosition) {
		this.fatcaDigitsPosition = fatcaDigitsPosition;
	}

	public String getFatcaDigitsLength() {
		return fatcaDigitsLength;
	}

	public void setFatcaDigitsLength(String fatcaDigitsLength) {
		this.fatcaDigitsLength = fatcaDigitsLength;
	}

	public boolean isWithHoldingTaxPosition() {
		return withHoldingTaxPosition;
	}

	public void setWithHoldingTaxPosition(boolean withHoldingTaxPosition) {
		this.withHoldingTaxPosition = withHoldingTaxPosition;
	}

	public String getWithHoldingTaxLength() {
		return withHoldingTaxLength;
	}

	public void setWithHoldingTaxLength(String withHoldingTaxLength) {
		this.withHoldingTaxLength = withHoldingTaxLength;
	}

	public String getRequiredTaxPosition() {
		return requiredTaxPosition;
	}

	public void setRequiredTaxPosition(String requiredTaxPosition) {
		this.requiredTaxPosition = requiredTaxPosition;
	}

	public String getRequiredTaxLength() {
		return requiredTaxLength;
	}

	public void setRequiredTaxLength(String requiredTaxLength) {
		this.requiredTaxLength = requiredTaxLength;
	}

	public String getFundraisingIdLength() {
		return fundraisingIdLength;
	}

	public void setFundraisingIdLength(String fundraisingIdLength) {
		this.fundraisingIdLength = fundraisingIdLength;
	}

	public String getFundraisingSpace() {
		return fundraisingSpace;
	}

	public void setFundraisingSpace(String fundraisingSpace) {
		this.fundraisingSpace = fundraisingSpace;
	}

	public String getPulseSpaceName() {
		return pulseSpaceName;
	}

	public void setPulseSpaceName(String pulseSpaceName) {
		this.pulseSpaceName = pulseSpaceName;
	}

	public String getFutureMarket() {
		return futureMarket;
	}

	public void setFutureMarket(String futureMarket) {
		this.futureMarket = futureMarket;
	}

}

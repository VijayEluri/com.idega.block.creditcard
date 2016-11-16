package com.idega.block.creditcard2.data.beans;

import java.sql.Date;
import java.util.Collection;

import javax.ejb.EJBException;
import javax.ejb.EJBLocalHome;
import javax.ejb.EJBLocalObject;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.idega.block.creditcard.data.CreditCardAuthorizationEntry;
import com.idega.data.IDOEntity;
import com.idega.data.IDOEntityDefinition;
import com.idega.data.IDOStoreException;

@Entity
@Table(name = "VALITORDEBIT_AUTHORISATION_ENTRIES")
@NamedQueries({
		@NamedQuery(name = ValitorDebitAuthorisationEntry.GET_BY_ID, query = "from ValitorDebitAuthorisationEntry bae where bae."
				+ ValitorDebitAuthorisationEntry.idProp + " = :" + ValitorDebitAuthorisationEntry.idProp),
		@NamedQuery(name = ValitorDebitAuthorisationEntry.GET_BY_PARENT_ID, query = "from ValitorDebitAuthorisationEntry bae where bae."
				+ ValitorDebitAuthorisationEntry.parentProp + " = :" + ValitorDebitAuthorisationEntry.parentProp),
		@NamedQuery(name = ValitorDebitAuthorisationEntry.GET_BY_AUTH_CODE, query = "from ValitorDebitAuthorisationEntry bae where bae."
				+ ValitorDebitAuthorisationEntry.authCodeProp + " = :" + ValitorDebitAuthorisationEntry.authCodeProp),
		@NamedQuery(name = ValitorDebitAuthorisationEntry.GET_BY_DATES, query = "from ValitorDebitAuthorisationEntry bae where bae."
				+ ValitorDebitAuthorisationEntry.dateProp + " >= :" + ValitorDebitAuthorisationEntry.dateFromProp + " and "
				+ ValitorDebitAuthorisationEntry.dateProp + " <=:" + ValitorDebitAuthorisationEntry.dateToProp),
		@NamedQuery(name = ValitorDebitAuthorisationEntry.GET_REFUNDS_BY_DATES, query = "from ValitorDebitAuthorisationEntry bae where bae.transactionType = "
				+ ValitorDebitAuthorisationEntry.AUTHORIZATION_TYPE_REFUND + " and bae." + ValitorDebitAuthorisationEntry.dateProp
				+ " >= :" + ValitorDebitAuthorisationEntry.dateFromProp + " and " + ValitorDebitAuthorisationEntry.dateProp + " <=:"
				+ ValitorDebitAuthorisationEntry.dateToProp) })
public class ValitorDebitAuthorisationEntry implements CreditCardAuthorizationEntry {

	public static final String GET_BY_ID = "ValitorDebitAuthorisationEntry.getByID";
	public static final String GET_BY_PARENT_ID = "ValitorDebitAuthorisationEntry.getByParentID";
	public static final String GET_BY_AUTH_CODE = "ValitorDebitAuthorisationEntry.getByAuthCode";
	public static final String idProp = "id";
	public static final String parentProp = "parent";
	public static final String authCodeProp = "authCode";
	public static final String GET_BY_DATES = "ValitorDebitAuthorisationEntry.GET_BY_DATES";
	public static final String GET_REFUNDS_BY_DATES = "ValitorDebitAuthorisationEntry.GET_REFUNDS_BY_DATES";
	public static final String dateProp = "date";
	public static final String dateFromProp = "dateFrom";
	public static final String dateToProp = "dateTo";


	//for Valitor these are Idega internal
	public static final String AUTHORIZATION_TYPE_SALE = "1";
	public static final String AUTHORIZATION_TYPE_REFUND = "3";
	public static final String AUTHORIZATION_TYPE_PARTIAL_REVERSAL = "4";
	public static final String AUTHORIZATION_TYPE_PRE_AUTHORIZE = "5";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "amount")
	private Double amount;

	@Column(name = "auth_code")
	private String authCode;

	@Column(name = "brand_name")
	private String brandName;

	@Column(name = "card_expire_date")
	private String cardExpireDate;

	@Column(name = "card_number")
	private String cardNumber;

	@Column(name = "currency")
	private String currency;

	@Column(name = "date")
	private Date date;

	@Column(name = "error_number")
	private String errorNumber;

	@Column(name = "error_text")
	private String errorText;

	@Column(name = "transaction_type")
	private String transactionType;

	@Column(name = "server_response")
	private String serverResponse;

	@Column(name = "rrn")
	private String rrn;

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	@OneToOne
	@JoinColumn(name = "parent")
	private ValitorDebitAuthorisationEntry parent;

	public void setParent(ValitorDebitAuthorisationEntry parent) {
		this.parent = parent;
	}

	@OneToOne
	@JoinColumn(name = "merchant", nullable = false)
	private ValitorDebitMerchant merchant;

	public ValitorDebitMerchant getMerchant() {
		return merchant;
	}

	public void setMerchant(ValitorDebitMerchant merchant) {
		this.merchant = merchant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public double getAmount() {
		return amount.doubleValue();
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	@Override
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCardExpireDate() {
		return cardExpireDate;
	}

	public void setCardExpireDate(String cardExpireDate) {
		this.cardExpireDate = cardExpireDate;
	}

	@Override
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String getErrorNumber() {
		return errorNumber;
	}

	public void setErrorNumber(String errorNumber) {
		this.errorNumber = errorNumber;
	}

	@Override
	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getServerResponse() {
		return serverResponse;
	}

	public void setServerResponse(String serverResponse) {
		this.serverResponse = serverResponse;
	}

	@Override
	public Object getPrimaryKey() {
		return this.id;
	}

	@Override
	public String getCardExpires() {
		return this.cardExpireDate;
	}

	@Override
	public String getAuthorizationCode() {
		return this.authCode;
	}

	@Override
	public String getExtraField() {
		return this.serverResponse.toString();
	}

	@Override
	public int getParentID() {
		return parent.getId().intValue();
	}

	@Override
	public CreditCardAuthorizationEntry getParent() {
		return this.parent;
	}

	@Override
	public void store() throws IDOStoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public IDOEntityDefinition getEntityDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer decode(String pkString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Integer> decode(String[] pkString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDatasource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDatasource(String datasource) {
		// TODO Auto-generated method stub

	}

	@Override
	public EJBLocalHome getEJBLocalHome() throws EJBException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isIdentical(EJBLocalObject arg0) throws EJBException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void remove() throws RemoveException, EJBException {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(IDOEntity o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CreditCardAuthorizationEntry getChild() throws FinderException {
		// TODO Auto-generated method stub
		return null;
	}

}
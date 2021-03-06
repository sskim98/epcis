package org.oliot.model.oliot;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ExtensionMap {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="extensionmap_seq")
	//@SequenceGenerator(name="extensionmap_seq", sequenceName="extensionmap_seq", allocationSize=1)
	private int id;
	
	String qName;
	String prefixValue;
	int innerValue;
	
	String dataType;
	int leftNodeNumber;
	int rightNodeNumber;
		
	
	String stringValue;
	int intValue;
	float floatValue;
	Date  timeValue;
	int boleanValue;
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	public String getPrefixValue() {
		return prefixValue;
	}
	public void setPrefixValue(String prefixValue) {
		this.prefixValue = prefixValue;
	}
	public int getInnerValue() {
		return innerValue;
	}
	public void setInnerValue(int innerValue) {
		this.innerValue = innerValue;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public int getLeftNodeNumber() {
		return leftNodeNumber;
	}
	public void setLeftNodeNumber(int leftNodeNumber) {
		this.leftNodeNumber = leftNodeNumber;
	}
	public int getRightNodeNumber() {
		return rightNodeNumber;
	}
	public void setRightNodeNumber(int rightNodeNumber) {
		this.rightNodeNumber = rightNodeNumber;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public float getFloatValue() {
		return floatValue;
	}
	public void setFloatValue(float floatValue) {
		this.floatValue = floatValue;
	}
	public Date getTimeValue() {
		return timeValue;
	}
	public void setTimeValue(Date timeValue) {
		this.timeValue = timeValue;
	}
	public int getBoleanValue() {
		return boleanValue;
	}
	public void setBoleanValue(int boleanValue) {
		this.boleanValue = boleanValue;
	}
	
	
	
	

	
	
	

}

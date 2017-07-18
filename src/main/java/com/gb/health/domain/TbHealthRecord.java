package com.gb.health.domain;

import java.util.Date;
/**
 *慈铭体检报告相关记录
 * @author lx
 *
 */
public class TbHealthRecord {
	private Integer id;

	private String typeName;

	private Integer typedataId;

	private Integer sendStatus;

	private String sendReturn;

	private Date sendTime;

	private String sendUrl;

	private String sendData;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName == null ? null : typeName.trim();
	}

	public Integer getTypedataId() {
		return typedataId;
	}

	public void setTypedataId(Integer typedataId) {
		this.typedataId = typedataId;
	}

	public Integer getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(Integer sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getSendReturn() {
		return sendReturn;
	}

	public void setSendReturn(String sendReturn) {
		this.sendReturn = sendReturn == null ? null : sendReturn.trim();
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getSendUrl() {
		return sendUrl;
	}

	public void setSendUrl(String sendUrl) {
		this.sendUrl = sendUrl == null ? null : sendUrl.trim();
	}

	public String getSendData() {
		return sendData;
	}

	public void setSendData(String sendData) {
		this.sendData = sendData == null ? null : sendData.trim();
	}
}
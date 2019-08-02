package com.terminal.server.web.model;

public class MessagePayload {

	private Long terminalId;

	private Integer sequenceNo;

	private Long timeStamp;

	public Long getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "MessagePayload [terminalId=" + terminalId + ", sequenceNo=" + sequenceNo + ", timeStamp=" + timeStamp
				+ "]";
	}

}

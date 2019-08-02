package com.threadimpl.demo.restcall.util;

public class SequenceTerminalCount {

	private Integer count;
	private Long terminalId = 1001L;
	private Integer sequenceNo = 0;

	public SequenceTerminalCount() {

	}

	public Integer getCount() {
		if (count == 7) {
			count = 0;
		} else {
			count++;
		}
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Long getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}

	public Integer getSequenceNo() {
		if (sequenceNo == 7) {
			sequenceNo = 0;
		} else {
			sequenceNo++;
		}
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

}

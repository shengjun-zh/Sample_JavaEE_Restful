package sample.javaee.restful.models;

import java.util.Date;

public class Message {

	private Long id;
	private String msg;
	private Date createdDate;

	public Message () {

	}

	public Message (Long id, String msg) {
		this.id = id;
		this.msg = msg;
		this.createdDate = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}




}

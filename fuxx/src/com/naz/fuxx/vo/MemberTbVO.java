package com.naz.fuxx.vo;

import java.io.Serializable;

public class MemberTbVO implements Serializable{
	private String userName;
	private String userId;
	private String userPw;
	private String userAddr;
	
	public MemberTbVO() {
	}
	
	public MemberTbVO(String userName, String userId, String userPw, String userAddr) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		this.userAddr = userAddr;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userAddr == null) ? 0 : userAddr.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPw == null) ? 0 : userPw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberTbVO other = (MemberTbVO) obj;
		if (userAddr == null) {
			if (other.userAddr != null)
				return false;
		} else if (!userAddr.equals(other.userAddr))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPw == null) {
			if (other.userPw != null)
				return false;
		} else if (!userPw.equals(other.userPw))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberTbVO [userName=" + userName + ", userId=" + userId + ", userPw=" + userPw + ", userAddr="
				+ userAddr + "]";
	}
	
	
}

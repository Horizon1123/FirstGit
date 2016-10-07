package com.wym.entity;

public class Tag { 
	private Integer t_id;   //编号
	private String t_name;   //标签名
	private Integer t_count;  //标签下对应的网址数量
	public Integer getT_id() {
		return t_id;
	}
	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public Integer getT_count() {
		return t_count;
	}
	public void setT_count(Integer t_count) {
		this.t_count = t_count;
	}
	@Override
	public String toString() {
		return "Tag [t_id=" + t_id + ", t_name=" + t_name + ", t_count=" + t_count + "]";
	}
	public Tag(Integer t_id, String t_name, Integer t_count) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_count = t_count;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((t_count == null) ? 0 : t_count.hashCode());
		result = prime * result + ((t_id == null) ? 0 : t_id.hashCode());
		result = prime * result + ((t_name == null) ? 0 : t_name.hashCode());
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
		Tag other = (Tag) obj;
		if (t_count == null) {
			if (other.t_count != null)
				return false;
		} else if (!t_count.equals(other.t_count))
			return false;
		if (t_id == null) {
			if (other.t_id != null)
				return false;
		} else if (!t_id.equals(other.t_id))
			return false;
		if (t_name == null) {
			if (other.t_name != null)
				return false;
		} else if (!t_name.equals(other.t_name))
			return false;
		return true;
	}
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

package com.wym.entity;

public class Favorite {
	private Integer f_id;
	private String f_label;
	private String f_url;
	private String f_tags;
	private String f_desc;
	public Integer getF_id() {
		return f_id;
	}
	public void setF_id(Integer f_id) {
		this.f_id = f_id;
	}
	public String getF_label() {
		return f_label;
	}
	public void setF_label(String f_label) {
		this.f_label = f_label;
	}
	public String getF_url() {
		return f_url;
	}
	public void setF_url(String f_url) {
		this.f_url = f_url;
	}
	public String getF_tags() {
		return f_tags;
	}
	public void setF_tags(String f_tags) {
		this.f_tags = f_tags;
	}
	public String getF_desc() {
		return f_desc;
	}
	public void setF_desc(String f_desc) {
		this.f_desc = f_desc;
	}
	@Override
	public String toString() {
		return "Favorite [f_id=" + f_id + ", f_label=" + f_label + ", f_url=" + f_url + ", f_tags=" + f_tags
				+ ", f_desc=" + f_desc + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((f_desc == null) ? 0 : f_desc.hashCode());
		result = prime * result + ((f_id == null) ? 0 : f_id.hashCode());
		result = prime * result + ((f_label == null) ? 0 : f_label.hashCode());
		result = prime * result + ((f_tags == null) ? 0 : f_tags.hashCode());
		result = prime * result + ((f_url == null) ? 0 : f_url.hashCode());
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
		Favorite other = (Favorite) obj;
		if (f_desc == null) {
			if (other.f_desc != null)
				return false;
		} else if (!f_desc.equals(other.f_desc))
			return false;
		if (f_id == null) {
			if (other.f_id != null)
				return false;
		} else if (!f_id.equals(other.f_id))
			return false;
		if (f_label == null) {
			if (other.f_label != null)
				return false;
		} else if (!f_label.equals(other.f_label))
			return false;
		if (f_tags == null) {
			if (other.f_tags != null)
				return false;
		} else if (!f_tags.equals(other.f_tags))
			return false;
		if (f_url == null) {
			if (other.f_url != null)
				return false;
		} else if (!f_url.equals(other.f_url))
			return false;
		return true;
	}
	public Favorite(Integer f_id, String f_label, String f_url, String f_tags, String f_desc) {
		super();
		this.f_id = f_id;
		this.f_label = f_label;
		this.f_url = f_url;
		this.f_tags = f_tags;
		this.f_desc = f_desc;
	}
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

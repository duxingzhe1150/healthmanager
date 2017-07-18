package com.gb.health.domain;

public class Analysis {
    private Integer id;

    private String number;
    
    private String number_2;

    private String type;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	public String getNumber_2() {
		return number_2;
	}

	public void setNumber_2(String number_2) {
		this.number_2 = number_2;
	}
	
	
	@Override
	public String toString() {
		
		return "{id:"+this.getId()+", number:"+this.getNumber()+", number_2:"+this.getNumber_2()+", type:"+this.getType()+", description:"+this.getDescription()+"}";
	}
}
package com.shil;

public class HashcodeAndEqualHuman {
	
	public int adharNumber;
	public String name;

	

public HashcodeAndEqualHuman(int adharNumber,String name) {
	
this.adharNumber=adharNumber;
this.name=name;
}
  
@Override
public int hashCode() {
	return adharNumber;
}

@Override
public boolean equals(Object obj) {
	HashcodeAndEqualHuman anotherHuman=	(HashcodeAndEqualHuman)obj;
	
	if(this.name==null) {
		if(anotherHuman.name!=null) {
			return false;
		}
	}
	if(obj.getClass()!=this.getClass()) {
		return false;
	}
	if(obj==null) {
		return false;
	}
	
	if(obj==this) {
		return true;
	}
	if(this.adharNumber!=anotherHuman.adharNumber) {
	return false;
	}
	
	if(!this.name.equals(anotherHuman.name)) {
		return false;
	}
	
	
	
	return true;
	
	
}

}

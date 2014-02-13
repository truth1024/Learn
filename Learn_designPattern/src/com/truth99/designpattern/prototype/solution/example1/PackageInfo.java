package com.truth99.designpattern.prototype.solution.example1;

public class PackageInfo implements Cloneable {

	public PackageInfo clone(){
		try {
			return (PackageInfo) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}

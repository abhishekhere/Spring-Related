package com.anand.lect2;

public class Square {

Points pointA,pointB,pointC,pointD;

public Points getPointA() {
	return pointA;
}

public void setPointA(Points pointA) {
	this.pointA = pointA;
}

public Points getPointB() {
	return pointB;
}

public void setPointB(Points pointB) {
	this.pointB = pointB;
}

public Points getPointC() {
	return pointC;
}

public void setPointC(Points pointC) {
	this.pointC = pointC;
}

public Points getPointD() {
	return pointD;
}

public void setPointD(Points pointD) {
	this.pointD = pointD;
}

public void draw(){
	System.out.println("point A("+ getPointA().getX()+","+getPointA().getY()+")");
	System.out.println("point B("+ getPointB().getX()+","+getPointB().getY()+")");
	System.out.println("point C("+ getPointC().getX()+","+getPointC().getY()+")");
	System.out.println("point D("+ getPointD().getX()+","+getPointD().getY()+")");
}

}

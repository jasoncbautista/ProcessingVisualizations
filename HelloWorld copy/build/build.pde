void setup(){
	size(900, 900);
	H.init(this).background(#ECECEC);
	smooth();

	HColorPool colors = new HColorPool(#FFFFFF, #333333);

	HShape d = new HShape("mongo.svg");
	H.add(d)
		.strokeWeight(0.5)
		.stroke(#000000)
		.noFill()
		.anchorAt(H.CENTER)
		.loc(width/2, height/2)
		.scale(3)
	;
	d.randomColors(colors.fillOnly());
	H.drawStage();
}


void draw(){

	
}
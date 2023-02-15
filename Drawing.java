package ShapesProject1;

public class Drawing {
	String artistName="Unfamiliar ";
	String artName="Unfamiliar ";
	double piecePrice =0;
	int pieceWidth =0;
	int pieceLength =0;
	
	
public Drawing(String artistName,String artName,double piecePrice,int pieceWidth,int pieceLength) {
	this.artistName=artistName;
	this.artName=artName;
	this.piecePrice =piecePrice;
	this.pieceWidth =pieceWidth;
	this.pieceLength =pieceLength;
	
}

public Drawing() {
	
	
}
	
	
	public String getArtistName() {
	return artistName;
}

public void setArtistName(String artistName) {
	this.artistName = artistName;
}

public String getArtName() {
	return artName;
}

public void setArtName(String artName) {
	this.artName = artName;
}

public double getPiecePrice() {
	return piecePrice;
}

public void setPiecePrice(double piecePrice) {
	this.piecePrice = piecePrice;
}

public int getPieceWidth() {
	return pieceWidth;
}

public void setPieceWidth(int pieceWidth) {
	this.pieceWidth = pieceWidth;
}

public int getPieceLength() {
	return pieceLength;
}

public void setPieceLength(int pieceLength) {
	this.pieceLength = pieceLength;
}

	public void getAllArtInfo(){
		System.out.println(" \033[1;4;32mpattern name\033[0m: "+artName+
				" creators: "+artistName+
				"\n size: "+
				pieceWidth +
				"x"+ pieceLength +
				" \n price: "+ piecePrice +"$");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

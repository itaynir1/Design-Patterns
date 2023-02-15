package ShapesProject1;

public class DrawingBuilder extends Drawing {
	Drawing newDrow = new Drawing(artistName,artName, piecePrice, pieceWidth, pieceLength);
	
	

	public DrawingBuilder(String artistName,String artName,double piecePrice,int pieceWidth,int pieceLength) {
		newDrow.setArtistName(artistName);
		newDrow.setArtName(artName);
		newDrow.setPiecePrice(piecePrice);
		newDrow.setPieceWidth(pieceWidth);
		newDrow.setPieceLength(pieceLength);
	}
	public DrawingBuilder(String artistName,String pieceName,double  piecePrice) {
		newDrow.setArtistName(artistName);
		newDrow.setArtName(pieceName);
		newDrow.setPiecePrice(piecePrice);
		
	}
	
	public DrawingBuilder(String artistName) {
		newDrow.setArtistName(artistName);
	}

	public DrawingBuilder(String artistName,String artName) {
		newDrow.setArtistName(artistName);
		newDrow.setArtName(artName);
	}
	public DrawingBuilder(double piecePrice) {
		newDrow.setPiecePrice(piecePrice);
	}
	public DrawingBuilder(int artWidth,int artLength) {
		newDrow.setPieceWidth(artWidth);
		newDrow.setPieceLength(artLength);
	}
	
	public DrawingBuilder(int pieceSize) {
		newDrow.setPieceWidth(pieceSize);
		newDrow.setPieceLength(pieceSize);
	}
	public DrawingBuilder() {
		
	}
	
	void build(){
		
		newDrow.getAllArtInfo();
		System.out.println("\n");
	}

}

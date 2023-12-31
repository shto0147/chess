import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class Square extends JLabel{
        public ChessPiece havePiece = null;
        public boolean move_p = false;

        protected Pos pos;

        protected boolean first_move = true;

        public void setImage() {
            resizeImage(100,100);
            setIcon(this.havePiece.pieceImg);  // 추가된 부분
        }

        public Square(int y, int x) {
            this.pos = new Pos(y,x);
            setLayout(null);
        }
        public Square(int y, int x, ChessPiece cp) {
            this.pos = new Pos(y,x);
            setLayout(null);
            this.havePiece = cp;
            cp.color = Cor.black;
        }

        public void setPiece(ChessPiece cp){
            this.havePiece = cp;
            setImage();
        }
        public void synchronization(){

        }

        private void resizeImage(int targetWidth, int targetHeight) {
            Image img = this.havePiece.pieceImg.getImage();
            Image resizedImg = img.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
            this.havePiece.pieceImg = new ImageIcon(resizedImg);
        }

    }

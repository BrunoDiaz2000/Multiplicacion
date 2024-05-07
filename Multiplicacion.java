class Multiplicacion {
   private int x,y;

   Multiplicacion() {}

   public int mostrarMultiplicacion() {
      return (this.x*this.y);
   }

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }

   @Override
   public String toString() {
      return "\nMultiplicacion [x=" + x + ", y=" + y + "]\n";
   }
   
}
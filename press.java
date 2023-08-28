import javax.swing.JOptionPane;

class press {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int input = JOptionPane.showOptionDialog(null, Integer.valueOf(i), ", 2, 1, null, null, null);
      if (input == 2 || input == -1)
        break; 
    } 
  }
}
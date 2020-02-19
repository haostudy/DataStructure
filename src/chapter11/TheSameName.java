package chapter11;

public class TheSameName {
    private int x;
    private class Inner{
        private int x=9;
        public void doIt(int x){
            x++;
            this.x++;
            TheSameName.this.x++;
        }
    }
}

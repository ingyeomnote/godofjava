public class ControlLabel {
    public static void main(String[] args){
        ControlLabel label = new ControlLabel();
        label.gugudan();
    }

    public void gugudan(){
        for(int i=1; i<=9; i++){
            if(i==4)
                continue;
            for(int j=1; j<=9; j++){
                if(j == 4)
                    continue;
                System.out.print(i + "*" + j + "=" + i*j);
            }
            System.err.println();
        }
    }
}

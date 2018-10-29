package Jacob.Cedar;

public class JackOLantern extends java.lang.Object{
    //2D array creation
    String faceFeatures[][];

    public JackOLantern(java.lang.String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    public void edit(java.lang.String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }
    //I dont understand how to make it actually print something



    public java.lang.String toString(){
        String done = "";
        for(int i = 0; i < faceFeatures.length; i++){
            for(int x = 0; x < faceFeatures[i].length; x++){
                done = faceFeatures[i][x];
            }
            done = done + "\n";
        }

        return done;
    }
    public void fill(java.lang.String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }


}

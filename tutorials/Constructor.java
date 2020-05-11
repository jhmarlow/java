private class StartScore {
    
    int mscore;

    StartScore() {
        this.mscore = 0;
    }

}

public class Constructor {

    public getScore() {

        StartScore st = new StartScore();
        return st.mscore;
    }

    public static void main(String[] args) {
        
        int score = new getScore();
        System.out.println(score);
    }

}
    
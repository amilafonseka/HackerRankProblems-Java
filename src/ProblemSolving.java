public class ProblemSolving {

    public static void main(String[] args){

        ProblemSolving ps = new ProblemSolving();
        ps.print(4);
    }

    public void print(int n){

        int level = n - 1;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < level; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < n - level; j++){
                System.out.print("#");
            }

            level--;
            System.out.println();

        }

    }
}

public class cc {

    public static void update(int marks[] ) {
        for (int i=0;i<marks.length;i++){
            marks[i] = marks[1] +1 ;
        }
    }
    public static void main(String[] args) {

        int marks[] = {98,45,54};
        update(marks);
        
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
      
}
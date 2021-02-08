// created by Mohammad Al-aqua
public class H_W1 {

    public static void main(String[] args) {

        H_W1 o = new H_W1();
        int[] a = {1,2,3,4,5};
        //1
        a = o.reversArray(a);
        o.log(a);
        //2
        int[] clone = o.cloneArray(a);
        o.log(clone);
        //3
        o.removeElements(a,3);
        o.log(a);

    }

    void removeElements(int[] a, int element){
        for (int i = 0; i < a.length; i++){
            if (a[i] == element){
                int counter = i;
                while (counter < a.length-1){
                    a[counter] = a[counter+1];
                    counter++;
                }
                a[counter] = 0;
                break;
            }
        }
    }

    int[] cloneArray(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    int[] reversArray(int[] a){
        int[] b = new int[a.length];
        int counter = 0;
        for (int i = a.length-1; i >= 0; i--) {
            b[counter] = a[i];
            counter++;
        }
        return b;
    }

    void log(int[] a){
        System.out.print("[");
        for (int i : a) System.out.print(i + " ");
        System.out.print("]");
        System.out.println();
    }

}

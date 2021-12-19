public class ThirdExercise {
    private Student [] merge(Student [] a, Student [] b) {
        Student[] c =new Student[a.length + b.length];
        int a1=0;
        int b1=0;
        for (int i=0;i<c.length;i++) {
            if (a1==a.length) {
                c[i]=b[b1];
                b1++;
            }
            else
                if (b1==b.length) {
                    c[i]=a[a1];
                    a1++;
                }
                else
                    if (a[a1].GPA<b[b1].GPA) {
                        c[i]=a[a1];
                        a1++;
                    }
                    else
                        if (b[b1].GPA<=a[a1].GPA) {
                            c[i]=b[b1];
                            b1++;
                        }
        }
        return c;
    }
    public Student [] sort (Student [] a) {
        if (a.length<=1) return a;
        Student[] b=new Student [a.length/2];
        Student[] c=new Student [a.length-a.length/2];
        System.arraycopy(a,0,b,0,a.length/2);
        System.arraycopy(a,a.length/2,c,0,a.length-a.length/2);
        b=sort(b);
        c=sort(c);
        return merge(b,c);
    }




}

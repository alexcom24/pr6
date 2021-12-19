public class SortingStudentsByGPA implements Comparator {
    public void r1(Student[] a1, int L, int R) {
        if (L==R) return;
        int B=(L+R)/2;
        int l=L;
        int r=R;
        Student m=a1[B];
        while (l<=r) {
            if (a1[l].GPA<m.GPA) {
                l=l+1;
                continue;
            }
            if (a1[r].GPA>m.GPA) {
                r=r-1;
                continue;
            }
            Student t=a1[l];
            a1[l]=a1[r];
            a1[r]=t;
            l=l+1;
            r=r-1;
        }
        if (l<R)
            r1(a1,r+1,R); // тут проблема
        if (r>L)
            r1(a1,L,r); // тут проблема
    }
}

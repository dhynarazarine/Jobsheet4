public class Faktorial24{
public int nilai;

public int faktorialBF(int n){
    int faktor = 1;
    int i = 1;
    while (1 <= n);{
        faktor = faktor * i;
        i++;
    }
    return faktor;
}

public int faktorialDC(int n){
    if (n==1){
        return 1;
    }
    else 
    {
        int fakto = n * faktorialDC(n-1);
        return fakto;
    }
}
}
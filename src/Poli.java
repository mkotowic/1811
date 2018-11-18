public class Poli {
    public static void main(String[] args) {

        AA aa = new AA();
        aa.introduce();

        System.out.println();

        BB bb = new BB();
        bb.introduce();

        System.out.println();

        Letter letter1 = new AA();
        Letter letter2 = new BB();

        letter1.introduce();
        letter2.introduce();
    }
}


interface Letter {
    void introduce();
}

class AA implements Letter {
    @Override
    public void introduce() {
        System.out.println("Jestem AA");
    }
}

class BB extends AA implements Letter {
    @Override
    public void introduce() {
        System.out.println("Jestem BB");
    }

}
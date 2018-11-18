class MarsApplication {

    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot("eksploracja",2, -60);
        MarsRobot spirit2 = new MarsRobot("oczekiwanie",0, 0);
        MarsRobot spirit3 = new MarsRobot("Powrót do bazy",5, -133);
        MarsRobot spirit4 = new MarsRobot("Powrót do bazy",5, 7);
        MarsRobot spirit5 = new MarsRobot("Powrót do bazy",2, 23);

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}

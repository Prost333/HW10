public class Main {
    public static void main(String[] args) {
        Robot ropotPowor1 = new RobotPovor("PizzaMacher", 100, "Italia", "Pepperoni", "AS-20", "plast");
        Robot ropotPowor2 = new RobotPovor("Борщевик", 100, "Зубровка", "ЛМ-3", "AS-20", "plast");
        Robot ropotPowor3 = new RobotPovor();
        Robot robotSaper1 = new RobotSaper("Сапер ПРО", 450, "Китай", "НР-1", "Титан");
        Robot robotSaper2 = new RobotSaper("ДоЛбИтНоРмАлЬнО", 500, "Беларусь", "Огонек2", "Сталь");
        Robot robotSaper3 = new RobotSaper();
        Robot robotbuild1 = new RobotBuild("РаботягаМАХ", 1, "Беларусь", "ПТУ", "Железо");
        Robot robotbuild2 = new RobotBuild("Бетономешатель", 80, "Польша", "Штепсель 10", "Сталь");
        Robot robotbuild3 = new RobotBuild();


        ropotPowor3.createRobot();
        robotSaper3.createRobot();
        robotbuild3.createRobot();
        ropotPowor2.replaceOsnovnoiAgregat("Вилка");
        robotSaper2.replaceOsnovnoiAgregat("FA3");
        robotbuild2.replaceOsnovnoiAgregat("Лопата");
        ropotPowor3.tornUp();
        robotSaper3.tornUp();
        robotbuild3.tornUp();


        String a = ropotPowor1.toString();
        System.out.println(a);


        Exhibition exhibition1 = new Exhibition();
        exhibition1.addRobot(robotSaper1);
        exhibition1.addRobot(robotSaper2);
        exhibition1.addRobot(robotSaper3);
        exhibition1.addRobot(ropotPowor1);
        exhibition1.addRobot(ropotPowor2);
        exhibition1.addRobot(ropotPowor3);
        exhibition1.addRobot(robotbuild1);
        exhibition1.addRobot(robotbuild2);
        exhibition1.addRobot(robotbuild3);
        exhibition1.printExhibition();

//        Exhibition exhibition2=new Exhibition();
//        exhibition2.addRobot(robotSaper1);
//        exhibition2.addRobot(robotSaper2);
//        exhibition2.addRobot(robotSaper3);
//        exhibition2.addRobot(robotbuild1);
//        exhibition2.addRobot(robotbuild2);
//        exhibition2.addRobot(robotbuild3);
//        exhibition2.possibility();

//        RobotEngineer robotsaper4= new RobotSaper();
//        RobotEngineer robotbuild4= new RobotBuild();
//        robotsaper4.createRobot();
//        robotbuild4.createRobot();
//        robotsaper4.repairRobot();
//        robotsaper4.grundAnaliz();
//        robotbuild4.grundAnaliz();
//        Exhibition exhibition3=new Exhibition();
//        exhibition3.addRobot(robotbuild4);
//        exhibition3.addRobot(robotsaper4);
//        exhibition3.possibility();

    }
}
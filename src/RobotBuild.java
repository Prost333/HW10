public class RobotBuild implements Robot, RobotEngineer {
    private String model;
    private int useEnergi;
    private String countryMade;
    private String agregat;
    private String material;
    private boolean isSwitch;


    public void createRobot() {
        model = "OstRabotaga";
        useEnergi = 50;
        countryMade = "Беларусь";
        agregat = "Руки с мазолями";
        material = "кровь с молоком";
    }

    public RobotBuild(String model, int useEnergi, String countryMade, String agregat, String material) {
        this.model = model;
        this.useEnergi = useEnergi;
        this.countryMade = countryMade;
        this.agregat = agregat;
        this.material = material;
    }

    public RobotBuild() {
    }

    public void repairRobot() {
        tornUp();
        System.out.println(model + " прошел техническое обслуживание");

    }


    public void replaceOsnovnoiAgregat(String newAgregat) {
        if (isSwitch = false) {
            agregat = newAgregat;
            System.out.println("агрегат заменен на: " + newAgregat);
        } else {
            System.out.println("нужно выключить робота");
        }

    }

    @Override
    public String toString() {
        return "RobotBuild{" +
                "Модель='" + model + '\'' +
                ", Потребление=" + useEnergi +
                ", Страна производитель='" + countryMade + '\'' +
                ", Агрегат='" + agregat + '\'' +
                ", Материал='" + material + '\'' +
                ", Включен?=" + isSwitch +
                '}';
    }

    public void tornUp() {
        isSwitch = true;
        System.out.println(model + " включен");
    }


    public void tornOff() {
        isSwitch = false;
        System.out.println(model + " выключен");

    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " строит панельки");
    }

    @Override
    public void grundAnaliz() {
        if (isSwitch == true) {
            System.out.println("У " + model + "Доступен визуальный анализ Грунта");
        } else {
            System.out.println("У " + model + " функция отключена, необходима включить робота");
        }

    }
}

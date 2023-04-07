public class RobotSaper implements Robot, RobotEngineer {
    private String model;
    private int useEnergi;
    private String powetUnitModel;
    private String countryMade;
    private String agregat;
    private String material;
    private boolean isSwitch;


    public RobotSaper(String model, int useEnergi, String countryMade, String agregat, String material) {
        this.model = model;
        this.useEnergi = useEnergi;
        this.countryMade = countryMade;
        this.agregat = agregat;
        this.material = material;
    }

    public RobotSaper() {

    }


    public void createRobot() {
        model = "BOMBOM";
        useEnergi = 500;
        countryMade = "Germani";
        agregat = "FA3";
        material = "Carbon";

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


    public void tornUp() {
        isSwitch = true;
        System.out.println(model + " включен");
    }

    @Override
    public String toString() {
        return "RobotSaper{" +
                "модель='" + model + '\'' +
                ", Потребление=" + useEnergi +
                ", Страна='" + countryMade + '\'' +
                ", Агрегат='" + agregat + '\'' +
                ", Материал='" + material + '\'' +
                ", Включен?=" + isSwitch +
                '}';
    }

    public void tornOff() {
        isSwitch = false;
        System.out.println(model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " разминирует территорию");
    }

    @Override
    public void grundAnaliz() {
        if (agregat == "FA3") {
            System.out.println("У " + model + " aнализ грунта возможен на 5 метров вглубь");
        } else {
            System.out.println("У " + model + " aнализ грунта не возможен, необходим базовый агрегат \"FA3\" ");
        }
    }

}

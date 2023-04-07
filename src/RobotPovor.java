public class RobotPovor implements Robot {
    private String model;
    private int useEnergi;

    private String countryMade;
    private String agregat;
    private String nomerZapchasti;
    private String material;
    private boolean isSwitch;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getUseEnergi() {
        return useEnergi;
    }

    public void setUseEnergi(int useEnergi) {
        this.useEnergi = useEnergi;
    }


    public String getCountryMade() {
        return countryMade;
    }

    public void setCountryMade(String countryMade) {
        this.countryMade = countryMade;
    }

    public String getAgregat() {
        return agregat;
    }

    public void setAgregat(String agregat) {
        this.agregat = agregat;
    }

    public String getNomerZapchasti() {
        return nomerZapchasti;
    }

    public void setNomerZapchasti(String nomerZapchasti) {
        this.nomerZapchasti = nomerZapchasti;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isSwitch() {
        return isSwitch;
    }

    public void setSwitch(boolean aSwitch) {
        isSwitch = aSwitch;
    }

    public RobotPovor(String model, int useEnergi, String countryMade, String agregat, String nomerZapchasti, String material) {
        this.model = model;
        this.useEnergi = useEnergi;
        this.countryMade = countryMade;
        this.agregat = agregat;
        this.nomerZapchasti = nomerZapchasti;
        this.material = material;
    }

    public RobotPovor() {
    }

    @Override
    public void createRobot() {
        model = "NAGIBATOR 2000";
        useEnergi = 100;
        countryMade = "USA";
        nomerZapchasti = "AK-4252";
        material = "iron";
        agregat = "Dolbila";

        System.out.println("Вы создали " + model);


    }

    @Override
    public void repairRobot() {
        tornUp();
        System.out.println(model + " прошел техническое обслуживание");

    }

    @Override
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
        return "RobotPovor: " +
                "Модель='" + model + '\'' +
                ", Потребление=" + useEnergi +
                ", Страна производитель='" + countryMade + '\'' +
                ", Агрегат='" + agregat + '\'' +
                ", Номер запчасти='" + nomerZapchasti + '\'' +
                ", материал='" + material + '\'' +
                ", Включен?=" + isSwitch +
                '}';
    }

    @Override
    public void tornUp() {
        isSwitch = true;
        System.out.println(model + " включен");
    }

    @Override
    public void tornOff() {
        isSwitch = false;
        System.out.println(model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Робот-повор готовит");
    }
}

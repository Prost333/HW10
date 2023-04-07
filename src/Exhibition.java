public class Exhibition {
    private Robot[] robots;

    public Robot[] getRobots() {
        return robots;
    }

    public Exhibition(Robot[] robots) {
        this.robots = robots;

    }

    public Exhibition() {
        robots = new Robot[]{};
    }


    public void addRobot(Robot robot) {
        int numberOfAnimals = robots.length;
        if (numberOfAnimals == 0) {
            robots = new Robot[1];
            robots[0] = robot;
        } else {
            Robot[] copyOfRobot = new Robot[robots.length + 1];
            for (int i = 0; i < robots.length; i++) {
                if (i != robots.length) {
                    copyOfRobot[i] = robots[i];
                } else {
                    copyOfRobot[i] = robot;
                }
            }
            robots = copyOfRobot;
            for (int b = 0; b < robots.length; b++) {
                if (copyOfRobot[b] == null) {
                    copyOfRobot[b] = robot;
                }
            }

        }
    }

    public void printExhibition() {
        for (int i = 0; i < robots.length; i++) {
            if (robots[i] != null) {
                System.out.println(robots[i].toString());
            }
        }
    }

    public void possibility() {
        for (int i = 0; i < robots.length; i++) {
            robots[i].uniquePossibility();
        }
    }
}

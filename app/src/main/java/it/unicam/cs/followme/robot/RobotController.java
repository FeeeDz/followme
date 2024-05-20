package it.unicam.cs.followme.robot;
import it.unicam.cs.followme.app.iController;
import java.util.ArrayList;
import java.util.List;

public class RobotController implements iController {


    List<Robot> robotList = new ArrayList<>();
    RobotFactory robotFactory = new RobotFactory();
    public RobotController(List<Robot> robots) {
        this.robotList = robots;
    }
    public RobotController() {
        this.robotList = robotFactory.inizializzaRobot();
    }

    @Override
    public List getlist() {
        return robotList;
    }
}

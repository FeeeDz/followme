package it.unicam.cs.followme.app;

import it.unicam.cs.followme.robot.Robot;
import it.unicam.cs.followme.utilities.FollowMeParserHandler;

public class SimulationController implements FollowMeParserHandler {

    Utils utils = new Utils();

    @Override
    public void parsingStarted() {

    }

    @Override
    public void parsingDone() {

    }

    Robot robot = new Robot();
    /*
    * MOVE x y s: si muove verso la direzione (x,y), dove x ed y sono valori compresi tra
    -1 ed 1 alla data velocità s espressa in m/s, si assume che al più una tra x ed y sia
    diversa da 0;
    * */
    @Override
    public void moveCommand(double[] args) {
        // classe robot
        //classe posizione
        //classe destinazione
        //velocità s
        double x = args[0], y = args[1], s = args[2];
        //s è dist ci dice in altre parole di quanto ci spostiamo

        if(!((x != 0.0 && y != 0.0) || (x > 1.0 || x < -1.0) || (y > 1.0 || y < -1.0))) {}
        Posizione posizione = robot.getPosizione();
        // TODO creare un nuovo metodo che calcola la nuova posizione del robot
        Posizione newPosizione = new Posizione(x, y); // todo aggiornare x, y con i valori ... sopra
        robot.setPosizione(newPosizione);
        robot.setVelocita(s);
        robot.setDestinazione(new Posizione(x,y));
        // quando settiamo le varie robe il robot si è mosso
    }

    @Override
    public void moveRandomCommand(double[] args) {

    }

    @Override
    public void signalCommand(String label) {

    }

    @Override
    public void unsignalCommand(String label) {

    }

    @Override
    public void followCommand(String label, double[] args) {

    }

    @Override
    public void stopCommand() {

    }

    @Override
    public void continueCommand(int s) {

    }

    @Override
    public void repeatCommandStart(int n) {

    }

    @Override
    public void untilCommandStart(String label) {

    }

    @Override
    public void doForeverStart() {

    }

    @Override
    public void doneCommand() {

    }
}

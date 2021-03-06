package GUI.cloudsimgui;

import examples.org.cloudbus.cloudsim.examples.power.random.*;
import examples.org.cloudbus.cloudsim.examples.power.Helper;

/**
 *
 * @author sabir
 */

public class SimulationLine {
    
    private String approachName;
    private int vm;
    private int pm;
    private double energy;
    //private double time;
    private double slav;
    private double OSLAV;
    private int numberMigration;
    private double migrationEnergy;
    private double migrationTime;
    private double esv;


    
    public SimulationLine(String n,int vm,int pm,double E,double slav,double oslav,double esv,int nMigr,double Em,double Tm){
        approachName = n;
        this.vm = vm;
        this.pm = pm;
        energy = E;
        this.slav = slav;
        OSLAV = oslav;
        numberMigration = nMigr;
        migrationEnergy = Em;
        migrationTime = Tm;
        this.esv = esv;
    }
        
    public int getPm() {
        return pm;
    }

    public void setPm(int pm) {
        this.pm = pm;
    }

    /*public double getTime() {
        return time;
    }*/
    
    /*public void setTime(double time) {
        this.time = time;
    }*/
    
    public double getSlav(){
        return slav;
    }

    public void setSlav(double slav){
        this.slav = slav;
    }

    public String getApproachName() {
        return approachName;
    }

    public int getVm() {
        return vm;
    }

    public double getEnergy() {
        return energy;
    }

    public double getOSLAV() {
        return OSLAV;
    }

    public int getNumberMigration() {
        return numberMigration;
    }

    public double getMigrationEnergy() {
        return migrationEnergy;
    }

    public void setApproachName(String approachName) {
        this.approachName = approachName;
    }

    public void setVm(int vm) {
        this.vm = vm;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public void setOSLAV(double OSLAV) {
        this.OSLAV = OSLAV;
    }

    public void setNumberMigration(int numberMigration) {
        this.numberMigration = numberMigration;
    }

    public void setMigrationEnergy(double migrationEnergy) {
        this.migrationEnergy = migrationEnergy;
    }

    public void setMigrationTime(double migrationTime) {
        this.migrationTime = migrationTime;
    }

    public double getMigrationTime() {
        return migrationTime;
    }
    
       public double getEsv() {
        return esv;
    }

    public void setEsv(double esv) {
        this.esv = esv;
    }
}
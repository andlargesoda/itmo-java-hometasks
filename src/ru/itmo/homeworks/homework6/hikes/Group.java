package ru.itmo.homeworks.homework6.hikes;

public class Group {
    private Mountain mountain;
    private Climber[] climbers;
    private int index;
    private boolean isOpen;
    public Group(Mountain mountain, boolean isOpen) {
        this.mountain = mountain;
        this.isOpen = isOpen;
        climbers = new Climber[5];
    }
    public void addClimber(Climber climber) { // при вызове данного метода в Application в () необходимо указать массив альпинистов, открытость набора в группу)
        if (isOpen == false) {
            System.out.println("Набор в группе не ведется");
            return;
        }
            if (index <= 5) {
                climbers[index] = climber;
                index++;
        }
    }
    public Climber[] getClimbers() {
        return climbers;
    }
}

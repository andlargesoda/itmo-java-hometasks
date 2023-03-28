package ru.itmo.homeworks.homework6.hikes;

public class Group {
    private Mountain mountain;
    private Climber[] climbers = new Climber[5];
    private boolean isOpen;

    public void addClimber01(Climber[] climbers, boolean isOpen) { // при вызове данного метода в Application в () необходимо указать массив альпинистов, открытость набора в группу)
        if (isOpen) {
            System.out.println("Набор в группу еще есть");
            for (int i = 0; i < climbers.length; i++) {
                this.climbers = climbers; // на значение, указанное при вызове данного метода будет i - элемент массива
            }
        }
    }
}

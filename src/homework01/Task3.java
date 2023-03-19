package homework01;

public class Tasks3 {
    public static void main(String[] args) {
        double time = 12, distance = 722.2;
        double speed = (distance * 1000)/ (time * 3600);
        System.out.println("Чтобы проехать расстояние равное " + distance + " км за " + time + " часов потреубется ехать со скоротью " + speed + " м/с.");
    }
}

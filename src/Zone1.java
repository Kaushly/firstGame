public class Zone1 {

    Enemy orc = getFirstEnemy();


    private static Enemy getFirstEnemy() {
        Enemy orc = new Enemy("Trall");
        int min = 10;
        int max = 30;
        orc.setHp((int)Math.random() * 100);
        orc.setAttack(orc.getAttack() + (int)Math.random() * ((max - min)+1)*100);
//        orc.setArmor((int)Math.random() * 10);
        return orc;
    }
    @Override
    public String toString() {
        return "Zone1{" +
                "orc=" + orc +
                '}';
    }
}



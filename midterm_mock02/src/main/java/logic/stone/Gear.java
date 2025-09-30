package logic.stone;

import logic.game.GameManager;
import utils.GameUtilities;

public class Gear extends HardStone{
    private int upgradeValue;

    public Gear(int PosX,int PosY) {
        super(PosX,PosY,2);
        this.upgradeValue = 1;

    }

    public Gear(int PosX,int PosY,int upgradeValue) {
        super(PosX,PosY,2);
        this.upgradeValue = Math.max(1,upgradeValue);
    }

    public void destroy() {
        GameManager.getInstance().addDigPower(upgradeValue);
        super.destroy();
    }

    public int getUpgradeValue() {
        return upgradeValue;
    }

    public void setUpgradeValue(int upgradeValue) {
        this.upgradeValue = Math.max(1,upgradeValue);
    }
}

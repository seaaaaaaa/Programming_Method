package logic.card;

import logic.game.CardColor;
import logic.game.CardSymbol;
import logic.game.GameLogic;

import javax.smartcardio.Card;

public class NumberCard extends BaseCard {

    public NumberCard(CardColor color, CardSymbol symbol) {
        super(color);
        this.setSymbol(symbol);
    }

    public void play() {
        GameLogic.getInstance().setTopCard(this);
    }

    public boolean ruleCheck() {
        if(GameLogic.getInstance().getTopCard().getSymbol() == this.getSymbol()||GameLogic.getInstance().getTopCard().getColor() == this.getColor()) {
            return true;
        }
        return false;
    }

}

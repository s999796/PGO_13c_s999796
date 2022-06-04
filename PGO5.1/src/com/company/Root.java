package com.company;

public class Root extends Plant {

    public Root(int toxicity) {
        super(toxicity);
    }

    @Override
    public int getReagent() {
        return super.getReagent() / 2;
    }
}

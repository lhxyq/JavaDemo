package com.lh.designmode.chain;

/**
 * Created by LH 2446059046@qq.com on 2017/9/27.
 */
public class Level {
    private int level;

    public Level(int level) {
        this.level = level;
    }

    public boolean above(Level level) {
        if (this.level >= level.level)
            return true;

        return false;
    }
}

package com.lh.designmode.chain;

/**
 * Created by LH 2446059046@qq.com on 2017/9/27.
 */
public abstract class Handel {
    private Handel nextHandel;

    public final void handleRequest(Request request) {
        if (this.getHandleLevel().above(request.getLevel())) {
            this.response(request);
        } else {
            if (this.nextHandel != null)
                this.nextHandel.handleRequest(request);
            else {
                System.out.println("没有合适的处理器...");
            }
        }
    }

    public void setNextHandel(Handel nextHandel) {
        this.nextHandel = nextHandel;
    }

    public abstract Level getHandleLevel();

    public abstract void response(Request request);
}

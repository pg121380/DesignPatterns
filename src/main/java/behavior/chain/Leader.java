package behavior.chain;

public abstract class Leader {

    protected String name;

    protected Leader nextLeader;    //责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     *  处理请求的核心方法
     * @param leaveRequest
     */
    public abstract void handleRequest(LeaveRequest leaveRequest);
}
